package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuElement;

@SuppressWarnings("restriction")
public abstract class BaseToolItemMenuRenderer<N> extends BaseRenderer<MMenu, WMenu<N>> {

	@Override
	protected void doProcessContent(MMenu element) {
		WMenu<N> menu = getWidget(element);
		for( MMenuElement e : element.getChildren() ) {
			WMenuElement<MMenuElement> o = engineCreateWidget(e);
			if( o != null ) {
				menu.addElement(o);
			}
		}
	}

	@Override
	public void childRendered(MMenu parentElement, MUIElement element) {
		
	}

	@Override
	public void hideChild(MMenu container, MUIElement changedObj) {
		
	}

	@Override
	public IEclipseContext getModelContext(MMenu part) {
		return null;
	}

}