package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WPropertyChangeHandler;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WPropertyChangeHandler.WPropertyChangeEvent;

@SuppressWarnings("restriction")
public abstract class WWidgetImpl<N,M extends MUIElement> implements WWidget<M> {
	private N nativeWidget;
	private M domElement;
	private List<Callback<Boolean, Void>> activationCallbacks = new ArrayList<Callback<Boolean,Void>>();
	private boolean active;
	
	private WPropertyChangeHandler<? extends WWidget<M>> propertyChangeHandler;
	
	protected abstract N createWidget();
	
	public WWidgetImpl() {
		
	}
	
	@Override
	public void activate() {
		this.active = true;
		for( Callback<Boolean, Void> c : activationCallbacks ) {
			c.call(Boolean.TRUE);
		}
	}
	
	@Override
	public void deactivate() {
		this.active = false;
		for( Callback<Boolean, Void> c : activationCallbacks ) {
			c.call(Boolean.FALSE);
		}
	}
	
	@Override
	public boolean isActive() {
		return active;
	}
	
	public void registerActivationCallback(Callback<Boolean, Void> callback) {
		activationCallbacks.add(callback);
	}
	
	@PostConstruct
	void init() {
		getWidget(); // ensure that the widget is created
	}
	
	@PreDestroy
	void destroy() {
		if( nativeWidget != null ) {
			setUserData(null);
		}
		propertyChangeHandler = null;
		domElement = null;
		activationCallbacks.clear();
		activationCallbacks = null;
	}
	
	@Override
	public final void setDomElement(M domElement) {
		this.domElement = domElement;
	}
	
	@Override
	public M getDomElement() {
		return domElement;
	}
	
	
	public N getWidget() {
		if( nativeWidget == null ) {
			nativeWidget = createWidget();
			bindProperties(nativeWidget);
			setUserData(this);
		}
		return nativeWidget;
	}
	
	protected void bindProperties(N widget) {
		
	}
	
	protected void bindProperty(final String propertyName, ObservableValue<? extends Object> value) {
		value.addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
				fireChange(propertyName, newValue);
			}
		});
	}
	
	protected abstract void setUserData(WWidgetImpl<N,M> widget);
	
	public void setPropertyChangeHandler(WPropertyChangeHandler<? extends WWidget<M>> propertyChangeHandler) {
		this.propertyChangeHandler = propertyChangeHandler;
	}
	
	protected void fireChange(String propertyName, Object newValue) {
		if( propertyChangeHandler != null ) {
			WPropertyChangeEvent<WWidget<M>> e = new WPropertyChangeEvent<WWidget<M>>(this, propertyName, newValue);
			propertyChangeHandler.propertyObjectChanged(e);
		}
	}
}
