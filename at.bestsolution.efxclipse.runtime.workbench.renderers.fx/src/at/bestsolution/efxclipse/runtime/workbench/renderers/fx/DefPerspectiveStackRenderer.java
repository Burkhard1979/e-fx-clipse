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
import java.util.List;

import javafx.scene.Node;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;

import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePerspectiveStackRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WCallback;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPerspectiveStack;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPerspectiveStack.WStackItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.PerspectiveStackItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefPerspectiveStackRenderer extends BasePerspectiveStackRenderer<FillLayoutPane,PerspectiveStackItem,Node> {

	@Override
	protected Class<? extends WPerspectiveStack<FillLayoutPane,PerspectiveStackItem,Node>> getWidgetClass() {
		return PerspectiveStackImpl.class;
	}
	
	public static class PerspectiveStackItemImpl implements WStackItem<PerspectiveStackItem, Node> {
		private PerspectiveStackItem item;
		private MPerspective domElement;
		private WCallback<WStackItem<PerspectiveStackItem, Node>, Node> initCallback;
		
		@PostConstruct
		void init() {
			getWidget();
		}
		
		protected PerspectiveStackItem getWidget() {
			if( item == null ) {
				item = createWidget();
			}
			return item;
		}
		
		protected PerspectiveStackItem createWidget() {
			final PerspectiveStackItem t = new PerspectiveStackItem();
			t.setInitRunnable(new Runnable() {
				
				@Override
				public void run() {
					if( initCallback != null ) {
						t.setContent(initCallback.call(PerspectiveStackItemImpl.this));
					}
				}
			});
			return t;
		}
		
		@Override
		public PerspectiveStackItem getNativeItem() {
			return item;
		}

		@Override
		public void setDomElement(MPerspective domElement) {
			this.domElement = domElement;
		}

		@Override
		public MPerspective getDomElement() {
			return domElement;
		}

		@Override
		public void setInitCallback(WCallback<WStackItem<PerspectiveStackItem, Node>, Node> callback) {
			this.initCallback = callback;
		}

		@Override
		public void setOnCloseCallback(WCallback<WStackItem<PerspectiveStackItem, Node>, Boolean> callback) {
			
		}
		
	}
	
	public static class PerspectiveStackImpl extends WLayoutedWidgetImpl<FillLayoutPane, FillLayoutPane, MPerspectiveStack> implements WPerspectiveStack<FillLayoutPane, PerspectiveStackItem, Node> {
		private List<WStackItem<PerspectiveStackItem, Node>> items = new ArrayList<WStackItem<PerspectiveStackItem,Node>>();
		
		@Override
		public Class<? extends WStackItem<PerspectiveStackItem, Node>> getStackItemClass() {
			return PerspectiveStackItemImpl.class;
		}

		@Override
		public void addItem(WStackItem<PerspectiveStackItem, Node> item) {
			items.add(item);
		}

		@Override
		public void addItems(List<WStackItem<PerspectiveStackItem, Node>> items) {
			this.items.addAll(items);
		}

		@Override
		public void addItems(int index, List<WStackItem<PerspectiveStackItem, Node>> items) {
			this.items.addAll(index, items);
		}

		@Override
		public void selectItem(int idx) {
			WStackItem<PerspectiveStackItem, Node> item = items.get(idx);
			Node node = item.getNativeItem().getContent();
			getWidget().getChildren().setAll(node);
		}

		@Override
		public int indexOf(WStackItem<PerspectiveStackItem, Node> item) {
			return items.indexOf(item);
		}

		@Override
		public List<WStackItem<PerspectiveStackItem, Node>> getItems() {
			return items;
		}

		@Override
		public void removeItems(List<WStackItem<PerspectiveStackItem, Node>> items) {
			this.items.removeAll(items);
		}

		@Override
		public void setMouseSelectedItemCallback(WCallback<WStackItem<PerspectiveStackItem, Node>, Void> selectedItemCallback) {
			
		}

		@Override
		public void setKeySelectedItemCallback(WCallback<WStackItem<PerspectiveStackItem, Node>, Void> selectedItemCallback) {
			
		}

		@Override
		public int getItemCount() {
			return items.size();
		}

		@Override
		protected FillLayoutPane getWidgetNode() {
			return getWidget();
		}

		@Override
		protected FillLayoutPane createWidget() {
			return new FillLayoutPane();
		}
	}
}