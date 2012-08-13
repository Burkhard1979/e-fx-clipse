package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;

import at.bestsolution.efxclipse.runtime.panels.fx.FXTab;
import at.bestsolution.efxclipse.runtime.panels.fx.FXTabPane;
import at.bestsolution.efxclipse.runtime.panels.skins.MinMaxTabPaneSkin;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseStackRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack.WStackItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefStackRenderer extends BaseStackRenderer<FXTabPane,FXTab> {

	@Override
	protected Class<? extends WStack<FXTabPane,FXTab>> getWidgetClass() {
		return StackWidgetImpl.class;
	}

	
	public static class StackWidgetImpl extends WLayoutedWidgetImpl<FXTabPane, FXTabPane, MPartStack> implements WStack<FXTabPane, FXTab> {
		
		private Callback<WStackItem<FXTab>, Void> mouseSelectedItemCallback;
		private Callback<WStackItem<FXTab>, Void> keySelectedItemCallback;
		private boolean inKeyTraversal;
		
		public void setMouseSelectedItemCallback(Callback<WStackItem<FXTab>, Void> mouseSelectedItemCallback) {
			this.mouseSelectedItemCallback = mouseSelectedItemCallback;
		}
		
		public void setKeySelectedItemCallback(Callback<WStackItem<FXTab>, Void> keySelectedItemCallback) {
			this.keySelectedItemCallback = keySelectedItemCallback;
		}
		
		@Override
		public int indexOf(WStackItem<FXTab> item) {
			return getWidget().getTabs().indexOf(item.getNativeItem());
		}
		
		@Override
		public int getItemCount() {
			return getWidget().getTabs().size();
		}
		
		@Override
		protected FXTabPane createWidget() {
			FXTabPane p = new FXTabPane();
//			p.setTabClosingPolicy(TabClosingPolicy.ALL_TABS);
			p.setSkin(new MinMaxTabPaneSkin(p));
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
					 
					final Callback<WStackItem<FXTab>, Void> cb;
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
		public Class<? extends WStackItem<FXTab>> getStackItemClass() {
			return StackItemImpl.class;
		}
		
		@Override
		public void addItem(WStackItem<FXTab> item) {
			addItems(Collections.singletonList(item));
		}
		
		@Override
		public void addItems(List<WStackItem<FXTab>> items) {
			getWidget().getTabs().addAll(extractTabs(items));
		}
		
		@Override
		public void addItems(int index, List<WStackItem<FXTab>> items) {
			getWidget().getTabs().addAll(index, extractTabs(items));
		}
		
		private static final List<FXTab> extractTabs(List<WStackItem<FXTab>> items) {
			List<FXTab> tabs = new ArrayList<FXTab>(items.size());
			for( WStackItem<FXTab> t : items ) {
				tabs.add(t.getNativeItem());
			}
			return tabs;
		}
		
		@Override
		public void selectItem(int idx) {
			getWidget().getSelectionModel().select(idx);
		}

		@Override
		public List<WStackItem<FXTab>> getItems() {
			List<WStackItem<FXTab>> rv = new ArrayList<WStackItem<FXTab>>();
			for( FXTab t : getWidget().getTabs() ) {
				@SuppressWarnings("unchecked")
				WStackItem<FXTab> i = (WStackItem<FXTab>) t.getUserData();
				if( i != null ) {
					rv.add(i);	
				}
			}
			return Collections.unmodifiableList(rv);
		}

		@Override
		public void removeItems(List<WStackItem<FXTab>> items) {
			List<FXTab> l = new ArrayList<FXTab>();
			for( WStackItem<FXTab> i : items ) {
				l.add(i.getNativeItem());
			}
			getWidget().getTabs().removeAll(l);
		}
	}
	
	public static class StackItemImpl implements WStackItem<FXTab> {
		private FXTab tab;
		private Callback<WStackItem<FXTab>, Node> initCallback;
		private Callback<WStackItem<FXTab>, Boolean> closeCallback;
		private MStackElement domElement;
		
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
		
		public void setInitCallback(Callback<WStackItem<FXTab>, Node> initCallback) {
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
		
		@Override
		public void setOnCloseCallback(final Callback<WStackItem<FXTab>, Boolean> callback) {
			this.closeCallback = callback;
		}
	}
}
