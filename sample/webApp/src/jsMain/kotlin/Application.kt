
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.flagpack.sample.App
import kotlinx.browser.document
import org.jetbrains.skiko.wasm.onWasmReady

/*
 * The entry point of the WebAssembly Compose application.
 *
 * 1. Initializes the Koin dependency injection framework to set up dependencies.
 * 2. Waits for the WebAssembly environment to be ready using `onWasmReady`.
 * 3. Creates a Compose viewport linked to the document body, where the UI is rendered.
 * 4. Invokes the `SharedApp` composable, which serves as the root of the app's UI.
 */
@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        ComposeViewport(document.body!!) {
            App()
        }
    }
}
