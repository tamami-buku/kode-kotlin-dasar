package lab.aikibo

import javafx.scene.paint.Color
import javafx.scene.paint.CycleMethod
import javafx.scene.paint.LinearGradient
import javafx.scene.paint.Stop
import javafx.scene.text.FontWeight
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val mainView by cssclass()
        val zodiakView by cssclass()
    }

    init {
        mainView {
            padding = box(30.px)
            prefWidth = 400.px
            content {
                padding = box(20.px)
            }
        }

        zodiakView {
            padding = box(10.px)
            maxWidth = 400.px
            content {
                padding = box(20.px)
            }
        }
    }
}