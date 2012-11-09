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

import java.util.HashMap;
import java.util.Set;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MArea;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuSeparator;
import org.eclipse.e4.ui.model.application.ui.menu.MPopupMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarSeparator;
import org.eclipse.e4.ui.model.application.ui.menu.MToolControl;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuPackageImpl;
import org.eclipse.e4.ui.workbench.UIEvents.UIElement;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.runtime.workbench.base.rendering.AbstractRenderer;
import at.bestsolution.efxclipse.runtime.workbench.base.rendering.RendererFactory;

@SuppressWarnings("restriction")
public abstract class BaseWorkbenchRendererFactory implements RendererFactory {
	public static final String SHARED_ELEMENTS_MAP = "EFX.RENDERING.SHARED_ELEMENTS_MAP";
	
	private IEclipseContext context;
	
	private BaseWindowRenderer<?> windowRenderer;
	private BaseSashRenderer<?> sashRenderer;
	private BaseMenuBarRenderer<?> menuBarRenderer;
	private BaseTrimBarRenderer<?> trimBarRenderer;
	private BaseToolBarRenderer<?> toolBarRenderer;
	private BaseToolItemRenderer<?> toolItemRenderer;
	private BaseStackRenderer<?, ?, ?> stackRenderer;
	private BasePartRenderer<?> partRenderer;
	private BaseMenuRenderer<?> menuRenderer;
	private BaseMenuItemRenderer<?> menuItemRenderer;
	private BaseMenuSeparatorRenderer<?> menuSeperatorRenderer;
	private BaseMenuRenderer<?> toolItemMenuRenderer;
	private BasePerspectiveStackRenderer<?, ?, ?> perspectiveStackRenderer;
	private BasePerspectiveRenderer<?> perspectiveRenderer;
	private BasePlaceholderRenderer<?> placeholderRenderer;
	private BaseToolControlRenderer<?> toolcontrolRenderer;
	private BaseToolBarSeparatorRenderer<?> toolbarSeparatorRenderer;
	private BaseAreaRenderer<?> areaRenderer;
	private BasePopupMenuRenderer<?> popupMenuRenderer;
	
