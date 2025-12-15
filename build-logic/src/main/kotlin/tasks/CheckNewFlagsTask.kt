package tasks

import FlagpackExtension
import models.FlagSize
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import services.ConsoleProgressMonitor
import services.GitRepository
import services.LocalDirectoryRepository
import utils.CountryCodeMapper
import utils.FileUtils
import java.io.File
import javax.inject.Inject

/**
 * Gradle task that checks for new flags in the upstream repository
 * without actually syncing them.
 */
abstract class CheckNewFlagsTask @Inject constructor() : DefaultTask() {

    init {
        description = "Check for new flags in upstream without syncing"
        group = "flagpack"
    }

    @TaskAction
    fun check() {
        val extension = project.extensions.getByType(FlagpackExtension::class.java)

        val useLocal = extension.useLocalDirectory.get()
        val localPath = extension.localDirectoryPath.get()
        val gitRepo = extension.gitRepository.get()
        val gitRef = extension.gitRef.get()
        val svgSourcePath = extension.svgSourcePath.get()
        val targetPath = extension.targetPath.get()
        val supportedSizes = extension.supportedSizes.get()

        logger.lifecycle("Checking for new flags...")
        logger.lifecycle("  Source: ${if (useLocal) localPath else "$gitRepo ($gitRef)"}")

        val targetDir = File(project.rootDir, targetPath)

        if (useLocal) {
            checkLocal(localPath, svgSourcePath, targetDir, supportedSizes)
        } else {
            checkGit(gitRepo, gitRef, svgSourcePath, targetDir, supportedSizes)
        }
    }

    private fun checkLocal(
        localPath: String,
        svgSourcePath: String,
        targetDir: File,
        supportedSizes: List<String>
    ) {
        val localRepo = LocalDirectoryRepository(localPath)
        try {
            compareFlags(
                getSvgDir = { size -> localRepo.getDirectory("$svgSourcePath/$size") },
                targetDir = targetDir,
                supportedSizes = supportedSizes
            )
        } finally {
            localRepo.cleanup()
        }
    }

    private fun checkGit(
        gitRepo: String,
        gitRef: String,
        svgSourcePath: String,
        targetDir: File,
        supportedSizes: List<String>
    ) {
        val gitRepository = GitRepository(gitRepo, gitRef)
        try {
            logger.lifecycle("Cloning repository...")
            gitRepository.cloneShallow(ConsoleProgressMonitor())

            val commitHash = gitRepository.getHeadCommitHash()
            logger.lifecycle("Checked at commit: $commitHash")

            compareFlags(
                getSvgDir = { size -> gitRepository.getDirectory("$svgSourcePath/$size") },
                targetDir = targetDir,
                supportedSizes = supportedSizes
            )
        } finally {
            gitRepository.cleanup()
        }
    }

    private fun compareFlags(
        getSvgDir: (String) -> File,
        targetDir: File,
        supportedSizes: List<String>
    ) {
        var totalNew = 0
        var totalMissing = 0
        val newFlags = mutableListOf<String>()
        val missingFlags = mutableListOf<String>()

        for (sizeCode in supportedSizes) {
            val size = FlagSize.fromCode(sizeCode)
            if (size == null) {
                logger.warn("Unknown size code: $sizeCode")
                continue
            }

            val svgDir = getSvgDir(sizeCode)
            if (!svgDir.exists()) {
                logger.warn("Source SVG directory not found: ${svgDir.absolutePath}")
                continue
            }

            val targetSizeDir = File(targetDir, size.packageSuffix)

            // Get source SVG files
            val sourceSvgs = FileUtils.listSvgFiles(svgDir)
                .map { FileUtils.getAlpha2FromFilename(it.name) }
                .toSet()

            // Get existing Kotlin files
            val existingFlags = if (targetSizeDir.exists()) {
                FileUtils.listKotlinFiles(targetSizeDir)
                    .map { it.nameWithoutExtension }
                    .toSet()
            } else {
                emptySet()
            }

            // Map alpha2 codes to property names for comparison
            val sourcePropertyNames = sourceSvgs.mapNotNull { alpha2 ->
                CountryCodeMapper.getEntry(alpha2)?.propertyName
            }.toSet()

            // Find new flags (in source but not in target)
            val newInSize = sourcePropertyNames - existingFlags
            totalNew += newInSize.size
            newFlags.addAll(newInSize.map { "${size.displayName}/$it" })

            // Find missing flags (in source but unknown alpha2)
            val unknownAlpha2 = sourceSvgs.filter { alpha2 ->
                CountryCodeMapper.getEntry(alpha2) == null
            }
            totalMissing += unknownAlpha2.size
            missingFlags.addAll(unknownAlpha2.map { "${size.displayName}/$it" })

            logger.lifecycle("  ${size.displayName}: ${sourceSvgs.size} source, ${existingFlags.size} existing, ${newInSize.size} new")
        }

        logger.lifecycle("\nSummary:")
        logger.lifecycle("  New flags available: $totalNew")
        logger.lifecycle("  Unknown country codes: $totalMissing")

        if (newFlags.isNotEmpty()) {
            logger.lifecycle("\nNew flags:")
            newFlags.take(20).forEach { logger.lifecycle("  + $it") }
            if (newFlags.size > 20) {
                logger.lifecycle("  ... and ${newFlags.size - 20} more")
            }
        }

        if (missingFlags.isNotEmpty()) {
            logger.warn("\nUnknown country codes (need mapping):")
            missingFlags.forEach { logger.warn("  ? $it") }
        }

        // Set output for GitHub Actions
        if (System.getenv("GITHUB_OUTPUT") != null) {
            val outputFile = File(System.getenv("GITHUB_OUTPUT"))
            outputFile.appendText("new_flags_count=$totalNew\n")
            outputFile.appendText("has_new_flags=${totalNew > 0}\n")
        }
    }
}
