package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WTrimBar;

@SuppressWarnings("restriction")
public abstract class BaseTrimBarRenderer<N> extends BaseRenderer<MTrimBar, WTrimBar<N>> {

	@Override
	public void doProcessContent(MTrimBar element) {
		WTrimBar<N> trimBar = getWidget(element);
		for( MTrimElement e : element.getChildren() ) {
			WLayoutedWidget<MTrimElement> trimElementWidget = engineCreateWidget(e);
			if( trimElementWidget != null ) {
				trimBar.addChild(trimElementWidget);
			}
		}
	}

	@Override
	public void childRendered(MTrimBar parentElement, MUIElement element) {
	}
	
	@Override
	public void hideChild(MTrimBar container, MUIElement changedObj) {
	}
}
