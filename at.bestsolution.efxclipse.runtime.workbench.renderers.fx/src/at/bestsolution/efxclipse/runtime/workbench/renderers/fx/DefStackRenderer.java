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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.workbench.IResourceUtilities;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.runtime.panels.fx.FXTab;
import at.bestsolution.efxclipse.runtime.panels.fx.FXTabPane;
import at.bestsolution.efxclipse.runtime.panels.fx.FXTabPane.MinMaxState;
import at.bestsolution.efxclipse.runtime.panels.skins.MinMaxTabPaneSkin;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseStackRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WCallback;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WStack;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WStack.WStackItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.actions.DetachView;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.actions.MoveToFirst;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.actions.MoveToLast;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.actions.PinToBottom;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefStackRenderer extends BaseStackRenderer<FXTabPane,FXTab, Node> {

	@Override
	protected Class<? extends WStack<FXTabPane,FXTab, Node>> getWidgetClass(MPartStack stack) {
		return StackWidgetImpl.class;
	}

	
	public static class StackWidgetImpl extends WLayoutedWidgetImpl<FXTabPane, FXTabPane, MPartStack> implements WStack<FXTabPane, FXTab, Node> {
		
		private WCallback<WStackItem<FXTab, Node>, Void> mouseSelectedItemCallback;
		private WCallback<WStackItem<FXTab, Node>, Void> keySelectedItemCallback;
		private WCallback<WMinMaxState, Void> minMaxCallback;
		private boolean inKeyTraversal;
		
		@Inject
		private EModelService modelService;
		
		public void setMouseSelectedItemCallback(WCallback<WStackItem<FXTab, Node>, Void> mouseSelectedItemCallback) {
			this.mouseSelectedItemCallback = mouseSelectedItemCallback;
		}
		
		public void setKeySelectedItemCallback(WCallback<WStackItem<FXTab, Node>, Void> keySelectedItemCallback) {
			this.keySelectedItemCallback = keySelectedItemCallback;
		}
		
		@Override
		public int indexOf(WStackItem<FXTab, Node> item) {
			return getWidget().getTabs().indexOf(item.getNativeItem());
		}
		
		@Override
		public int getItemCount() {
			return getWidget().getTabs().size();
		}
		
		@Override
		public void setMinMaxCallback(WCallback<WMinMaxState, Void> minMaxCallback) {
			this.minMaxCallback = minMaxCallback;
		}
		
		@Override
		public void setMinMaxState(WMinMaxState state) {
			MinMaxState t = MinMaxState.RESTORED;
			switch (state) {
			case MAXIMIZED:
				t = MinMaxState.MAXIMIZED;
				break;
			case MINIMIZED:
				t = MinMaxState.MINIMIZED;
				break;
			case RESTORED:
				t = MinMaxState.RESTORED;
				break;
			case NONE:
				t = MinMaxState.NONE;
				break;
			}
			getWidget().setMinMaxState(t);
		}
		
		@Override
		protected FXTabPane createWidget() {
			FXTabPane p = new FXTabPane();
			p.setSkin(new MinMaxTabPaneSkin(p));
			
//			ContextMenu m = new ContextMenu();
//			
//			{
//				MenuItem item = new MenuItem("Detach");
//				item.setOnAction(new EventHandler<ActionEvent>() {
//					
//					@Override
//					public void handle(ActionEvent event) {
//						DetachView d = new DetachView();
//						d.detach((MPart) getDomElement().getSelectedElement(), modelService);
//					}
//				});
//				m.getItems().add(item);	
//			}
//			
//			{
//				MenuItem item = new MenuItem("Move To First");
//				item.setOnAction(new EventHandler<ActionEvent>() {
//					
//					@Override
//					public void handle(ActionEvent event) {
//						MoveToFirst d = new MoveToFirst();
//						d.move((MPart) getDomElement().getSelectedElement());
//					}
//				});
//				m.getItems().add(item);	
//			}
//			
//			{
//				MenuItem item = new MenuItem("Move To Last");
//				item.setOnAction(new EventHandler<ActionEvent>() {
//					
//					@Override
//					public void handle(ActionEvent event) {
//						MoveToLast d = new MoveToLast();
//						d.move((MPart) getDomElement().getSelectedElement());
//					}
//				});
//				m.getItems().add(item);	
//			}
//			
//			{
//				MenuItem item = new MenuItem("Pin To Bottom");
//				item.setOnAction(new EventHandler<ActionEvent>() {
//					
//					@Override
//					public void handle(ActionEvent event) {
//						PinToBottom d = new PinToBottom();
//						d.pin((MPart) getDomElement().getSelectedElement());
//					}
//				});
//				m.getItems().add(item);	
//			}
//			
//			p.setContextMenu(m);
			p.minMaxStateProperty().addListener(new ChangeListener<MinMaxState>() {

				@Override
				public void changed(ObservableValue<? extends MinMaxState> observable, MinMaxState oldValue, MinMaxState newValue) {
					if( minMaxCallback != null ) {
						switch (newValue) {
						case RESTORED:
							minMaxCallback.call(WMinMaxState.RESTORED);
							break;
						case MAXIMIZED:
							minMaxCallback.call(WMinMaxState.MAXIMIZED);
							break;
						case MINIMIZED:
							minMaxCallback.call(WMinMaxState.MINIMIZED);
							break;
						case NONE:
							// Nothing to do
							break;
						}	
					}
				}
			});
			p.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent event) {
					inKeyTraversal = true;
				}
				
			});
			p.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent event) {
					inKeyTraversal = false;
				}
				
			});

			p.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<FXTab>() {

				@Override
				public void changed(ObservableValue<? extends FXTab> observable, FXTab oldValue, FXTab newValue) {
					if( newValue == null ) {
						return;
					}
					final StackItemImpl w = (StackItemImpl) newValue.getUserData();
					w.handleSelection();
					 
					final WCallback<WStackItem<FXTab, Node>, Void> cb;
					if( ! inKeyTraversal ) {
						cb = mouseSelectedItemCallback;
					} else {
						cb = keySelectedItemCallback;
					}
					
					if( cb != null ) {
						if( w.tab.getContent() != null && ! w.tab.getContent().isVisible() ) {
							// At the moment the visibility changes the content is not yet
							// made visible
							w.tab.getContent().visibleProperty().addListener(new ChangeListener<Boolean>() {

								@Override
								public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
									w.tab.getContent().visibleProperty().removeListener(this);
									if( newValue ) {
										cb.call(w);
									}
								}
							});
						} else {
							// Delay if the subcontrol just got created
							// isVisible() reports true while it is not really
							Platform.runLater(new Runnable() {
								
								@Override
								public void run() {
									cb.call(w);
								}
							});
							
						}
					}
				}
			});
			return p;
		}

		@Override
		protected FXTabPane getWidgetNode() {
			return getWidget();
		}

		@Override
		public Class<? extends WStackItem<FXTab, Node>> getStackItemClass() {
			return StackItemImpl.class;
		}
		
		@Override
		public void addItem(WStackItem<FXTab, Node> item) {
			addItems(Collections.singletonList(item));
		}
		
		@Override
		public void addItems(List<WStackItem<FXTab, Node>> items) {
			getWidget().getTabs().addAll(extractTabs(items));
		}
		
		@Override
		public void addItems(int index, List<WStackItem<FXTab, Node>> items) {
			getWidget().getTabs().addAll(index, extractTabs(items));
		}
		
		private static final List<FXTab> extractTabs(List<WStackItem<FXTab, Node>> items) {
			List<FXTab> tabs = new ArrayList<FXTab>(items.size());
			for( WStackItem<FXTab, Node> t : items ) {
				tabs.add(t.getNativeItem());
			}
			return tabs;
		}
		
		@Override
		public void selectItem(int idx) {
			getWidget().getSelectionModel().select(idx);
		}

		@Override
		public List<WStackItem<FXTab, Node>> getItems() {
			List<WStackItem<FXTab, Node>> rv = new ArrayList<WStackItem<FXTab, Node>>();
			for( FXTab t : getWidget().getTabs() ) {
				@SuppressWarnings("unchecked")
				WStackItem<FXTab, Node> i = (WStackItem<FXTab, Node>) t.getUserData();
				if( i != null ) {
					rv.add(i);	
				}
			}
			return Collections.unmodifiableList(rv);
		}

		@Override
		public void removeItems(List<WStackItem<FXTab, Node>> items) {
			List<FXTab> l = new ArrayList<FXTab>();
			for( WStackItem<FXTab, Node> i : items ) {
				l.add(i.getNativeItem());
			}
			getWidget().getTabs().removeAll(l);
		}
	}
	
	public static class StackItemImpl implements WStackItem<FXTab, Node> {
		private FXTab tab;
		private WCallback<WStackItem<FXTab, Node>, Node> initCallback;
		private WCallback<WStackItem<FXTab, Node>, Boolean> closeCallback;
		private MStackElement domElement;
		
		@Inject
		private IResourceUtilities<Image> resourceUtilities;
		
		@PostConstruct
		void init() {
			getWidget();
		}
		
		@Override
		public void setDomElement(MStackElement domElement) {
			this.domElement = domElement;
		}
		
		@Override
		public MStackElement getDomElement() {
			return domElement;
		}

		protected FXTab getWidget() {
			if( tab == null ) {
				tab = createWidget();
			}
			tab.setUserData(this);
			return tab;
		}
		
		protected FXTab createWidget() {
			final FXTab t = new FXTab();
			t.setCloseVetoHandler(new Callback<FXTab, Boolean>() {
				
				@Override
				public Boolean call(FXTab param) {
					if( closeCallback != null ) {
						return closeCallback.call(StackItemImpl.this);
					}
					return Boolean.FALSE;
				}
			});
			return t;
		}
		
		void handleSelection() {
			if( initCallback != null ) {
				tab.setContent(initCallback.call(this));
				initCallback = null;
			}	
		}
		
		public void setInitCallback(WCallback<WStackItem<FXTab, Node>, Node> initCallback) {
			this.initCallback = initCallback;
		}

		@Override
		public FXTab getNativeItem() {
			return getWidget();
		}

		@Inject
		public void setLabel(@Named(ATTRIBUTE_localizedLabel)String label) {
			getWidget().setText(label);
		}
		
		@Inject
		public void setCloseable(@Named(UIEvents.Part.CLOSEABLE) boolean closeable) {
			getWidget().setClosable(closeable);
		}
		
		@Inject
		public void setIcon(@Named(UIEvents.UILabel.ICONURI) @Optional String iconUri) {
			if( iconUri != null ) {
				getWidget().setGraphic(new ImageView(resourceUtilities.imageDescriptorFromURI(URI.createURI(iconUri))));
			} else {
				getWidget().setGraphic(null);
			}
		}
		
		@Override
		public void setOnCloseCallback(final WCallback<WStackItem<FXTab, Node>, Boolean> callback) {
			this.closeCallback = callback;
		}
	}
}
