//package at.bestsolution.efxclipse.gefx.demo;
//
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.emf.common.notify.impl.AdapterImpl;
//
//import at.bestsolution.efxclipse.gefx.scene.Node;
//import at.bestsolution.efxclipse.gefx.scene.Rectangle;
//
//public class GroupAdapter extends AdapterImpl {
//
//	SceneAdapterFactory adapterFactory;
//	Group fxGroup;
//	at.bestsolution.efxclipse.gefx.scene.Group group;
//	Parent fxParent;
//
//	public GroupAdapter(SceneAdapterFactory adapterFactory, at.bestsolution.efxclipse.gefx.scene.Group group, Scene fxScene) {
//		super();
//		this.adapterFactory = adapterFactory;
//		this.group = group;
//		fxGroup = new Group();
//		fxScene.setRoot(fxGroup);
//		group.eAdapters().add(this);
//		
//		for (Node childNode : group.getChildren()) {
//			adapterFactory.adapt(childNode, fxGroup);
//		}
//	}
//	
//	@Override
//	public void notifyChanged(Notification msg) {
//		update();
//	}
//
//	private void update() {
//		
//	}
//
//}