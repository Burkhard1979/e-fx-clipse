package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;

import org.eclipse.e4.ui.model.application.ui.MUIElement;


@SuppressWarnings("restriction")
public interface WLayoutedWidget<M extends MUIElement> extends WWidget<M> {
	public Object getStaticLayoutNode();
	public double getWeight();
}
