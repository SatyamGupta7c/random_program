import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
public class Swing_Problem_4 extends Application {
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Rectangle houseBody = new Rectangle(100, 150, 200, 150);
        houseBody.setFill(Color.YELLOW);
        houseBody.setStroke(Color.BLACK);
        Rectangle door = new Rectangle(180, 230, 40, 70);
        door.setFill(Color.BROWN);
        door.setStroke(Color.BLACK);
        Polygon roof = new Polygon();
        roof.getPoints().addAll(
            90.0, 150.0,  
            310.0, 150.0, 
            200.0, 70.0   
        );
        roof.setFill(Color.BROWN);
        roof.setStroke(Color.BLACK);
        pane.getChildren().addAll(houseBody, door, roof);
        Scene scene = new Scene(pane, 400, 350);
        primaryStage.setTitle("Simple House");
        primaryStage.setScene(scene);
        primaryStage.show();}
    public static void main(String[] args) {
        launch(args);
    }}