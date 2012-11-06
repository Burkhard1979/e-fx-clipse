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
package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.EventProcessor.ChildrenHandler;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WMenu;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WToolBar;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WWidget;

@SuppressWarnings("restriction")
public abstract class BaseToolBarRenderer<N> extends BaseRenderer<MToolBar, WToolBar<N>> implements ChildrenHandler<MToolBar, MToolBarElement> {
	private List<MToolBarElement> widgets = new ArrayList<MToolBarElement>();
	private Thread syncThread;
		
	public BaseToolBarRenderer() {
		syncThread = new Thread("ToolItem Enablement Sync") {
			@SuppressWarnings("unchecked")
			@Override
			public void run() {
				while( true ) {
					synchronized (widgets) {
						for( MToolBarElement e : widgets ) {
							if( e.getRenderer() instanceof BaseItemRenderer<?,?> ) {
								final MToolBarElement tmp = e;
								final BaseItemRenderer<MToolBarElement,?> r = (BaseItemRenderer<MToolBarElement,?>) tmp.getRenderer();
								r.checkEnablement(tmp);
							}
						}
					}
					
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
		};
		syncThread.setDaemon(true);
		syncThread.start();
	}
	
	@PostConstruct
	void init(IEventBroker eventBroker) {
		EventProcessor.attachChildProcessor(eventBroker, this);
		EventProcessor.attachVisibleProcessor(eventBroker, this);
	}
	
	@Override
	public void doProcessContent(MToolBar element) {
		WToolBar<N> toolbar = getWidget(element);
		for( MToolBarElement item : element.getChildren() ) {
			WWidget<MToolBarElement> itemWidget = engineCreateWidget(item);
			if( itemWidget != null ) {
				toolbar.addChild(itemWidget);
			}
		}
	}

	@Override
	public void childRendered(MToolBar parentElement, MUIElement element) {
		synchronized (widgets) {
			widgets.add((MToolBarElement) element);	
		}
		
		if( inContentProcessing(parentElement) ) {
			return;
		}
		
		
		int idx = getRenderedIndex(parentElement, element);
		WToolBar<N> toolbar = getWidget(parentElement);
		@SuppressWarnings("unchecked")
		WLayoutedWidget<MToolBarElement> widget = (WLayoutedWidget<MToolBarElement>) element.getWidget();
		if( widget instanceof WMenu ) {
			toolbar.addChild(idx, widget);
		}
	}

	@Override
	public void hideChild(MToolBar container, MUIElement changedObj) {
		synchronized (widgets) {
			widgets.remove(changedObj);	
		}
		
		WToolBar<N> toolbar = getWidget(container);
		
		if( toolbar == null ) {
			return;
		}
		
		@SuppressWarnings("unchecked")
		WLayoutedWidget<MToolBarElement> widget = (WLayoutedWidget<MToolBarElement>) changedObj.getWidget();
		if( widget != null ) {
			toolbar.removeChild(widget);
		}
	}
	
	@Override
	public void handleChildAddition(MToolBar parent, MToolBarElement element) {
		if (element.isToBeRendered() && element.isVisible()) {
			if( element.getWidget() == null ) {
				engineCreateWidget(element);	
			} else {
				childRendered(parent, element);
			}
		}
	}
	
	@Override
	public void handleChildRemove(MToolBar parent, MToolBarElement element) {
		if (element.isToBeRendered() && element.isVisible() && element.getWidget() != null) {
			hideChild(parent, element);
		}
	}
}
