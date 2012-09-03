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
package at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.UIEvents;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WLayoutedWidget;


@SuppressWarnings("restriction")
public abstract class WLayoutedWidgetImpl<N,NN extends Node,M extends MUIElement> extends WWidgetImpl<N,M> implements WLayoutedWidget<M> {
	private AnchorPane staticLayoutGroup;
	private double weight = 10;
	
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
	
	@Override
	public double getWeight() {
		return weight;
	}
	
	@Inject
	void setContainerData(@Named(UIEvents.UIElement.CONTAINERDATA) @Optional String data) {
		if( data != null ) {
			try {
				weight = Double.parseDouble(data);
				return;
			} catch(Throwable t) {
				
			}
		}
		
		weight = 10;
	}
}