package lab.aikibo.views

import javafx.scene.layout.GridPane
import lab.aikibo.controller.MainController
import lab.aikibo.Styles.Companion.zodiakView
import tornadofx.*

/**
 * Created by tamami on 9/15/17.
 */
class PiscesView: View("Pisces") {

    override val root = GridPane()

    val mainController: MainController by inject()

    init {
        root.hgap = 10.0
        root.vgap = 10.0

        with(root) {
            addClass(zodiakView)

            row {
                label("Pisces")
            }

            row {
                label("Karakteristik") {
                    prefWidth = 100.0
                }
                label("Penuh rasa cinta, praktis, berjiwa sosial, suka berkhayal") {
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