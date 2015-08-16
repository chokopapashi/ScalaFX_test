import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.Includes._
import scalafx.scene.control.{Button, Label, TextField}
import scalafx.scene.layout.BorderPane
import scalafx.scene.paint.Color
import scalafx.scene.Scene


object EventHandlerAndHandleEventTest extends JFXApp {
    stage = new JFXApp.PrimaryStage {
        title.value = "Event Handler And Handle Event Test"
//        width = 600
//        height = 450
        scene = new Scene {
            fill = Color.LightGreen

            content = new BorderPane {
                val label = new Label("Test")
                top = label
                val field = new TextField
                center = field
                bottom = new Button("Click") {
                    style = Style.OSX_Lion_Default
                    onAction = { (_: ActionEvent) =>
                        label.text = "You typed: " + field.text()
                    }
                }
            }
        }
    }
}




