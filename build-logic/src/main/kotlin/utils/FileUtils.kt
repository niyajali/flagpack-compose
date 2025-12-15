package utils

import java.io.File

/**
 * Utility functions for file operations.
 */
object FileUtils {

    /**
     * Convert a string to PascalCase for use in Kotlin property names.
     */
    fun String.toPascalCase(): String {
        return this.replace("-", " ")
            .replace("_", " ")
            .split(Regex("\\s+"))
            .filter { it.isNotEmpty() }
            .joinToString("") { word ->
                word.lowercase().replaceFirstChar { it.uppercase() }
            }
    }

    /**
     * Convert a string to camelCase for use in Kotlin variable names.
     */
    fun String.toCamelCase(): String {
        val pascalCase = this.toPascalCase()
        return pascalCase.replaceFirstChar { it.lowercase() }
    }

    /**
     * Get the alpha2 code from an SVG filename.
     * Handles filenames like "US.svg", "GB-UKM.svg", "BQ-BO.svg"
     */
    fun getAlpha2FromFilename(filename: String): String {
        return filename.removeSuffix(".svg")
    }

    /**
     * Recursively delete a directory and all its contents.
     */
    fun deleteRecursively(file: File): Boolean {
        if (file.isDirectory) {
            file.listFiles()?.forEach { child ->
                deleteRecursively(child)
            }
        }
        return file.delete()
    }

    /**
     * Ensure a directory exists, creating it if necessary.
     */
    fun ensureDirectory(dir: File): File {
        if (!dir.exists()) {
            dir.mkdirs()
        }
        return dir
    }

    /**
     * Copy a file to a destination directory.
     */
    fun copyFile(source: File, destDir: File): File {
        ensureDirectory(destDir)
        val destFile = File(destDir, source.name)
        source.copyTo(destFile, overwrite = true)
        return destFile
    }

    /**
     * List all SVG files in a directory.
     */
    fun listSvgFiles(dir: File): List<File> {
        return dir.listFiles()
            ?.filter { it.isFile && it.extension.equals("svg", ignoreCase = true) }
            ?.sortedBy { it.name }
            ?: emptyList()
    }

    /**
     * List all Kotlin files in a directory.
     */
    fun listKotlinFiles(dir: File): List<File> {
        return dir.listFiles()
            ?.filter { it.isFile && it.extension.equals("kt", ignoreCase = true) }
            ?.sortedBy { it.name }
            ?: emptyList()
    }

    /**
     * Write content to a file, creating parent directories if needed.
     */
    fun writeFile(file: File, content: String) {
        file.parentFile?.let { ensureDirectory(it) }
        file.writeText(content)
    }

    /**
     * Append content to a file, creating it if it doesn't exist.
     */
    fun appendFile(file: File, content: String) {
        file.parentFile?.let { ensureDirectory(it) }
        file.appendText(content)
    }

    /**
     * Check if two files have the same content.
     */
    fun filesAreEqual(file1: File, file2: File): Boolean {
        if (!file1.exists() || !file2.exists()) return false
        if (file1.length() != file2.length()) return false
        return file1.readBytes().contentEquals(file2.readBytes())
    }
}
