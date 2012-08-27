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
package at.bestsolution.efxclipse.runtime.workbench.internal;

import java.util.List;
import java.util.Map;

import javafx.scene.Group;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.internal.workbench.Activator;
import org.eclipse.e4.ui.internal.workbench.E4Workbench;
import org.eclipse.e4.ui.internal.workbench.Policy;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.MContribution;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MGenericStack;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import at.bestsolution.efxclipse.runtime.services.theme.ThemeManager;
import at.bestsolution.efxclipse.runtime.workbench.AbstractPartRenderer;
import at.bestsolution.efxclipse.runtime.workbench.IRendererFactory;

@SuppressWarnings({ "restriction" })
public class PartRenderingEngine implements IPresentationEngine {
	public static final String engineURI = "bundleclass://at.bestsolution.efxclipse.runtime.workbench/"
			+ "at.bestsolution.efxclipse.runtime.workbench.internal.PartRenderingEngine";

	private static final String defaultFactoryUrl = "bundleclass://at.bestsolution.efxclipse.runtime.workbench.renderers/"
			+ "at.bestsolution.efxclipse.runtime.workbench.renderers.WorkbenchRendererFactory";

	private final String factoryUrl;
	private IRendererFactory curFactory = null;
	private IEclipseContext appContext;

	@Inject
	protected Logger logger;

	@Inject
	@Optional
	protected IEventBroker eventBroker;

	@Inject
	@Optional
	EModelService modelService;

	private MApplication theApp;

	private Group limboContainer;

	@Inject
	@Optional
	ThemeManager themeManager;

	// Life Cycle handlers
		private EventHandler toBeRenderedHandler = new EventHandler() {
			public void handleEvent(Event event) {

				MUIElement changedElement = (MUIElement) event
						.getProperty(UIEvents.EventTags.ELEMENT);
				MElementContainer<?> parent = changedElement.getParent();

				// Handle Detached Windows
				if (parent == null) {
					parent = (MElementContainer<?>) ((EObject) changedElement)
							.eContainer();
				}

				boolean menuChild = parent instanceof MMenu;

				// If the parent isn't displayed who cares?
				if (!(parent instanceof MApplication)
						&& (parent == null || parent.getWidget() == null || menuChild))
					return;

				if (changedElement.isToBeRendered()) {
					Activator.trace(Policy.DEBUG_RENDERER, "visible -> true", null); //$NON-NLS-1$

					// Note that the 'createGui' protocol calls 'childAdded'
//					Object w = createGui(changedElement);
//					if (w instanceof Control && !(w instanceof Shell)) {
//						fixZOrder(changedElement);
//					}
				} else {
					Activator
							.trace(Policy.DEBUG_RENDERER, "visible -> false", null); //$NON-NLS-1$

					// Ensure that the element about to be removed is not the
					// selected element
					if (parent.getSelectedElement() == changedElement)
						parent.setSelectedElement(null);

					// Un-maximize the element before tearing it down
					if (changedElement.getTags().contains(MAXIMIZED))
						changedElement.getTags().remove(MAXIMIZED);

					// Note that the 'removeGui' protocol calls 'childRemoved'
					removeGui(changedElement);
				}

			}
		};
	
