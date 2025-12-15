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
    private const val MAX_LINES_THRESHOLD = 3000

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
            "--input-path", svgFile.absolutePath,
            "--output-path", outputDir.absolutePath,
            "--package-name", "$packageName.${size.packageSuffix}",
            "--output-format", "lazy-property"
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

        val content = generatedFile.readText()

        // Check line count to prevent build failures with overly complex SVGs
        val lineCount = content.lines().size
        if (lineCount > MAX_LINES_THRESHOLD) {
            throw IllegalStateException(
                "Generated file exceeds $MAX_LINES_THRESHOLD lines ($lineCount lines). " +
                "SVG is too complex and may cause build failures."
            )
        }

        return content
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
        var builderContent = extractBuilderContent(valkyrieOutput)
            ?: throw IllegalStateException("Could not extract Builder content for ${flagEntry.propertyName}")

        // Replace the name with a structured name for filtering/UI
        val structuredName = buildImageVectorName(flagEntry, size)
        builderContent = replaceBuilderName(builderContent, structuredName)

        // Extract imports from Valkyrie output (may include PathFillType, StrokeCap, etc.)
        val valkyrieImports = extractImports(valkyrieOutput)

        // Base required imports
        val baseImports = mutableSetOf(
            "androidx.compose.ui.graphics.Color",
            "androidx.compose.ui.graphics.SolidColor",
            "androidx.compose.ui.graphics.vector.ImageVector",
            "androidx.compose.ui.graphics.vector.path",
            "androidx.compose.ui.unit.dp",
            "$packageName.FlagIcons"
        )

        // Preview-related imports
        val previewImports = if (generatePreview) {
            setOf(
                "androidx.compose.foundation.Image",
                "androidx.compose.foundation.layout.Box",
                "androidx.compose.foundation.layout.padding",
                "androidx.compose.runtime.Composable",
                "androidx.compose.ui.Modifier",
                "org.jetbrains.compose.ui.tooling.preview.Preview"
            )
        } else {
            emptySet()
        }

        // Merge all imports and filter out package declaration artifacts
        val allImports = (baseImports + previewImports + valkyrieImports)
            .filter { it.startsWith("androidx.") || it.startsWith("org.jetbrains.") || it.startsWith("kotlin.") || it.startsWith(packageName) }
            .sorted()

        return buildString {
            // Package declaration
            appendLine("package $packageName.${size.packageSuffix}")
            appendLine()

            // Imports
            allImports.forEach { appendLine("import $it") }

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

            // Property declaration using lazy delegate
            appendLine("public val FlagIcons.${size.objectName}.${flagEntry.propertyName}: ImageVector by lazy {")
            appendLine("    $builderContent")
            appendLine("}")

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
     * Build a structured name for the ImageVector that can be parsed for filtering/UI.
     * Format: "CountryName:Alpha2:Alpha3:Numeric:Size"
     * Example: "Afghanistan:AF:AFG:004:Large"
     *
     * Components can be extracted by splitting on ':'
     * - [0] Country Name
     * - [1] ISO Alpha-2 code
     * - [2] ISO Alpha-3 code (or empty)
     * - [3] ISO Numeric code (or empty)
     * - [4] Size (Small/Medium/Large)
     */
    private fun buildImageVectorName(flagEntry: FlagEntry, size: FlagSize): String {
        return listOf(
            flagEntry.countryName,
            flagEntry.alpha2,
            flagEntry.alpha3 ?: "",
            flagEntry.numeric ?: "",
            size.objectName
        ).joinToString(":")
    }

    /**
     * Replace the name parameter in ImageVector.Builder with a structured name.
     */
    private fun replaceBuilderName(builderContent: String, newName: String): String {
        // Match name = "..." or name = "...", patterns
        val namePattern = Regex("""name\s*=\s*"[^"]*"""")
        return namePattern.replaceFirst(builderContent, """name = "$newName"""")
    }

    /**
     * Extract imports from Valkyrie-generated code.
     * This captures additional imports like PathFillType, StrokeCap, etc.
     */
    private fun extractImports(content: String): Set<String> {
        val importPattern = Regex("""^import\s+(.+)$""", RegexOption.MULTILINE)
        return importPattern.findAll(content)
            .map { it.groupValues[1].trim() }
            .toSet()
    }

    /**
     * Extract the ImageVector.Builder content from generated code.
     * Handles both backing-property and lazy-property output formats.
     */
    private fun extractBuilderContent(content: String): String? {
        // Find the start of ImageVector.Builder
        val startIndex = content.indexOf("ImageVector.Builder(")
        if (startIndex < 0) return null

        // Find the matching .build() call
        val buildIndex = content.indexOf(".build()", startIndex)
        if (buildIndex < 0) return null

        return content.substring(startIndex, buildIndex + ".build()".length)
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
            val structuredName = buildImageVectorName(flagEntry, size)
            appendLine("public val FlagIcons.${size.objectName}.${flagEntry.propertyName}: ImageVector by lazy {")
            appendLine("    ImageVector.Builder(")
            appendLine("        name = \"$structuredName\",")
            appendLine("        defaultWidth = ${size.width}.dp,")
            appendLine("        defaultHeight = ${size.height}.dp,")
            appendLine("        viewportWidth = ${size.width}f,")
            appendLine("        viewportHeight = ${size.height}f")
            appendLine("    ).apply {")
            appendLine("        // Placeholder path - flag could not be converted")
            appendLine("        path(fill = SolidColor(Color.Gray)) {")
            appendLine("            moveTo(0f, 0f)")
            appendLine("            lineTo(${size.width}f, 0f)")
            appendLine("            lineTo(${size.width}f, ${size.height}f)")
            appendLine("            lineTo(0f, ${size.height}f)")
            appendLine("            close()")
            appendLine("        }")
            appendLine("    }.build()")
            appendLine("}")

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
