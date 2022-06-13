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
                classes(Container.profileImageAndTextContainer)
            }
        ) {
            Img(
                src = "profile.jpg",
                attrs = {
                    classes(Container.profileImage)
                }
            )
            Div(
                attrs = {
                    classes(Container.profileTextContainer)
                }
            ) {
                P(
                    attrs = {
                        classes(FontStyle.sectionText)
                    }
                ) {
                    Text("やぎりゅう（八木 利生太郎）")
                }
                P(
                    attrs = {
                        classes(FontStyle.sectionText)
                    }
                ) {
                    Text("AndroidアプリやiOSアプリの開発をやっています。")
                }
                P(
                    attrs = {
                        classes(FontStyle.sectionText)
                    }
                ) {
                    Text("他だと、CやRustが好きで最近勉強します。")
                }
            }
        }
    }
}
