package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import style.Container
import style.FontStyle

@Composable
fun ProfileSection() {
    Div(
        attrs = {
            classes(Container.profileSectionContainer)
        }
    ) {
        H1(
            attrs = {
                classes(FontStyle.sectionTitle)
            }
        ) {
            Text("Profile")
        }

        Div(
            attrs = {
                classes()
            }
        ) {
            Img(
                src = "profile.jpg",
                attrs = {
                    classes(Container.profileImage)
                }
            )
        }
    }
}
