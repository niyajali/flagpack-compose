package utils

import models.FlagEntry
import models.FlagSize
import java.io.File
import java.util.concurrent.TimeUnit

/**
 * Utility for converting SVG flag files to Compose ImageVector Kotlin code
 * using the Valkyrie CLI tool.
 *
 * Valkyrie provides better SVG parsing and ImageVector generation compared
 * to svg2compose, handling complex SVG paths more accurately.
 *
 * @see <a href="https://github.com/ComposeGears/Valkyrie">Valkyrie GitHub</a>
 */
object ValkyrieConverter {

    private const val VALKYRIE_COMMAND = "valkyrie"
    private const val TIMEOUT_SECONDS = 30L

    /**
     * Check if Valkyrie CLI is installed and available.
     */
    fun isValkyrieInstalled(): Boolean {
        return try {
            val process = ProcessBuilder("which", VALKYRIE_COMMAND)
                .redirectErrorStream(true)
                .start()
            process.waitFor(5, TimeUnit.SECONDS)
            process.exitValue() == 0
        } catch (e: Exception) {
            false
        }
    }

    /**
     * Get Valkyrie version for logging purposes.
     */
    fun getValkyrieVersion(): String? {
        return try {
            val process = ProcessBuilder(VALKYRIE_COMMAND, "--version")
                .redirectErrorStream(true)
                .start()
            process.waitFor(5, TimeUnit.SECONDS)
            if (process.exitValue() == 0) {
                process.inputStream.bufferedReader().readText().trim()
            } else null
        } catch (e: Exception) {
            null
        }
    }

    /**
     * Convert an SVG file to ImageVector Kotlin code using Valkyrie CLI.
     *
     * @param svgFile The SVG file to convert
     * @param flagEntry The flag entry with country information
     * @param size The flag size variant
     * @param packageName The base package name for generated code
     * @param generatePreview Whether to generate a preview composable
     * @return The generated Kotlin code as a string
     */
    fun convertToImageVector(
        svgFile: File,
        flagEntry: FlagEntry,
        size: FlagSize,
        packageName: String,
        generatePreview: Boolean = true
    ): String {
        require(svgFile.exists()) { "SVG file does not exist: ${svgFile.absolutePath}" }
        require(svgFile.length() > 0) { "SVG file is empty: ${svgFile.absolutePath}" }

        // Create temporary directory for Valkyrie output
        val tempDir = createTempDir("flagpack-valkyrie")
        val tempOutputDir = File(tempDir, "output").apply { mkdirs() }

        try {
            // Run Valkyrie CLI to convert SVG to ImageVector
            val valkyrieOutput = runValkyrieCli(svgFile, tempOutputDir, packageName, size)

            // Post-process the generated content to match our format
            return postProcess(
                valkyrieOutput = valkyrieOutput,
                flagEntry = flagEntry,
                size = size,
                packageName = packageName,
                generatePreview = generatePreview
            )
        } finally {
            // Clean up temp directory
            tempDir.deleteRecursively()
        }
    }

    /**
     * Run Valkyrie CLI to convert SVG to ImageVector.
     */
    private fun runValkyrieCli(
        svgFile: File,
        outputDir: File,
        packageName: String,
        size: FlagSize
    ): String {
        val command = listOf(
            VALKYRIE_COMMAND,
            "svgxml2imagevector",
            "--input", svgFile.absolutePath,
            "--output", outputDir.absolutePath,
            "--package", "$packageName.${size.packageSuffix}",
            "--output-format", "backing-property"
        )

        val process = ProcessBuilder(command)
            .directory(outputDir)
            .redirectErrorStream(true)
            .start()

        val completed = process.waitFor(TIMEOUT_SECONDS, TimeUnit.SECONDS)
        if (!completed) {
            process.destroyForcibly()
            throw RuntimeException("Valkyrie CLI timed out after ${TIMEOUT_SECONDS}s")
        }

        val output = process.inputStream.bufferedReader().readText()
        val exitCode = process.exitValue()

        if (exitCode != 0) {
            throw RuntimeException("Valkyrie CLI failed with exit code $exitCode: $output")
        }

        // Find the generated file
        val generatedFile = outputDir.walkTopDown()
            .filter { it.isFile && it.extension == "kt" }
            .firstOrNull()
            ?: throw IllegalStateException("Valkyrie did not generate output file")

        return generatedFile.readText()
    }

