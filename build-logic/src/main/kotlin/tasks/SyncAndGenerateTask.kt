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
 * Gradle task that performs a full sync operation:
 * 1. Syncs SVG flags from upstream
 * 2. Generates ImageVector Kotlin files using Valkyrie CLI
 * 3. Updates FlagList.kt files
 *
 * This is the main task for keeping the library up-to-date with upstream.
 *
 * @see <a href="https://github.com/ComposeGears/Valkyrie">Valkyrie GitHub</a>
 */
abstract class SyncAndGenerateTask @Inject constructor() : DefaultTask() {

    init {
        description = "Full sync: download flags, generate ImageVectors (via Valkyrie), and update lists"
        group = "flagpack"
    }

    @TaskAction
    fun syncAndGenerate() {
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

        logger.lifecycle("=" .repeat(60))
        logger.lifecycle("FLAGPACK SYNC AND GENERATE")
        logger.lifecycle("=" .repeat(60))
        logger.lifecycle("Valkyrie CLI: ${valkyrieVersion ?: "installed"}")
        logger.lifecycle("Source: ${if (useLocal) localPath else "$gitRepo ($gitRef)"}")
        logger.lifecycle("Target: $targetPath")
        logger.lifecycle("Package: $packageName")
        logger.lifecycle("Sizes: ${supportedSizes.joinToString(", ")}")
        logger.lifecycle("=" .repeat(60))

        val result = if (useLocal) {
            processFromLocal(
                localPath = localPath,
                svgSourcePath = svgSourcePath,
                targetPath = targetPath,
                packageName = packageName,
                supportedSizes = supportedSizes,
                generatePreviews = generatePreviews
            )
        } else {
            processFromGit(
                gitRepo = gitRepo,
                gitRef = gitRef,
                svgSourcePath = svgSourcePath,
                targetPath = targetPath,
                packageName = packageName,
                supportedSizes = supportedSizes,
                generatePreviews = generatePreviews
            )
        }

        // Generate flag lists
        logger.lifecycle("\nUpdating flag lists...")
        generateFlagLists(
            targetPath = targetPath,
            packageName = packageName,
            supportedSizes = supportedSizes
        )

        // Write sync log
        val logFile = File(project.rootDir, syncLogFile)
        logFile.writeText(result.toSummary())
        logger.lifecycle("Sync log written to: ${logFile.absolutePath}")

        // Set GitHub Actions output
        setGitHubActionsOutput(result)

        // Final summary
        logger.lifecycle("\n" + "=" .repeat(60))
        logger.lifecycle("SYNC COMPLETE")
        logger.lifecycle("=" .repeat(60))
        logger.lifecycle(result.toSummary())

        if (!result.success) {
            throw RuntimeException("Sync completed with errors")
        }
    }

