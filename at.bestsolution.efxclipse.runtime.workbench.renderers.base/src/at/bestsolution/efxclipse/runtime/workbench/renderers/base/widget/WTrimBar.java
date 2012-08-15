package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimElement;

@SuppressWarnings("restriction")
public interface WTrimBar<N> extends WWidget<MTrimBar> {

	void addChild(WLayoutedWidget<MTrimElement> trimElementWidget);

}
