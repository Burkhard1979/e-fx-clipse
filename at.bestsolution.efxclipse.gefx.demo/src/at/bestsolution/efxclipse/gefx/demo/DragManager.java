package at.bestsolution.efxclipse.gefx.demo;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.gefx.scene.LinePoint;

public class DragManager {

	public interface IDragListener {
		DragEvent handle(DragEvent event);
	}
	
	public static DragManager INSTANCE = new DragManager();

	public class DragEvent {
		
		private double x;
		private double y;

		public DragEvent(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}

	}

	public LinePoint linePoint;
	
	private final List<IDragListener> listerners = new ArrayList<>();

	public void addDragListener(IDragListener listener) {
		listerners.add(listener);
	}
	
	public void fireDragEvent(double x, double y) {
		DragEvent dragEvent = new DragEvent(x, y);
		for (IDragListener listener : listerners) {
			dragEvent = listener.handle(dragEvent);
			if(dragEvent == null)
				break;
		}
	}

}
