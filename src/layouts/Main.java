package layouts;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFx");

        HBox topMenu = new HBox();

        Button button = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");
        Button button4 = new Button("Navigate");
        Button button5 = new Button("Code");
        topMenu.getChildren().addAll(button, button2, button3, button4, button5);

        VBox leftMenu = new VBox();
        Button button6 = new Button("Analize");
        Button button7 = new Button("Refactory");
        Button button8 = new Button("Build");
        Button button9 = new Button("Run");
        Button button10 = new Button("Help");
        leftMenu.getChildren().addAll(button6, button7, button8, button9, button10);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);


        Scene scene = new Scene(borderPane, 300, 300);

        window.setScene(scene);
        window.show();
    }
}
