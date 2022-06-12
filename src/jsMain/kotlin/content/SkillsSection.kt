package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import style.Container

@Composable
fun SkillsSection() {
    Div(
        attrs = {
            classes(Container.skillsSectionContainer)
            id("skills")
        }
    ) {
        Text("Sills Section")
    }
}
