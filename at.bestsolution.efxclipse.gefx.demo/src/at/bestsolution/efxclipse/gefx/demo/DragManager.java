package at.bestsolution.efxclipse.gefx.demo;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.gefx.scene.LinePoint;

public class DragManager {
	
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
	
	private final List<ConnectorAdapter> conectorAdapters = new ArrayList<>();

	public void addDragListener(ConnectorAdapter listener) {
		conectorAdapters.add(listener);
	}
	
	public ConnectorAdapter fireDragEvent(double x, double y) {
		DragEvent dragEvent = new DragEvent(x, y);
		for (ConnectorAdapter connectorAdapter : conectorAdapters) {
			if(connectorAdapter.handle(dragEvent))
				return connectorAdapter;
		}
		return null;
	}

}
