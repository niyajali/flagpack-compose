package com.flagpack.sample.util

import kotlinx.browser.window

actual object ClipboardManager {
    actual fun copyToClipboard(text: String): Boolean {
        return try {
            window.navigator.clipboard.writeText(text)
            true
        } catch (e: Exception) {
            // Fallback for older browsers
            try {
                val textArea = kotlinx.browser.document.createElement("textarea")
                textArea.asDynamic().value = text
                textArea.asDynamic().style.position = "fixed"
                textArea.asDynamic().style.left = "-9999px"
                kotlinx.browser.document.body?.appendChild(textArea)
                textArea.asDynamic().select()
                kotlinx.browser.document.asDynamic().execCommand("copy")
                kotlinx.browser.document.body?.removeChild(textArea)
                true
            } catch (e2: Exception) {
                false
            }
        }
    }
}
