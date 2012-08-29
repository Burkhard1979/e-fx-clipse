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

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.control.SplitPane.Divider;

import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseSashRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WSash;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefSashRenderer extends BaseSashRenderer<SplitPane> {

	@Override
	protected Class<? extends WSash<SplitPane>> getWidgetClass() {
		return WSashImpl.class;
	}

	public static class WSashImpl extends WLayoutedWidgetImpl<SplitPane, SplitPane, MPartSashContainer> implements WSash<SplitPane> {
		private List<WLayoutedWidget<MPartSashContainerElement>> items = new ArrayList<WLayoutedWidget<MPartSashContainerElement>>();

		private ChangeListener<Number> listener = new ChangeListener<Number>() {
			private boolean queueing;
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				if( ! queueing ) {
					queueing = true;
					Platform.runLater(new Runnable() {
						
						@Override
						public void run() {
							recalcWeight();
							queueing = false;
						}
					});
				}
			}
		};
		
		private void recalcWeight() {
			double prev = 0;
			int idx = 0;
			for( double d : getWidget().getDividerPositions() ) {
				items.get(idx++).getDomElement().setContainerData((d - prev)*10+"");
				prev = d;
			}
			items.get(items.size()-1).getDomElement().setContainerData((1.0-prev)*10+"");
		}
		
		@Override
		protected void bindProperties(final SplitPane widget) {
			super.bindProperties(widget);
			widget.getDividers().addListener(new ListChangeListener<Divider>() {

				@Override
				public void onChanged(javafx.collections.ListChangeListener.Change<? extends Divider> c) {
					while( c.next() ) {
						for( Divider d : c.getAddedSubList() ) {
							d.positionProperty().addListener(listener);
						}
						
						for( Divider d : c.getRemoved() ) {
							d.positionProperty().removeListener(listener);	
						}
					}
				}
			});
			for( Divider d : widget.getDividers() ) {
				d.positionProperty().addListener(listener);
			}
		}
		
		@Override
		protected SplitPane createWidget() {
			SplitPane p = new SplitPane();
			return p;
		}

		@Override
		protected SplitPane getWidgetNode() {
			return getWidget();
		}

		@Override
		public void addItem(WLayoutedWidget<MPartSashContainerElement> widget) {
			SplitPane p = getWidget();
			p.getItems().add((Node) widget.getStaticLayoutNode());
			items.add(widget);
			updateDividers();
		}
		
		@Override
		public void addItems(int index, List<WLayoutedWidget<MPartSashContainerElement>> list) {
			SplitPane p = getWidget();
			List<Node> l = new ArrayList<Node>();
			for( WLayoutedWidget<MPartSashContainerElement> i : list ) {
				l.add((Node) i.getStaticLayoutNode());
			}
			p.getItems().addAll(index, l);
			items.addAll(index, list);
			updateDividers();
		}
		
		@Override
		public void addItems(List<WLayoutedWidget<MPartSashContainerElement>> list) {
			SplitPane p = getWidget();
			List<Node> l = new ArrayList<Node>();
			for( WLayoutedWidget<MPartSashContainerElement> i : list ) {
				l.add((Node) i.getStaticLayoutNode());
			}
			p.getItems().addAll(l);
			items.addAll(list);
			updateDividers();
		}
		
		@Override
		public void removeItem(WLayoutedWidget<MPartSashContainerElement> widget) {
			SplitPane p = getWidget();
			p.getItems().remove(widget.getStaticLayoutNode());
			items.remove(widget);
			updateDividers();
		}
		
		@Override
		protected void doCleanup() {
			super.doCleanup();
			items.clear();
		}
		
		private void updateDividers() {
			if( items.size() <= 1 ) {
				return;
			}
			
			double total = 0;
			
			for( WLayoutedWidget<MPartSashContainerElement> w : items ) {
				total += w.getWeight();
			}
			
			double[] deviders = new double[items.size() - 1];
			for (int i = 0; i < items.size() - 1; i++) {
				deviders[i] = (i == 0 ? 0 : deviders[i - 1]) + (items.get(i).getWeight() / total);
			}
			
			getWidget().setDividerPositions(deviders);
		}
		
		@Override
		public int getItemCount() {
			return getWidget().getItems().size();
		}
	}
}
