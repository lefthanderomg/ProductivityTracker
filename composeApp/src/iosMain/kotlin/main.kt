import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController
import productivity.tracker.app.App

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}
