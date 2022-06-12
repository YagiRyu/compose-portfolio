package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import style.AppStyleSheet
import style.Container
import style.FontStyle

@Composable
fun TopSction() {
    Div(
        attrs = {
            classes(Container.topSectionContainer)
        }
    ) {
        P(
            attrs = {
                classes(FontStyle.title)
            }
        ) {
            Text("Hi🙌 I'm ")
            Span(
                attrs = {
                    classes(FontStyle.greenTitle)
                }
            ) {
                Text(" Ryutaro Yagi")
            }
        }
        P(
            attrs = {
                classes(FontStyle.subTitle)
            }
        ) {
            Text("Android Engineer")
        }
        Div(
            attrs = {
                classes(Container.topSectionIconContainer)
            }
        ) {
            A(
                href = "https://github.com/YagiRyu"
            ) {
                Img(
                    src = "github.png",
                    attrs = {
                        classes(AppStyleSheet.topSectionIconSize)
                    }
                )
            }
            A(
                href = "https://twitter.com/K3Kcj"
            ) {
                Img(
                    src = "twitter.png",
                    attrs = {
                        classes(AppStyleSheet.topSectionIconSize)
                    }
                )
            }
        }
    }
}
