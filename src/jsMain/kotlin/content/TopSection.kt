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
            Span(
                attrs = {
                    classes(FontStyle.greenTitle)
                }
            ) {
                Text("Android Engineer")
            }
        }
    }
}
