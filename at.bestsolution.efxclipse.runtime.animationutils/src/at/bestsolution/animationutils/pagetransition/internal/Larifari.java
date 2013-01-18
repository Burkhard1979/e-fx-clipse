package at.bestsolution.animationutils.pagetransition.internal;


import javafx.animation.FadeTransition;
import javafx.animation.FadeTransitionBuilder;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.ParallelTransitionBuilder;
import javafx.animation.SequentialTransition;
import javafx.animation.SequentialTransitionBuilder;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Larifari extends Application {

	BorderPane left;
	BorderPane right;
	
	Rectangle rect;
	
	private void doIt() {
		Bounds leftBounds = left.getBoundsInParent();
		
		Bounds rightBounds = right.getBoundsInParent();
		
		
		FadeTransition fadeOut = FadeTransitionBuilder.create()
			.duration(new Duration(100))
			.fromValue(1)
			.toValue(0.3)
			.build();
		
		FadeTransition fadeIn = FadeTransitionBuilder.create()
			.duration(new Duration(100))
			.fromValue(0.3)
			.toValue(1)
			.build();
		
		TranslateTransition moveA = TranslateTransitionBuilder.create()
			.byX(leftBounds.getMinX()-rightBounds.getMinX())
			.byY(leftBounds.getMinY()-rightBounds.getMinY())
			.duration(new Duration(500))
			.node(right)
			.build();
		
		SequentialTransition a = SequentialTransitionBuilder.create()
			.node(right)
			.children(fadeOut, moveA, fadeIn)
			.build();
		
		TranslateTransition moveB = TranslateTransitionBuilder.create()
				.byX(rightBounds.getMinX()-leftBounds.getMinX())
				.byY(rightBounds.getMinY()-leftBounds.getMinY())
				.duration(new Duration(500))
				.node(left)
				.build();
		
		SequentialTransition b = SequentialTransitionBuilder.create()
				.node(right)
				.children(fadeOut, moveB, fadeIn)
				.build();
		
		ParallelTransition switchi = ParallelTransitionBuilder.create()
			.children(a, b)
			.interpolator(Interpolator.EASE_BOTH)
			.build();
		
		switchi.play();
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		HBox root = new HBox();
		root.setFillHeight(true);
		
		left = new BorderPane();
		Text t = new Text("Left Area");
		t.setEffect(new DropShadow(2,3,3,Color.RED));
		t.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				doIt();
			}
		});
		left.setCenter(t);
		HBox.setHgrow(left, Priority.ALWAYS);
//		left.setMinWidth(800);
//		left.setMinHeight(300);
//		front.setLayoutX(400);
//		front.setLayoutY(300);
		
		rect = new Rectangle(20, 80);
		rect.setOpacity(0.7);
		rect.setFill(Color.GREEN);
		
		left.getChildren().add(rect);

		right = new BorderPane();
		t = new Text("right\nside");
		t.setTextAlignment(TextAlignment.CENTER);
		t.setEffect(new DropShadow(2,3,3,Color.RED));
		
		right.setCenter(t);
		HBox.setHgrow(right, Priority.ALWAYS);
//		right.setMinWidth(800);
//		right.setMinHeight(600);
//		right.setVisible(true);
//		right.setLayoutX(400);
//		right.setLayoutY(300);
		
//		back.setRotationAxis(new Point3D(0, 1, 0));
//		back.setRotate(130);
		
		root.getChildren().add(left);
		root.getChildren().add(right);
		
		Scene scene = new Scene(root);
		scene.setCamera(new PerspectiveCamera());
		primaryStage.setScene(scene);
		primaryStage.setWidth(800);
		primaryStage.setHeight(600);
		
		primaryStage.show();
		
		primaryStage.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				doIt();
			}
		});

	}

	public static void main(String[] args) {
		launch(args);
	}
}
