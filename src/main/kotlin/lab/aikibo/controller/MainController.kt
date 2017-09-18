package lab.aikibo.controller

import lab.aikibo.views.*
import tornadofx.Controller
import tornadofx.FX
import java.time.LocalDate

class MainController : Controller() {
    val mainView: MainView by inject()
    val resultCapricorn: CapricornView by inject()
    val resultAquarius: AquariusView by inject()
    val resultPisces: PiscesView by inject()
    val resultAries: AriesView by inject()
    val resultTaurus: TaurusView by inject()
    val resultGemini: GeminiView by inject()
    val resultCancer: CancerView by inject()
    val resultLeo: LeoView by inject()
    val resultVirgo: VirgoView by inject()
    val resultLibra: LibraView by inject()
    val resultScorpio: ScorpioView by inject()
    val resultSagitarius: SagitariusView by inject()

    fun init() {
        showMainView()
    }

    fun showMainView() {
        if(FX.primaryStage.scene.root != mainView.root) {
            FX.primaryStage.scene.root = mainView.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResult(date: LocalDate) {
        if((date.monthValue == 12 && date >= LocalDate.of(date.year, 12, 22)) ||
                (date.monthValue == 1 && date <= LocalDate.of(date.year, 1, 20))) {
            showResultCapricorn()
        }
        if((date.monthValue == 1 && date >= LocalDate.of(date.year, 1, 21)) ||
                (date.monthValue == 2 && date <= LocalDate.of(date.year, 2, 19))) {
            showResultAquarius()
        }
        if((date.monthValue == 2 && date >= LocalDate.of(date.year, 2, 20)) ||
                (date.monthValue == 3 && date <= LocalDate.of(date.year, 3, 20))) {
            showResultPisces()
        }
        if((date.monthValue == 3 && date >= LocalDate.of(date.year, 3, 21)) ||
                (date.monthValue == 4 && date <= LocalDate.of(date.year, 4, 19))) {
            showResultAries()
        }
        if((date.monthValue == 4 && date >= LocalDate.of(date.year, 4, 21)) ||
                (date.monthValue == 5 && date <= LocalDate.of(date.year, 5, 20))) {
            showResultTaurus()
        }
        if((date.monthValue == 5 && date >= LocalDate.of(date.year, 5, 21))||
                (date.monthValue == 6 && date <= LocalDate.of(date.year, 6, 21))) {
            showResultGemini()
        }
        if((date.monthValue == 6 && date >= LocalDate.of(date.year, 6, 22)) ||
                (date.monthValue == 7 && date <= LocalDate.of(date.year, 7, 22))) {
            showResultCancer()
        }
        if((date.monthValue == 7 && date >= LocalDate.of(date.year, 7, 23)) ||
                (date.monthValue == 8 && date <= LocalDate.of(date.year, 8, 23))) {
            showResultLeo()
        }
        if((date.monthValue == 8 && date >= LocalDate.of(date.year, 8, 24)) ||
                (date.monthValue == 9 && date <= LocalDate.of(date.year, 9, 22))) {
            showResultVirgo()
        }
        if((date.monthValue == 9 && date >= LocalDate.of(date.year, 9, 23)) ||
                (date.monthValue == 10 && date <= LocalDate.of(date.year, 10, 23))) {
            showResultLibra()
        }
        if((date.monthValue == 10 && date >= LocalDate.of(date.year, 10, 24)) ||
                (date.monthValue == 11 && date <= LocalDate.of(date.year, 11, 22))) {
            showResultScorpio()
        }
        if((date.monthValue == 11 && date >= LocalDate.of(date.year, 11, 23)) ||
                (date.monthValue == 12 && date <= LocalDate.of(date.year, 12, 21))) {
            showResultSagitarius()
        }
    }

    fun showResultCapricorn() {
        if(FX.primaryStage.scene.root != resultCapricorn.root) {
            FX.primaryStage.scene.root = resultCapricorn.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultAquarius() {
        if(FX.primaryStage.scene.root != resultAquarius.root) {
            FX.primaryStage.scene.root = resultAquarius.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultPisces() {
        if(FX.primaryStage.scene.root != resultPisces.root) {
            FX.primaryStage.scene.root = resultPisces.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultAries() {
        if(FX.primaryStage.scene.root != resultAries.root) {
            FX.primaryStage.scene.root = resultAries.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultTaurus() {
        if(FX.primaryStage.scene.root != resultTaurus.root) {
            FX.primaryStage.scene.root = resultTaurus.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultGemini() {
        if(FX.primaryStage.scene.root != resultGemini.root) {
            FX.primaryStage.scene.root = resultGemini.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultCancer() {
        if(FX.primaryStage.scene.root != resultCancer.root) {
            FX.primaryStage.scene.root = resultCancer.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultLeo() {
        if(FX.primaryStage.scene.root != resultLeo.root) {
            FX.primaryStage.scene.root = resultLeo.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultVirgo() {
        if(FX.primaryStage.scene.root != resultVirgo.root) {
            FX.primaryStage.scene.root = resultVirgo.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultLibra() {
        if(FX.primaryStage.scene.root != resultLibra.root) {
            FX.primaryStage.scene.root = resultLibra.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultScorpio() {
        if(FX.primaryStage.scene.root != resultScorpio.root) {
            FX.primaryStage.scene.root = resultScorpio.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun showResultSagitarius() {
        if(FX.primaryStage.scene.root != resultSagitarius.root) {
            FX.primaryStage.scene.root = resultSagitarius.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }
}