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

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPlaceholderWidget;


@SuppressWarnings("restriction")
public abstract class BasePlaceholderRenderer<N> extends BaseRenderer<MPlaceholder, WPlaceholderWidget> {
	
	@Inject
	@Named(BaseWorkbenchRendererFactory.SHARED_ELEMENTS_MAP)
	private Map<MUIElement, Set<MPlaceholder>> renderedMap;
	
	private Set<MPlaceholder> getRenderedPlaceholders(MUIElement element) {
		Set<MPlaceholder> set = renderedMap.get(element);
		if( set == null ) {
			set = new HashSet<MPlaceholder>();
			renderedMap.put(element, set);
		}
		
		return set;
	}
	
	@Override
	protected void initWidget(MPlaceholder element, WPlaceholderWidget widget) {
		super.initWidget(element, widget);
		
		MUIElement ref = element.getRef();
		ref.setCurSharedRef(element);
		
		Set<MPlaceholder> set = getRenderedPlaceholders(element);
		if( ! set.contains(element) ) {
			set.add(element);
		}
		
		@SuppressWarnings("unchecked")
		WLayoutedWidget<MUIElement> refWidget = (WLayoutedWidget<MUIElement>) ref.getWidget();
		if( refWidget == null ) {
			ref.setToBeRendered(true);
			refWidget = engineCreateWidget(ref,getContextForParent(ref));
		}
		
		widget.setContent(refWidget);
		
		if( ref instanceof MContext ) {
			IEclipseContext context = ((MContext) ref).getContext();
			IEclipseContext newParentContext = getModelContext(element);
			if (context.getParent() != newParentContext) {
				context.setParent(newParentContext);
			}
		}
	}
	
	@Override
	public void destroyWidget(MPlaceholder element) {
		MUIElement refElement = element.getRef();
		
		super.destroyWidget(element);
	}
}
