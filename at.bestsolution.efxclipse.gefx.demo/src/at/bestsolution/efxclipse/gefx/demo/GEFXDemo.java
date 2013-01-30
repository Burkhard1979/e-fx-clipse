package at.bestsolution.efxclipse.gefx.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import at.bestsolution.efxclipse.gefx.scene.Ellipse;
import at.bestsolution.efxclipse.gefx.scene.Rectangle;
import at.bestsolution.efxclipse.gefx.scene.SceneFactory;

public class GEFXDemo extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		SceneAdapterFactory sceneAdapterFactory = new SceneAdapterFactory();

		// this would come e.g. from an XMI Resource
		at.bestsolution.efxclipse.gefx.scene.Group group = createGroup();

		Scene scene = new Scene(new Group(), 800, 600, Color.WHITE);

		// the adapter factory adapts the JavaFX scene to the EMF objects
		sceneAdapterFactory.adapt(group, scene);
		
		// take one of the EMF objects and change it...
		Rectangle rectangle = (Rectangle) group.getChildren().get(0);
		rectangle.setWidth(200);
		
		// ...and the change will be reflected in the JavaFX scene
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	/**
	 * creates a dummy scene from EObjects
	 */
	at.bestsolution.efxclipse.gefx.scene.Group createGroup() {
		at.bestsolution.efxclipse.gefx.scene.Scene scene = SceneFactory.eINSTANCE.createScene();

		at.bestsolution.efxclipse.gefx.scene.Group root = SceneFactory.eINSTANCE.createGroup();
		scene.setRoot(root);

		at.bestsolution.efxclipse.gefx.scene.Rectangle rectangle = SceneFactory.eINSTANCE.createRectangle();
		rectangle.setX(10);
		rectangle.setY(10);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		root.getChildren().add(rectangle);

		Ellipse ellipse = SceneFactory.eINSTANCE.createEllipse();
		ellipse.setCenterX(200);
		ellipse.setCenterY(200);
		ellipse.setRadiusX(100);
		ellipse.setRadiusY(50);
		root.getChildren().add(ellipse);

		return root;
	}
	
}
