package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

@SuppressWarnings("restriction")
public interface WMenu<N> extends WMenuElement<MMenu> {

	void addElement(WMenuElement<MMenuElement> widget);

}
