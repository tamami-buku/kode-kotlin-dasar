package lab.aikibo.views

import javafx.scene.layout.GridPane
import lab.aikibo.Styles
import lab.aikibo.controller.MainController
import tornadofx.*

/**
 * Created by tamami on 9/15/17.
 */
class TaurusView: View("Taurus") {

    override val root = GridPane()

    val mainController: MainController by inject()

    init {
        root.hgap = 10.0
        root.vgap = 10.0

        with(root) {
            addClass(Styles.zodiakView)

            row {
                label("Taurus")
            }

            row {
                label("Karakteristik") {
                    prefWidth = 100.0
                }
                label("Materialistis, keras kepala, pasif, praktis dan setia dalam cinta " +
                        "ramah serta sabar, memiliki toleransi yang tinggi") {
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