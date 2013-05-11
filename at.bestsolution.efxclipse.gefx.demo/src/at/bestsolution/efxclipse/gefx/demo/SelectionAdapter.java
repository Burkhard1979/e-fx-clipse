package at.bestsolution.efxclipse.gefx.demo;

import java.util.Set;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import at.bestsolution.efxclipse.gefx.demo.SelectionManager.ISelectionListener;
import at.bestsolution.efxclipse.gefx.scene.Shape;

public class SelectionAdapter {

	private Pane pane;
	private Rectangle rectangle;
	private SelectionManager selectionManager = SelectionManager.INSTANCE;

	public SelectionAdapter(final Pane pane) {
		super();
		this.pane = pane;
		rectangle = new Rectangle(0, 0, 50, 50);
		pane.getChildren().add(rectangle);

		selectionManager.addListener(new ISelectionListener() {

			@Override
			public void notifyChanged() {
				Set<Shape> selectedElements = selectionManager
						.getSelectedElements();
				if (selectedElements.isEmpty()) {
					rectangle.setVisible(false);
				} else {
					rectangle.setVisible(true);
					Shape element = selectedElements.iterator().next();

					double minX = Double.MAX_VALUE;
					double maxX = Double.MIN_VALUE;
					double minY = Double.MAX_VALUE;
					double maxY = Double.MIN_VALUE;

					for (Shape shape : selectedElements) {
						minX = Math.min(minX, shape.getMinSceneX());
						maxX = Math.max(maxX, shape.getMaxSceneX());
						minY = Math.min(minY, shape.getMinSceneY());
						maxY = Math.max(maxY, shape.getMaxSceneY());
					}

					rectangle.setLayoutX(minX);
					rectangle.setLayoutY(minY);
					rectangle.setWidth(maxX - minX);
					rectangle.setHeight(maxY - minY);
				}
			}

		});
	}

}
