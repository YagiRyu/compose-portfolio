package style

import org.jetbrains.compose.web.css.*

object Container : StyleSheet(AppStyleSheet) {
    val topSectionContainer by style {
        flexDirection(FlexDirection.Column)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
    }
}
