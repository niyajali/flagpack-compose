package com.flagpack.sample.util

import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSURL
import platform.Foundation.NSUserDomainMask
import platform.Foundation.writeToURL

@OptIn(ExperimentalForeignApi::class)
actual object FileDownloader {
    actual fun downloadFile(content: String, fileName: String, format: ExportFormat): DownloadResult {
        return try {
            val fullFileName = "$fileName.${format.extension}"

            val fileManager = NSFileManager.defaultManager
            val urls = fileManager.URLsForDirectory(NSDocumentDirectory, NSUserDomainMask)
            val documentsUrl = urls.firstOrNull() as? NSURL
                ?: return DownloadResult.Error("Could not find Documents directory")

            val fileUrl = documentsUrl.URLByAppendingPathComponent(fullFileName)
                ?: return DownloadResult.Error("Could not create file URL")

            val nsString = content as Any
            @Suppress("UNCHECKED_CAST")
            val success = (nsString as platform.Foundation.NSString).writeToURL(
                fileUrl,
                atomically = true,
                encoding = platform.Foundation.NSUTF8StringEncoding,
                error = null
            )

            if (success) {
                DownloadResult.Success("Saved to Documents/$fullFileName")
            } else {
                DownloadResult.Error("Failed to write file")
            }
        } catch (e: Exception) {
            DownloadResult.Error("Failed to save file: ${e.message}")
        }
    }

    actual fun isSupported(): Boolean = true
}
