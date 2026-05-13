package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.Group;


public class DrawingLine extends Application {
    @Override
    public void start(Stage stage) {
        Line line = new Line();
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);
        Group root = new Group(line);
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Sample application");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}