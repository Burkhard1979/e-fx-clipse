package at.bestsolution.efxclipse.runtime.workbench.renderers.fx;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;

import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePerspectiveRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPerspective;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefPerspectiveRenderer extends BasePerspectiveRenderer<FillLayoutPane> {

	@Override
	protected Class<? extends WPerspective<FillLayoutPane>> getWidgetClass() {
		return PerspectiveWidgetImpl.class;
	}

	public static class PerspectiveWidgetImpl extends WLayoutedWidgetImpl<FillLayoutPane, FillLayoutPane, MPerspective> implements WPerspective<FillLayoutPane> {

		@Override
		protected FillLayoutPane getWidgetNode() {
			return getWidget();
		}

		@Override
		protected FillLayoutPane createWidget() {
			return new FillLayoutPane();
		}

		@Override
		public void addItems(List<WLayoutedWidget<MPartSashContainerElement>> list) {
			List<Node> l = new ArrayList<Node>(list.size());
			for( WLayoutedWidget<MPartSashContainerElement> w : list ) {
				l.add((Node) w.getStaticLayoutNode());
			}
			getWidget().getChildren().addAll(l);
		}

		@Override
		public void addItem(int index, WLayoutedWidget<MPartSashContainerElement> widget) {
			getWidget().getChildren().add(index, (Node) widget.getStaticLayoutNode());
		}

		@Override
		public void removeItem(WLayoutedWidget<MUIElement> widget) {
			getWidget().getChildren().remove(widget.getStaticLayoutNode());
		}
		
	}
}
