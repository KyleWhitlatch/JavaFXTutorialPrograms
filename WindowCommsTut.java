import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Created by Miner_000 on 11/10/2015.
 */
public class WindowCommsTut extends Application //implements EventHandler<ActionEvent>{
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
        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Please Confirm","Are you sure you want to send naked pics?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();


    }
}
