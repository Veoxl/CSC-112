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