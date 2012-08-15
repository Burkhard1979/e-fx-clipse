package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;

import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

@SuppressWarnings("restriction")
public interface WToolBar<N> extends WWidget<MToolBar> {

	void addChild(WLayoutedWidget<MToolBarElement> itemWidget);

}
