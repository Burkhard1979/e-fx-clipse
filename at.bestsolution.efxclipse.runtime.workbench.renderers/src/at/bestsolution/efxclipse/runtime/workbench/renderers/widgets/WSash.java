package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

import java.util.List;

import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

@SuppressWarnings("restriction")
public interface WSash<N> extends WWidget<MPartSashContainer> {

	public void addItem(WLayoutedWidget<MPartSashContainerElement> widget);

	public void setSplits(double... deviders);

	public int getItemCount();

	public void addItems(List<WLayoutedWidget<MPartSashContainerElement>> list);

	public void addItems(int index, List<WLayoutedWidget<MPartSashContainerElement>> list);

	public void removeItem(WLayoutedWidget<MPartSashContainerElement> widget);

}
