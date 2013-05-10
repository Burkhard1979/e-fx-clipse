package at.bestsolution.efxclipse.gefx.demo;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import at.bestsolution.efxclipse.gefx.scene.LinePoint;

public class LinePointAdapter {

	LinePoint linePoint;
	Pane pane;
	Rectangle rectangle;
	Drag drag;

	public LinePointAdapter(final LinePoint linePoint, Pane parent) {
		this.linePoint = linePoint;
		pane = new Pane();
		pane.setPrefHeight(Region.USE_COMPUTED_SIZE);

		rectangle = new Rectangle(-3, -3, 6, 6);
		rectangle.setFill(Color.RED);
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
					DragManager.INSTANCE.fireDragEvent(x, y);
				}
			}
			
		});
		
//		.setOnDragDetected(new EventHandler<MouseEvent>() {
//		    public void handle(MouseEvent event) {
//		        /* drag was detected, start a drag-and-drop gesture*/
//		        /* allow any transfer mode */
//		        Dragboard db = source.startDragAndDrop(TransferMode.ANY);
//		        
//		        /* Put a string on a dragboard */
//		        ClipboardContent content = new ClipboardContent();
//		        content.putString(source.getText());
//		        db.setContent(content);
//		        
//		        event.consume();
//		    }
//		});

		rectangle.setOnMouseReleased(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				drag = null;
				rectangle.getScene().setCursor(Cursor.DEFAULT);
			}

		});
		
	}

	void update() {
		pane.setLayoutX(linePoint.getX());
		pane.setLayoutY(linePoint.getY());
	}
	
	public Pane getPane() {
		return pane;
	}

	class Drag {
		double x, y;
	}

}
