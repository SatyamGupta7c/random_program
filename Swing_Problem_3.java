import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Swing_Problem_3 extends Application {

    @Override
    public void start(Stage primaryStage) {
 
        Button button = new Button("Press Me");
        button.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        button.setOnAction(e -> System.out.println("Welcome to JavaFX"));

        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: black;");
        root.getChildren().add(button);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("My First Frame");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        public static void main(String[] args) {
        launch(args);
    }
}
