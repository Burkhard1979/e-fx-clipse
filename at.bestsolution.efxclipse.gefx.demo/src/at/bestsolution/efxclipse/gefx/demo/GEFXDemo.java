package at.bestsolution.efxclipse.gefx.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;
import at.bestsolution.efxclipse.gefx.scene.Block;
import at.bestsolution.efxclipse.gefx.scene.Connection;
import at.bestsolution.efxclipse.gefx.scene.Connector;
import at.bestsolution.efxclipse.gefx.scene.SceneFactory;
import at.bestsolution.efxclipse.gefx.scene.System;

public class GEFXDemo extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		SceneAdapterFactory sceneAdapterFactory = new SceneAdapterFactory();

		// this would come e.g. from an XMI Resource
//		at.bestsolution.efxclipse.gefx.scene.Group group = createGroup();
		
		Scene scene = new Scene(new Group(), 800, 600, Color.WHITE);
		Pane pane = new Pane();
		scene.setRoot(pane);

		System system = SceneFactory.eINSTANCE.createSystem();
		
		Block block = SceneFactory.eINSTANCE.createBlock();
		block.setX(100);
		block.setY(100);
		block.setWidth(100);
		block.setHeight(50);
		system.getBlocks().add(block);
		
		Connector connector = SceneFactory.eINSTANCE.createConnector();
		connector.setX(0.5);
		connector.setY(0);
		connector.setRotation(0);
		block.getConnectors().add(connector);
		
		Block block2 = SceneFactory.eINSTANCE.createBlock();
		block2.setX(300);
		block2.setY(100);
		block2.setWidth(100);
		block2.setHeight(50);
		system.getBlocks().add(block2);
		
		Connector connector2 = SceneFactory.eINSTANCE.createConnector();
		connector2.setX(-0.5);
		connector2.setY(0);
		connector2.setRotation(-Math.PI);
		block2.getConnectors().add(connector2);
		
		Connection connection = SceneFactory.eINSTANCE.createConnection();
		connection.setStart(connector);
		connection.setEnd(connector2);
		system.getConnections().add(connection);
		
		BlockAdapter blockAdapter = new BlockAdapter(block, pane);
		new ConnectorAdapter(connector, blockAdapter.getPane());
		
		BlockAdapter blockAdapter2 = new BlockAdapter(block2, pane);
		new ConnectorAdapter(connector2, blockAdapter2.getPane());
		
		new CubicConnectionAdapter(connection, pane);
		
		// the adapter factory adapts the JavaFX scene to the EMF objects
//		sceneAdapterFactory.adapt(group, scene);
		
		// take one of the EMF objects and change it...
//		Rectangle rectangle = (Rectangle) group.getChildren().get(0);
//		rectangle.setWidth(200);
		
		
//		CubicCurve cubic = new CubicCurve();
//		cubic.setStartX(0.0f);
//		cubic.setStartY(50.0f);
//		cubic.setControlX1(25.0f);
//		cubic.setControlY1(0.0f);
//		cubic.setControlX2(75.0f);
//		cubic.setControlY2(100.0f);
//		cubic.setEndX(100.0f);
//		cubic.setEndY(50.0f);
//		cubic.setFill(null);
//		cubic.setStroke(Color.BLACK);
//		pane.getChildren().add(cubic);
		
		
		// ...and the change will be reflected in the JavaFX scene
		primaryStage.setScene(scene);

		primaryStage.show();
	}
	
	

//	/**
//	 * creates a dummy scene from EObjects
//	 */
//	at.bestsolution.efxclipse.gefx.scene.Group createGroup() {
//		at.bestsolution.efxclipse.gefx.scene.Scene scene = SceneFactory.eINSTANCE.createScene();
//
//		at.bestsolution.efxclipse.gefx.scene.Group root = SceneFactory.eINSTANCE.createGroup();
//		scene.setRoot(root);
//
//		at.bestsolution.efxclipse.gefx.scene.Rectangle rectangle = SceneFactory.eINSTANCE.createRectangle();
//		rectangle.setX(10);
//		rectangle.setY(10);
//		rectangle.setWidth(100);
//		rectangle.setHeight(100);
//		root.getChildren().add(rectangle);
//
//		Ellipse ellipse = SceneFactory.eINSTANCE.createEllipse();
//		ellipse.setCenterX(200);
//		ellipse.setCenterY(200);
//		ellipse.setRadiusX(100);
//		ellipse.setRadiusY(50);
//		root.getChildren().add(ellipse);
//		
//		Line line = SceneFactory.eINSTANCE.createLine().from(ellipse).to(rectangle);
//		root.getLines().add(line);
//		
//		return root;
//	}
	
}
