package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.List;

import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseMenuItemRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefMenuItemRenderer extends BaseMenuItemRenderer<MenuItem> {

	@Override
	protected Class<? extends WMenuItem<MenuItem>> getWidgetClass() {
		return MenuItemImpl.class;
	}

	public static class MenuItemImpl extends WWidgetImpl<MenuItem, MMenuItem> implements WMenuItem<MenuItem> {
		private ItemType type;
		
		@Inject
		public MenuItemImpl(@Named("type") ItemType type) {
			this.type = type;
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

		@Override
		protected MenuItem createWidget() {
			switch (type) {
			case CHECK:
				return new CheckMenuItem();
			case RADIO:
				return new RadioMenuItem(null);
			default:
				return new MenuItem();
			}
		}
		
		@Inject
		public void setLabel(@Named(ATTRIBUTE_localizedLabel) String label) {
			getWidget().setText(label);
		}

		@Override
		protected void setUserData(WWidgetImpl<MenuItem, MMenuItem> widget) {
			getWidget().setUserData(widget);
		}
	}
}
