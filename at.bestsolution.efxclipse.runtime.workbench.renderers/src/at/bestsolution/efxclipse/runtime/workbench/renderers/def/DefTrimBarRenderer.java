package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javafx.scene.Node;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimElement;

import at.bestsolution.efxclipse.runtime.panels.GridData;
import at.bestsolution.efxclipse.runtime.panels.GridLayoutPane;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseTrimBarRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WTrimBar;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefTrimBarRenderer extends BaseTrimBarRenderer<GridLayoutPane> {

	@Override
	protected Class<? extends WTrimBar<GridLayoutPane>> getWidgetClass() {
		return WTrimBarImpl.class;
	}

	public static class WTrimBarImpl extends WLayoutedWidgetImpl<GridLayoutPane, GridLayoutPane, MTrimBar> implements WTrimBar<GridLayoutPane> {

		@Override
		protected GridLayoutPane createWidget() {
			GridLayoutPane box = new GridLayoutPane();
			box.setHorizontalSpacing(0);
			box.setMarginWidth(0);
			box.setMarginHeight(0);
			box.setStyle("-fx-background-color: red");
			return box;
		}

		@Override
		protected GridLayoutPane getWidgetNode() {
			return getWidget();
		}
		
		@Override
		public void addChild(WLayoutedWidget<MTrimElement> trimElementWidget) {
			Node n = trimElementWidget.getStaticLayoutNode();
			getWidget().getChildren().add(n);
			GridLayoutPane.setConstraint(n, new GridData(GridData.FILL_BOTH));
		}
	}
}
