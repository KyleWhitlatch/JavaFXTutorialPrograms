import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Miner_000 on 11/11/2015.
 */
public class LayoutsEmbedded extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ThatJazzyGuy");

        HBox topMenu = new HBox();
        Button buttonA = new Button("Alpha");
        Button buttonB = new Button("Bravo");
        Button buttonC = new Button("Charlie");
        topMenu.getChildren().addAll(buttonA,buttonB,buttonC);

        VBox leftMenu = new VBox();
        Button buttonD = new Button("Delta");
        Button buttonE = new Button("Echo");
        Button buttonF = new Button("Foxtrot");
        leftMenu.getChildren().addAll(buttonD,buttonE,buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);


        Scene scene = new Scene(borderPane,300,250);
        window.setScene(scene);
        window.show();
    }
}
