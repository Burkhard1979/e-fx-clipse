/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package com.toedter.e4.javafx.addons.cleanup;

import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Control;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MArea;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import at.bestsolution.efxclipse.runtime.workbench.AbstractPartRenderer;

@SuppressWarnings("restriction")
public class CleanupAddon {
	@Inject
	IEventBroker eventBroker;

	@Inject
	EModelService modelService;

	@Inject
	MApplication app;

	private final EventHandler childrenHandler = new EventHandler() {
		@Override
		public void handleEvent(Event event) {
			Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
			String eventType = (String) event.getProperty(UIEvents.EventTags.TYPE);
			if (UIEvents.EventTypes.REMOVE.equals(eventType)) {
				final MElementContainer<?> container = (MElementContainer<?>) changedObj;
				MUIElement containerParent = container.getParent();

				// Determine the elements that should *not* ever be
				// auto-destroyed
				if (container instanceof MApplication || container instanceof MPerspectiveStack
						|| container instanceof MMenuElement || container instanceof MTrimBar
						|| container instanceof MToolBar || container instanceof MArea) {
					return;
				}

				if (container instanceof MWindow && containerParent instanceof MApplication) {
					return;
				}

				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						// Remove it from the display if no visible children
						int tbrCount = modelService.toBeRenderedCount(container);

						// Cache the value since setting the TBR may change
						// the result
						boolean lastStack = isLastEditorStack(container);
						if (tbrCount == 0 && !lastStack) {
							container.setToBeRendered(false);
						}

						// Remove it from the model if it has no children at
						// all
						if (container.getChildren().size() == 0) {
							MElementContainer<MUIElement> parent = container.getParent();
							if (parent != null && !lastStack) {
								container.setToBeRendered(false);
								parent.getChildren().remove(container);
							} else if (container instanceof MWindow) {
								// Must be a Detached Window
								MUIElement eParent = (MUIElement) ((EObject) container).eContainer();
								if (eParent instanceof MPerspective) {
									((MPerspective) eParent).getWindows().remove(container);
								} else if (eParent instanceof MWindow) {
									((MWindow) eParent).getWindows().remove(container);
								}
							}
						} else if (container.getChildren().size() == 1 && container instanceof MPartSashContainer) {
							// if a sash container has only one element then
							// remove it and move
							// its child up to where it used to be
							MUIElement theChild = container.getChildren().get(0);
							MElementContainer<MUIElement> parentContainer = container.getParent();
							if (parentContainer != null) {
								int index = parentContainer.getChildren().indexOf(container);

								// Magic check, are we unwrapping a sash
								// container
								if (theChild instanceof MPartSashContainer) {
									if (container.getWidget() instanceof SplitPane) {
										SplitPane theComp = (SplitPane) container.getWidget();
										Object tmp = theChild.getWidget();
										theChild.setWidget(theComp);
										// TODO: Save the original child
										// theComp.setLayout(new
										// SashLayout(theComp, theChild));
										// theComp.setData(AbstractPartRenderer.OWNING_ME,
										// theChild);
										container.setWidget(tmp);
									}
								}

								theChild.setContainerData(container.getContainerData());
								container.getChildren().remove(theChild);
								parentContainer.getChildren().add(index, theChild);
								container.setToBeRendered(false);
								parentContainer.getChildren().remove(container);
							}
						}
					}
				});

			}
		}
	};

	private final EventHandler visibilityChangeHandler = new EventHandler() {
		@Override
		public void handleEvent(Event event) {
			MUIElement changedObj = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);
			if (changedObj instanceof MTrimBar) {
				return;
			}

			if (changedObj.getWidget() instanceof Stage) {
				if (changedObj.isVisible()) {
					((Stage) changedObj.getWidget()).show();
				} else {
					((Stage) changedObj.getWidget()).hide();
				}
			} else if (changedObj.getWidget() instanceof Rectangle) {
				if (changedObj.isVisible()) {
					// Make all the parents visible
					MUIElement parent = changedObj.getParent();
					if (!parent.isVisible()) {
						parent.setVisible(true);
					}
				} else {
					// If there are no more 'visible' children then make the
					// parent go away too
					MElementContainer<MUIElement> parent = changedObj.getParent();
					boolean makeInvisible = true;
					for (MUIElement kid : parent.getChildren()) {
						if (kid.isToBeRendered() && kid.isVisible()) {
							makeInvisible = false;
							break;
						}
					}
					if (makeInvisible) {
						parent.setVisible(false);
					}
				}
			} else if (changedObj.getWidget() instanceof Parent) {
				Parent ctrl = (Parent) changedObj.getWidget();
				MElementContainer<MUIElement> parent = changedObj.getParent();
				if (parent == null) {
					return;
				}
				if (changedObj.isVisible()) {
					if (parent.getRenderer() != null) {
						Object myParent = ((AbstractPartRenderer) parent.getRenderer()).getUIContainer(changedObj);
						if (myParent instanceof Pane) {
							Pane parentComp = (Pane) myParent;
							parentComp.getChildren().add(ctrl);

							Control prevControl = null;
							for (MUIElement childME : parent.getChildren()) {
								if (childME == changedObj) {
									break;
								}
								if (childME.getWidget() instanceof Control && childME.isVisible()) {
									prevControl = (Control) childME.getWidget();
								}
							}
							// TODO What to do here?
							// if (prevControl != null) {
							// ctrl.moveBelow(prevControl);
							// } else {
							// ctrl.moveAbove(null);
							// }
							// ctrl.getShell().layout(new Control[] { ctrl },
							// SWT.DEFER);
						} else {
							System.out.println("Check re-parenting code for: " + myParent);
						}

						// Check if the parent is visible
						if (!parent.isVisible()) {
							parent.setVisible(true);
						}
					}
				} else {
					Group limbo = (Group) app.getContext().get("limbo");

					// Reparent the control to 'limbo'
					if (ctrl.getParent() instanceof Pane) {
						Pane curParent = (Pane) ctrl.getParent();
						curParent.getChildren().remove(ctrl);
					} else if (ctrl.getParent() instanceof Group) {
						Group curParent = (Group) ctrl.getParent();
						curParent.getChildren().remove(ctrl);
					} else {
						System.out.println("Check re-parenting code for: " + ctrl.getParent());
					}

					limbo.getChildren().add(ctrl);

					// ctrl.setParent(limbo);
					// curParent.layout(true);
					// if (curParent.getShell() != curParent) {
					// curParent.getShell().layout(new Control[] { curParent },
					// SWT.DEFER);
					// }

					// Always leave the perspective composite in the
					// presentation
					if ((Object) parent instanceof MPerspective) {
						return;
					}

					// Always leave Window's in the presentation
					if ((Object) parent instanceof MWindow) {
						return;
					}

					// If there are no more 'visible' children then make the
					// parent go away too
					boolean makeInvisible = true;
					for (MUIElement kid : parent.getChildren()) {
						if (kid.isToBeRendered() && kid.isVisible()) {
							makeInvisible = false;
							break;
						}
					}
					if (makeInvisible) {
						parent.setVisible(false);
					}
				}
			}
		}
	};

	private final EventHandler renderingChangeHandler = new EventHandler() {
		@Override
		public void handleEvent(Event event) {
			MUIElement changedObj = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);
			MElementContainer<MUIElement> container = null;
			if (changedObj.getCurSharedRef() != null) {
				container = changedObj.getCurSharedRef().getParent();
			} else {
				container = changedObj.getParent();
			}

			// this can happen for shared parts that aren't attached to any
			// placeholders
			if (container == null) {
				return;
			}

			// never hide top-level windows
			MUIElement containerElement = container;
			if (containerElement instanceof MWindow && containerElement.getParent() != null) {
				return;
			}

			// These elements should neither be shown nor hidden based on their
			// containment state
			if (isLastEditorStack(containerElement) || containerElement instanceof MPerspective
					|| containerElement instanceof MPerspectiveStack) {
				return;
			}

			Boolean toBeRendered = (Boolean) event.getProperty(UIEvents.EventTags.NEW_VALUE);
			if (toBeRendered) {
				// Bring the container back if one of its children goes visible
				if (!container.isToBeRendered()) {
					container.setToBeRendered(true);
				}
			} else {
				int visCount = modelService.countRenderableChildren(container);

				// Remove stacks with no visible children from the display (but
				// not the
				// model)
				final MElementContainer<MUIElement> theContainer = container;
				if (visCount == 0) {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							if (!isLastEditorStack(theContainer)) {
								theContainer.setToBeRendered(false);
							}
						}
					});
				}
			}
		}
	};

	@PostConstruct
	void init(IEclipseContext context) {
		eventBroker.subscribe(UIEvents.buildTopic(UIEvents.ElementContainer.TOPIC, UIEvents.ElementContainer.CHILDREN),
				childrenHandler);
		eventBroker.subscribe(UIEvents.buildTopic(UIEvents.UIElement.TOPIC, UIEvents.UIElement.TOBERENDERED),
				renderingChangeHandler);
		eventBroker.subscribe(UIEvents.buildTopic(UIEvents.UIElement.TOPIC, UIEvents.UIElement.VISIBLE),
				visibilityChangeHandler);
	}

	@PreDestroy
	void removeListeners() {
		eventBroker.unsubscribe(childrenHandler);
		eventBroker.unsubscribe(renderingChangeHandler);
		eventBroker.unsubscribe(visibilityChangeHandler);
	}

	boolean isLastEditorStack(MUIElement element) {
		return modelService.isLastEditorStack(element);
	}
}
