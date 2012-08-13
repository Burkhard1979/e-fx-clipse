package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuBar;

@SuppressWarnings("restriction")
public abstract class BaseMenuBarRenderer<N> extends BaseRenderer<MMenu, WMenuBar<N>> {

	@SuppressWarnings("unchecked")
	@Override
	public void doProcessContent(MMenu element) {
		WMenuBar<N> menuBar = getWidget(element);
		for( MMenuElement e : element.getChildren() ) {
			Object widget = engineCreateWidget(e);
			if( widget instanceof WMenu ) {
				menuBar.addElement((WMenu<MMenuElement>)widget);
			}
		}
	}

	@Override
	public void childRendered(MMenu parentElement, MUIElement element) {
		
	}
	
	@Override
	public void hideChild(MMenu container, MUIElement changedObj) {
		
	}
}
