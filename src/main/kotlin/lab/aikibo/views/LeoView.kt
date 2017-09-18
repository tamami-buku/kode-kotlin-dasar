package lab.aikibo.views

import javafx.scene.layout.GridPane
import lab.aikibo.Styles
import lab.aikibo.controller.MainController
import tornadofx.*

/**
 * Created by tamami on 9/15/17.
 */
class LeoView: View("Leo") {

    override val root = GridPane()

    val mainController: MainController by inject()

    init {
        root.hgap = 10.0
        root.vgap = 10.0

        with(root) {
            addClass(Styles.zodiakView)

            row {
                label("Leo")
            }

            row {
                label("Karakteristik") {
                    prefWidth = 100.0
                }
                label("Suasana hati sering berubah, sangat setia, perhatian banget, sentimentil " +
                        "sulit memaafkan kesalahan, daya ingat sangat kuat") {
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