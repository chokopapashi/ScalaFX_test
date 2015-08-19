import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.Includes._
import scalafx.scene.control.{CheckBox, Label}
import scalafx.scene.layout.BorderPane
import scalafx.scene.paint.Color
import scalafx.scene.Scene

object CheckBoxTest extends JFXApp {
    stage = new JFXApp.PrimaryStage {
        title.value = "Check Box Test"
        width = 320
        height = 120
        scene = new Scene {
//            fill = Color.LightGreen
/* ------------------------------------------------------------------------ */
            content = new BorderPane {
                val label = new Label("Test")
                top = label
                center = new CheckBox("Check Box") {
                    style = """-fx-border-color: lightblue;
                               -fx-border-width: 2;"""
                    selected = true
                    indeterminate = true
                    onAction = { (_: ActionEvent) =>
                        label.text = if(selected()) "Selected!" else "Not selected..."
                    }
                }
/* ------------------------------------------------------------------------ */
            }
        }
    }
}