    /**
     * Post-process Valkyrie output to match our required format.
     */
    private fun postProcess(
        valkyrieOutput: String,
        flagEntry: FlagEntry,
        size: FlagSize,
        packageName: String,
        generatePreview: Boolean
    ): String {
        // Extract the ImageVector.Builder content from Valkyrie output
        val builderContent = extractBuilderContent(valkyrieOutput)
            ?: throw IllegalStateException("Could not extract Builder content for ${flagEntry.propertyName}")

        return buildString {
            // Package declaration
            appendLine("package $packageName.${size.packageSuffix}")
            appendLine()

            // Imports
            appendLine("import androidx.compose.ui.graphics.Color")
            appendLine("import androidx.compose.ui.graphics.SolidColor")
            appendLine("import androidx.compose.ui.graphics.vector.ImageVector")
            appendLine("import androidx.compose.ui.graphics.vector.path")
            appendLine("import androidx.compose.ui.graphics.vector.group")
            appendLine("import androidx.compose.ui.unit.dp")
            appendLine("import $packageName.FlagIcons")

            if (generatePreview) {
                appendLine("import androidx.compose.foundation.Image")
                appendLine("import androidx.compose.foundation.layout.Box")
                appendLine("import androidx.compose.foundation.layout.padding")
                appendLine("import androidx.compose.runtime.Composable")
                appendLine("import androidx.compose.ui.Modifier")
                appendLine("import org.jetbrains.compose.ui.tooling.preview.Preview")
            }

            appendLine()

            // KDoc
            appendLine("/**")
            appendLine(" * ${flagEntry.countryName} Flag (${size.width}x${size.height}dp)")
            appendLine(" *")
            appendLine(" * - ISO Alpha-2: ${flagEntry.alpha2}")
            if (flagEntry.alpha3 != null) {
                appendLine(" * - ISO Alpha-3: ${flagEntry.alpha3}")
            }
            if (flagEntry.numeric != null) {
                appendLine(" * - ISO Numeric: ${flagEntry.numeric}")
            }
            appendLine(" *")
            appendLine(" * @see [Flagpack](https://flagpack.xyz)")
            appendLine(" */")

            // Property declaration
            appendLine("public val FlagIcons.${size.objectName}.${flagEntry.propertyName}: ImageVector")
            appendLine("    get() {")
            appendLine("        if (${flagEntry.backingFieldName} != null) {")
            appendLine("            return ${flagEntry.backingFieldName}!!")
            appendLine("        }")
            appendLine("        ${flagEntry.backingFieldName} = $builderContent")
            appendLine("        return ${flagEntry.backingFieldName}!!")
            appendLine("    }")
            appendLine()

            // Backing field
            appendLine("@Suppress(\"ObjectPropertyName\")")
            appendLine("private var ${flagEntry.backingFieldName}: ImageVector? = null")

            // Preview composable
            if (generatePreview) {
                appendLine()
                appendLine("@Preview")
                appendLine("@Composable")
                appendLine("private fun ${flagEntry.propertyName}Preview() {")
                appendLine("    Box(modifier = Modifier.padding(12.dp)) {")
                appendLine("        Image(")
                appendLine("            imageVector = FlagIcons.${size.objectName}.${flagEntry.propertyName},")
                appendLine("            contentDescription = \"${flagEntry.countryName} Flag\"")
                appendLine("        )")
                appendLine("    }")
                appendLine("}")
            }
        }
    }

    /**
     * Extract the ImageVector.Builder content from generated code.
     */
    private fun extractBuilderContent(content: String): String? {
        // Pattern for ImageVector.Builder with build()
        val patterns = listOf(
            // Pattern 1: Builder with apply block
            Regex(
                """ImageVector\.Builder\s*\([^)]*\)\s*\.apply\s*\{[\s\S]*?\}\s*\.build\(\)""",
                RegexOption.DOT_MATCHES_ALL
            ),
            // Pattern 2: Builder().path{}.build()
            Regex(
                """ImageVector\.Builder\([^)]+\)[\s\S]*?\.build\(\)""",
                RegexOption.DOT_MATCHES_ALL
            )
        )

        for (pattern in patterns) {
            pattern.find(content)?.let { return it.value }
        }

        // Fallback: extract manually using balanced braces
        val startIndex = content.indexOf("ImageVector.Builder(")
        if (startIndex >= 0) {
            val buildIndex = content.indexOf(".build()", startIndex)
            if (buildIndex >= 0) {
                return content.substring(startIndex, buildIndex + ".build()".length)
            }
        }

        return null
    }

