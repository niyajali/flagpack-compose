package com.flagpack.sample.util

import platform.UIKit.UIPasteboard

actual object ClipboardManager {
    actual fun copyToClipboard(text: String): Boolean {
        return try {
            UIPasteboard.generalPasteboard.string = text
            true
        } catch (e: Exception) {
            false
        }
    }
}
