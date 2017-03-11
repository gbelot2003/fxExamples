package Sfields;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class fieldsData extends Application{

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFx");

        TextField nameInput = new TextField();

        Button button = new Button("Click me");
        button.setOnAction(e -> isNumber(nameInput, nameInput.getText()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput, button);

        Scene scene = new Scene(layout, 300, 140);

        window.setScene(scene);
        window.show();

    }

    private boolean isNumber(TextField input, String message){
        try {

            int age = Integer.parseInt(input.getText());
            System.out.println("User is " + age);
            return true;

        } catch (NumberFormatException e){
            System.out.println("Error " + message + " is not a number");
            return false;
        }
    }

}
