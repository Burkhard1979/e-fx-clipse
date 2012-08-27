package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WMenuElement;


@SuppressWarnings("restriction")
public abstract class BaseMenuRenderer<N> extends BaseRenderer<MMenu, WMenu<N>> {

	@Override
	protected void initWidget(final MMenu element, WMenu<N> widget) {
		super.initWidget(element, widget);
		widget.setShowingCallback(new Runnable() {

			@Override
			public void run() {
				handleShowing(element);
			}
		});
	}
	
	void handleShowing(MMenu element) {
		for( MMenuElement e : element.getChildren() ) {
			if( e.getRenderer() instanceof BaseItemRenderer) {
				@SuppressWarnings("unchecked")
				BaseItemRenderer<MMenuElement, ?> r = (BaseItemRenderer<MMenuElement, ?>) e.getRenderer();
				r.checkEnablement(e);
			}
		}
	}
	
	@Override
	public void doProcessContent(MMenu element) {
		// TODO Should we do this creation lazy????
		WMenu<N> menu = getWidget(element);
		for( MMenuElement e : element.getChildren() ) {
			WMenuElement<MMenuElement> widget = engineCreateWidget(e);
			if( widget != null ) {
				menu.addElement(widget);
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
