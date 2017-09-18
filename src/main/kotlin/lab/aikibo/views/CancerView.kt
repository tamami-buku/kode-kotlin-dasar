package lab.aikibo.views

import javafx.scene.layout.GridPane
import lab.aikibo.Styles
import lab.aikibo.controller.MainController
import tornadofx.*


/**
 * Created by tamami on 9/15/17.
 */
class CancerView: View("Cancer") {

    override val root = GridPane()

    val mainController: MainController by inject()

    init {
        root.hgap = 10.0
        root.vgap = 10.0

        with(root) {
            addClass(Styles.zodiakView)

            row {
                label("Cancer")
            }

            row {
                label("Karakteristik") {
                    prefWidth = 100.0
                }
                label("Sangat setia, penuh perhatian, sulit memaafkan, daya ingat sangat kuat " +
                        "suasana hati berubah-ubah, berjiwa sentimentil") {
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