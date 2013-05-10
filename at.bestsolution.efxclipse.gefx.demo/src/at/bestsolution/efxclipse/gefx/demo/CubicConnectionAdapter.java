//package at.bestsolution.efxclipse.gefx.demo;
//
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.CubicCurve;
//
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.emf.common.notify.impl.AdapterImpl;
//
//import at.bestsolution.efxclipse.gefx.scene.Connection;
//import at.bestsolution.efxclipse.gefx.scene.Connector;
//
//public class CubicConnectionAdapter {
//
//	Connection connection;
//	CubicCurve curve;
//
//	public CubicConnectionAdapter(final Connection connection, Pane parent) {
//		this.connection = connection;
//		parent.getChildren().add(curve = new CubicCurve());
//		curve.setFill(null);
//		curve.setStroke(Color.BLACK);
//
//		connection.eAdapters().add(new AdapterImpl() {
//			@Override
//			public void notifyChanged(Notification msg) {
//				update();
//			}
//		});
//		
//		connection.getStart().eContainer().eAdapters().add(new AdapterImpl() {
//			@Override
//			public void notifyChanged(Notification msg) {
//				update();
//			}
//		});
//		
//		connection.getEnd().eContainer().eAdapters().add(new AdapterImpl() {
//			@Override
//			public void notifyChanged(Notification msg) {
//				update();
//			}
//		});
//
//		update();
//	}
//
//	void update() {
//		Connector start = connection.getStart();
//		curve.setStartX(start.getSceneX());
//		curve.setStartY(start.getSceneY());
//		curve.setControlX1(start.getSceneX() + 100);
//		curve.setControlY1(start.getSceneY());
//		
//		Connector end = connection.getEnd();
//		curve.setEndX(end.getSceneX());
//		curve.setEndY(end.getSceneY());
//		curve.setControlX2(end.getSceneX() - 100);
//		curve.setControlY2(end.getSceneY());
//		
//	}
//
//}
