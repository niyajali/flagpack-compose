package com.flagpack.sample.util

/**
 * File format types for flag export
 */
enum class ExportFormat(val extension: String, val mimeType: String, val displayName: String) {
    SVG("svg", "image/svg+xml", "SVG"),
    XML("xml", "application/xml", "Vector XML")
}

/**
 * Result of a file download/save operation
 */
sealed class DownloadResult {
    data class Success(val message: String) : DownloadResult()
    data class Error(val message: String) : DownloadResult()
}

/**
 * Multiplatform file downloader for saving flag exports to the file system.
 * Each platform implements this differently based on available APIs.
 */
expect object FileDownloader {
    /**
     * Download/save a file with the given content.
     *
     * @param content The file content to save
     * @param fileName The name of the file (without extension)
     * @param format The export format (SVG or XML)
     * @return DownloadResult indicating success or failure
     */
    fun downloadFile(content: String, fileName: String, format: ExportFormat): DownloadResult

    /**
     * Check if file download is supported on this platform.
     * @return true if download is supported
     */
    fun isSupported(): Boolean
}
