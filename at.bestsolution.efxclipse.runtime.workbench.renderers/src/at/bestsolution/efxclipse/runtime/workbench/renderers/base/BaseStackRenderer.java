package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.scene.Node;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WStack.WStackItem;
import at.bestsolution.efxclipse.runtime.workbench.rendering.AbstractRenderer;
import at.bestsolution.efxclipse.runtime.workbench.rendering.RendererFactory;

@SuppressWarnings("restriction")
public abstract class BaseStackRenderer<N, I> extends BaseRenderer<MPartStack, WStack<N, I>> {
	// private static final String MAP_ITEM_KEY = "fx.rendering.stackitem";

	@Inject
	RendererFactory factory;
	
	boolean inLazyInit;
	
	@PostConstruct
	void init(IEventBroker eventBroker) {
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_CHILDREN, new EventHandler() {

			@Override
			public void handleEvent(Event event) {
				Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
				if (changedObj instanceof MPartStack) {
					MPartStack parent = (MPartStack) changedObj;
					if (BaseStackRenderer.this == parent.getRenderer()) {
						String eventType = (String) event.getProperty(UIEvents.EventTags.TYPE);
						MUIElement element = (MUIElement) event.getProperty(UIEvents.EventTags.NEW_VALUE);

						if (element instanceof MStackElement) {
							if (UIEvents.EventTypes.ADD.equals(eventType)) {
								handleChildAddition(parent, (MStackElement) element);
							} else if (UIEvents.EventTypes.REMOVE.equals(eventType)) {
								handleChildRemove(parent, (MStackElement) element);
							} else {
								handleChildMove(parent, (MStackElement) element);
							}
						} else {
							System.err.println("ERROR: " + element);
						}
					}
				}
			}
		});
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_SELECTEDELEMENT, new EventHandler() {

			@Override
			public void handleEvent(Event event) {
				Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
				if (changedObj instanceof MPartStack) {
					MPartStack parent = (MPartStack) changedObj;
					if (BaseStackRenderer.this == parent.getRenderer()) {
						String eventType = (String) event.getProperty(UIEvents.EventTags.TYPE);
						if (UIEvents.EventTypes.SET.equals(eventType)) {
							MUIElement newValue = (MUIElement) event.getProperty(UIEvents.EventTags.NEW_VALUE);
							MUIElement oldValue = (MUIElement) event.getProperty(UIEvents.EventTags.OLD_VALUE);
							handleSelectedElement(parent, (MStackElement) oldValue, (MStackElement) newValue);
						}
					}
				}
			}
		});
	}

	@Override
	protected void initWidget(final MPartStack element, final WStack<N, I> widget) {
		super.initWidget(element, widget);
		widget.setMouseSelectedItemCallback(new Callback<WStackItem<I>, Void>() {

			@Override
			public Void call(WStackItem<I> param) {
				if (param.getDomElement() != null) {
					activatationJob((MPart) param.getDomElement(),true);
				}

				return null;
			}
		});
		widget.setKeySelectedItemCallback(new Callback<WStackItem<I>, Void>() {

			@Override
			public Void call(WStackItem<I> param) {
				if (param.getDomElement() != null) {
					activatationJob((MPart) param.getDomElement(),false);
				}

				return null;
			}
		});
		
		widget.registerActivationCallback(new Callback<Boolean, Void>() {
			
			@Override
			public Void call(Boolean param) {
				if( param.booleanValue() && element.getSelectedElement() != null ) {
					activatationJob((MPart) element.getSelectedElement(), true);
				}
				return null;
			}
		});
	}
	
	private void activatationJob(final MPart p, final boolean focus) {
		activate(p, focus);
	}

	@Override
	public void doProcessContent(MPartStack element) {
		WStack<N, I> stack = getWidget(element);
		List<WStackItem<I>> items = new ArrayList<WStackItem<I>>();
		WStackItem<I> initalItem = null;

		for (MStackElement e : element.getChildren()) {
			// Precreate the rendering context for the subitem
			AbstractRenderer<MStackElement, ?> renderer = factory.getRenderer(e);
			if (renderer != null && e.isToBeRendered() ) {
				WStackItem<I> item = createStackItem(stack, e, renderer);
				items.add(item);

				if (e == element.getSelectedElement()) {
					initalItem = item;
				}
			}
		}

		if (!items.isEmpty()) {
			if (initalItem == null || items.size() == 1 || items.get(0) == initalItem) {
				stack.addItems(items);
			} else {
				stack.addItem(initalItem);
				if (items.get(items.size() - 1) == initalItem) {
					stack.addItems(0, items.subList(0, items.size() - 1));
				} else {
					int idx = items.indexOf(initalItem);
					stack.addItems(0, items.subList(0, idx));
					stack.addItems(items.subList(idx + 1, items.size()));
				}

			}
		}

	}

	private WStackItem<I> createStackItem(WStack<N, I> stack, final MStackElement e, AbstractRenderer<MStackElement, ?> renderer) {
		IEclipseContext context = renderer.setupRenderingContext(e);
		WStackItem<I> item = ContextInjectionFactory.make(stack.getStackItemClass(), context);
		item.setDomElement(e);
		item.setInitCallback(new Callback<WStack.WStackItem<I>, Node>() {

			@Override
			public Node call(WStackItem<I> param) {
				inLazyInit = true;
				try {
					WLayoutedWidget<MStackElement> widget = engineCreateWidget(e);
					if (widget != null) {
						return widget.getStaticLayoutNode();
					}
					return null;					
				} finally {
					inLazyInit = false;
				}
			}
		});
		item.setOnCloseCallback(new Callback<WStack.WStackItem<I>, Boolean>() {

			@Override
			public Boolean call(WStackItem<I> param) {
				return ! handleStackItemClose(e, param);
			}
		});

		return item;
	}

	void handleChildAddition(MPartStack parent, MStackElement element) {
		int idx = parent.getChildren().indexOf(element);

		AbstractRenderer<MStackElement, ?> renderer = factory.getRenderer(element);
		WStack<N, I> stack = getWidget(parent);
		WStackItem<I> item = createStackItem(getWidget(parent), element, renderer);

		if (parent.getChildren().size() - 1 == idx) {
			stack.addItems(Collections.singletonList(item));
		} else {
			stack.addItems(idx, Collections.singletonList(item));
		}
	}

	void handleChildRemove(MPartStack parent, MStackElement element) {
		// TODO Implement
	}

	void handleChildMove(MPartStack parent, MStackElement element) {
		// TODO Implement
	}

	void handleSelectedElement(MPartStack parent, MStackElement oldElement, MStackElement newElement) {
		WStack<N, I> stack = getWidget(parent);
		int idx = 0;
		for( WStackItem<I> i : stack.getItems() ) {
			if( i.getDomElement() == newElement ) {
				stack.selectItem(idx);
				break;
			}
			idx++;
		}
	}

	boolean handleStackItemClose(MStackElement e, WStackItem<I> item) {
		MPart part = (MPart) e;
		if( ! part.isCloseable() ) {
			return false;
		}
		
		IEclipseContext partContext = part.getContext();
		IEclipseContext parentContext = getContextForParent(part);
		// a part may not have a context if it hasn't been rendered
		IEclipseContext context = partContext == null ? parentContext : partContext;
		// Allow closes to be 'canceled'
		EPartService partService = (EPartService) context
				.get(EPartService.class.getName());
		if (partService.savePart(part, true)) {
			partService.hidePart(part);
			return true;
		}
		// the user has canceled out of the save operation, so don't close the
		// part
		return false;
		
	}
	
	@Override
	public void childRendered(MPartStack parentElement, MUIElement element) {
		if( inLazyInit || isInContentProcessing() ) {
			return;
		}

		WStack<N, I> stack = getWidget(parentElement);
		for( WStackItem<I> i : stack.getItems() ) {
			if( i.getDomElement() == element ) {
				return;
			}
		}
		
		int idx = getRenderedIndex(parentElement, element);
		AbstractRenderer<MStackElement, ?> renderer = factory.getRenderer(element);
		stack.addItems(idx, Collections.singletonList(createStackItem(stack, (MStackElement)element, renderer)));
	}
	
	@Override
	public void hideChild(MPartStack container, MUIElement changedObj) {
		WStack<N, I> stack = getWidget(container);
		if( stack == null ) {
			return;
		}
		
		WStackItem<I> item = null;
		
		for( WStackItem<I> i : stack.getItems() ) {
			if( i.getDomElement() == changedObj ) {
				item = i;
				break;
			}
		}
		
		if( item != null ) {
			List<WStackItem<I>> l = Collections.singletonList(item);
			stack.removeItems(l); 
		}
	}
}