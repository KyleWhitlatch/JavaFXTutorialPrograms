import javax.swing.*;
import static java.lang.System.*;
import java.awt.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Created by Miner_000 on 11/10/2015.
 */
public class ProgramClose extends Application //implements EventHandler<ActionEvent>{
{
    Button button;
    Stage window;

    public static void main(String[] args) throws Throwable {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX - ThatJazzyGuy *tips fedora*");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();

        });

        button = new Button("Close Program");
        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();


    }
    private void closeProgram(){
        Boolean answer = ConfirmBox.display("Exit?","Sure you want to exit?");
        if(answer){
            window.close();
        }

    }
}
