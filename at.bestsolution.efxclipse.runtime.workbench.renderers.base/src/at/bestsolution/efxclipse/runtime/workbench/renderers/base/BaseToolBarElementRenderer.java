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

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WToolBarElement;

@SuppressWarnings("restriction")
public abstract class BaseToolBarElementRenderer<N> extends BaseRenderer<MToolBarElement, WToolBarElement<N>> {
	@Override
	protected void doProcessContent(MToolBarElement element) {
		// no child
	}

	@Override
	public void childRendered(MToolBarElement parentElement, MUIElement element) {
		// no child		
	}

	@Override
	public void hideChild(MToolBarElement container, MUIElement changedObj) {
		// no child		
	}
}