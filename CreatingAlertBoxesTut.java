import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 * Created by Miner_000 on 11/10/2015.
 */
public class CreatingAlertBoxesTut extends Application //implements EventHandler<ActionEvent>{
{
   Stage window;
    Button button;

    public static void main(String[] args) throws Throwable {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ThatJazzyGuy");

        button = new Button("Click Me");
        button.setOnAction(e -> AlertBox.display("ALERT!","This is an alert."));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();


    }
}
