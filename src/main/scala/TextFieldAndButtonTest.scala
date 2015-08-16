import scalafx.application.JFXApp
import scalafx.Includes._
import scalafx.scene.control.{Button, Label, TextField}
import scalafx.scene.layout.BorderPane
import scalafx.scene.paint.Color
import scalafx.scene.Scene

object TextFieldAndButtonTest extends JFXApp {
    stage = new JFXApp.PrimaryStage {
        title.value = "TextField And Button Test"
//        width = 600
//        height = 450
        scene = new Scene {
            fill = Color.LightGreen

            content = new BorderPane {

                top = new Label("This is TextField And Button Test of JavaFX!")
                center = new TextField
                bottom = new Button("Click") {
//                    style = """-fx-background-color:
//                                    linear-gradient(#f0ff35, #a9ff00),
//                                    radial-gradient(center 50% -40%, radius 200%, #b8ee36 45%, #80c800 50%);
//                               -fx-background-radius: 6, 5;
//                               -fx-background-insets: 0, 1;
//                               -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 );
//                               -fx-text-fill: #395306;"""
                    style = """-fx-background-color: 
                                   rgba(0,0,0,0.08),
                                   linear-gradient(#5a61af, #51536d),
                                   linear-gradient(#e4fbff 0%,#cee6fb 10%, #a5d3fb 50%, #88c6fb 51%, #d5faff 100%);
                               -fx-background-insets: 0 0 -1 0,0,1;
                               -fx-background-radius: 5,5,4;
                               -fx-padding: 3 30 3 30;
                               -fx-text-fill: #242d35;
                               -fx-font-size: 14px;"""
                }
            }
        }
    }
}



