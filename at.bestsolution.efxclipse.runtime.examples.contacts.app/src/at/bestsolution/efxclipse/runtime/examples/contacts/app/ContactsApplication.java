/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.examples.contacts.app;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
 
public class ContactsApplication extends Application {

    public static void main(String[] args) {
    	launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	URL location = getClass().getResource("contacts.fxml");
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(location);
    	fxmlLoader.setController(new ContactsController());

    	Pane root = null;
    	try {
			root = (Pane)fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

    	Scene scene = new Scene(root, 800, 600);
		
    	primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}