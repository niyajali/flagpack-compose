package com.flagpack.sample.util

import java.awt.Toolkit
import java.awt.datatransfer.StringSelection

actual object ClipboardManager {
    actual fun copyToClipboard(text: String): Boolean {
        return try {
            val clipboard = Toolkit.getDefaultToolkit().systemClipboard
            val selection = StringSelection(text)
            clipboard.setContents(selection, selection)
            true
        } catch (e: Exception) {
            false
        }
    }
}
