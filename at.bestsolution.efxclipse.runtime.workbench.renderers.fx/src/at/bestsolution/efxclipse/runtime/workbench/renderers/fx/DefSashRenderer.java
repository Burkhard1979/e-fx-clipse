package at.bestsolution.efxclipse.runtime.workbench.renderers.fx;

import java.util.ArrayList;
import java.util.List;

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
		private ChangeListener<Number> listener = new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.err.println("Modified: " + newValue);
			}
		};
		
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
		}
		
		@Override
		public void addItems(int index, List<WLayoutedWidget<MPartSashContainerElement>> list) {
			SplitPane p = getWidget();
			List<Node> l = new ArrayList<Node>();
			for( WLayoutedWidget<MPartSashContainerElement> i : list ) {
				l.add((Node) i.getStaticLayoutNode());
			}
			p.getItems().addAll(index, l);
		}
		
		@Override
		public void addItems(List<WLayoutedWidget<MPartSashContainerElement>> list) {
			SplitPane p = getWidget();
			List<Node> l = new ArrayList<Node>();
			for( WLayoutedWidget<MPartSashContainerElement> i : list ) {
				l.add((Node) i.getStaticLayoutNode());
			}
			p.getItems().addAll(l);
		}
		
		@Override
		public void removeItem(WLayoutedWidget<MPartSashContainerElement> widget) {
			SplitPane p = getWidget();
			p.getItems().remove(widget.getStaticLayoutNode());
		}
		
		@Override
		public int getItemCount() {
			return getWidget().getItems().size();
		}
		
		

		@Override
		public void setSplits(double... splits) {
			getWidget().setDividerPositions(splits);
		}
	}
}
