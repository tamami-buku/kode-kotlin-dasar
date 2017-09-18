package lab.aikibo.views

import javafx.scene.Parent
import javafx.scene.layout.BorderPane
import javafx.scene.layout.GridPane
import tornadofx.View
import tornadofx.addClass
import lab.aikibo.Styles.Companion.zodiakView
import lab.aikibo.controller.MainController
import tornadofx.borderpane
import tornadofx.*

/**
 * Created by tamami on 9/14/17.
 */
class CapricornView : View("Capricorn") {

    override val root = GridPane()

    val mainController: MainController by inject()

    init {
        title = "Bintang Capricorn"
        root.hgap = 10.0
        root.vgap = 10.0

        with(root) {
            addClass(zodiakView)

            row {
                label("Capricorn")
            }
            row {
                useMaxWidth = true
                label("Karakteristik") {
                    prefWidth = 100.0
                }
                label("Gengsinya tinggi, rajin, pendiam, materialis, teguh pendirian, " +
                    "ambisius terhadap target, suka memerintah orang lain, dan mampu mengorganisir") {
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