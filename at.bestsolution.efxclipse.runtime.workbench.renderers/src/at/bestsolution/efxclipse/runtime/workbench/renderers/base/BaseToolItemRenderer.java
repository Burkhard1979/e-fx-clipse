package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WToolItem;

@SuppressWarnings("restriction")
public abstract class BaseToolItemRenderer<N> extends BaseRenderer<MToolItem, WToolItem<N>> {

	@Override
	public void doProcessContent(MToolItem element) {
		if( element.getMenu() != null ) {
			engineCreateWidget(element.getMenu());
		}
	}

	@Override
	public void childRendered(MToolItem parentElement, MUIElement element) {
		
	}
	
	@Override
	public void hideChild(MToolItem container, MUIElement changedObj) {
		
	}

}
