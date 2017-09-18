package lab.aikibo.views

import javafx.scene.layout.GridPane
import lab.aikibo.controller.MainController
import lab.aikibo.Styles.Companion.zodiakView
import tornadofx.*

/**
 * Created by tamami on 9/15/17.
 */
class AquariusView: View("Aquarius") {

    override val root = GridPane()

    val mainController: MainController by inject()

    init {
        root.hgap = 10.0
        root.vgap = 10.0

        with(root) {
            addClass(zodiakView)

            row {
                label("Aquarius")
            }

            row {
                label("Karakteristik") {
                    prefWidth = 100.0
                }
                label("Otaknya jenius, tenang, penuh ide, objektif, dan cepat mengerti " +
                    "dalam memahami sesuatu") {
                    prefWidth = 300.0
                    isWrapText = true
                }
            }

            row {
                button("Kembali") {
                    setOnAction {
                        mainController.showMainView()
                    }
                }
            }
        }
    }
}