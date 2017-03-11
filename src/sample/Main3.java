package sample;

/**
 * Created by gbelot on 02-11-17.
 */
        import javafx.application.Application;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Label;
        import javafx.scene.layout.StackPane;
        import javafx.scene.layout.VBox;
        import javafx.scene.control.Button;
        import javafx.stage.Stage;


public class Main3 extends Application{

    Stage windows;
    Button button;
    Button answerButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        windows = primaryStage;
        windows.setTitle("Gerardo Belot");

        button = new Button("Open Modal");
        button.setOnAction(e -> AlertBox.display("title of Modal", "Whooos"));

        answerButton = new Button("Button to cuestion and Answer");
        answerButton.setOnAction(e -> {
           boolean result = ConfirmBox.display("Modal of Cuestion", "Do you like to play with JavaFx");
            System.out.println(result);
        });


        StackPane layout = new StackPane();
        layout.getChildren().addAll(button, answerButton);

        Scene scene = new Scene(layout, 300, 200 );
        windows.setScene(scene);
        windows.show();
    }
}


