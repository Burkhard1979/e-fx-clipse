package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolItemRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WToolItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefToolItemRenderer extends BaseToolItemRenderer<Node> {

	@Override
	protected Class<? extends WToolItem<Node>> getWidgetClass() {
		return ToolItemImpl.class;
	}

	
	public static class ToolItemImpl extends WLayoutedWidgetImpl<ButtonBase, ButtonBase, MToolItem> implements WToolItem<Node> {
		private ItemType type;
		private boolean menuButton;
		
		@Inject
		public ToolItemImpl(@Named(BaseRenderer.CONTEXT_DOM_ELEMENT) MToolItem domElement) {
			type = domElement.getType();
			menuButton = domElement.getMenu() != null;
		}
		
		@Inject
		public void setLabel(@Named(ATTRIBUTE_localizedLabel)String label) {
			getWidget().setText(label);
		}
		
		@Override
		protected ButtonBase createWidget() {
			switch (type) {
			case CHECK:
				return new CheckBox("CheckBox");
			case PUSH:
				if( menuButton ) {
					SplitMenuButton b = new SplitMenuButton();
					b.setText("Push/Menu Button");
					return b;
				} else {
					return new Button("Push Button");	
				}
			case RADIO:
				return new RadioButton("RadioButton");
			default:
				break;
			}
			return null;
		}
		
		@Override
		protected ButtonBase getWidgetNode() {
			return getWidget();
		}
	}
}
