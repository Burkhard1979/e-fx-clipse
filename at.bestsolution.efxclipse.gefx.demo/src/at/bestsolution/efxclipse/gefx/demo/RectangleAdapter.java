//package at.bestsolution.efxclipse.gefx.demo;
//
//import javafx.event.Event;
//import javafx.event.EventHandler;
//import javafx.scene.Cursor;
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.input.MouseEvent;
//
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.emf.common.notify.impl.AdapterImpl;
//
//import at.bestsolution.efxclipse.gefx.scene.Rectangle;
//
//public class RectangleAdapter extends AdapterImpl {
//
//	javafx.scene.shape.Rectangle fxRectangle;
//	Rectangle rectangle;
//	Parent fxParent;
//	Drag drag;
//
//	public RectangleAdapter(final Rectangle rectangle, Parent fxParent) {
//		super();
//		this.rectangle = rectangle;
//		this.fxParent = fxParent;
//		fxRectangle = new javafx.scene.shape.Rectangle();
//		((Group) fxParent).getChildren().add(fxRectangle);
//		update();
//		rectangle.eAdapters().add(this);
//		
//		fxRectangle.setOnMousePressed(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				fxRectangle.getScene().setCursor(Cursor.CLOSED_HAND);
//				drag = new Drag();
//				drag.x = event.getSceneX() - fxRectangle.getX();
//				drag.y = event.getSceneY() - fxRectangle.getY();
//			}
//		});
//
//		fxRectangle.setOnMouseDragged(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				if (drag != null) {
//					rectangle.setX(event.getSceneX() - drag.x);
//					rectangle.setY(event.getSceneY() - drag.y);
//				}
//				// fxRectangle.relocate(event.getSceneX(), event.getSceneY());
//				// c.relocate(event.getSceneX() - c.getRadius(),
//				// event.getSceneY() - c.getRadius());
//			}
//		});
//
//		fxRectangle.setOnMouseReleased(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				drag = null;
//				fxRectangle.getScene().setCursor(Cursor.DEFAULT);
//			}
//
//		});
//
//	}
//
//	@Override
//	public void notifyChanged(Notification msg) {
//		update();
//	}
//
//	private void update() {
//		fxRectangle.setX(rectangle.getX());
//		fxRectangle.setY(rectangle.getY());
//		fxRectangle.setWidth(rectangle.getWidth());
//		fxRectangle.setHeight(rectangle.getHeight());
//	}
//
//	class Drag {
//		double x, y;
//	}
//
//}