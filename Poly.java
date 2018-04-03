import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

public class Poly extends BorderPane {

	private static int sides = 4;

	private void paint() {
		Polygon poly = new Polygon();
		poly.setFill((Paint) Color.WHITE);
		poly.setStroke((Paint) Color.BLACK);
		ObservableList<Double> list = poly.getPoints();
		double centerX = this.getWidth() / 2.0;
		double centerY = this.getHeight() / 2.0;
		double radius = Math.min(this.getWidth(), this.getHeight()) * 0.4;
		for (int i = 0; i < sides;) {
			list.add((Double) (centerX + radius * Math.cos((double) (2 * i) * Math.PI / (double) sides)));
			list.add((Double) (centerY - radius * Math.sin((double) (2 * i) * Math.PI / (double) sides)));
			i++;
		}
		this.getChildren().clear();
		this.getChildren().add((Node) poly);
		HBox hbox = new HBox();
		Button addSide = new Button("+");
		Button subtractSide = new Button("-");
		addSide.setOnAction(e -> {
			int sides = Poly.getSides();
			Poly.setSides(sides + 1);
			this.paint();
		});
		subtractSide.setOnAction(e -> {
			int sides = Poly.getSides();
			Poly.setSides(sides - 1);
			this.paint();
		});
		hbox.getChildren().addAll((Node[]) new Node[] { subtractSide, addSide });
		hbox.setAlignment(Pos.CENTER);
		this.setBottom((Node) hbox);
	}

	public void setWidth(double width) {
		super.setWidth(width);
		this.paint();
	}

	public void setHeight(double height) {
		super.setHeight(height);
		this.paint();
	}

	public static int getSides() {
		return sides;
	}

	public static void setSides(int sides) {
		if (sides == 1) {
			sides = 2;
		}
		Poly.sides = sides;
	}
}
