package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuSeparator;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuPackageImpl;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.runtime.workbench.rendering.AbstractRenderer;
import at.bestsolution.efxclipse.runtime.workbench.rendering.RendererFactory;


@SuppressWarnings("restriction")
public abstract class BaseWorkbenchRendererFactory implements RendererFactory {
	private IEclipseContext context;
	
	private BaseWindowRenderer<?> windowRenderer;
	private BaseSashRenderer<?> sashRenderer;
	private BaseMenuBarRenderer<?> menuBarRenderer;
	private BaseTrimBarRenderer<?> trimBarRenderer;
	private BaseToolBarRenderer<?> toolBarRenderer;
	private BaseToolItemRenderer<?> toolItemRenderer;
	private BaseStackRenderer<?, ?> stackRenderer;
	private BasePartRenderer<?> partRenderer;
	private BaseMenuRenderer<?> menuRenderer;
	private BaseMenuItemRenderer<?> menuItemRenderer;
	private BaseMenuSeparatorRenderer<?> menuSeperatorRenderer;
	private BaseToolItemMenuRenderer<?> toolItemMenuRenderer;
	
	@Inject
	public BaseWorkbenchRendererFactory(IEclipseContext context) {
		this.context = context.createChild();
		this.context.set(RendererFactory.class, this);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <R extends AbstractRenderer<?,?>> R getRenderer(MUIElement modelObject) {
		if( modelObject instanceof MWindow ) {
			if( windowRenderer == null ) {
				windowRenderer = ContextInjectionFactory.make(getWindowRendererClass(), context);
			}
			return (R) windowRenderer;
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
		}  else if( modelObject instanceof MMenuSeparator ) {
			if( menuSeperatorRenderer == null ) {
				menuSeperatorRenderer = ContextInjectionFactory.make(getMenuSeparatorRendererClass(), context);
			}
			return (R) menuSeperatorRenderer;
		}
		
		return null;
	}

	protected abstract Class<? extends BaseWindowRenderer<?>> getWindowRendererClass();
	protected abstract Class<? extends BaseSashRenderer<?>> getSashRendererClass();
	protected abstract Class<? extends BaseMenuBarRenderer<?>> getMenuBarRendererClass();
	protected abstract Class<? extends BaseTrimBarRenderer<?>> getTrimBarRendererClass();
	protected abstract Class<? extends BaseToolBarRenderer<?>> getToolBarRendererClass();
	protected abstract Class<? extends BaseToolItemRenderer<?>> getToolItemRendererClass();
	protected abstract Class<? extends BaseStackRenderer<?,?>> getStackRendererClass();
	protected abstract Class<? extends BasePartRenderer<?>> getPartRendererClass();
	protected abstract Class<? extends BaseMenuRenderer<?>> getMenuRendererClass();
	protected abstract Class<? extends BaseMenuItemRenderer<?>> getMenuItemRendererClass();
	protected abstract Class<? extends BaseMenuSeparatorRenderer<?>> getMenuSeparatorRendererClass();
	protected abstract Class<? extends BaseToolItemMenuRenderer<?>> getToolItemMenuRendererClass();
}
