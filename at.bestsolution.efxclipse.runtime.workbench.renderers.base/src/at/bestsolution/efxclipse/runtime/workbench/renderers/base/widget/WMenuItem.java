package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;

import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;

@SuppressWarnings("restriction")
public interface WMenuItem<N> extends WMenuElement<MMenuItem> {

	void setOnActionCallback(Runnable runnable);

	void setHandled(boolean handled);

}
