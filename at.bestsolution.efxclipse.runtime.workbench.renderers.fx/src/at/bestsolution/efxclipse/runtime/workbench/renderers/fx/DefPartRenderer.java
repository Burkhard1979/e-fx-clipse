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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import at.bestsolution.efxclipse.runtime.core.log.Logger.Level;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePartRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPart;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WToolBar;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefPartRenderer extends BasePartRenderer<BorderPane,Node,Node> {
	private static final String TOOLBAR_MENU_FLOAT_TAG = "Part-ToolBarMenu-Floating";
	private static final String TOOLBAR_MENU_BOTTOM_TAG = "Part-ToolBarMenu-Bottom";
	
	private static final String TOOL_BAR_FULL_SPAN_TAG = "Part-Toolbar-FullSpan";
	
	@Override
	protected Class<? extends WPart<BorderPane,Node,Node>> getWidgetClass(MPart part) {
		return PartImpl.class;
	}

	@Override
	protected boolean requiresFocus(WPart<BorderPane,Node,Node> widget) { 
		Node n = (Node) widget.getWidget();
		
		do {
			if( n.getUserData() == widget ) {
				return false;
			}
		} while( (n = n.getParent()) != null );
		
		return true;
	}
	
	public static class PartImpl extends WLayoutedWidgetImpl<BorderPane, AnchorPane, MPart> implements WPart<BorderPane,Node,Node> {
		@Inject
		EPartService service;
		
		private AnchorPane contentArea;
		private BorderPane dataArea;
		private BorderPane toolbarMenuContainer;
		
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
			if( check == null || check.getScene() == null ) {
				return false;
			}
			
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
		protected AnchorPane getWidgetNode() {
			if( contentArea == null ) {
				contentArea = new AnchorPane();
				dataArea = new BorderPane();
				
				AnchorPane.setTopAnchor(dataArea, 0.0);
				AnchorPane.setLeftAnchor(dataArea, 0.0);
				AnchorPane.setBottomAnchor(dataArea, 1.0);
				AnchorPane.setRightAnchor(dataArea, 1.0);
				
				contentArea.getChildren().add(dataArea);
				
				Node n = getWidget();
				if( n != null ) {
					n.getStyleClass().add("part-content");
					dataArea.setCenter(n);
				} else {
					logger.log(Level.ERROR, "No widget node to attach");
				}				
			}
			return contentArea;
		}

		private void initToolbarMenu() {
			if( toolbarMenuContainer == null ) {
				// Ensure that everything is initialized!!!
				getStaticLayoutNode();
				BorderPane p = new BorderPane();
				p.getStyleClass().add("view-toolbar-menu");
				toolbarMenuContainer = new BorderPane();
				if( getDomElement().getTags().contains(TOOL_BAR_FULL_SPAN_TAG) ) {
					p.setCenter(toolbarMenuContainer);
				} else {
					p.setRight(toolbarMenuContainer);	
				}
				
				if( getDomElement().getTags().contains(TOOLBAR_MENU_BOTTOM_TAG) ) {
					dataArea.setBottom(p);
				} else {
					dataArea.setTop(p);	
				}
			}
		}
		
		private void checkToolbarMenu() {
			if( toolbarMenuContainer.getLeft() == null && toolbarMenuContainer.getRight() == null ) {
				toolbarMenuContainer = null;
				dataArea.setTop(null);
			}
		}
		
		@Override
		public void setToolbar(WToolBar<Node> widget) {
			if( widget == null ) {
				if( toolbarMenuContainer != null ) {
					toolbarMenuContainer.setLeft(null);
					checkToolbarMenu();
				}
			} else {
				initToolbarMenu();
				((Node)widget.getWidget()).getStyleClass().add("view-toolbar");
				toolbarMenuContainer.setLeft((Node) widget.getStaticLayoutNode());
			}
		}
		
		@Override
		public void setMenu(WMenu<Node> widget) {
			if( widget == null ) {
				if( toolbarMenuContainer != null ) {
					toolbarMenuContainer.setRight(null);
					checkToolbarMenu();
				}
			} else {
				initToolbarMenu();
				toolbarMenuContainer.setRight((Node) widget.getWidget());
			}
		}
	}
}
