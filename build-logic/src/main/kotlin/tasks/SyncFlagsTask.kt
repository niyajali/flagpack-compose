package tasks

import FlagpackExtension
import models.FlagSize
import models.SyncResult
import models.SyncedFlagInfo
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import services.ConsoleProgressMonitor
import services.GitRepository
import services.LocalDirectoryRepository
import utils.CountryCodeMapper
import utils.FileUtils
import utils.ValkyrieConverter
import java.io.File
import javax.inject.Inject

/**
 * Gradle task that syncs SVG flags from the upstream flagpack-core repository
 * and generates ImageVector Kotlin files using Valkyrie CLI.
 *
 * @see <a href="https://github.com/ComposeGears/Valkyrie">Valkyrie GitHub</a>
 */
abstract class SyncFlagsTask @Inject constructor() : DefaultTask() {

    init {
        description = "Sync SVG flags from upstream and generate ImageVector Kotlin files using Valkyrie"
        group = "flagpack"
    }

    @TaskAction
    fun sync() {
        val extension = project.extensions.getByType(FlagpackExtension::class.java)

        val useLocal = extension.useLocalDirectory.get()
        val localPath = extension.localDirectoryPath.get()
        val gitRepo = extension.gitRepository.get()
        val gitRef = extension.gitRef.get()
        val svgSourcePath = extension.svgSourcePath.get()
        val targetPath = extension.targetPath.get()
        val packageName = extension.packageName.get()
        val supportedSizes = extension.supportedSizes.get()
        val generatePreviews = extension.generatePreviews.get()
        val syncLogFile = extension.syncLogFile.get()

        // Check Valkyrie installation
        if (!ValkyrieConverter.isValkyrieInstalled()) {
            throw IllegalStateException(
                """
                Valkyrie CLI is not installed or not in PATH.

                Install via Homebrew:
                    brew install ComposeGears/repo/valkyrie

                Or download from: https://github.com/ComposeGears/Valkyrie/releases
                """.trimIndent()
            )
        }

        val valkyrieVersion = ValkyrieConverter.getValkyrieVersion()

        logger.lifecycle("Starting flag sync...")
        logger.lifecycle("  Valkyrie CLI: ${valkyrieVersion ?: "installed"}")
        logger.lifecycle("  Source: ${if (useLocal) localPath else "$gitRepo ($gitRef)"}")
        logger.lifecycle("  Target: $targetPath")
        logger.lifecycle("  Sizes: ${supportedSizes.joinToString(", ")}")

        val result = if (useLocal) {
            syncFromLocal(
                localPath = localPath,
                svgSourcePath = svgSourcePath,
                targetPath = targetPath,
                packageName = packageName,
                supportedSizes = supportedSizes,
                generatePreviews = generatePreviews
            )
        } else {
            syncFromGit(
                gitRepo = gitRepo,
                gitRef = gitRef,
                svgSourcePath = svgSourcePath,
                targetPath = targetPath,
                packageName = packageName,
                supportedSizes = supportedSizes,
                generatePreviews = generatePreviews
            )
        }

        // Write sync log
        val logFile = File(project.rootDir, syncLogFile)
        logFile.writeText(result.toSummary())
        logger.lifecycle("Sync log written to: ${logFile.absolutePath}")

        // Log results
        logger.lifecycle("\n${result.toSummary()}")

        if (!result.success) {
            throw RuntimeException("Flag sync failed with errors")
        }
    }

    private fun syncFromLocal(
        localPath: String,
        svgSourcePath: String,
        targetPath: String,
        packageName: String,
        supportedSizes: List<String>,
        generatePreviews: Boolean
    ): SyncResult {
        val localRepo = LocalDirectoryRepository(localPath)

        try {
            return processFlags(
                getSvgDir = { size -> localRepo.getDirectory("$svgSourcePath/$size") },
                targetPath = targetPath,
                packageName = packageName,
                supportedSizes = supportedSizes,
                generatePreviews = generatePreviews
            )
        } finally {
            localRepo.cleanup()
        }
    }

