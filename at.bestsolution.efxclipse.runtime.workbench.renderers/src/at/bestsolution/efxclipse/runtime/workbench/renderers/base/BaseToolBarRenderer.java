package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WToolBar;

@SuppressWarnings("restriction")
public abstract class BaseToolBarRenderer<N> extends BaseRenderer<MToolBar, WToolBar<N>> {
	@Override
	public void doProcessContent(MToolBar element) {
		WToolBar<N> toolbar = getWidget(element);
		for( MToolBarElement item : element.getChildren() ) {
			WLayoutedWidget<MToolBarElement> itemWidget = engineCreateWidget(item);
			if( itemWidget != null ) {
				toolbar.addChild(itemWidget);
			}
		}
	}

	@Override
	public void childRendered(MToolBar parentElement, MUIElement element) {
		
	}

	@Override
	public void hideChild(MToolBar container, MUIElement changedObj) {
		
	}
}
