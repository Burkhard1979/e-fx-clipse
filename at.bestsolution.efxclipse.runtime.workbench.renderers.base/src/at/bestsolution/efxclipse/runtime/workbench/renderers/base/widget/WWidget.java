package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;

import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

@SuppressWarnings("restriction")
public interface WWidget<M extends MUIElement> {
	public void setPropertyChangeHandler(WPropertyChangeHandler<? extends WWidget<M>> handler);
	public void setDomElement(M domElement);
	public M getDomElement();
	public void addStyleClasses(List<String> classnames);
	public void addStyleClasses(String... classnames);
	public void setStyleId(String id);
	public Object getWidget();
	public void deactivate();
	public void activate();
	public boolean isActive();
	public void registerActivationCallback(WCallback<Boolean, Void> callback);
}