	private EventHandler childrenHandler = new EventHandler() {
		public void handleEvent(Event event) {

			Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
			if (!(changedObj instanceof MElementContainer<?>))
				return;

			MElementContainer<MUIElement> changedElement = (MElementContainer<MUIElement>) changedObj;
			boolean isApplication = changedObj instanceof MApplication;

			boolean menuChild = changedObj instanceof MMenu;
			// If the parent isn't in the UI then who cares?
			AbstractPartRenderer renderer = getRendererFor(changedElement);
			if ((!isApplication && renderer == null) || menuChild)
				return;

			String eventType = (String) event
					.getProperty(UIEvents.EventTags.TYPE);
			if (UIEvents.EventTypes.ADD.equals(eventType)) {
				Activator.trace(Policy.DEBUG_RENDERER, "Child Added", null); //$NON-NLS-1$
				MUIElement added = (MUIElement) event
						.getProperty(UIEvents.EventTags.NEW_VALUE);

				// OK, we have a new -visible- part we either have to create
				// it or host it under the correct parent. Note that we
				// explicitly do *not* render non-selected elements in
				// stacks (to support lazy loading).
				boolean isStack = changedObj instanceof MGenericStack<?>;
				boolean hasWidget = added.getWidget() != null;
				boolean isSelected = added == changedElement
						.getSelectedElement();
				boolean renderIt = !isStack || hasWidget || isSelected;
				if (renderIt) {
					// NOTE: createGui will call 'childAdded' if successful
					Object w = createGui(added);
//					if (w instanceof Control && !(w instanceof Shell)) {
//						final Control ctrl = (Control) w;
//						fixZOrder(added);
//						if (!ctrl.isDisposed()) {
//							ctrl.getShell().layout(new Control[] { ctrl },
//									SWT.DEFER);
//						}
//					}
				} else {
					if (renderer != null && added.isToBeRendered())
						renderer.childRendered(changedElement, added);
				}

				// If the element being added is a placeholder, check to see if
				// it's 'globally visible' and, if so, remove all other
				// 'local' placeholders referencing the same element.
				int newLocation = modelService.getElementLocation(added);
				if (newLocation == EModelService.IN_SHARED_AREA
						|| newLocation == EModelService.OUTSIDE_PERSPECTIVE) {
					MWindow topWin = modelService.getTopLevelWindowFor(added);
					modelService.hideLocalPlaceholders(topWin, null);
				}
			} else if (UIEvents.EventTypes.REMOVE.equals(eventType)) {
				Activator.trace(Policy.DEBUG_RENDERER, "Child Removed", null); //$NON-NLS-1$
				MUIElement removed = (MUIElement) event
						.getProperty(UIEvents.EventTags.OLD_VALUE);
				// Removing invisible elements is a NO-OP as far as the
				// renderer is concerned
				if (!removed.isToBeRendered())
					return;

//				if (removed.getWidget() instanceof Control) {
//					Control ctrl = (Control) removed.getWidget();
//					ctrl.setLayoutData(null);
//					ctrl.getParent().layout(new Control[] { ctrl },
//							SWT.CHANGED | SWT.DEFER);
//				}

				// Ensure that the element about to be removed is not the
				// selected element
				if (changedElement.getSelectedElement() == removed)
					changedElement.setSelectedElement(null);

				if (renderer != null)
					renderer.hideChild(changedElement, removed);
			}
		}
	};
	
	@Inject
	public PartRenderingEngine(@Named(E4Workbench.RENDERER_FACTORY_URI) @Optional String factoryUrl) {
		if (factoryUrl == null) {
			factoryUrl = defaultFactoryUrl;
		}
		this.factoryUrl = factoryUrl;
	}

