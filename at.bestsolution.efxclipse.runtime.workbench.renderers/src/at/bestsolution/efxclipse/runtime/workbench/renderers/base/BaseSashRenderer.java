package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WSash;

@SuppressWarnings("restriction")
public abstract class BaseSashRenderer<N> extends BaseRenderer<MPartSashContainer, WSash<N>> {

	@Override
	public void doProcessContent(MPartSashContainer element) {
		WSash<N> sash = getWidget(element);
		
		List<Double> layoutData = new ArrayList<Double>();
		double total = 0;
		
		for( MPartSashContainerElement e : element.getChildren() ) {
			WLayoutedWidget<MPartSashContainerElement> widget = engineCreateWidget(e);
			if( widget != null ) {
				sash.addItem(widget);
				double v;
				if( e.getContainerData() != null ) {
					v = Double.parseDouble(e.getContainerData());
					if( v > 0.9 ) {
						// Calc back to a potential percentage
						v = v / Math.pow(10, e.getContainerData().length());
					}
				} else {
					v = 0.1;
				}
				layoutData.add(v);
				total += v;
			}
		}
		
		if( ! layoutData.isEmpty() && layoutData.size() > 1 ) {
			double[] deviders = new double[layoutData.size()-1];
			for( int i = 0; i < layoutData.size() - 1; i++ ) {
				deviders[i] = layoutData.get(i) / total;
			}
			
			sash.setSplits(deviders);			
		}
	}

	@Override
	public void childRendered(MPartSashContainer parentElement, MUIElement element) {
		if( isInContentProcessing() ) {
			return;
		}
		
		List<Double> layoutData = new ArrayList<Double>();
		double total = 0;
		
		for( MPartSashContainerElement e : parentElement.getChildren() ) {
			double v;
			if( e.isToBeRendered() ) {
				if( e.getContainerData() != null ) {
					v = Double.parseDouble(e.getContainerData());
					if( v > 0.9 ) {
						// Calc back to a potential percentage
						v = v / Math.pow(10, e.getContainerData().length());
					}
				} else {
					v = 0.1;
				}
				layoutData.add(v);
				total += v;
			}
		}
		
		int idx = getRenderedIndex(parentElement, element);
		WSash<N> sash = getWidget(parentElement);
		
		@SuppressWarnings("unchecked")
		List<WLayoutedWidget<MPartSashContainerElement>> l = Collections.singletonList((WLayoutedWidget<MPartSashContainerElement>)element.getWidget());
		sash.addItems(idx,l);
		
		if( ! layoutData.isEmpty() && layoutData.size() > 1 ) {
			double[] deviders = new double[layoutData.size()-1];
			for( int i = 0; i < layoutData.size() - 1; i++ ) {
				deviders[i] = layoutData.get(i) / total;
			}
			
			sash.setSplits(deviders);			
		}
	}

	@Override
	public void hideChild(MPartSashContainer container, MUIElement changedObj) {
		WSash<N> sash = getWidget(container);
		
		if( sash == null ) {
			return;
		}
		
		@SuppressWarnings("unchecked")
		WLayoutedWidget<MPartSashContainerElement> widget = (WLayoutedWidget<MPartSashContainerElement>) changedObj.getWidget();
		if( widget != null ) {
			sash.removeItem(widget);
		}
	}
}
