import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import androidx.compose.ui.window.ComposeViewport
import com.flagpack.sample.App
import org.jetbrains.compose.resources.configureWebResources

/**
 * Main function.
 * This function is used to start the application and initialize essential components.
 * It performs the following tasks:
 * 1. Initializes Koin for dependency injection.
 * 2. Configures the web resources, specifically setting up resource path mapping.
 * 3. Creates a canvas-based window to host the Compose UI, setting the window title and the canvas element ID.
 * 4. Calls `SharedApp()` to render the root composable of the application.
 *
 * @see CanvasBasedWindow
 * @see SharedApp
 */
@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    /*
     * Configures the web resources for the application.
     * Specifically, it sets a path mapping for resources (e.g., CSS, JS).
     */
    configureWebResources {
        resourcePathMapping { path -> "./$path" }
    }

    /*
     * Creates a Canvas-based window for rendering the Compose UI.
     * This window uses the canvas element with the ID "ComposeTarget" and has the title "WebApp".
     */
    ComposeViewport(
        viewportContainerId = "ComposeTarget",
    ) {
        App()
    }
}
