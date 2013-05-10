package at.bestsolution.efxclipse.gefx.demo;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import at.bestsolution.efxclipse.gefx.demo.ResizeHandle.Position;
import at.bestsolution.efxclipse.gefx.scene.Block;

public class BlockAdapter {

	Block block;
	Pane pane;
	Rectangle rectangle;
	Drag drag;
//	ResizeDrag resizeDrag;
//	Rectangle rightResizeHandle;

	public BlockAdapter(final Block block, Pane parent) {
		this.block = block;
		pane = new Pane();
		pane.setPrefHeight(Region.USE_COMPUTED_SIZE);

		rectangle = new Rectangle();
		rectangle.getStyleClass().add("block");
		// object bounding box relative (proportional = true)
		Stop[] stops = new Stop[] { new Stop(0, Color.web("#F8FFE8")), new Stop(1, Color.web("#B7DF2D"))};
		LinearGradient lg1 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stops);
		rectangle.setFill(lg1);
//		rectangle.setFill(Color.BISQUE);
		rectangle.setStroke(Color.BLACK);
		pane.getChildren().add(rectangle);
		rectangle.setStrokeWidth(1);
		rectangle.setArcHeight(15);
		rectangle.setArcWidth(15);
		
		new ResizeHandle(block, pane, Position.North);
		new ResizeHandle(block, pane, Position.NorthEast);
		new ResizeHandle(block, pane, Position.East);
		new ResizeHandle(block, pane, Position.SouthEast);
		new ResizeHandle(block, pane, Position.South);
		new ResizeHandle(block, pane, Position.SouthWest);
		new ResizeHandle(block, pane, Position.West);
		new ResizeHandle(block, pane, Position.NorthWest);
		
//		ResizeHandle2 resizeHandle2 = new ResizeHandle2(block, pane, Position.West);
		
//		rightResizeHandle = new Rectangle(7, 7);
//		rightResizeHandle.setFill(Color.BLUEVIOLET);
//		rightResizeHandle.setCursor(Cursor.E_RESIZE);
//		pane.getChildren().add(rightResizeHandle);

		parent.getChildren().add(pane);
		update();

		block.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				update();
			}
		});

		rectangle.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				rectangle.getScene().setCursor(Cursor.CLOSED_HAND);
				drag = new Drag();
				drag.x = event.getSceneX() - pane.getLayoutX();
				drag.y = event.getSceneY() - pane.getLayoutY();
			}

		});
		
		rectangle.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (drag != null) {
					block.setX(event.getSceneX() - drag.x);
					block.setY(event.getSceneY() - drag.y);
				}
			}
			
		});

		rectangle.setOnMouseReleased(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				drag = null;
				rectangle.getScene().setCursor(Cursor.DEFAULT);
			}

		});
		
	}

	void update() {
		pane.setLayoutX(block.getX());
		pane.setLayoutY(block.getY());
		
		rectangle.setLayoutX(-block.getWidth() / 2);
		rectangle.setLayoutY(-block.getHeight() / 2);
		rectangle.setWidth(block.getWidth());
		rectangle.setHeight(block.getHeight());
	}

	public Block getBlock() {
		return block;
	}
	
	public Pane getPane() {
		return pane;
	}

	class Drag {
		double x, y;
	}
	
	class ResizeDrag {
		double blockX;
		double width;
		double x;
	}

}
