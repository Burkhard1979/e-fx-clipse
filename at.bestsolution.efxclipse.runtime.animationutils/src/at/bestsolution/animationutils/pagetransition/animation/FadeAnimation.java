package at.bestsolution.animationutils.pagetransition.animation;

import javafx.animation.Animation;
import javafx.animation.FadeTransitionBuilder;
import javafx.animation.Interpolator;
import javafx.scene.Node;
import javafx.util.Duration;
import at.bestsolution.animationutils.pagetransition.ACenterSwitchAnimation;

public class FadeAnimation extends ACenterSwitchAnimation {

	@Override
	protected Animation createAndPrepareAnimation(Node curNode, Node newNode) {
		return FadeTransitionBuilder.create()
			.node(curNode)
			.interpolator(Interpolator.EASE_BOTH)
			.fromValue(1.0)
			.toValue(0.0)
			.duration(new Duration(1000))
			.build();
	}
	
	@Override
	protected void resetProperties(Node curNode, Node newNode) {
		curNode.setOpacity(1);
		newNode.setOpacity(1);
	}

}
