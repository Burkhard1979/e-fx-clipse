package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;

import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

@SuppressWarnings("restriction")
public interface WMenuBar<N> extends WMenuElement<MMenu>, WLayoutedWidget<MMenu> {

	void addElement(WMenu<MMenuElement> widget);

}
