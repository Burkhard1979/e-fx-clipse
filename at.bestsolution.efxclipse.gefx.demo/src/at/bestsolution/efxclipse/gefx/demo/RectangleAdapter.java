package at.bestsolution.efxclipse.gefx.demo;

import javafx.scene.Group;
import javafx.scene.Parent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import at.bestsolution.efxclipse.gefx.scene.Rectangle;

public class RectangleAdapter extends AdapterImpl {

	javafx.scene.shape.Rectangle fxRectangle;
	Rectangle rectangle;
	Parent fxParent;

	public RectangleAdapter(Rectangle rectangle, Parent fxParent) {
		super();
		this.rectangle = rectangle;
		this.fxParent = fxParent;
		fxRectangle = new javafx.scene.shape.Rectangle();
		((Group) fxParent).getChildren().add(fxRectangle);
		update();
		rectangle.eAdapters().add(this);
	}
	
	@Override
	public void notifyChanged(Notification msg) {
		update();
	}

	private void update() {
		fxRectangle.setX(rectangle.getX());
		fxRectangle.setY(rectangle.getY());
		fxRectangle.setWidth(rectangle.getWidth());
		fxRectangle.setHeight(rectangle.getHeight());
	}

}