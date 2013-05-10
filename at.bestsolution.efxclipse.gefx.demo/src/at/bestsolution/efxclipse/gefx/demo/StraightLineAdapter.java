package at.bestsolution.efxclipse.gefx.demo;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import at.bestsolution.efxclipse.gefx.scene.LinePoint;
import at.bestsolution.efxclipse.gefx.scene.StraightLine;

public class StraightLineAdapter {

	StraightLine straightLine;
	Line line;

	public StraightLineAdapter(final StraightLine straightLine, Pane parent) {
		this.straightLine = straightLine;
		parent.getChildren().add(line = new Line());

		straightLine.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		});
		
		AdapterImpl linePointAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		};
		
		for (LinePoint linePoint : straightLine.getPoints()) {
			linePoint.eAdapters().add(linePointAdapter);
			new LinePointAdapter(linePoint, parent);
		}
		
		update();
	}

	void update() {
		LinePoint startPoint = straightLine.getPoints().get(0);
		line.setStartX(startPoint.getX());
		line.setStartY(startPoint.getY());
		
		LinePoint endPoint = straightLine.getPoints().get(1);
		line.setEndX(endPoint.getX());
		line.setEndY(endPoint.getY());
	}

}