	@PostConstruct
	void initialize(IEclipseContext context) {
		this.appContext = context;

		String cssTheme = (String) appContext.get(E4Application.THEME_ID);
		if (themeManager != null && cssTheme != null) {
			themeManager.setCurrentThemeId(cssTheme);
		}

		// Add the renderer to the context
		context.set(IPresentationEngine.class.getName(), this);

		IRendererFactory factory = null;
		IContributionFactory contribFactory = context.get(IContributionFactory.class);
		try {
			factory = (IRendererFactory) contribFactory.create(factoryUrl, context);
		} catch (Exception e) {
			logger.warn(e, "Could not create rendering factory");
		}

		// Try to load the default one
		if (factory == null) {
			try {
				factory = (IRendererFactory) contribFactory.create(defaultFactoryUrl, context);
			} catch (Exception e) {
				logger.error(e, "Could not create default rendering factory");
			}
		}

		if (factory == null) {
			throw new IllegalStateException("Could not create any rendering factory. Aborting ...");
		}

		curFactory = factory;
		context.set(IRendererFactory.class, curFactory);
		
		eventBroker.subscribe(UIEvents.UIElement.TOPIC_TOBERENDERED,
				toBeRenderedHandler);
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_CHILDREN,
				childrenHandler);
	}

	@PreDestroy
	void contextDisposed() {
		if (eventBroker == null) {
			return;
		}
	}

	@SuppressWarnings("unchecked")
	public Object createGui(MUIElement element, Object parentWidget, IEclipseContext parentContext) {
		System.err.println("creating new element");
		if (!element.isToBeRendered()) {
			return null;
		}
		
		Object currentWidget = element.getWidget();
		
		if(currentWidget != null) {
			//TODO Port SWT code
			return currentWidget;
		}

		if (element instanceof MContext) {
			MContext ctxt = (MContext) element;
			// Assert.isTrue(ctxt.getContext() == null,
			// "Before rendering Context should be null");
			if (ctxt.getContext() == null) {
				IEclipseContext lclContext = parentContext.createChild(getContextName(element));
				populateModelInterfaces(ctxt, lclContext, element.getClass().getInterfaces());
				ctxt.setContext(lclContext);

				// System.out.println("New Context: " + lclContext.toString()
				// + " parent: " + parentContext.toString());

				// make sure the context knows about these variables that have
				// been defined in the model
				for (String variable : ctxt.getVariables()) {
					lclContext.declareModifiable(variable);
				}

				Map<String, String> props = ctxt.getProperties();
				for (String key : props.keySet()) {
					lclContext.set(key, props.get(key));
				}

				E4Workbench.processHierarchy(element);
			}
		}

		Object newWidget = createWidget(element, parentWidget);

		if (newWidget != null) {
			AbstractPartRenderer renderer = getRendererFor(element);

			// Have the renderer hook up any widget specific listeners
			renderer.hookControllerLogic(element);

			// Process its internal structure through the renderer that created
			// it
			if (element instanceof MElementContainer) {
				renderer.processContents((MElementContainer<MUIElement>) element);
			}

			// Allow a final chance to set up
			renderer.postProcess(element);

			// Now that we have a widget let the parent (if any) know
			if (element.getParent() instanceof MUIElement) {
				MElementContainer<MUIElement> parentElement = element.getParent();
				AbstractPartRenderer parentRenderer = getRendererFor(parentElement);
				if (parentRenderer != null) {
					parentRenderer.childRendered(parentElement, element);
				}
			}
		} else {
			// failed to create the widget, dispose its context if necessary
			if (element instanceof MContext) {
				MContext ctxt = (MContext) element;
				IEclipseContext lclContext = ctxt.getContext();
				if (lclContext != null) {
					lclContext.dispose();
					ctxt.setContext(null);
				}
			}
		}

		return newWidget;
	}

	private static void populateModelInterfaces(MContext contextModel, IEclipseContext context, Class<?>[] interfaces) {
		for (Class<?> intf : interfaces) {
			// Activator.trace(Policy.DEBUG_CONTEXTS,
			//					"Adding " + intf.getName() + " for " //$NON-NLS-1$ //$NON-NLS-2$
			// + contextModel.getClass().getName(), null);
			context.set(intf.getName(), contextModel);

			populateModelInterfaces(contextModel, context, intf.getInterfaces());
		}
	}

	private IEclipseContext getContext(MUIElement parent) {
		if (parent instanceof MContext) {
			return ((MContext) parent).getContext();
		}
		return modelService.getContainingContext(parent);
	}

	protected AbstractPartRenderer getRendererFor(MUIElement element) {
		return (AbstractPartRenderer) element.getRenderer();
	}

	public Object createGui(final MUIElement element) {
		// Obtain the necessary parent widget
		Object parent = null;
		MUIElement parentME = element.getParent();
		if (parentME == null) {
			parentME = (MUIElement) ((EObject) element).eContainer();
		}
		if (parentME != null) {
			AbstractPartRenderer renderer = getRendererFor(parentME);
			if (renderer != null) {
				if (!element.isVisible()) {
					parent = getLimboContainer();
				} else {
					parent = renderer.getUIContainer(element);
				}
			}
		}

		// Obtain the necessary parent context
		IEclipseContext parentContext = null;
		if (element.getCurSharedRef() != null) {
			MPlaceholder ph = element.getCurSharedRef();
			parentContext = getContext(ph.getParent());
		} else if (parentContext == null && element.getParent() != null) {
			parentContext = getContext(element.getParent());
		} else if (parentContext == null && element.getParent() == null) {
			parentContext = getContext((MUIElement) ((EObject) element).eContainer());
		}

		return createGui(element, parent, parentContext);
	}

	private Object getLimboContainer() {
		if (limboContainer != null) {
			limboContainer = new Group();
		}
		return limboContainer;
	}

	private String getContextName(MUIElement element) {
		StringBuilder builder = new StringBuilder(element.getClass().getSimpleName());
		String elementId = element.getElementId();
		if (elementId != null && elementId.length() != 0) {
			builder.append(" (").append(elementId).append(") ");
		}
		builder.append("Context");
		return builder.toString();
	}

	protected Object createWidget(MUIElement element, Object parent) {
		AbstractPartRenderer renderer = getRenderer(element, parent);
		if (renderer != null) {
			// Remember which renderer is responsible for this widget
			element.setRenderer(renderer);
			Object newWidget = renderer.createWidget(element, parent);
			if (newWidget != null) {
				renderer.bindWidget(element, newWidget);
				return newWidget;
			}
		}

		return null;
	}

	private AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		return curFactory.getRenderer(uiElement, parent);
	}

	public void removeGui(MUIElement element) {
//		if (removeRoot == null)
//			removeRoot = element;
//		renderedElements.remove(element);

		// We call 'hideChild' *before* checking if the actual element
		// has been rendered in order to pick up cases of 'lazy loading'
		MUIElement parent = element.getParent();
		AbstractPartRenderer parentRenderer = parent != null ? getRendererFor(parent)
				: null;
		if (parentRenderer != null) {
			parentRenderer.hideChild(element.getParent(), element);
		}

		AbstractPartRenderer renderer = getRendererFor(element);

		// If the element hasn't been rendered then this is a NO-OP
		if (renderer != null) {

			if (element instanceof MElementContainer<?>) {
				MElementContainer<MUIElement> container = (MElementContainer<MUIElement>) element;
				MUIElement selectedElement = container.getSelectedElement();
				List<MUIElement> children = container.getChildren();
				for (MUIElement child : children) {
					// remove stuff in the "back" first
					if (child != selectedElement) {
						removeGui(child);
					}
				}

				if (selectedElement != null
						&& children.contains(selectedElement)) {
					// now remove the selected element
					removeGui(selectedElement);
				}
			}

			if (element instanceof MPerspective) {
				MPerspective perspective = (MPerspective) element;
				for (MWindow subWindow : perspective.getWindows()) {
					removeGui(subWindow);
				}
			} else if (element instanceof MWindow) {
				MWindow window = (MWindow) element;
				for (MWindow subWindow : window.getWindows()) {
					removeGui(subWindow);
				}

				if (window instanceof MTrimmedWindow) {
					MTrimmedWindow trimmedWindow = (MTrimmedWindow) window;
					for (MUIElement trimBar : trimmedWindow.getTrimBars()) {
						removeGui(trimBar);
					}
				}
			}

			renderer.disposeWidget(element);

			// unset the client object
			if (element instanceof MContribution) {
				MContribution contribution = (MContribution) element;
				Object client = contribution.getObject();
				IEclipseContext parentContext = renderer.getContext(element);
				if (parentContext != null && client != null) {
					try {
						ContextInjectionFactory.uninject(client, parentContext);
					} catch (Exception e) {
						if (logger != null) {
							logger.error(e);
						}
					}
				}
				contribution.setObject(null);
			}

			// dispose the context
			if (element instanceof MContext) {
				clearContext((MContext) element);
			}
		}

//		if (removeRoot == element)
//			removeRoot = null;
	}
	
	private void clearContext(MContext contextME) {
		MContext ctxt = (MContext) contextME;
		IEclipseContext lclContext = ctxt.getContext();
		if (lclContext != null) {
			IEclipseContext parentContext = lclContext.getParent();
			IEclipseContext child = parentContext.getActiveChild();
			if (child == lclContext) {
				child.deactivate();
			}

			ctxt.setContext(null);
			lclContext.dispose();
		}
	}

	public Object run(MApplicationElement uiRoot, IEclipseContext appContext) {
		if (uiRoot instanceof MApplication) {
			theApp = (MApplication) uiRoot;
			MWindow selected = theApp.getSelectedElement();
			if (selected == null) {
				for (MWindow window : theApp.getChildren()) {
					createGui(window);
				}
			} else {
				// render the selected one first
				createGui(selected);
				for (MWindow window : theApp.getChildren()) {
					if (selected != window) {
						createGui(window);
					}
				}
			}
		}
		return null;
	}

	public void stop() {
		// TODO Auto-generated method stub

	}
}
