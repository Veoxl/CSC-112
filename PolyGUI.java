/*
 * Name: Matthew Britt
 * Date: 4/2/2018
 * Course Number: CSC-112
 * Course Name: Intermediate Topics in Java Programming
 * Email: msbritt0001@student.stcc.edu
 * Using Javafx to make a Polygon that changes the number of sides
 */
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PolyGUI extends javafx.application.Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		Scene scene = new Scene((Parent) new Poly(), 450, 450);
		primaryStage.setTitle("Polygon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}