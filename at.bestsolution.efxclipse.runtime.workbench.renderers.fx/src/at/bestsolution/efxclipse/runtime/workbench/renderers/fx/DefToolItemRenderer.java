package at.bestsolution.efxclipse.runtime.workbench.renderers.fx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.workbench.IResourceUtilities;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolItemRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WToolItem;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefToolItemRenderer extends BaseToolItemRenderer<Node> {

	@Override
	protected Class<? extends WToolItem<Node>> getWidgetClass() {
		return ToolItemImpl.class;
	}

	
	public static class ToolItemImpl extends WLayoutedWidgetImpl<ButtonBase, ButtonBase, MToolItem> implements WToolItem<Node> {
		private ItemType type;
		private boolean menuButton;
		private Runnable onActionCallback;
		
		private boolean handled = true;
		private boolean enabled = true;
		
		@Inject
		IResourceUtilities<Image> resourceUtilities;
		
		@Inject
		public ToolItemImpl(@Named(BaseRenderer.CONTEXT_DOM_ELEMENT) MToolItem domElement) {
			type = domElement.getType();
			menuButton = domElement.getMenu() != null;
		}
		
		@Override
		protected void bindProperties(ButtonBase widget) {
			super.bindProperties(widget);
			if( widget instanceof CheckBox ) {
				bindProperty(UIEvents.Item.SELECTED, ((CheckBox) widget).selectedProperty());
			} else if( widget instanceof ToggleButton ) {
				bindProperty(UIEvents.Item.SELECTED, ((ToggleButton) widget).selectedProperty());
			}
		}
		
		@Override
		public void setHandled(boolean handled) {
			if( this.handled != handled ) {
				this.handled = handled;
				updateEnabledState();	
			}
		}
		
		private void updateEnabledState() {
			getWidget().setDisable(!(handled && enabled));
		}
		
		@Inject
		public void setLabel(@Named(ATTRIBUTE_localizedLabel)String label) {
			getWidget().setText(label);
		}
		
		@Inject
		public void setEnabled(@Named(UIEvents.Item.ENABLED) boolean enabled) {
			this.enabled = enabled;
			updateEnabledState();
		}
		
		@Inject
		public void setIconURI(@Named(UIEvents.UILabel.ICONURI) String uri) {
			if( uri == null ) {
				getWidget().setGraphic(null);
			} else {
				Image img = resourceUtilities.imageDescriptorFromURI(URI.createURI(uri));
				if( img != null ) {
					getWidget().setGraphic(new ImageView(img));
				}
			}
		}
		
		@Inject
		public void setSelected(@Named(UIEvents.Item.SELECTED) boolean selected) {
			if( getWidget() instanceof CheckBox ) {
				CheckBox b = (CheckBox) getWidget();
				if( b.isSelected() != selected ) {
					b.setSelected(selected);
				}
				
			} else if( getWidget() instanceof ToggleButton ) {
				RadioButton b = (RadioButton) getWidget();
				if( b.isSelected() != selected ) {
					b.setSelected(selected);
				}
			}
		}
		
		public void setOnActionCallback(Runnable onActionCallback) {
			this.onActionCallback = onActionCallback;
		}
		
		@Override
		protected void doCleanup() {
			super.doCleanup();
			onActionCallback = null;
		}
		
		@Override
		protected ButtonBase createWidget() {
			ButtonBase b = internalCreateWidget();
			if( b != null ) {
				b.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) {
						if( onActionCallback != null ) {
							onActionCallback.run();
						}
					}
				});
			}
			return b;
		}
		
		private ButtonBase internalCreateWidget() {
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
