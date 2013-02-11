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

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuPackageImpl;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WMenuItem;

@SuppressWarnings("restriction")
public abstract class BaseMenuItemRenderer<N> extends BaseItemRenderer<MMenuItem, WMenuItem<N>> {
	@Inject
	UISynchronize sync;
	
	@Override
	protected void initWidget(final MMenuItem element, WMenuItem<N> widget) {
		super.initWidget(element, widget);
		
		final IEclipseContext modelContext = getModelContext(element);
		widget.setOnActionCallback(new Runnable() {
			
			@Override
			public void run() {
				executeAction(element,modelContext.getActiveLeaf()); 
			}
		});
	}
	
	@Override
	protected void initRenderingContext(MMenuItem element, IEclipseContext context) {
		super.initRenderingContext(element, context);
		context.set(MenuPackageImpl.Literals.ITEM__TYPE.getName(), element.getType());
	}
		
	@Override
	public void doProcessContent(MMenuItem element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childRendered(MMenuItem parentElement, MUIElement element) {
		
	}

	@Override
	public void hideChild(MMenuItem container, MUIElement changedObj) {
		
	}
	
	@Override
	public void checkEnablement(final MMenuItem menuElement) {
		@SuppressWarnings("unchecked")
		final WMenuItem<N> widget = (WMenuItem<N>) menuElement.getWidget();

		// can we call canExecute in the none ui thread????
		sync.asyncExec(new Runnable() {
			
			@Override
			public void run() {
				try {
					widget.setHandled(canExecute(menuElement, getModelContext(menuElement))); 	
				} catch(Throwable t) {
					//TODO Log it
					t.printStackTrace();
				}
				
			}
		});
	}
}
