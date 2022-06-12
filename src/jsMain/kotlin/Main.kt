import components.Layout
import content.Footer
import content.ProfileSection
import content.SkillsSection
import content.TopSction
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.renderComposable
import style.AppStyleSheet

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Layout {
            TopSction()
            ProfileSection()
            SkillsSection()
            Footer()
        }
    }
}

