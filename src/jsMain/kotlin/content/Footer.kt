package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import style.AppStyleSheet

@Composable
fun Footer() {
    Div(
        attrs = {
            classes(AppStyleSheet.footer)
        }
    ) {
        Text("2022 : Ryutaro Yagi")
    }
}
