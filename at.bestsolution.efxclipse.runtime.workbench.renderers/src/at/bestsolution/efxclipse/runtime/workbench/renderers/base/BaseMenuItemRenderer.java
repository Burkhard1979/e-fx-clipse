package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import javafx.scene.control.MenuItem;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuPackageImpl;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuItem;

@SuppressWarnings("restriction")
public abstract class BaseMenuItemRenderer<N> extends BaseRenderer<MMenuItem, WMenuItem<MenuItem>> {

	@Override
	protected void initRenderingContext(MMenuItem element, IEclipseContext context) {
		super.initRenderingContext(element, context);
		context.set(MenuPackageImpl.Literals.ITEM__TYPE.getName(), element.getType());
	}
		
	@Override
	public void doProcessContent(MMenuItem element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childRendered(MMenuItem parentElement, MUIElement element) {
		
	}

	@Override
	public void hideChild(MMenuItem container, MUIElement changedObj) {
		
	}
}
