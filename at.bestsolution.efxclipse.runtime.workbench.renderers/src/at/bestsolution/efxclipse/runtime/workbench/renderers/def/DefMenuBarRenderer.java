package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuBar;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefMenuBarRenderer extends BaseMenuBarRenderer<MenuBar> {

	@Override
	protected Class<? extends WMenuBar<MenuBar>> getWidgetClass() {
		return WMenuBarImpl.class;
	}
	
	public static class WMenuBarImpl extends WLayoutedWidgetImpl<MenuBar, MenuBar, MMenu> implements WMenuBar<MenuBar> {

		@Override
		protected MenuBar createWidget() {
			MenuBar b = new MenuBar();
			return b;
		}

		@Override
		protected MenuBar getWidgetNode() {
			return getWidget();
		}

		@Override
		public void addElement(WMenu<MMenuElement> widget) {
			getWidget().getMenus().add((Menu) widget.getWidget());
		}
	}
}
