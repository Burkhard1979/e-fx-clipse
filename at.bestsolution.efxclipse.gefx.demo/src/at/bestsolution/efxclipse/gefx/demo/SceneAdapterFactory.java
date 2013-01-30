package at.bestsolution.efxclipse.gefx.demo;

import javafx.scene.Parent;
import javafx.scene.Scene;
import at.bestsolution.efxclipse.gefx.scene.Ellipse;
import at.bestsolution.efxclipse.gefx.scene.Group;
import at.bestsolution.efxclipse.gefx.scene.Rectangle;

public class SceneAdapterFactory {

	public Object adapt(Object object, Object parent) {
		if (object instanceof Rectangle) {
			return new RectangleAdapter((Rectangle) object, (Parent) parent);
		} else if (object instanceof Ellipse) {
			return new EllipseAdapter((Ellipse) object, (Parent) parent);
		} else if (object instanceof Group) {
			return new GroupAdapter(this, (Group) object, (Scene) parent);
		}
		return null;
	}
	
}
