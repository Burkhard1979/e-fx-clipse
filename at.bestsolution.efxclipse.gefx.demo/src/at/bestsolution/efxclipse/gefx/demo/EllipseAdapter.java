//package at.bestsolution.efxclipse.gefx.demo;
//
//import javafx.scene.Group;
//import javafx.scene.Parent;
//
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.emf.common.notify.impl.AdapterImpl;
//
//import at.bestsolution.efxclipse.gefx.scene.Ellipse;
//import at.bestsolution.efxclipse.gefx.scene.Rectangle;
//
//public class EllipseAdapter extends AdapterImpl {
//
//	javafx.scene.shape.Ellipse fxEllipse;
//	Ellipse ellipse;
//	Parent fxParent;
//
//	public EllipseAdapter(Ellipse ellipse, Parent fxParent) {
//		super();
//		this.ellipse = ellipse;
//		this.fxParent = fxParent;
//		fxEllipse = new javafx.scene.shape.Ellipse();
//		((Group) fxParent).getChildren().add(fxEllipse);
//		update();
//		ellipse.eAdapters().add(this);
//	}
//	
//	@Override
//	public void notifyChanged(Notification msg) {
//		update();
//	}
//
//	private void update() {
//		fxEllipse.setCenterX(ellipse.getCenterX());
//		fxEllipse.setCenterY(ellipse.getCenterY());
//		fxEllipse.setRadiusX(ellipse.getRadiusX());
//		fxEllipse.setRadiusY(ellipse.getRadiusY());
//	}
//
//}