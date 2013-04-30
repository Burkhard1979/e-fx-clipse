package at.bestsolution.efxclipse.gefx.demo;

import javafx.scene.layout.AnchorPane;
import at.bestsolution.efxclipse.gefx.scene.Block;

public class SceneAdapterFactory {

	public Object adapt(Object object, Object parent) {
		// if (object instanceof Rectangle) {
		// return new RectangleAdapter((Rectangle) object, (Parent) parent);
		// } else if (object instanceof Ellipse) {
		// return new EllipseAdapter((Ellipse) object, (Parent) parent);
		// } else if (object instanceof Group) {
		// return new GroupAdapter(this, (Group) object, (Scene) parent);
		// } else if (object instanceof Line) {
		// return new LineAdapter((Line) object, (Parent) parent);
		// }

		if (object instanceof Block) {
			return new BlockAdapter((Block) object, (AnchorPane) parent);
		}
		
		return null;
	}

}
