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
package at.bestsolution.efxclipse.runtime.workbench.renderers.fx;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseAreaRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuItemRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuSeparatorRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePartRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePerspectiveRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePerspectiveStackRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePlaceholderRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePopupMenuRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseSashRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseStackRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolBarSeparatorRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolControlRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolItemRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseTrimBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseWindowRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseWorkbenchRendererFactory;

@SuppressWarnings("restriction")
public class DefWorkbenchRendererFactory extends BaseWorkbenchRendererFactory {

	@Inject
	public DefWorkbenchRendererFactory(IEclipseContext context) {
		super(context);
	}

	@Override
	protected Class<? extends BaseWindowRenderer<?>> getWindowRendererClass() {
		return DefWindowRenderer.class;
	}

	@Override
	protected Class<? extends BaseSashRenderer<?>> getSashRendererClass() {
		return DefSashRenderer.class;
	}

	@Override
	protected Class<? extends BaseMenuBarRenderer<?>> getMenuBarRendererClass() {
		return DefMenuBarRenderer.class;
	}

	@Override
	protected Class<? extends BaseTrimBarRenderer<?>> getTrimBarRendererClass() {
		return DefTrimBarRenderer.class;
	}

	@Override
	protected Class<? extends BaseToolBarRenderer<?>> getToolBarRendererClass() {
		return DefToolBarRenderer.class;
	}

	@Override
	protected Class<? extends BaseToolItemRenderer<?>> getToolItemRendererClass() {
		return DefToolItemRenderer.class;
	}

	@Override
	protected Class<? extends BaseStackRenderer<?, ?, ?>> getStackRendererClass() {
		return DefStackRenderer.class;
	}

	@Override
	protected Class<? extends BasePartRenderer<?>> getPartRendererClass() {
		return DefPartRenderer.class;
	}

	@Override
	protected Class<? extends BaseMenuRenderer<?>> getMenuRendererClass() {
		return DefMenuRenderer.class;
	}

	@Override
	protected Class<? extends BaseMenuItemRenderer<?>> getMenuItemRendererClass() {
		return DefMenuItemRenderer.class;
	}

	@Override
	protected Class<? extends BaseMenuSeparatorRenderer<?>> getMenuSeparatorRendererClass() {
		return DefMenuSeparatorRenderer.class;
	}

	@Override
	protected Class<? extends BaseMenuRenderer<?>> getToolItemMenuRendererClass() {
		return DefToolItemMenuRenderer.class;
	}

	@Override
	protected Class<? extends BasePerspectiveStackRenderer<?, ?, ?>> getPerspectiveStackRendererClass() {
		return DefPerspectiveStackRenderer.class;
	}

	@Override
	protected Class<? extends BasePerspectiveRenderer<?>> getPerspectiveRendererClass() {
		return DefPerspectiveRenderer.class;
	}

	@Override
	protected Class<? extends BasePlaceholderRenderer<?>> getPlaceholderRendererClass() {
		return DefPlaceholderRenderer.class;
	}

	@Override
	protected Class<? extends BaseToolControlRenderer<?>> getToolcontrolRendererClass() {
		return DefToolControlRenderer.class;
	}

	@Override
	protected Class<? extends BaseToolBarSeparatorRenderer<?>> getToolBarSeparatorRendererClass() {
		return DefToolBarSeparatorRenderer.class;
	}

	@Override
	protected Class<? extends BaseAreaRenderer<?>> getAreaRendererClass() {
		return DefAreaRenderer.class;
	}
	
	@Override
	protected Class<? extends BasePopupMenuRenderer<?>> getPopupMenuRendererClass() {
		return DefPopupMenuRenderer.class;
	}
}