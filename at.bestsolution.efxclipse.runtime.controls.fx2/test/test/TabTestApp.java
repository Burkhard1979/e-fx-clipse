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
package test;

import at.bestsolution.efxclipse.runtime.controls.fx2.FX2Tab;
import at.bestsolution.efxclipse.runtime.controls.fx2.FX2TabPane;
import at.bestsolution.efxclipse.runtime.controls.fx2.FX2TabPaneSkin;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.stage.Stage;
import javafx.util.Callback;

public class TabTestApp extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(TabTestApp.class);
	}

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		FX2TabPane p = new FX2TabPane();
		p.setSkin(new FX2TabPaneSkin(p));
		FX2Tab tab = new FX2Tab();
		tab.setCloseVetoHandler(new Callback<Tab, Boolean>() {
			
			@Override
			public Boolean call(Tab param) {
				return Boolean.TRUE;
			}
		});
		tab.setText("Hello World");
		p.getTabs().add(tab);
		
		Scene s = new Scene(p,200,200);
		primaryStage.setScene(s);
		primaryStage.show();
	}

}
