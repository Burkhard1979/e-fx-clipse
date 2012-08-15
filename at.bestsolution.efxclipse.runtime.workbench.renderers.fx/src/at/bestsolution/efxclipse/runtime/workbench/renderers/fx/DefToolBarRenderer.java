package at.bestsolution.efxclipse.runtime.workbench.renderers.fx;

import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;

import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WLayoutedWidgetImpl;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WToolBar;

@SuppressWarnings("restriction")
public class DefToolBarRenderer extends BaseToolBarRenderer<ToolBar> {

	@Override
	protected Class<? extends WToolBar<ToolBar>> getWidgetClass() {
		return WToolBarImpl.class;
	}

	public static class WToolBarImpl extends WLayoutedWidgetImpl<ToolBar, ToolBar, MToolBar> implements WToolBar<ToolBar> {
		private ToggleGroup group;
		
		@Override
		protected ToolBar createWidget() {
			ToolBar b = new ToolBar();
			return b;
		}

		@Override
		protected ToolBar getWidgetNode() {
			return getWidget();
		}

		@Override
		public void addChild(WLayoutedWidget<MToolBarElement> itemWidget) {
			if( itemWidget.getWidget() instanceof Toggle ) {
				if( group == null ) {
					group = new ToggleGroup();
				}
				group.getToggles().add((Toggle) itemWidget.getWidget());
			}
			getWidget().getItems().add(itemWidget.getStaticLayoutNode());
		}
	}
}
