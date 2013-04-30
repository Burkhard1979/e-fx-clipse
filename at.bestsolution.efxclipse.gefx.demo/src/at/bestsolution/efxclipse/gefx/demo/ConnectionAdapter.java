package at.bestsolution.efxclipse.gefx.demo;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import at.bestsolution.efxclipse.gefx.scene.Connection;
import at.bestsolution.efxclipse.gefx.scene.Connector;

public class ConnectionAdapter {

	Connection connection;
	Line line;

	public ConnectionAdapter(final Connection connection, Pane parent) {
		this.connection = connection;
		parent.getChildren().add(line = new Line());

		connection.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		});
		
		connection.getStart().eContainer().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		});
		
		connection.getEnd().eContainer().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		});

		update();
	}

	void update() {
		Connector start = connection.getStart();
		line.setStartX(start.getSceneX());
		line.setStartY(start.getSceneY());
		
		Connector end = connection.getEnd();
		line.setEndX(end.getSceneX());
		line.setEndY(end.getSceneY());
	}

}
