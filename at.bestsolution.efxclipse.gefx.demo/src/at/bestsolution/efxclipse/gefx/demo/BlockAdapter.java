package at.bestsolution.efxclipse.gefx.demo;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.effect.DropShadow;
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
import at.bestsolution.efxclipse.gefx.demo.SelectionManager.ISelectionListener;
import at.bestsolution.efxclipse.gefx.scene.Block;

public class BlockAdapter {

	Block block;
	Pane pane;
	Rectangle rectangle;
	Drag drag;
	Rectangle selection;

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
		rectangle.setStroke(Color.BLACK);
		pane.getChildren().add(rectangle);
		rectangle.setStrokeWidth(1);
		rectangle.setArcHeight(15);
		rectangle.setArcWidth(15);
		
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(3);
		dropShadow.setOffsetY(3);
		dropShadow.setColor(Color.rgb(0, 0, 0, 0.2));
		rectangle.setEffect(dropShadow);
		
		selection = new Rectangle();
		selection.setStroke(Color.AQUAMARINE);
		selection.setFill(null);
		selection.setVisible(false);
		pane.getChildren().add(selection);
		
		new ResizeHandle(block, pane, Position.North);
		new ResizeHandle(block, pane, Position.NorthEast);
		new ResizeHandle(block, pane, Position.East);
		new ResizeHandle(block, pane, Position.SouthEast);
		new ResizeHandle(block, pane, Position.South);
		new ResizeHandle(block, pane, Position.SouthWest);
		new ResizeHandle(block, pane, Position.West);
		new ResizeHandle(block, pane, Position.NorthWest);
		
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
				
				SelectionManager.INSTANCE.select(block, true);
				
				event.consume();
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
		
		SelectionManager.INSTANCE.addListener(new ISelectionListener() {
			
			@Override
			public void notifyChanged() {
				selection.setVisible(SelectionManager.INSTANCE.isSelected(block));
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
		
		selection.setLayoutX(-block.getWidth() / 2 - 2);
		selection.setLayoutY(-block.getHeight() / 2 - 2);
		selection.setWidth(block.getWidth() + 4);
		selection.setHeight(block.getHeight() + 4);
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
