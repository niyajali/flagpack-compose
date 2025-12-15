package com.flagpack.sample.util

import kotlinx.browser.window

actual object ClipboardManager {
    actual fun copyToClipboard(text: String): Boolean {
        return try {
            window.navigator.clipboard.writeText(text)
            true
        } catch (e: Exception) {
            false
        }
    }
}
