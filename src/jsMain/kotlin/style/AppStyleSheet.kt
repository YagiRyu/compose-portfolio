package style

import org.jetbrains.compose.web.css.*

object AppStyleSheet : StyleSheet() {
    val centerContainer by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        width(100.vw)
        height(100.vh)
    }

    val footer by style {
        display(DisplayStyle.Flex)
        position(Position.Fixed)
        bottom(0.px)
        justifyContent(JustifyContent.Center)
        paddingBottom(16.px)
        alignItems(AlignItems.Center)
        width(100.vw)
    }
}
