package at.bestsolution.efxclipse.gefx.demo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import at.bestsolution.efxclipse.gefx.scene.Block;
import at.bestsolution.efxclipse.gefx.scene.Connector;

public class ConnectorAdapter {

	Connector connector;
	Pane pane;
	Circle circle;
	private Line line;

	public ConnectorAdapter(final Connector connector, Pane parent) {
		this.connector = connector;
		pane = new Pane();
		parent.getChildren().add(pane);

		circle = new Circle(0, 0, 5, Color.CADETBLUE);
		circle.getProperties().put("Adapter", this);
		pane.getChildren().add(circle);

		line = new Line();
		pane.getChildren().add(line);
		
		connector.getBlock().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		});

		update();
	}

	void update() {
		Block block = connector.getBlock();
		
		pane.setLayoutX(block.getWidth() * connector.getX());
		pane.setLayoutY(block.getHeight() * connector.getY());

		line.setStartX(0);
		line.setStartY(0);

		double rotation = connector.getRotation();

		line.setEndX(20 * Math.cos(rotation));
		line.setEndY(20 * Math.sin(rotation));
	}
}