    private fun processFromLocal(
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

    private fun processFromGit(
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
            logger.lifecycle("\nCloning repository...")
            gitRepository.cloneShallow(ConsoleProgressMonitor())

            val commitHash = gitRepository.getHeadCommitHash()
            logger.lifecycle("Cloned at commit: $commitHash\n")

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

        // Ensure FlagIcons.kt exists
        ensureFlagIconsFile(targetDir, packageName)

        // Count existing flags
        val existingCount = supportedSizes.sumOf { sizeCode ->
            val size = FlagSize.fromCode(sizeCode) ?: return@sumOf 0
            val sizeDir = File(targetDir, size.packageSuffix)
            if (sizeDir.exists()) FileUtils.listKotlinFiles(sizeDir).size else 0
        }

        logger.lifecycle("Existing flags: $existingCount")

        // Process each size
        for (sizeCode in supportedSizes) {
            val size = FlagSize.fromCode(sizeCode)
            if (size == null) {
                errors.add("Unknown size code: $sizeCode")
                continue
            }

            logger.lifecycle("\nProcessing ${size.displayName} flags...")

            val svgDir = getSvgDir(sizeCode)
            if (!svgDir.exists()) {
                errors.add("SVG directory not found: ${svgDir.absolutePath}")
                logger.warn("  SVG directory not found: ${svgDir.absolutePath}")
                continue
            }

            val outputDir = File(targetDir, size.packageSuffix)
            FileUtils.ensureDirectory(outputDir)

            val svgFiles = FileUtils.listSvgFiles(svgDir)
            logger.lifecycle("  Found ${svgFiles.size} SVG files")

            var processedCount = 0
            var skippedCount = 0

            for (svgFile in svgFiles) {
                try {
                    val alpha2 = FileUtils.getAlpha2FromFilename(svgFile.name)
                    val flagEntry = CountryCodeMapper.getEntry(alpha2)

                    if (flagEntry == null) {
                        logger.debug("Unknown country code: $alpha2")
                        continue
                    }

                    val outputFile = File(outputDir, "${flagEntry.propertyName}.kt")

                    // Skip if file already exists
                    if (outputFile.exists()) {
                        skippedCount++
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
                        logger.debug("Using fallback for ${svgFile.name}: ${e.message}")
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
            logger.lifecycle("  Generated: $processedCount new, Skipped: $skippedCount existing")
        }

        // Count final flags
        val finalCount = supportedSizes.sumOf { sizeCode ->
            val size = FlagSize.fromCode(sizeCode) ?: return@sumOf 0
            val sizeDir = File(targetDir, size.packageSuffix)
            if (sizeDir.exists()) FileUtils.listKotlinFiles(sizeDir).size else 0
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

    private fun ensureFlagIconsFile(targetDir: File, packageName: String) {
        val flagIconsFile = File(targetDir, "FlagIcons.kt")
        if (!flagIconsFile.exists()) {
            FileUtils.ensureDirectory(targetDir)
            flagIconsFile.writeText(
                """
                |package $packageName
                |
                |/**
                | * Root object for accessing flag icons.
                | *
                | * Flags are organized by size:
                | * - [FlagIcons.Small] - Small flags (16x12dp)
                | * - [FlagIcons.Medium] - Medium flags (20x15dp)
                | * - [FlagIcons.Large] - Large flags (32x24dp)
                | *
                | * Example usage:
                | * ```kotlin
                | * Image(
                | *     imageVector = FlagIcons.Large.UnitedStates,
                | *     contentDescription = "US Flag"
                | * )
                | * ```
                | *
                | * @see [Flagpack](https://flagpack.xyz)
                | */
                |public object FlagIcons {
                |    /**
                |     * Small flag icons (16x12dp).
                |     */
                |    public object Small
                |
                |    /**
                |     * Medium flag icons (20x15dp).
                |     */
                |    public object Medium
                |
                |    /**
                |     * Large flag icons (32x24dp).
                |     */
                |    public object Large
                |}
                """.trimMargin()
            )
            logger.lifecycle("Created FlagIcons.kt")
        }
    }

    private fun generateFlagLists(
        targetPath: String,
        packageName: String,
        supportedSizes: List<String>
    ) {
        val targetDir = File(project.rootDir, targetPath)

        for (sizeCode in supportedSizes) {
            val size = FlagSize.fromCode(sizeCode) ?: continue
            val sizeDir = File(targetDir, size.packageSuffix)

            if (!sizeDir.exists()) continue

            val flagFiles = FileUtils.listKotlinFiles(sizeDir)
                .filter { !it.name.endsWith("FlagList.kt") }

            val flagProperties = flagFiles.map { file ->
                "FlagIcons.${size.objectName}.${file.nameWithoutExtension}"
            }.sorted()

            val listContent = buildFlagListContent(packageName, size, flagProperties)
            val listFile = File(targetDir, "${size.objectName}FlagList.kt")
            listFile.writeText(listContent)

            logger.lifecycle("  ${size.displayName}FlagList: ${flagProperties.size} flags")
        }
    }

    private fun buildFlagListContent(
        packageName: String,
        size: FlagSize,
        flagProperties: List<String>
    ): String {
        return buildString {
            appendLine("package $packageName")
            appendLine()
            appendLine("import androidx.compose.ui.graphics.vector.ImageVector")
            flagProperties.forEach { prop ->
                val propertyName = prop.substringAfterLast(".")
                appendLine("import $packageName.${size.packageSuffix}.$propertyName")
            }
            appendLine()
            appendLine("/**")
            appendLine(" * List of all ${size.displayName} (${size.width}x${size.height}dp) flag icons.")
            appendLine(" *")
            appendLine(" * Contains ${flagProperties.size} flags, lazily initialized.")
            appendLine(" */")
            appendLine("public val FlagIcons.${size.objectName}FlagList: List<ImageVector>")
            appendLine("    get() {")
            appendLine("        if (_${size.objectName.lowercase()}FlagList != null) {")
            appendLine("            return _${size.objectName.lowercase()}FlagList!!")
            appendLine("        }")
            appendLine("        _${size.objectName.lowercase()}FlagList = listOf(")
            flagProperties.forEachIndexed { index, prop ->
                val comma = if (index < flagProperties.size - 1) "," else ""
                appendLine("            $prop$comma")
            }
            appendLine("        )")
            appendLine("        return _${size.objectName.lowercase()}FlagList!!")
            appendLine("    }")
            appendLine()
            appendLine("@Suppress(\"ObjectPropertyName\")")
            appendLine("private var _${size.objectName.lowercase()}FlagList: List<ImageVector>? = null")
        }
    }

    private fun setGitHubActionsOutput(result: SyncResult) {
        val outputFile = System.getenv("GITHUB_OUTPUT")?.let { File(it) } ?: return

        outputFile.appendText(result.toGitHubActionsOutput())
    }
}
