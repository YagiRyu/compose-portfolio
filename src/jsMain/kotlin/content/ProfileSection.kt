package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import style.Container

@Composable
fun ProfileSection() {
    Div(
        attrs = {
            classes(Container.profileSectionContainer)
            id("profile")
        }
    ) {
        Text("Profile Section")
    }
}
