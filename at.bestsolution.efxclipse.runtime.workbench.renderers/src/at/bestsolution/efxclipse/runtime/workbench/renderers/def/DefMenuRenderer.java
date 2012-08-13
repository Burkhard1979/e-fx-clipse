package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuElement;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefMenuRenderer extends BaseMenuRenderer<Menu> {

	@Override
	protected Class<? extends WMenu<Menu>> getWidgetClass() {
		return MenuImpl.class;
	}

	public static class MenuImpl extends WWidgetImpl<Menu, MMenu> implements WMenu<Menu> {

		@Override
		protected Menu createWidget() {
			Menu m = new Menu();
			return m;
		}

		@Override
		public void addStyleClasses(List<String> classnames) {
			getWidget().getStyleClass().addAll(classnames);
		}

		@Override
		public void addStyleClasses(String... classnames) {
			getWidget().getStyleClass().addAll(classnames);
		}

		@Override
		public void setStyleId(String id) {
			getWidget().setId(id);
		}
		
		@Inject
		public void setLabel(@Named(ATTRIBUTE_localizedLabel)String label) {
			getWidget().setText(label);
		}
		
		@Override
		public void addElement(WMenuElement<MMenuElement> widget) {
			getWidget().getItems().add((MenuItem) widget.getWidget());
		}
		
		@Override
		protected void setUserData(WWidgetImpl<Menu, MMenu> widget) {
			getWidget().setUserData(widget);
		}
	}
}
