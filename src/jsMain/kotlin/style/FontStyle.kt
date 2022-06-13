package style

import org.jetbrains.compose.web.css.*

object FontStyle : StyleSheet(AppStyleSheet) {
    val title by style {
        fontSize(60.px)
        fontWeight(900)

        media(mediaMaxWidth(640.px)) {
            self style {
                fontSize(30.px)
            }
        }
    }

    val greenTitle by style {
        fontSize(60.px)
        fontWeight(900)
        color(Color("#82BD29"))

        media(mediaMaxWidth(640.px)) {
            self style {
                fontSize(30.px)
            }
        }
    }

    val subTitle by style {
        fontSize(40.px)
        fontWeight(900)

        media(mediaMaxWidth(640.px)) {
            self style {
                fontSize(25.px)
            }
        }
    }

    val sectionTitle by style {
        fontSize(50.px)
        fontWeight(900)

        media(mediaMaxWidth(640.px)) {
            self style {
                fontSize(27.px)
            }
        }
    }

    val sectionSubTitle by style {
        fontSize(30.px)
        fontWeight(600)

        media(mediaMaxWidth(640.px)) {
            self style {
                fontSize(22.px)
            }
        }
    }

    val sectionText by style {
        fontSize(24.px)
        fontWeight(400)

        media(mediaMaxWidth(640.px)) {
            self style {
                fontSize(16.px)
            }
        }
    }
}
