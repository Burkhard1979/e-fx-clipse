package at.bestsolution.efxclipse.gefx.demo;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.shape.Rectangle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import at.bestsolution.efxclipse.gefx.scene.Connector;
import at.bestsolution.efxclipse.gefx.scene.LinePoint;
import at.bestsolution.efxclipse.gefx.scene.StraightLine;

public class LinePointAdapter {

	private LinePoint linePoint;
	private Pane pane;
	private Rectangle rectangle;
	private Drag drag;
	private Connector connector;
	private AdapterImpl blockAdapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			snapToConnector();
		}
	};

	public LinePointAdapter(final LinePoint linePoint, Pane parent) {
		this.linePoint = linePoint;
		pane = new Pane();
		pane.setPrefHeight(Region.USE_COMPUTED_SIZE);

		rectangle = new Rectangle(-3, -3, 6, 6);
		// rectangle.setFill(Color.RED);
		pane.getChildren().add(rectangle);

		parent.getChildren().add(pane);

		update();

		linePoint.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		});

		rectangle.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				rectangle.getScene().setCursor(Cursor.CLOSED_HAND);
				drag = new Drag();
				drag.x = event.getSceneX() - pane.getLayoutX();
				drag.y = event.getSceneY() - pane.getLayoutY();
			}

		});

		rectangle.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (drag != null) {
					double x = event.getSceneX() - drag.x;
					double y = event.getSceneY() - drag.y;
					linePoint.setX(x);
					linePoint.setY(y);
					ConnectorAdapter connectorAdapter = DragManager.INSTANCE
							.fireDragEvent(x, y);
					if (connectorAdapter != null) {
						drag.connector = connectorAdapter.getConnector();
					} else {
						drag.connector = null;
					}
				}
			}

		});

		rectangle.setOnMouseReleased(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				rectangle.getScene().setCursor(Cursor.DEFAULT);
				if (drag.connector != null) {
					StraightLine line = linePoint.getLine();
					line.setStartConnector(drag.connector);
					connector = drag.connector;
					drag.connector.getBlock().eAdapters().add(blockAdapter);
					snapToConnector();
				} else if (connector != null) {
					Connector c = connector;
					connector = null;
					c.getBlock().eAdapters().remove(blockAdapter);
				}
				drag = null;
			}

		});

		linePoint.getLine().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		});

	}

	private void update() {
		// StraightLine line = linePoint.getLine();
		// if (line.getPoints().indexOf(linePoint) == 0 && connector != null) {
		// pane.setLayoutX(connector.getSceneX());
		// pane.setLayoutY(connector.getSceneY());
		// } else {
		pane.setLayoutX(linePoint.getX());
		pane.setLayoutY(linePoint.getY());
		// }
	}

	public Pane getPane() {
		return pane;
	}

	private void snapToConnector() {
		if (connector != null) {
			linePoint.setX(connector.getSceneX());
			linePoint.setY(connector.getSceneY());
		}
	}

	private static class Drag {
		double x, y;
		Connector connector;
	}

}
