package sample;

/**
 * Created by gbelot on 02-11-17.
 */

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main4 extends Application{

    Stage windows;
    Button button;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception{
        windows = primaryStage;
        windows.setTitle("JavaFx");

        windows.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button = new Button("Close Program");
        button.setOnAction(event -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 400, 400);
        windows.setScene(scene);
        windows.show();
    }

    private void closeProgram(){
        /*System.out.print("This is clousing");
        windows.close();*/

        Boolean answer = ConfirmBox.display("Are you sure", "You are about close the program");
        if (answer)
            windows.close();
    }
}
