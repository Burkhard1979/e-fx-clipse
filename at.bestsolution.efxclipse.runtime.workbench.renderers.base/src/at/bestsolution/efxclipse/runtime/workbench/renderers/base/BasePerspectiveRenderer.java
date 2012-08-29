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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPerspective;

@SuppressWarnings("restriction")
public abstract class BasePerspectiveRenderer<N> extends BaseRenderer<MPerspective, WPerspective<N>> {
	
	@Override
	protected void doProcessContent(MPerspective element) {
		element.getChildren();
		List<WLayoutedWidget<MPartSashContainerElement>> list = new ArrayList<WLayoutedWidget<MPartSashContainerElement>>();
		for( MPartSashContainerElement e : element.getChildren() ) {
			WLayoutedWidget<MPartSashContainerElement> w = engineCreateWidget(e);
			if( w != null ) {
				list.add(w);
			}
		}
		getWidget(element).addItems(list);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void childRendered(MPerspective parentElement, MUIElement element) {
		if( inContentProcessing ) {
			return;
		}
		
		getWidget(parentElement).addItem(getRenderedIndex(parentElement, element),(WLayoutedWidget<MPartSashContainerElement>)element.getWidget());
	}

	@Override
	public void hideChild(MPerspective container, MUIElement changedObj) {
		WPerspective<N> perspective = getWidget(container);
		
		if( perspective == null ) {
			return;
		}
		
		@SuppressWarnings("unchecked")
		WLayoutedWidget<MUIElement> widget = (WLayoutedWidget<MUIElement>) changedObj.getWidget();
		if( widget != null ) {
			perspective.removeItem(widget);
		}
	}
}