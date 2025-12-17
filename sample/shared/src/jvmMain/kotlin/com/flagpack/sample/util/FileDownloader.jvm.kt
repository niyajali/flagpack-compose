package com.flagpack.sample.util

import java.awt.FileDialog
import java.awt.Frame
import java.io.File
import java.io.FileWriter
import javax.swing.JFileChooser
import javax.swing.filechooser.FileNameExtensionFilter

actual object FileDownloader {
    actual fun downloadFile(content: String, fileName: String, format: ExportFormat): DownloadResult {
        return try {
            val fullFileName = "$fileName.${format.extension}"

            // Try to use JFileChooser for file save dialog
            val fileChooser = JFileChooser().apply {
                dialogTitle = "Save ${format.displayName} File"
                selectedFile = File(fullFileName)
                fileFilter = FileNameExtensionFilter(
                    "${format.displayName} Files (*.${format.extension})",
                    format.extension
                )
            }

            val result = fileChooser.showSaveDialog(null)
            if (result == JFileChooser.APPROVE_OPTION) {
                var file = fileChooser.selectedFile
                // Ensure correct extension
                if (!file.name.endsWith(".${format.extension}")) {
                    file = File(file.absolutePath + ".${format.extension}")
                }

                FileWriter(file).use { writer ->
                    writer.write(content)
                }

                DownloadResult.Success("Saved to ${file.absolutePath}")
            } else {
                DownloadResult.Error("Save cancelled")
            }
        } catch (e: Exception) {
            // Fallback: save to user home directory
            try {
                val homeDir = System.getProperty("user.home")
                val downloadsDir = File(homeDir, "Downloads")
                if (!downloadsDir.exists()) {
                    downloadsDir.mkdirs()
                }
                val fullFileName = "$fileName.${format.extension}"
                val file = File(downloadsDir, fullFileName)

                FileWriter(file).use { writer ->
                    writer.write(content)
                }

                DownloadResult.Success("Saved to ${file.absolutePath}")
            } catch (e2: Exception) {
                DownloadResult.Error("Failed to save file: ${e2.message}")
            }
        }
    }

    actual fun isSupported(): Boolean = true
}
