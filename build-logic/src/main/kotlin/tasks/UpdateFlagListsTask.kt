package tasks

import FlagpackExtension
import models.FlagSize
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import utils.FileUtils
import java.io.File
import javax.inject.Inject

/**
 * Gradle task that generates/updates the FlagList.kt files for each size.
 * These files contain a lazy list of all flags for easy iteration.
 */
abstract class UpdateFlagListsTask @Inject constructor() : DefaultTask() {

    init {
        description = "Update FlagList.kt files with all available flags"
        group = "flagpack"
    }

    @TaskAction
    fun update() {
        val extension = project.extensions.getByType(FlagpackExtension::class.java)

        val targetPath = extension.targetPath.get()
        val packageName = extension.packageName.get()
        val supportedSizes = extension.supportedSizes.get()

        val targetDir = File(project.rootDir, targetPath)

        logger.lifecycle("Updating flag lists...")

        for (sizeCode in supportedSizes) {
            val size = FlagSize.fromCode(sizeCode)
            if (size == null) {
                logger.warn("Unknown size code: $sizeCode")
                continue
            }

            val sizeDir = File(targetDir, size.packageSuffix)
            if (!sizeDir.exists()) {
                logger.warn("Size directory not found: ${sizeDir.absolutePath}")
                continue
            }

            // Get all Kotlin files in the size directory
            val flagFiles = FileUtils.listKotlinFiles(sizeDir)
                .filter { !it.name.endsWith("FlagList.kt") }

            // Extract property names from file names
            val flagProperties = flagFiles.map { file ->
                val propertyName = file.nameWithoutExtension
                "FlagIcons.${size.objectName}.$propertyName"
            }.sorted()

            logger.lifecycle("  ${size.displayName}: ${flagProperties.size} flags")

            // Generate the FlagList.kt file
            val listContent = generateFlagListContent(
                packageName = packageName,
                size = size,
                flagProperties = flagProperties
            )

            val listFile = File(targetDir, "${size.objectName}FlagList.kt")
            listFile.writeText(listContent)
        }

        logger.lifecycle("Flag lists updated successfully")
    }

    private fun generateFlagListContent(
        packageName: String,
        size: FlagSize,
        flagProperties: List<String>
    ): String {
        return buildString {
            appendLine("package $packageName")
            appendLine()
            appendLine("import androidx.compose.ui.graphics.vector.ImageVector")

            // Import each flag
            flagProperties.forEach { prop ->
                val propertyName = prop.substringAfterLast(".")
                appendLine("import $packageName.${size.packageSuffix}.$propertyName")
            }

            appendLine()
            appendLine("/**")
            appendLine(" * List of all ${size.displayName} (${size.width}x${size.height}dp) flag icons.")
            appendLine(" *")
            appendLine(" * This list contains ${flagProperties.size} flags and is lazily initialized.")
            appendLine(" * Use this for iterating over all flags, e.g., in a flag picker.")
            appendLine(" *")
            appendLine(" * @see FlagIcons.${size.objectName}")
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
}
