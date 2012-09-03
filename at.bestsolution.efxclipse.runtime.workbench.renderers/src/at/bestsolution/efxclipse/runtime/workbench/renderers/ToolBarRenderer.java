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

import javafx.scene.Node;
import javafx.scene.layout.HBox;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;

@SuppressWarnings("restriction")
public class ToolBarRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		// Since we use a JavaFX ToolBar for the TrimBar, each e4 toolbar is
		// rendered as JavaFX HBox
		HBox toolBar = new HBox();
		toolBar.getStyleClass().setAll("segmented-button-bar");
		return toolBar;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		super.processContents(container);

		HBox toolBar = (HBox) container.getWidget();
		for (MUIElement element : container.getChildren()) {
			toolBar.getChildren().add((Node)element.getWidget());
		}
	}
}
