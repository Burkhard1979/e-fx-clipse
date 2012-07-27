package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javafx.scene.layout.BorderPane;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePartRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WPart;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefPartRenderer extends BasePartRenderer<BorderPane> {

	@Override
	protected Class<? extends WPart<BorderPane>> getWidgetClass() {
		return PartImpl.class;
	}

	public static class PartImpl extends WWidgetImpl<BorderPane, BorderPane, MPart> implements WPart<BorderPane> {
		
		@Override
		protected BorderPane createWidget() {
			BorderPane p = new BorderPane();
			return p;
		}

		@Override
		protected BorderPane getWidgetNode() {
			return getWidget();
		}
	}
}
