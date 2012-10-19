package at.bestsolution.animationutils.pagetransition;

import java.util.Deque;
import java.util.LinkedList;

import javafx.animation.Animation;
import javafx.animation.FadeTransitionBuilder;
import javafx.animation.Interpolator;
import javafx.animation.PauseTransitionBuilder;
import javafx.animation.SequentialTransitionBuilder;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import at.bestsolution.animationutils.pagetransition.animation.FadeAnimation;
import at.bestsolution.animationutils.pagetransition.animation.RotateOutAnimation;
import at.bestsolution.animationutils.pagetransition.animation.SlideAnimation;
import at.bestsolution.animationutils.pagetransition.animation.ZoomSlideAnimation;

public class AnimatedBorderPaneCenterSwitcher {

	private BorderPane pane;
	private Text label;
	
	private Deque<ACenterSwitchAnimation> animations = new LinkedList<ACenterSwitchAnimation>();
	private ACenterSwitchAnimation anim = new SlideAnimation();
	
	public AnimatedBorderPaneCenterSwitcher(BorderPane pane) {
		this.pane = pane;
		
		pane.setStyle(	"-fx-background-image: url(\"low_contrast_linen.png\");" +
						"-fx-background-repeat: repeat;");
		
		animations.add(new SlideAnimation());
		animations.add(new FadeAnimation());
		animations.add(new ZoomSlideAnimation());
		animations.add(new RotateOutAnimation());
		
		anim = animations.poll();
		
		label = new Text();
		label.setFont(new Font("Arial", 100));
		label.setEffect(new javafx.scene.effect.DropShadow(5, 3, 4, Color.RED));
		label.setX(20);
		label.setY(120);
		
		a = SequentialTransitionBuilder.create().children(
			FadeTransitionBuilder.create()
				.node(label)
				.interpolator(Interpolator.EASE_IN)
				.fromValue(0)
				.toValue(1)
				.duration(new Duration(800))
				.build(),
			PauseTransitionBuilder.create()
				.duration(new Duration(500))
				.build(),
			FadeTransitionBuilder.create()
				.node(label)
				.interpolator(Interpolator.EASE_OUT)
				.fromValue(1)
				.toValue(0)
				.duration(new Duration(1000))
				.build()
		).build();
	}
	
	public void switchTo(Node newCenter) {
		showCurrentAnimation();
		anim.animate(pane, newCenter);
	}
	
	public void nextAnim() {
		animations.offerLast(anim);
		anim = animations.pollFirst();
		System.err.println("current anim is " + anim);
		showCurrentAnimation();
	}
	
	public void prevAnim() {
		animations.offerFirst(anim);
		anim = animations.pollLast();
		System.err.println("current anim is " + anim);
		showCurrentAnimation();
	}
	
	Animation a;
	
	private void showCurrentAnimation() {
		
		String string = anim.getClass().getSimpleName();
		
		label.setText(string);
		
		if (pane.getChildren().contains(label)) {
			
			if (pane.getChildren().indexOf(label) != pane.getChildren().size()-1) {
				pane.getChildren().remove(label);
				pane.getChildren().add(label);
			}
			
			a.stop();
			a.playFrom(new Duration(800));
			return;
		}
		
		pane.getChildren().add(label);
		
		a.onFinishedProperty().set(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				pane.getChildren().remove(label);
			}
		});
		
		a.play();
	}
	
	
	
}
