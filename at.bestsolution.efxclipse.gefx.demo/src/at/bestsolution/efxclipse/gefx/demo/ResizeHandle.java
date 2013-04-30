package at.bestsolution.efxclipse.gefx.demo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import at.bestsolution.efxclipse.gefx.scene.Block;

public class ResizeHandle {

	enum Position {
		East, North
	}

	final Block block;
	Rectangle rightResizeHandle;
	ResizeDrag resizeDrag;
	Position position;

	public ResizeHandle(final Block block, Pane parent, final Position position) {
		this.block = block;
		this.position = position;
		rightResizeHandle = new Rectangle(7, 7);
		rightResizeHandle.setFill(Color.BLUEVIOLET);
		rightResizeHandle.setCursor(Cursor.E_RESIZE);
		parent.getChildren().add(rightResizeHandle);

		block.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		});

		rightResizeHandle.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				resizeDrag = new ResizeDrag();
				resizeDrag.width = block.getWidth();
				resizeDrag.height = block.getHeight();
				resizeDrag.x = event.getSceneX();
				resizeDrag.y = event.getSceneY();
				resizeDrag.blockX = block.getX();
				resizeDrag.blockY = block.getY();
			}

		});

		rightResizeHandle.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (resizeDrag != null) {

					if (position == Position.East) {
						double deltaX = event.getSceneX() - resizeDrag.x;
						block.setX(resizeDrag.blockX + deltaX / 2);
						block.setWidth(resizeDrag.width + deltaX);
					}

					else if (position == Position.North) {
						double deltaY = event.getSceneY() - resizeDrag.y;
						block.setY(resizeDrag.blockY + deltaY / 2);
						block.setHeight(resizeDrag.height - deltaY);
					}

				}
			}

		});

		rightResizeHandle.setOnMouseReleased(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				resizeDrag = null;
			}

		});

		update();
	}

	void update() {
		if (position == Position.East) {
			rightResizeHandle.setLayoutX(block.getWidth() / 2 - 3);
			rightResizeHandle.setLayoutY(-3);
		}

		if (position == Position.North) {
			rightResizeHandle.setLayoutX(-3);
			rightResizeHandle.setLayoutY(-block.getHeight() / 2 - 3);
		}
	}

	class ResizeDrag {
		double blockX;
		double blockY;
		double width;
		double height;
		double x;
		double y;
	}

}
