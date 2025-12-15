package com.flagpack.sample.util

/**
 * Multiplatform clipboard manager for copying text to system clipboard.
 */
expect object ClipboardManager {
    /**
     * Copy text to the system clipboard.
     * @param text The text to copy
     * @return true if successful, false otherwise
     */
    fun copyToClipboard(text: String): Boolean
}
