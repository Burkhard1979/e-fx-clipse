package at.bestsolution.efxclipse.runtime.workbench.renderers.fx;

import java.util.List;

import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolItemMenuRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.ToolItemMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WWidgetImpl;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WMenuElement;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WToolItem;

@SuppressWarnings("restriction")
public class DefToolItemMenuRenderer extends BaseToolItemMenuRenderer<ToolItemMenu> {

	@Override
	protected Class<? extends WMenu<ToolItemMenu>> getWidgetClass() {
		return WMenuImpl.class;
	}

	static class WMenuImpl extends WWidgetImpl<ToolItemMenu, MMenu> implements WMenu<ToolItemMenu> {
		private SplitMenuButton button;
		
		@Inject
		public WMenuImpl(@Named(BaseRenderer.CONTEXT_DOM_ELEMENT) MMenu domElement) {
			MToolItem item = (MToolItem) ((EObject)domElement).eContainer();
			@SuppressWarnings("unchecked")
			WToolItem<SplitMenuButton> w = (WToolItem<SplitMenuButton>) item.getWidget();
			this.button = (SplitMenuButton) w.getWidget();
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
		protected ToolItemMenu createWidget() {
			return new ToolItemMenu(button);
		}

		@Override
		protected void setUserData(WWidgetImpl<ToolItemMenu, MMenu> widget) {
			getWidget().setUserData(widget);
		}

		@Inject
		public void setLabel(@Named(ATTRIBUTE_localizedLabel) String label) {
			getWidget().setText(label);
		}

		@Override
		public void addElement(WMenuElement<MMenuElement> widget) {
			getWidget().getItems().add((MenuItem) widget.getWidget());
		}
	}
	
}