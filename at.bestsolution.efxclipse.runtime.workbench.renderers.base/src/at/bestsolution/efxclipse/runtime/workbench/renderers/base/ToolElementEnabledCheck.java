package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

@SuppressWarnings("restriction")
public interface ToolElementEnabledCheck<M extends MToolBarElement> {
	public void checkEnablement(M toolbarElement);
}
