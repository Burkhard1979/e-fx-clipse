package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;

import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

@SuppressWarnings("restriction")
public interface WPerspective<N> extends WLayoutedWidget<MPerspective> {

	void addItems(List<WLayoutedWidget<MPartSashContainerElement>> list);

	void addItem(int renderedIndex, WLayoutedWidget<MPartSashContainerElement> widget);

	void removeItem(WLayoutedWidget<MUIElement> widget);

}
