package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

import java.util.List;

import javafx.util.Callback;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

@SuppressWarnings("restriction")
public interface WWidget<M extends MUIElement> {
	public void setDomElement(M domElement);
	public M getDomElement();
	public void addStyleClasses(List<String> classnames);
	public void addStyleClasses(String... classnames);
	public void setStyleId(String id);
	public Object getWidget();
	public void deactivate();
	public void activate();
	public boolean isActive();
	public void registerActivationCallback(Callback<Boolean, Void> callback);
}
