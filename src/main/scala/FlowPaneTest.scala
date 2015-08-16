import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint.Color
import scalafx.scene.layout.FlowPane
import scalafx.scene.control.Label

object FlowPaneTest extends JFXApp {
    stage = new JFXApp.PrimaryStage {
        title.value = "Flow pane Test"
        width = 600
        height = 450
        scene = new Scene {
            fill = Color.LightGreen

            content = new FlowPane {
                children = Seq(
                    new Label("abc") {
                        style  = "-fx-font-size: 48pt"
                    },
                    new Label(" "),
                    new Label("def") {
                        style  = "-fx-font-size: 48pt"
                    },
                    new Label(" "),
                    new Label("ghi"){
                        style  = "-fx-font-size: 48pt"
                    })
            }

/*
            content = new Rectangle {
                x = 25
                y = 40
                width = 100
                height = 100
                fill <== when (hover) choose Color.Green otherwise Color.Red
            }
*/
        }
    }
}


