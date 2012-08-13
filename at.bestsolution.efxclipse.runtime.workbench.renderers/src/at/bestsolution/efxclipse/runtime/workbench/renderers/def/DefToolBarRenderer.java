package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javafx.scene.control.ToolBar;

import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WToolBar;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefToolBarRenderer extends BaseToolBarRenderer<ToolBar> {

	@Override
	protected Class<? extends WToolBar<ToolBar>> getWidgetClass() {
		return WToolBarImpl.class;
	}

	public static class WToolBarImpl extends WLayoutedWidgetImpl<ToolBar, ToolBar, MToolBar> implements WToolBar<ToolBar> {

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
			getWidget().getItems().add(itemWidget.getStaticLayoutNode());
		}
		
	}
}
