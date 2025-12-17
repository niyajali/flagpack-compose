package com.flagpack.sample.util

import android.content.ContentValues
import android.content.Context
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import java.io.File
import java.io.FileOutputStream

private var appContext: Context? = null

actual object FileDownloader {
    actual fun downloadFile(content: String, fileName: String, format: ExportFormat): DownloadResult {
        return try {
            val context = appContext ?: return DownloadResult.Error("Context not available")
            val fullFileName = "$fileName.${format.extension}"

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                // Use MediaStore for Android 10+
                val contentValues = ContentValues().apply {
                    put(MediaStore.MediaColumns.DISPLAY_NAME, fullFileName)
                    put(MediaStore.MediaColumns.MIME_TYPE, format.mimeType)
                    put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOWNLOADS)
                }

                val resolver = context.contentResolver
                val uri = resolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues)
                    ?: return DownloadResult.Error("Failed to create file")

                resolver.openOutputStream(uri)?.use { outputStream ->
                    outputStream.write(content.toByteArray())
                }

                DownloadResult.Success("Saved to Downloads/$fullFileName")
            } else {
                // Use legacy storage for older Android versions
                @Suppress("DEPRECATION")
                val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                val file = File(downloadsDir, fullFileName)
                FileOutputStream(file).use { outputStream ->
                    outputStream.write(content.toByteArray())
                }
                DownloadResult.Success("Saved to Downloads/$fullFileName")
            }
        } catch (e: Exception) {
            DownloadResult.Error("Failed to save file: ${e.message}")
        }
    }

    actual fun isSupported(): Boolean = true

    fun setContext(context: Context) {
        appContext = context.applicationContext
    }
}
