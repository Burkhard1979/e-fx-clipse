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

public class TestSwitch extends Application {
	
	BorderPane root;
	ImageView workspaceA;
	ImageView workspaceB;
	
	AnimatedBorderPaneCenterSwitcher sw;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			workspaceA = new ImageView();
			workspaceA.setImage(new Image("ws1.png")); 
			workspaceB = new ImageView();
			workspaceB.setImage(new Image("ws2.png"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		root = new BorderPane();
		sw = new AnimatedBorderPaneCenterSwitcher(root);
		root.setCenter(workspaceA);
		Scene scene = new Scene(root);
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

	public static void main(String[] args) {
		launch(args);
	}
}
