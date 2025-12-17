package com.flagpack.sample.util

import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.url.URL
import org.w3c.files.Blob
import org.w3c.files.BlobPropertyBag

actual object FileDownloader {
    @OptIn(ExperimentalWasmJsInterop::class)
    actual fun downloadFile(content: String, fileName: String, format: ExportFormat): DownloadResult {
        return try {
            val fullFileName = "$fileName.${format.extension}"

            // Create JsArray and add content as JsString
            val parts = JsArray<JsAny?>()
            parts[0] = content.toJsString()

            // Create blob from content
            val blob = Blob(
                parts,
                BlobPropertyBag(type = format.mimeType)
            )

            // Create object URL for the blob
            val url = URL.createObjectURL(blob)

            // Create download link
            val link = document.createElement("a") as HTMLAnchorElement
            link.href = url
            link.download = fullFileName
            link.style.display = "none"

            // Append to body, click, and remove
            document.body?.appendChild(link)
            link.click()
            document.body?.removeChild(link)

            // Revoke the object URL to free memory
            URL.revokeObjectURL(url)

            DownloadResult.Success("Download started: $fullFileName")
        } catch (e: Exception) {
            DownloadResult.Error("Failed to download: ${e.message}")
        }
    }

    actual fun isSupported(): Boolean = true
}
