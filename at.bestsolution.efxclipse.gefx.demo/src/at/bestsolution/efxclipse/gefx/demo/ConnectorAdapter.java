package at.bestsolution.efxclipse.gefx.demo;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.gefx.demo.DragManager.IDragListener;
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

		circle = new Circle(0, 0, 10, Color.CADETBLUE);
		circle.getProperties().put("Adapter", this);
		pane.getChildren().add(circle);

		line = new Line();
		pane.getChildren().add(line);

		DragManager.INSTANCE.addDragListener(new IDragListener() {

			@Override
			public DragManager.DragEvent handle(DragManager.DragEvent event) {
				// get postion in scene
				Block block = (Block) connector.eContainer();
				
				double x = connector.getSceneX();
				double y = connector.getSceneY();
				
				if(Math.abs(x - event.getX()) < 10 && Math.abs(y - event.getY()) < 10) {
					circle.setFill(Color.RED);
				} else {
					circle.setFill(Color.CADETBLUE);
				}
				
				return event;					
			}

		});

//		circle.setOnMouseEntered(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent arg0) {
//				circle.setFill(Color.RED);
//			}
//
//		});
//
//		circle.setOnMouseExited(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent arg0) {
//				circle.setFill(Color.CADETBLUE);
//			}
//
//		});

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
