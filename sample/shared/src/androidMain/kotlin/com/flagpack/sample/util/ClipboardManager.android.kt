package com.flagpack.sample.util

import android.content.ClipData
import android.content.ClipboardManager as AndroidClipboardManager
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private var appContext: Context? = null

@Composable
fun ProvideClipboardContext() {
    appContext = LocalContext.current.applicationContext
}

actual object ClipboardManager {
    actual fun copyToClipboard(text: String): Boolean {
        return try {
            val context = appContext ?: return false
            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as AndroidClipboardManager
            val clip = ClipData.newPlainText("Flag Code", text)
            clipboard.setPrimaryClip(clip)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun setContext(context: Context) {
        appContext = context.applicationContext
    }
}