	@Inject
	public BaseWorkbenchRendererFactory(IEclipseContext context) {
		this.context = context.createChild();
		this.context.set(RendererFactory.class, this);
		this.context.set(SHARED_ELEMENTS_MAP, new HashMap<UIElement, Set<MPlaceholder>>());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <R extends AbstractRenderer<?,?>> R getRenderer(MUIElement modelObject) {
		if( modelObject instanceof MPopupMenu ) {
			if( popupMenuRenderer == null ) {
				popupMenuRenderer = ContextInjectionFactory.make(getPopupMenuRendererClass(), context);
			}
			return (R) popupMenuRenderer;
		} else if( areaRenderer instanceof MArea ) {
			if( areaRenderer == null ) {
				areaRenderer = ContextInjectionFactory.make(getAreaRendererClass(), context);
			}
			return (R) areaRenderer;
		} else if( modelObject instanceof MWindow ) {
			if( windowRenderer == null ) {
				windowRenderer = ContextInjectionFactory.make(getWindowRendererClass(), context);
			}
			return (R) windowRenderer;
		} else if( modelObject instanceof MPerspectiveStack ) {
			if( perspectiveStackRenderer == null ) {
				perspectiveStackRenderer = ContextInjectionFactory.make(getPerspectiveStackRendererClass(), context);
			}
			return (R) perspectiveStackRenderer;
		} else if( modelObject instanceof MPerspective ) {
			if( perspectiveRenderer == null ) {
				perspectiveRenderer = ContextInjectionFactory.make(getPerspectiveRendererClass(), context);
			}
			return (R) perspectiveRenderer;
		} else if( modelObject instanceof MPartSashContainer ) {
			if( sashRenderer == null ) {
				sashRenderer = ContextInjectionFactory.make(getSashRendererClass(), context);
			}
			return (R) sashRenderer;
		} else if( modelObject instanceof MMenu ) {
			if( BasicPackageImpl.Literals.WINDOW__MAIN_MENU.equals(((EObject)modelObject).eContainmentFeature()) ) {
				if( menuBarRenderer == null ) {
					menuBarRenderer = ContextInjectionFactory.make(getMenuBarRendererClass(), context);
				}
				return (R) menuBarRenderer;
			} else if( MenuPackageImpl.Literals.TOOL_ITEM__MENU.equals(((EObject)modelObject).eContainmentFeature()) ) {
				if( toolItemMenuRenderer == null ) {
					toolItemMenuRenderer = ContextInjectionFactory.make(getToolItemMenuRendererClass(), context);
				}
				return (R) toolItemMenuRenderer;
			} else {
				if( menuRenderer == null ) {
					menuRenderer = ContextInjectionFactory.make(getMenuRendererClass(), context);
				}
				return (R) menuRenderer;
			}
		} else if( modelObject instanceof MTrimBar ) {
			if( trimBarRenderer == null ) {
				trimBarRenderer = ContextInjectionFactory.make(getTrimBarRendererClass(), context);
			}
			return (R) trimBarRenderer;
		} else if( modelObject instanceof MToolBar ) {
			if( toolBarRenderer == null ) {
				toolBarRenderer = ContextInjectionFactory.make(getToolBarRendererClass(), context);
			}
			return (R) toolBarRenderer;
		} else if( modelObject instanceof MToolItem ) {
			if( toolItemRenderer == null ) {
				toolItemRenderer = ContextInjectionFactory.make(getToolItemRendererClass(), context);
			}
			return (R) toolItemRenderer;
		} else if( modelObject instanceof MPartStack ) {
			if( stackRenderer == null ) {
				stackRenderer = ContextInjectionFactory.make(getStackRendererClass(), context);
			}
			return (R) stackRenderer;
		} else if( modelObject instanceof MPart ) {
			if( partRenderer == null ) {
				partRenderer = ContextInjectionFactory.make(getPartRendererClass(), context);
			}
			return (R) partRenderer;
		} else if( modelObject instanceof MMenuItem ) {
			if( menuItemRenderer == null ) {
				menuItemRenderer = ContextInjectionFactory.make(getMenuItemRendererClass(), context);
			}
			return (R) menuItemRenderer;
		} else if( modelObject instanceof MMenuSeparator ) {
			if( menuSeperatorRenderer == null ) {
				menuSeperatorRenderer = ContextInjectionFactory.make(getMenuSeparatorRendererClass(), context);
			}
			return (R) menuSeperatorRenderer;
		} else if( modelObject instanceof MPlaceholder ) {
			if( placeholderRenderer == null ) {
				placeholderRenderer = ContextInjectionFactory.make(getPlaceholderRendererClass(), context);
			}
			return (R) placeholderRenderer;
		} else if( modelObject instanceof MToolControl ) {
			if(toolcontrolRenderer == null) {
				toolcontrolRenderer = ContextInjectionFactory.make(getToolcontrolRendererClass(), context);
			}
			return (R) toolcontrolRenderer;
		} else if(modelObject instanceof MToolBarSeparator) {
			if(toolbarSeparatorRenderer == null) {
				toolbarSeparatorRenderer = ContextInjectionFactory.make(getToolBarSeparatorRendererClass(), context);
			}
			return (R) toolbarSeparatorRenderer;
		}
		
		return null;
	}

	
	protected abstract Class<? extends BaseWindowRenderer<?>> getWindowRendererClass();
	protected abstract Class<? extends BaseSashRenderer<?>> getSashRendererClass();
	protected abstract Class<? extends BaseMenuBarRenderer<?>> getMenuBarRendererClass();
	protected abstract Class<? extends BaseTrimBarRenderer<?>> getTrimBarRendererClass();
	protected abstract Class<? extends BaseToolBarRenderer<?>> getToolBarRendererClass();
	protected abstract Class<? extends BaseToolItemRenderer<?>> getToolItemRendererClass();
	protected abstract Class<? extends BaseStackRenderer<?,?,?>> getStackRendererClass();
	protected abstract Class<? extends BasePartRenderer<?>> getPartRendererClass();
	protected abstract Class<? extends BaseMenuRenderer<?>> getMenuRendererClass();
	protected abstract Class<? extends BaseMenuItemRenderer<?>> getMenuItemRendererClass();
	protected abstract Class<? extends BaseMenuSeparatorRenderer<?>> getMenuSeparatorRendererClass();
	protected abstract Class<? extends BaseMenuRenderer<?>> getToolItemMenuRendererClass();
	protected abstract Class<? extends BasePerspectiveStackRenderer<?, ?, ?>> getPerspectiveStackRendererClass();
	protected abstract Class<? extends BasePerspectiveRenderer<?>> getPerspectiveRendererClass();
	protected abstract Class<? extends BasePlaceholderRenderer<?>> getPlaceholderRendererClass();
	protected abstract Class<? extends BaseToolControlRenderer<?>> getToolcontrolRendererClass();
	protected abstract Class<? extends BaseToolBarSeparatorRenderer<?>> getToolBarSeparatorRendererClass();
	protected abstract Class<? extends BaseAreaRenderer<?>> getAreaRendererClass();
	protected abstract Class<? extends BasePopupMenuRenderer<?>> getPopupMenuRendererClass();

}
