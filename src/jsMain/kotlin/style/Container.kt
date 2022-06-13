package style

import org.jetbrains.compose.web.css.*

object Container : StyleSheet(AppStyleSheet) {
    val topSectionContainer by style {
        flexDirection(FlexDirection.Column)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        background("url(pc.jpg) no-repeat center")
        backgroundSize("cover")
        position(Position.Relative)
        overflow("hidden")
        width(100.vw)
        height(100.vh)

        media(mediaMaxWidth(640.px)) {
            self style {
                height(300.px)
            }
        }
    }

    val topSectionIconContainer by style {
        flexDirection(FlexDirection.Row)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
    }

    val profileSectionContainer by style {
        flexDirection(FlexDirection.Column)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        width(100.vw)
        height(100.vh)

        media(mediaMaxWidth(640.px)) {
            self style {
                height(500.px)
            }
        }
    }

    val profileImage by style {
        borderRadius(r = 100.px)
        width(300.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                width(200.px)
            }
        }
    }

    val profileTextContainer by style {
        marginLeft(20.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                marginLeft(10.px)
            }
        }
    }

    val profileImageAndTextContainer by style {
        margin(30.px)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceAround)
        alignItems(AlignItems.Center)
        flexDirection(FlexDirection.Row)
    }

    val skillsSectionContainer by style {
        flexDirection(FlexDirection.Column)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        width(100.vw)
        height(100.vh)
    }
}
