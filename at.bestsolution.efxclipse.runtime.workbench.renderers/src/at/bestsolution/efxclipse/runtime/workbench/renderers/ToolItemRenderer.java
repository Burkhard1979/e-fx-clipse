/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.UIEvents.EventTags;
import org.eclipse.emf.common.util.URI;
import org.osgi.service.event.Event;

@SuppressWarnings("restriction")
public class ToolItemRenderer extends ItemRenderer {
	@Inject
	IContributionFactory contributionFactory;

	static class RadioButton extends Button {

	}

	private org.osgi.service.event.EventHandler selectionHandler = new org.osgi.service.event.EventHandler() {

		@Override
		public void handleEvent(Event event) {
			ButtonBase button = (ButtonBase) event.getProperty(EventTags.WIDGET);
			
			if( Boolean.TRUE.equals(event.getProperty(EventTags.NEW_VALUE)) ) {
				button.getStyleClass().add("efxSelectedRadioToolButton");
			} else {
				button.getStyleClass().remove("efxSelectedRadioToolButton");
			}
		}
		
	};
	
	@Inject
	IEventBroker eventBroker;
	
	@PostConstruct
	void init() {
		eventBroker.subscribe(UIEvents.Item.TOPIC_SELECTED, selectionHandler);
	}
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		MToolItem item = (MToolItem) element;

		ButtonBase button;

		if (item.getType() == ItemType.RADIO) {
			button = new RadioButton();
			if( item.isSelected() ) {
				button.getStyleClass().add("efxSelectedRadioToolButton");
			}
		} else {
			button = new Button();
		}

		if( item.getLocalizedLabel() != null ) {
			button.setText(item.getLocalizedLabel());
		}
		
		if (item.getIconURI() != null) {
			URL url = Util.convertToOSGiURL(URI.createURI(item.getIconURI()));
			Image img = new Image(url.toExternalForm());
			button.setGraphic(new ImageView(img));
		}
		if (item.getTooltip() != null) {
			button.setTooltip(new Tooltip(item.getLocalizedTooltip()));
		}

		return button;
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		final EventHandler<ActionEvent> h;
		final ButtonBase button = (ButtonBase) me.getWidget();

		if (me instanceof MDirectToolItem) {
			final MDirectToolItem item = (MDirectToolItem) me;
			item.setObject(contributionFactory.create(item.getContributionURI(), getContext(item)));
			h = createEventHandler(item);
		} else if (me instanceof MHandledToolItem) {
			final MHandledItem item = (MHandledToolItem) me;
			h = createParametrizedCommandEventHandler(item);
		} else {
			h = null;
		}

		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (button instanceof RadioButton) {
					selectButton(button);
				}

				if (h != null) {
					h.handle(event);
				}
			}
		});
	}

	private void selectButton(ButtonBase button) {
		for (Node n : button.getParent().getChildrenUnmodifiable()) {
			if (n instanceof RadioButton) {
				if( n != button ) {
					((MToolItem)n.getUserData()).setSelected(false);
				}
			}
		}
		System.err.println("Add selection");
		((MToolItem)button.getUserData()).setSelected(true);
	}
}
