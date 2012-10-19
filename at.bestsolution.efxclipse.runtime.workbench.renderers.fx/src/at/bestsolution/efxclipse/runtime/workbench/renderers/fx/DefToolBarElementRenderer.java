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

import java.util.List;

import javafx.scene.Group;

import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseToolBarElementRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WToolBarElement;
import at.bestsolution.efxclipse.runtime.workbench.renderers.fx.widget.WWidgetImpl;

@SuppressWarnings("restriction")
public class DefToolBarElementRenderer extends BaseToolBarElementRenderer<Group> {

	@Override
	protected Class<? extends WToolBarElement<Group>> getWidgetClass() {
		return WToolBarElementImpl.class;
	}
	
	public static class WToolBarElementImpl extends WWidgetImpl<Group, MToolBarElement> implements WToolBarElement<Group> {

		@Override
		public void addStyleClasses(List<String> classnames) {
			getWidget().getStyleClass().addAll(classnames);
		}

		@Override
		public void addStyleClasses(String... classnames) {
			getWidget().getStyleClass().addAll(classnames);
		}

		@Override
		public void setStyleId(String id) {
			getWidget().setId(id);
		}

		@Override
		protected Group createWidget() {
			return new Group();
		}

		@Override
		protected void setUserData(WWidgetImpl<Group, MToolBarElement> widget) {
			getWidget().setUserData(widget);
		}
		
	}
}
