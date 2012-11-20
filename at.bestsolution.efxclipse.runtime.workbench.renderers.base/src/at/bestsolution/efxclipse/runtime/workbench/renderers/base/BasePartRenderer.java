/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.UIEvents;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WCallback;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPart;


@SuppressWarnings("restriction")
public abstract class BasePartRenderer<N> extends BaseRenderer<MPart, WPart<N>> {
	
	@PostConstruct
	void init(IEventBroker broker) {
		registerEventListener(broker, UIEvents.UILabel.ICONURI);
		registerEventListener(broker, UIEvents.UILabel.LABEL);
		registerEventListener(broker, UIEvents.UILabel.TOOLTIP);
	}
	
	@Override
	protected void initWidget(final MPart element, final WPart<N> widget) {
		super.initWidget(element, widget);		
		
		widget.registerActivationCallback(new WCallback<Boolean, Void>() {
			
			@Override
			public Void call(Boolean param) {
				if( param.booleanValue() ) {
						//FIXME When the activation was done through keyboard navigation this seems to fail
						activate(element, true);
				}
				return null;
			}
		});
	}
	
//	protected abstract boolean requiresFocus(WPart<N> widget);
	
	@Override
	public void doProcessContent(MPart element) {
		WPart<N> widget = getWidget(element);
		
		element.getContext().set(widget.getWidget().getClass().getName(), widget.getWidget());
		IContributionFactory contributionFactory = (IContributionFactory) element.getContext().get(IContributionFactory.class
				.getName());
		Object newPart = contributionFactory.create(element.getContributionURI(), element.getContext());
		element.setObject(newPart);
	}

	@Override
	public void childRendered(MPart parentElement, MUIElement element) {
		
	}
	
	@Override
	public void hideChild(MPart container, MUIElement changedObj) {
		
	}

}
