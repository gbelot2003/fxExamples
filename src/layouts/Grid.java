package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Grid extends Application {
    Stage window;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFx");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label namelabel = new Label("Username: ");
        GridPane.setConstraints(namelabel, 0, 0);

        TextField nameInput = new TextField("User Name");
        GridPane.setConstraints(nameInput, 1, 0);

        Label passlabel = new Label("Password: ");
        GridPane.setConstraints(passlabel, 0, 1);

        TextField passInput = new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(namelabel, nameInput, passlabel, passInput, loginButton);

        Scene scene = new Scene(grid, 300, 200);

        window.setScene(scene);
        window.show();
    }
}
