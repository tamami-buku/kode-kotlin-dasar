package lab.aikibo.views

import lab.aikibo.Styles
import javafx.scene.control.Alert.AlertType.INFORMATION
import javafx.scene.control.DatePicker
import javafx.scene.layout.HBox
import tornadofx.*
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import java.time.LocalDateTime
import lab.aikibo.Styles.Companion.mainView
import lab.aikibo.controller.MainController
import java.time.LocalDate
import java.time.LocalDate.now

class MainView : View("Hello TornadoFX") {
    override val root = GridPane()
    val mainController: MainController by inject()

    lateinit var tglLahir: DatePicker

    init {
        title = "Aplikasi Zodiak"
        root.hgap = 10.0
        root.vgap = 10.0

        with(root) {
            addClass(mainView)

            row("Tanggal Lahir") {
                tglLahir = datepicker()
                tglLahir.value = LocalDate.now()
            }

            row {
                button("Proses") {
                    isDefaultButton = true

                    setOnAction {
                        mainController.showResult(tglLahir.value)
                    }
                }
            }
        }
    }
}