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
		North, NorthEast, East, SouthEast, South, SouthWest, West, NorthWest
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
		rightResizeHandle.setCursor(getCursor());
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

					double deltaX = 0;
					double deltaY = 0;
					boolean left = true;
					boolean top = true;
					
					switch (position) {
					case East:
						deltaX = event.getSceneX() - resizeDrag.x;
						left = false;
						break;
					case North:
						deltaY = event.getSceneY() - resizeDrag.y;
						break;
					case NorthEast:
						deltaX = event.getSceneX() - resizeDrag.x;
						deltaY = event.getSceneY() - resizeDrag.y;
						left = false;
						break;
					case NorthWest:
						deltaX = event.getSceneX() - resizeDrag.x;
						deltaY = event.getSceneY() - resizeDrag.y;
						break;
					case South:
						deltaY = event.getSceneY() - resizeDrag.y;
						top = false;
						break;
					case SouthEast:
						deltaX = event.getSceneX() - resizeDrag.x;
						deltaY = event.getSceneY() - resizeDrag.y;
						left = false;
						top = false;
						break;
					case SouthWest:
						deltaX = event.getSceneX() - resizeDrag.x;
						deltaY = event.getSceneY() - resizeDrag.y;
						top = false;
						break;
					case West:
						deltaX = event.getSceneX() - resizeDrag.x;
						break;
					}

					block.setX(resizeDrag.blockX + deltaX / 2);
					block.setY(resizeDrag.blockY + deltaY / 2);

					block.setWidth(resizeDrag.width + (left ? -1 : 1) * deltaX);
					block.setHeight(resizeDrag.height + (top ? -1 : 1) * deltaY);
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

	private Cursor getCursor() {
		switch (position) {
		case North:
			return Cursor.N_RESIZE;
		case NorthEast:
			return Cursor.NE_RESIZE;
		case East:
			return Cursor.E_RESIZE;
		case SouthEast:
			return Cursor.SE_RESIZE;
		case South:
			return Cursor.S_RESIZE;
		case SouthWest:
			return Cursor.SW_RESIZE;
		case West:
			return Cursor.W_RESIZE;
		case NorthWest:
			return Cursor.NW_RESIZE;
		default:
			return null;
		}

	}

	void update() {
		double x = 0, y = 0;

		switch (position) {
		case North:
			x = -3;
			y = -block.getHeight() / 2 - 3;
			break;
		case NorthEast:
			x = block.getWidth() / 2 - 3;
			y = -block.getHeight() / 2 - 3;
			break;
		case East:
			x = block.getWidth() / 2 - 3;
			y = -3;
			break;
		case SouthEast:
			x = block.getWidth() / 2 - 3;
			y = block.getHeight() / 2 - 3;
			break;
		case South:
			x = -3;
			y = block.getHeight() / 2 - 3;
			break;
		case SouthWest:
			x = -block.getWidth() / 2 - 3;
			y = block.getHeight() / 2 - 3;
			break;
		case West:
			x = -block.getWidth() / 2 - 3;
			y = -3;
			break;
		case NorthWest:
			x = -block.getWidth() / 2 - 3;
			y = -block.getHeight() / 2 - 3;
			break;
		}

		rightResizeHandle.setLayoutX(x);
		rightResizeHandle.setLayoutY(y);
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
