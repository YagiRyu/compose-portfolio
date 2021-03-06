package style

import org.jetbrains.compose.web.css.*

object AppStyleSheet : StyleSheet() {
    val centerContainer by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        color(Color.white)
        background("#000000")
    }

    val footer by style {
        display(DisplayStyle.Flex)
        bottom(0.px)
        justifyContent(JustifyContent.Center)
        paddingBottom(16.px)
        alignItems(AlignItems.Center)
        width(100.vw)
        background("#000000")
    }

    val topSectionIconSize by style {
        width(40.px)
        marginRight(8.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                width(26.px)
            }
        }
    }
}
