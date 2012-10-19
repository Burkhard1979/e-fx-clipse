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
package at.bestsolution.animationutils.pagetransition;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.efxclipse.runtime.application.AbstractJFXApplication;

public class MyApplication extends AbstractJFXApplication {

	BorderPane root;
	ImageView workspaceA;
	ImageView workspaceB;
	
	AnimatedBorderPaneCenterSwitcher sw;
	
	protected void jfxStart(IApplicationContext applicationContext, Application jfxApplication, Stage primaryStage) {
		try {
			workspaceA = new ImageView();
			workspaceA.setImage(new Image(getClass().getClassLoader().getResourceAsStream("ws1.jpg"))); 
			workspaceB = new ImageView();
			workspaceB.setImage(new Image(getClass().getClassLoader().getResourceAsStream("ws2.jpg")));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		root = new BorderPane();
		sw = new AnimatedBorderPaneCenterSwitcher(root);
		root.setCenter(workspaceA);
		Scene scene = new Scene(root,400,400,true);
		scene.setCamera(new PerspectiveCamera());
		primaryStage.setScene(scene);
//		primaryStage.setWidth(800);
//		primaryStage.setHeight(600);
		primaryStage.setFullScreen(true);
		primaryStage.show();
		
		primaryStage.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				doIt();
			}
		});
		
		primaryStage.addEventHandler(ScrollEvent.SCROLL, new EventHandler<ScrollEvent>() {

			@Override
			public void handle(ScrollEvent event) {
				if (event.getDeltaY() < 0) {
					sw.nextAnim();
				}
				else {
					sw.prevAnim();
				}
			}
		});
	}
	
	public void doIt() {
		if (root.getCenter() == workspaceA) {		
			sw.switchTo(workspaceB);
		}
		else if (root.getCenter() == workspaceB) {
			sw.switchTo(workspaceA);
		}
		
	}
	
}
