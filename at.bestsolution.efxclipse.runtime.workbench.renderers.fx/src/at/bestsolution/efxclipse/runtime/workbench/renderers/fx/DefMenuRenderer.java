package at.bestsolution.efxclipse.runtime.workbench.renderers.fx;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WMenuElement;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefMenuRenderer extends BaseMenuRenderer<Menu> {

	@Override
	protected Class<? extends WMenu<Menu>> getWidgetClass() {
		return MenuImpl.class;
	}

	public static class MenuImpl extends WWidgetImpl<Menu, MMenu> implements WMenu<Menu> {
		private ToggleGroup group;
		
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
			if( widget.getWidget() instanceof Toggle ) {
				if( group == null ) {
					group = new ToggleGroup();
				}
				// see http://javafx-jira.kenai.com/browse/RT-24256
//				group.getToggles().add((Toggle) widget.getWidget());
				((Toggle)widget.getWidget()).setToggleGroup(group);
			}
			getWidget().getItems().add((MenuItem) widget.getWidget());
		}
		
		@Override
		protected void setUserData(WWidgetImpl<Menu, MMenu> widget) {
			getWidget().setUserData(widget);
		}
	}
}
