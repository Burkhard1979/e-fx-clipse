package at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget;

import javafx.scene.Node;

public class PerspectiveStackItem {
	private Node content;
	private Runnable runnable;
	
	public Node getContent() {
		if( content == null ) {
			if( runnable != null ) {
				runnable.run();
			}
		}
		return content;
	}

	public void setInitRunnable(Runnable runnable) {
		this.runnable = runnable;
	}

	public void setContent(Node content) {
		this.content = content;
	}
}
