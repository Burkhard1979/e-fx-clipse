/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.controls.fx2;

import at.bestsolution.efxclipse.runtime.controls.FXTabPane.MinMaxState;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class FX2MinMaxTabPaneSkin extends FX2TabPaneSkin {
	private final HBox minMaxGroup = new HBox(3);
	private final Group maxButton;
	private final Group minButton;
	private final Group restoreButton;
	
	public FX2MinMaxTabPaneSkin(FX2TabPane pane) {
		super(pane);

		maxButton = new MaxButton();
		minButton = new MinButton();
		restoreButton = new RestoreButton();
		
		updateButtonState(pane.getMinMaxState());
		pane.minMaxStateProperty().addListener(new ChangeListener<MinMaxState>() {

			@Override
			public void changed(ObservableValue<? extends MinMaxState> observable, MinMaxState oldValue, MinMaxState newValue) {
				updateButtonState(newValue);
			}
		});
		
		getChildren().add(minMaxGroup);
	}

	private void updateButtonState(MinMaxState state) {
		switch (state) {
		case NONE:
			minMaxGroup.getChildren().clear();
			break;
		case MAXIMIZED:
			minMaxGroup.getChildren().clear();
			minMaxGroup.getChildren().add(restoreButton);
			break;
		case MINIMIZED:
			minMaxGroup.getChildren().clear();
			minMaxGroup.getChildren().add(restoreButton);
			break;
		case RESTORED:
			minMaxGroup.getChildren().clear();
			minMaxGroup.getChildren().addAll(minButton, maxButton);
			break;
		}
	}
	
	@Override
	protected void layoutChildren() {
		super.layoutChildren();
		minMaxGroup.relocate(widthProperty().get()-minMaxGroup.prefWidth(USE_COMPUTED_SIZE)-5,6);
	}
	
	class MaxButton extends Group {
		public MaxButton() {
			{
				Rectangle r = new Rectangle(12,12,Color.TRANSPARENT);
				getChildren().add(r);	
			}
			
			{
				Rectangle r = new Rectangle(10,2,Color.WHITE);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				getChildren().add(r);
			}
			
			{
				Rectangle r = new Rectangle(10,8,Color.WHITE);
				r.setY(2);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				getChildren().add(r);
			}
			
			setOnMouseReleased(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					getBehavior().maximize();
				}
			});
		}
	}
	
	class MinButton extends Group {
		public MinButton() {
			{
				Rectangle r = new Rectangle(12,12,Color.TRANSPARENT);
				getChildren().add(r);	
			}
			
			{
				Rectangle r = new Rectangle(10,2,Color.WHITE);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				getChildren().add(r);	
			}
			
			setOnMouseReleased(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					getBehavior().minimize();
				}
			});
		}
	}
	
	class RestoreButton extends Group {
		public RestoreButton() {
			{
				Rectangle r = new Rectangle(12,12,Color.TRANSPARENT);
				getChildren().add(r);	
			}
			{
				Rectangle r = new Rectangle(8,2,Color.BLACK);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				r.setX(2);
				getChildren().add(r);
			}
			{
				Rectangle r = new Rectangle(8,5,Color.WHITE);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				r.setY(2);
				r.setX(2);
				getChildren().add(r);
			}
			
			{
				Rectangle r = new Rectangle(8,2,Color.BLACK);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				r.setY(4);
				getChildren().add(r);
			}
			
			{
				Rectangle r = new Rectangle(8,5,Color.WHITE);
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(0.5);
				r.setY(6);
				getChildren().add(r);
			}
			
			setOnMouseReleased(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					getBehavior().restore();
				}
			});
		}
	}
}