    private fun syncFromGit(
        gitRepo: String,
        gitRef: String,
        svgSourcePath: String,
        targetPath: String,
        packageName: String,
        supportedSizes: List<String>,
        generatePreviews: Boolean
    ): SyncResult {
        val gitRepository = GitRepository(gitRepo, gitRef)

        try {
            logger.lifecycle("Cloning repository...")
            gitRepository.cloneShallow(ConsoleProgressMonitor())

            val commitHash = gitRepository.getHeadCommitHash()
            logger.lifecycle("Cloned at commit: $commitHash")

            return processFlags(
                getSvgDir = { size -> gitRepository.getDirectory("$svgSourcePath/$size") },
                targetPath = targetPath,
                packageName = packageName,
                supportedSizes = supportedSizes,
                generatePreviews = generatePreviews
            )
        } finally {
            gitRepository.cleanup()
        }
    }

    private fun processFlags(
        getSvgDir: (String) -> File,
        targetPath: String,
        packageName: String,
        supportedSizes: List<String>,
        generatePreviews: Boolean
    ): SyncResult {
        val targetDir = File(project.rootDir, targetPath)
        val newFlags = mutableListOf<SyncedFlagInfo>()
        val errors = mutableListOf<String>()
        val sizeBreakdown = mutableMapOf<FlagSize, Int>()

        // Count existing flags
        val existingCount = supportedSizes.sumOf { sizeCode ->
            val size = FlagSize.fromCode(sizeCode) ?: return@sumOf 0
            val sizeDir = File(targetDir, size.packageSuffix)
            FileUtils.listKotlinFiles(sizeDir).size
        }

        // Process each size
        for (sizeCode in supportedSizes) {
            val size = FlagSize.fromCode(sizeCode)
            if (size == null) {
                errors.add("Unknown size code: $sizeCode")
                continue
            }

            val svgDir = getSvgDir(sizeCode)
            if (!svgDir.exists()) {
                errors.add("SVG directory not found: ${svgDir.absolutePath}")
                continue
            }

            val outputDir = File(targetDir, size.packageSuffix)
            FileUtils.ensureDirectory(outputDir)

            val svgFiles = FileUtils.listSvgFiles(svgDir)
            logger.lifecycle("Processing ${svgFiles.size} SVG files for ${size.displayName} size...")

            var processedCount = 0
            for (svgFile in svgFiles) {
                try {
                    val alpha2 = FileUtils.getAlpha2FromFilename(svgFile.name)
                    val flagEntry = CountryCodeMapper.getEntry(alpha2)

                    if (flagEntry == null) {
                        logger.warn("Unknown country code: $alpha2")
                        continue
                    }

                    val outputFile = File(outputDir, "${flagEntry.propertyName}.kt")

                    // Skip if file already exists
                    if (outputFile.exists()) {
                        continue
                    }

                    val kotlinCode = try {
                        ValkyrieConverter.convertToImageVector(
                            svgFile = svgFile,
                            flagEntry = flagEntry,
                            size = size,
                            packageName = packageName,
                            generatePreview = generatePreviews
                        )
                    } catch (e: Exception) {
                        logger.warn("Valkyrie failed for ${svgFile.name}, using fallback: ${e.message}")
                        ValkyrieConverter.createFallbackImageVector(
                            flagEntry = flagEntry,
                            size = size,
                            packageName = packageName,
                            generatePreview = generatePreviews
                        )
                    }

                    outputFile.writeText(kotlinCode)
                    processedCount++

                    newFlags.add(
                        SyncedFlagInfo(
                            countryName = flagEntry.countryName,
                            alpha2 = flagEntry.alpha2,
                            alpha3 = flagEntry.alpha3,
                            size = size,
                            filePath = outputFile.absolutePath
                        )
                    )
                } catch (e: Exception) {
                    errors.add("Error processing ${svgFile.name}: ${e.message}")
                    logger.error("Error processing ${svgFile.name}", e)
                }
            }

            sizeBreakdown[size] = processedCount
            logger.lifecycle("  ${size.displayName}: $processedCount new flags")
        }

        // Count final flags
        val finalCount = supportedSizes.sumOf { sizeCode ->
            val size = FlagSize.fromCode(sizeCode) ?: return@sumOf 0
            val sizeDir = File(targetDir, size.packageSuffix)
            FileUtils.listKotlinFiles(sizeDir).size
        }

        return SyncResult(
            success = errors.isEmpty(),
            totalBefore = existingCount,
            totalAfter = finalCount,
            newFlags = newFlags,
            errors = errors,
            sizeBreakdown = sizeBreakdown
        )
    }
}
