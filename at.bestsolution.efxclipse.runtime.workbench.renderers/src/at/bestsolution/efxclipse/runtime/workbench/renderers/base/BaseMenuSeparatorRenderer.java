package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuSeparator;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuSeparator;

@SuppressWarnings("restriction")
public abstract class BaseMenuSeparatorRenderer<N> extends BaseRenderer<MMenuSeparator, WMenuSeparator<N>> {


	@Override
	public void doProcessContent(MMenuSeparator element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childRendered(MMenuSeparator parentElement, MUIElement element) {
		
	}

	@Override
	public void hideChild(MMenuSeparator container, MUIElement changedObj) {
		
	}
}
