package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import at.bestsolution.efxclipse.runtime.workbench.base.rendering.RendererFactory;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WSash;

@SuppressWarnings("restriction")
public abstract class BaseSashRenderer<N> extends BaseRenderer<MPartSashContainer, WSash<N>> {
	@Inject
	RendererFactory factory;

	@PostConstruct
	void init(IEventBroker eventBroker) {
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_CHILDREN, new EventHandler() {

			@Override
			public void handleEvent(Event event) {
				Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
				if (changedObj instanceof MPartSashContainer) {
					MPartSashContainer parent = (MPartSashContainer) changedObj;
					if (BaseSashRenderer.this == parent.getRenderer()) {
						String eventType = (String) event.getProperty(UIEvents.EventTags.TYPE);
						
						if (UIEvents.EventTypes.ADD.equals(eventType)) {
							MUIElement element = (MUIElement) event.getProperty(UIEvents.EventTags.NEW_VALUE);
							handleChildAddition(parent, (MPartSashContainerElement) element);
						} else if (UIEvents.EventTypes.REMOVE.equals(eventType)) {
							MUIElement element = (MUIElement) event.getProperty(UIEvents.EventTags.OLD_VALUE);
							handleChildRemove(parent, (MPartSashContainerElement) element);
						}
					}
				}
			}
		});
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_SELECTEDELEMENT, new EventHandler() {

			@Override
			public void handleEvent(Event event) {
				Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
				if (changedObj instanceof MPartSashContainer) {
					MPartSashContainer parent = (MPartSashContainer) changedObj;
					if (BaseSashRenderer.this == parent.getRenderer()) {
						String eventType = (String) event.getProperty(UIEvents.EventTags.TYPE);
						if (UIEvents.EventTypes.SET.equals(eventType)) {
							MUIElement newValue = (MUIElement) event.getProperty(UIEvents.EventTags.NEW_VALUE);
							MUIElement oldValue = (MUIElement) event.getProperty(UIEvents.EventTags.OLD_VALUE);
							handleSelectedElement(parent, (MPartSashContainerElement) oldValue, (MPartSashContainerElement) newValue);
						}
					}
				}
			}
		});
		eventBroker.subscribe(UIEvents.UIElement.TOPIC_VISIBLE, new EventHandler() {

			@Override
			public void handleEvent(Event event) {
				MUIElement changedObj = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);
				if (changedObj.isToBeRendered()) {
					MUIElement parent = changedObj.getParent();
					if (BaseSashRenderer.this == parent.getRenderer()) {
						MPartSashContainer stack = (MPartSashContainer) parent;
						String eventType = (String) event.getProperty(UIEvents.EventTags.TYPE);
						if (UIEvents.EventTypes.SET.equals(eventType)) {
							Boolean newValue = (Boolean) event.getProperty(UIEvents.EventTags.NEW_VALUE);
							if (newValue.booleanValue()) {
								// TODO Is childRendered not dangerous to call
								// here??
								childRendered(stack, changedObj);
							} else {
								hideChild(stack, changedObj);
							}
						}
					}
				}
			}
		});
	}

	@Override
	public void doProcessContent(MPartSashContainer element) {
		WSash<N> sash = getWidget(element);

		List<Double> layoutData = new ArrayList<Double>();
		double total = 0;

		for (MPartSashContainerElement e : element.getChildren()) {
			WLayoutedWidget<MPartSashContainerElement> widget = engineCreateWidget(e);
			if (widget != null) {
				sash.addItem(widget);
				double v;
				if (e.getContainerData() != null) {
					v = Double.parseDouble(e.getContainerData());
					if (v > 0.9) {
						// Calc back to a potential percentage
						v = v / Math.pow(10, e.getContainerData().length());
					}
				} else {
					v = 0.1;
				}
				layoutData.add(v);
				total += v;
			}
		}

		if (!layoutData.isEmpty() && layoutData.size() > 1) {
			double[] deviders = new double[layoutData.size() - 1];
			for (int i = 0; i < layoutData.size() - 1; i++) {
				deviders[i] = (i == 0 ? 0 : deviders[i - 1]) + (layoutData.get(i) / total);
			}

			sash.setSplits(deviders);
		}
	}

	@Override
	public void childRendered(MPartSashContainer parentElement, MUIElement element) {
		if (isInContentProcessing()) {
			return;
		}

		List<Double> layoutData = new ArrayList<Double>();
		double total = 0;

		for (MPartSashContainerElement e : parentElement.getChildren()) {
			double v;
			if (e.isToBeRendered()) {
				if (e.getContainerData() != null) {
					v = Double.parseDouble(e.getContainerData());
					if (v > 0.9) {
						// Calc back to a potential percentage
						v = v / Math.pow(10, e.getContainerData().length());
					}
				} else {
					v = 0.1;
				}
				layoutData.add(v);
				total += v;
			}
		}

		int idx = getRenderedIndex(parentElement, element);
		WSash<N> sash = getWidget(parentElement);

		@SuppressWarnings("unchecked")
		List<WLayoutedWidget<MPartSashContainerElement>> l = Collections.singletonList((WLayoutedWidget<MPartSashContainerElement>) element.getWidget());
		sash.addItems(idx, l);

		if (!layoutData.isEmpty() && layoutData.size() > 1) {
			double[] deviders = new double[layoutData.size() - 1];
			for (int i = 0; i < layoutData.size() - 1; i++) {
				deviders[i] = (i == 0 ? 0 : deviders[i - 1]) + (layoutData.get(i) / total);
			}

			sash.setSplits(deviders);
		}
	}

	@Override
	public void hideChild(MPartSashContainer container, MUIElement changedObj) {
		WSash<N> sash = getWidget(container);

		if (sash == null) {
			return;
		}

		@SuppressWarnings("unchecked")
		WLayoutedWidget<MPartSashContainerElement> widget = (WLayoutedWidget<MPartSashContainerElement>) changedObj.getWidget();
		if (widget != null) {
			sash.removeItem(widget);
		}
	}

	void handleChildAddition(MPartSashContainer parent, MPartSashContainerElement element) {
		if (element.isToBeRendered() && element.isVisible()) {
			if( element.getWidget() == null ) {
				engineCreateWidget(element);	
			} else {
				childRendered(parent, element);
			}
		}
	}

	void handleChildRemove(MPartSashContainer parent, MPartSashContainerElement element) {
		if (element.isToBeRendered() && element.isVisible() && element.getWidget() != null) {
			hideChild(parent, element);
		}
	}

	void handleSelectedElement(MPartSashContainer parent, MPartSashContainerElement oldElement, MPartSashContainerElement newElement) {
		// TODO Implement (is this needed the SWT renderes don't care about
		// this!)
	}
}
