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
package at.bestsolution.efxclipse.runtime.workbench.renderers.fx;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePartRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPart;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefPartRenderer extends BasePartRenderer<BorderPane> {

	@Override
	protected Class<? extends WPart<BorderPane>> getWidgetClass(MPart part) {
		return PartImpl.class;
	}

	@Override
	protected boolean requiresFocus(WPart<BorderPane> widget) { 
		Node n = (Node) widget.getWidget();
		
		do {
			if( n.getUserData() == widget ) {
				return false;
			}
		} while( (n = n.getParent()) != null );
		
		return true;
	}
	
	public static class PartImpl extends WLayoutedWidgetImpl<BorderPane, BorderPane, MPart> implements WPart<BorderPane> {
		@Inject
		EPartService service;
		
		@Override
		protected BorderPane createWidget() {
			final BorderPane p = new BorderPane();
			p.setOnMousePressed(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					event.consume();
					service.activate(getDomElement(),true);
					if( !checkFocusControl() ) {
						ContextInjectionFactory.invoke(getDomElement().getObject(), Focus.class, getDomElement().getContext(),null);
						if( !checkFocusControl() ) {
							p.requestFocus();	
						}
					}
				}
			});
			return p;
		}
		
		private boolean checkFocusControl() {
			BorderPane check = getWidget();
			Node n = check.getScene().getFocusOwner();
			
			if( n == null ) {
				return false;
			}
			
			while (n.getParent() != null) {
				if (n.getParent() == check) {
					return true;
				}
				n = n.getParent();
				
			}
			return false;
		}

		@Override
		protected BorderPane getWidgetNode() {
			return getWidget();
		}
	}
}
