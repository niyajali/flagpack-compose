package tasks

import FlagpackExtension
import models.FlagSize
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import utils.CountryCodeMapper
import utils.FileUtils
import utils.ValkyrieConverter
import java.io.File
import javax.inject.Inject

/**
 * Gradle task that generates ImageVector Kotlin files from existing SVG files.
 * This task assumes SVG files are already present locally (e.g., copied manually
 * or from a previous sync).
 *
 * Uses Valkyrie CLI for SVG to ImageVector conversion. Valkyrie provides
 * superior SVG parsing compared to alternatives, handling complex paths accurately.
 *
 * @see <a href="https://github.com/ComposeGears/Valkyrie">Valkyrie GitHub</a>
 */
abstract class GenerateFlagsTask @Inject constructor() : DefaultTask() {

    init {
        description = "Generate ImageVector Kotlin files from local SVG flags using Valkyrie"
        group = "flagpack"
    }

    @TaskAction
    fun generate() {
        val extension = project.extensions.getByType(FlagpackExtension::class.java)

        val localPath = extension.localDirectoryPath.get()
        val svgSourcePath = extension.svgSourcePath.get()
        val targetPath = extension.targetPath.get()
        val packageName = extension.packageName.get()
        val supportedSizes = extension.supportedSizes.get()
        val generatePreviews = extension.generatePreviews.get()

        if (localPath.isEmpty()) {
            throw IllegalArgumentException("localDirectoryPath must be set for generateFlags task")
        }

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
        logger.lifecycle("Using Valkyrie CLI${valkyrieVersion?.let { " ($it)" } ?: ""}")

        val sourceDir = File(localPath, svgSourcePath)
        val targetDir = File(project.rootDir, targetPath)

        logger.lifecycle("Generating flags from: ${sourceDir.absolutePath}")
        logger.lifecycle("Output to: ${targetDir.absolutePath}")

        var totalGenerated = 0
        var totalErrors = 0
        var totalFallbacks = 0

        for (sizeCode in supportedSizes) {
            val size = FlagSize.fromCode(sizeCode)
            if (size == null) {
                logger.warn("Unknown size code: $sizeCode")
                continue
            }

            val svgDir = File(sourceDir, sizeCode)
            if (!svgDir.exists()) {
                logger.warn("SVG directory not found: ${svgDir.absolutePath}")
                continue
            }

            val outputDir = File(targetDir, size.packageSuffix)
            FileUtils.ensureDirectory(outputDir)

            val svgFiles = FileUtils.listSvgFiles(svgDir)
            logger.lifecycle("Processing ${svgFiles.size} SVG files for ${size.displayName} size...")

            var sizeGenerated = 0
            var sizeFallbacks = 0
            for (svgFile in svgFiles) {
                try {
                    val alpha2 = FileUtils.getAlpha2FromFilename(svgFile.name)
                    val flagEntry = CountryCodeMapper.getEntry(alpha2)

                    if (flagEntry == null) {
                        logger.warn("Unknown country code: $alpha2")
                        continue
                    }

                    val outputFile = File(outputDir, "${flagEntry.propertyName}.kt")

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
                        sizeFallbacks++
                        ValkyrieConverter.createFallbackImageVector(
                            flagEntry = flagEntry,
                            size = size,
                            packageName = packageName,
                            generatePreview = generatePreviews
                        )
                    }

                    outputFile.writeText(kotlinCode)
                    sizeGenerated++
                } catch (e: Exception) {
                    logger.error("Error processing ${svgFile.name}: ${e.message}")
                    totalErrors++
                }
            }

            totalGenerated += sizeGenerated
            totalFallbacks += sizeFallbacks
            logger.lifecycle("  ${size.displayName}: Generated $sizeGenerated files" +
                    if (sizeFallbacks > 0) " ($sizeFallbacks fallbacks)" else "")
        }

        logger.lifecycle("\nGeneration complete:")
        logger.lifecycle("  Total generated: $totalGenerated")
        if (totalFallbacks > 0) {
            logger.lifecycle("  Total fallbacks: $totalFallbacks")
        }
        logger.lifecycle("  Total errors: $totalErrors")

        if (totalErrors > 0) {
            logger.warn("Some flags failed to generate. Check the log for details.")
        }
    }
}
