package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl;

import java.util.List;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;

@SuppressWarnings("restriction")
public abstract class WLayoutedWidgetImpl<N,NN extends Node,M extends MUIElement> extends WWidgetImpl<N,M> implements WLayoutedWidget<M> {
	private AnchorPane staticLayoutGroup;
	
	protected abstract NN getWidgetNode();
	
	@Override
	public Node getStaticLayoutNode() {
		if( staticLayoutGroup == null ) {
			Node n = getWidgetNode();
			if( n != null ) {
				staticLayoutGroup = new AnchorPane();
				staticLayoutGroup.getChildren().add(n);
				AnchorPane.setBottomAnchor(n, 0.0);
				AnchorPane.setLeftAnchor(n, 0.0);
				AnchorPane.setRightAnchor(n, 0.0);
				AnchorPane.setTopAnchor(n, 0.0);
			}
		}
		return staticLayoutGroup;
	}
	
	@Override
	public void addStyleClasses(List<String> classnames) {
		getWidgetNode().getStyleClass().addAll(classnames);
	}
	
	@Override
	public void addStyleClasses(String... classnames) {
		getWidgetNode().getStyleClass().addAll(classnames);
	}
	
	@Override
	public void setStyleId(String id) {
		getWidgetNode().setId(id);
	}
	
	@Override
	protected void setUserData(WWidgetImpl<N, M> widget) {
		getWidgetNode().setUserData(widget);
	}
}