    /**
     * Create a fallback ImageVector when Valkyrie fails.
     * This should rarely happen with Valkyrie but is included for robustness.
     */
    fun createFallbackImageVector(
        flagEntry: FlagEntry,
        size: FlagSize,
        packageName: String,
        generatePreview: Boolean = true
    ): String {
        return buildString {
            appendLine("package $packageName.${size.packageSuffix}")
            appendLine()
            appendLine("import androidx.compose.ui.graphics.Color")
            appendLine("import androidx.compose.ui.graphics.SolidColor")
            appendLine("import androidx.compose.ui.graphics.vector.ImageVector")
            appendLine("import androidx.compose.ui.graphics.vector.path")
            appendLine("import androidx.compose.ui.unit.dp")
            appendLine("import $packageName.FlagIcons")

            if (generatePreview) {
                appendLine("import androidx.compose.foundation.Image")
                appendLine("import androidx.compose.foundation.layout.Box")
                appendLine("import androidx.compose.foundation.layout.padding")
                appendLine("import androidx.compose.runtime.Composable")
                appendLine("import androidx.compose.ui.Modifier")
                appendLine("import org.jetbrains.compose.ui.tooling.preview.Preview")
            }

            appendLine()
            appendLine("/**")
            appendLine(" * ${flagEntry.countryName} Flag (${size.width}x${size.height}dp)")
            appendLine(" *")
            appendLine(" * - ISO Alpha-2: ${flagEntry.alpha2}")
            if (flagEntry.alpha3 != null) {
                appendLine(" * - ISO Alpha-3: ${flagEntry.alpha3}")
            }
            if (flagEntry.numeric != null) {
                appendLine(" * - ISO Numeric: ${flagEntry.numeric}")
            }
            appendLine(" *")
            appendLine(" * Note: This flag could not be fully converted from SVG.")
            appendLine(" * @see [Flagpack](https://flagpack.xyz)")
            appendLine(" */")
            appendLine("public val FlagIcons.${size.objectName}.${flagEntry.propertyName}: ImageVector")
            appendLine("    get() {")
            appendLine("        if (${flagEntry.backingFieldName} != null) {")
            appendLine("            return ${flagEntry.backingFieldName}!!")
            appendLine("        }")
            appendLine("        ${flagEntry.backingFieldName} = ImageVector.Builder(")
            appendLine("            name = \"${flagEntry.propertyName}\",")
            appendLine("            defaultWidth = ${size.width}.dp,")
            appendLine("            defaultHeight = ${size.height}.dp,")
            appendLine("            viewportWidth = ${size.width}f,")
            appendLine("            viewportHeight = ${size.height}f")
            appendLine("        ).apply {")
            appendLine("            // Placeholder path - flag could not be converted")
            appendLine("            path(fill = SolidColor(Color.Gray)) {")
            appendLine("                moveTo(0f, 0f)")
            appendLine("                lineTo(${size.width}f, 0f)")
            appendLine("                lineTo(${size.width}f, ${size.height}f)")
            appendLine("                lineTo(0f, ${size.height}f)")
            appendLine("                close()")
            appendLine("            }")
            appendLine("        }.build()")
            appendLine("        return ${flagEntry.backingFieldName}!!")
            appendLine("    }")
            appendLine()
            appendLine("@Suppress(\"ObjectPropertyName\")")
            appendLine("private var ${flagEntry.backingFieldName}: ImageVector? = null")

            if (generatePreview) {
                appendLine()
                appendLine("@Preview")
                appendLine("@Composable")
                appendLine("private fun ${flagEntry.propertyName}Preview() {")
                appendLine("    Box(modifier = Modifier.padding(12.dp)) {")
                appendLine("        Image(")
                appendLine("            imageVector = FlagIcons.${size.objectName}.${flagEntry.propertyName},")
                appendLine("            contentDescription = \"${flagEntry.countryName} Flag\"")
                appendLine("        )")
                appendLine("    }")
                appendLine("}")
            }
        }
    }
}
