
import static java.lang.System.*; //just for simple console stuff

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//A basic list of imports for JavaFX

/**
 * Created by ThatJazzyGuy on 11/10/2015.
 */
public class BasicJavaFXTut extends Application //JavaFX classes must inherit from Application
{
    Button button; //a self-explanatory JavaFX object


    public static void main(String[] args) throws Throwable { //just a personal touch with the throws Throwable
        launch(args); //calls the Application "main" method
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Stages are your window, the default is primaryStage
        primaryStage.setTitle("Domo Arigato, Mr. Roboto!");

        StackPane layout = new StackPane(); //StackPane is a generic layout format


        button = new Button(); //Instantiation
        button.setText("Click Me!"); //setText could also be placed as a parameter for the instantiation i.e. new Button(" ");
        layout.getChildren().add(button); //adds the button to the layout as a node
        button.setOnAction(e -> {//lambda expression to set action - replaces EventHandler<ActionEvent>
            out.println("HI!");
        });

        Scene scene = new Scene(layout, 300, 250); //Scenes are what are inside the window
        primaryStage.setScene(scene); //sets what scene the window will display
        primaryStage.show(); //serves same function as setVisible(true) in swing.


    }

}
