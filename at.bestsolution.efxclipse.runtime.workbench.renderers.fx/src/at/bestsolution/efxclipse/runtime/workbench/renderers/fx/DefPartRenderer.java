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
package at.bestsolution.efxclipse.runtime.workbench.renderers.fx;

import javafx.scene.layout.BorderPane;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BasePartRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPart;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefPartRenderer extends BasePartRenderer<BorderPane> {

	@Override
	protected Class<? extends WPart<BorderPane>> getWidgetClass(MPart part) {
		return PartImpl.class;
	}

//TODO Uncertain what this code did in the past keep it commented for the next release and then remove it in > 0.2.0
//	@Override
//	protected boolean requiresFocus(WPart<BorderPane> widget) {
//		Node n = (Node) widget.getWidget();
//		
//		do {
//			if( n.getUserData() == widget ) {
//				return false;
//			}
//		} while( (n = n.getParent()) != null );
//		
//		return true;
//	}

	public static class PartImpl extends WLayoutedWidgetImpl<BorderPane, BorderPane, MPart> implements WPart<BorderPane> {
		
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
