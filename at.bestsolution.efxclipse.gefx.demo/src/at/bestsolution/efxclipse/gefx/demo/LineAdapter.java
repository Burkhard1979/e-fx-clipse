//package at.bestsolution.efxclipse.gefx.demo;
//
//import javafx.event.Event;
//import javafx.event.EventHandler;
//import javafx.scene.Cursor;
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.shape.Line;
//
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.emf.common.notify.impl.AdapterImpl;
//
//import at.bestsolution.efxclipse.gefx.scene.Ellipse;
//import at.bestsolution.efxclipse.gefx.scene.Node;
//import at.bestsolution.efxclipse.gefx.scene.Rectangle;
//import at.bestsolution.efxclipse.gefx.scene.Shape;
//
//public class LineAdapter extends AdapterImpl {
//
//	Parent fxParent;
//	Drag drag;
//	private Line fxLine;
//	at.bestsolution.efxclipse.gefx.scene.Line line;
//
//	public LineAdapter(final at.bestsolution.efxclipse.gefx.scene.Line line, Parent fxParent) {
//		super();
//		this.fxParent = fxParent;
//		this.line = line;
//		
//		fxLine = new Line();
//		
//		((Group) fxParent).getChildren().add(fxLine);
//		update();
//		line.eAdapters().add(this);
//	
//	}
//
//	@Override
//	public void notifyChanged(Notification msg) {
//		update();
//	}
//
//	private void update() {
//		Ellipse start = (Ellipse) line.getStart();
//		fxLine.setStartX(start.getCenterX());
//		fxLine.setStartY(start.getCenterY());
//		
//		Rectangle end = (Rectangle) line.getEnd();
//		fxLine.setEndX(end.getX());
//		fxLine.setEndY(end.getY());
//	}
//
//	class Drag {
//		double x, y;
//	}
//
//}