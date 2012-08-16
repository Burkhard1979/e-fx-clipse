package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import at.bestsolution.efxclipse.runtime.workbench.base.rendering.AbstractRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WPropertyChangeHandler;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WWidget;

@SuppressWarnings("restriction")
public abstract class BaseRenderer<M extends MUIElement, W extends WWidget<M>> extends AbstractRenderer<M, W> {
	private static final String RENDERING_CONTEXT_KEY = "fx.rendering.context";
	
	public static final String CONTEXT_DOM_ELEMENT = "fx.rendering.domElement";
	
	public static final String ATTRIBUTE_localizedLabel = "localizedLabel";
	public static final String ATTRIBUTE_localizedTooltip = "localizedTooltip";
	
	@Inject
	IEclipseContext _context; // The rendering context
	
	@Inject
	EModelService modelService;
	
	boolean inContentProcessing;
	
	boolean inContextModification;
	
	boolean inUIModification;
	
	private Map<String,EAttribute> attributeMap = new HashMap<String, EAttribute>();
	
	@Override
	public final W createWidget(final M element) {
		final IEclipseContext context = setupRenderingContext(element);
		
		W widget =  ContextInjectionFactory.make(getWidgetClass(), context);
		widget.setPropertyChangeHandler(new WPropertyChangeHandler<W>() {

			@Override
			public void propertyObjectChanged(WPropertyChangeEvent<W> event) {
				// There is already a modification in process
				if( inUIModification || inContextModification ) {
					return;
				}
				
				try {
					inUIModification = true;
					
					EAttribute attribute = attributeMap.get(event.propertyname);
					EObject eo = (EObject)element;
					
					if( attribute == null ) {
						EStructuralFeature f = eo.eClass().getEStructuralFeature(event.propertyname);
						if( f instanceof EAttribute ) {
							attribute = (EAttribute) f;
							attributeMap.put(event.propertyname, attribute);
						}
					}
					
					if( attribute != null ) {
						if( attribute.getEType().getInstanceClass() == int.class ) {
							eo.eSet(attribute, ((Number)event.newValue).intValue());
						} else {
							eo.eSet(attribute, event.newValue);
						}
					}
				} finally {
					inUIModification = false;
				}
			}
			
		});
		initWidget(element, widget);
		
		return widget;
	}
	
	public final IEclipseContext setupRenderingContext(M element) {
		IEclipseContext context = (IEclipseContext) element.getTransientData().get(RENDERING_CONTEXT_KEY);
		if( context == null ) {
			context = _context.createChild("Element RenderingContext");
			element.getTransientData().put(RENDERING_CONTEXT_KEY, context);
			context.set(CONTEXT_DOM_ELEMENT, element);
			initRenderingContext(element, context);
			
			try {
				inContextModification = true;
				EObject eo = (EObject) element;
				for( EAttribute e : eo.eClass().getEAllAttributes() ) {
					context.set(e.getName(), eo.eGet(e));
				}
				
				// Localized Label/Tooltip treatment
				if( element instanceof MUILabel ) {
					MUILabel l = (MUILabel) element;
					context.set(ATTRIBUTE_localizedLabel, l.getLocalizedLabel());
					context.set(ATTRIBUTE_localizedTooltip, l.getLocalizedTooltip());
				}
			} finally {
				inContextModification = false;
			}
		}
		return context;
	}
	
	protected void registerEventListener(IEventBroker broker, String topic) {
		broker.subscribe(topic, new EventHandler() {
			
			@Override
			public void handleEvent(Event event) {
				// There is already a modification in process
				if( inContextModification ) {
					return;
				}
				
				try {
					inContextModification = true;
					Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
					if( changedObj instanceof MUIElement ) {
						MUIElement e = (MUIElement) changedObj;
						if( e.getRenderer() == BaseRenderer.this ) {
							IEclipseContext ctx = (IEclipseContext) e.getTransientData().get(RENDERING_CONTEXT_KEY);
							if( ctx != null ) {
								ctx.set(event.getProperty(UIEvents.EventTags.ATTNAME).toString(), event.getProperty(UIEvents.EventTags.NEW_VALUE));
								if( e instanceof MUILabel ) {
									MUILabel l = (MUILabel) e;
									if( event.getProperty(UIEvents.EventTags.ATTNAME).equals(UIEvents.UILabel.LABEL) ) {
										ctx.set(ATTRIBUTE_localizedLabel, l.getLocalizedLabel());	
									} else if( event.getProperty(UIEvents.EventTags.ATTNAME).equals(UIEvents.UILabel.TOOLTIP) ) {
										ctx.set(ATTRIBUTE_localizedTooltip, l.getLocalizedTooltip());	
									}									
								}
							}
						}
					}
				} finally {
					inContextModification = false;
				}
			}
		});
	}
	
	protected void initRenderingContext(M element, IEclipseContext context) {
		
	}
	
	protected void initWidget(M element, W widget) {
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void destroyWidget(M element) {
		if( element.getTransientData().containsKey(RENDERING_CONTEXT_KEY) ) {
			unbindWidget(element, (W) element.getWidget());
			
			IEclipseContext ctx = (IEclipseContext) element.getTransientData().get(RENDERING_CONTEXT_KEY);
			ctx.dispose();
			element.getTransientData().remove(RENDERING_CONTEXT_KEY);
			
		}
	}
	
	private void unbindWidget(M me, W widget) {
		widget.setDomElement(null);
//		widget.removeStyleClasses(me.getTags());
//		if( me.getElementId() != null ) {
//			widget.setStyleId(me.getElementId());
//		}
		me.setWidget(null);
	}
	
	@Override
	public void bindWidget(M me, W widget) {
		widget.setDomElement(me);
		widget.addStyleClasses(me.getTags());
		if( me.getElementId() != null ) {
			widget.setStyleId(me.getElementId());
		}
		me.setWidget(widget);
	}

	@Override
	public void postProcess(M element) {
	}
	
	protected IPresentationEngine getPresentationEngine() {
		return _context.get(IPresentationEngine.class);
	}
	
	protected abstract Class<? extends W> getWidgetClass();
	
	@SuppressWarnings("unchecked")
	protected <LW extends WWidget<PM>, PM extends MUIElement> LW engineCreateWidget(PM pm) {
		return (LW) getPresentationEngine().createGui(pm);
	}
	
	protected IEclipseContext getRenderingContext(M element) {
		return (IEclipseContext) element.getTransientData().get(RENDERING_CONTEXT_KEY);
	}
	
	protected IEclipseContext getContextForParent(MUIElement element) {
		return modelService.getContainingContext(element);
	}

	public IEclipseContext getModelContext(MUIElement part) { 
		if (part instanceof MContext) {
			return ((MContext) part).getContext();
		}
		return getContextForParent(part);
	}

	protected void activate(MPart element, boolean requiresFocus) {
		IEclipseContext curContext = getModelContext(element);
		if (curContext != null) {
			EPartService ps = (EPartService) curContext.get(EPartService.class
					.getName());
			if (ps != null)
				ps.activate(element, requiresFocus);
		}
	}
	
	@Override
	public final void processContent(M element) {
		try {
			inContentProcessing = true;
			doProcessContent(element);
		} finally {
			inContentProcessing = false;
		}
	}
	
	protected boolean isInContentProcessing() {
		return inContentProcessing;
	}
	
	protected int getRenderedIndex(MUIElement parent, MUIElement element) {
		EObject eElement = (EObject) element;
		
		EObject container = eElement.eContainer();
		@SuppressWarnings("unchecked")
		List<MUIElement> list = (List<MUIElement>) container.eGet(eElement.eContainmentFeature());
		int idx = 0;
		for( MUIElement u : list ) {
			if( u.isToBeRendered() && u.isVisible() ) {
				if( u == element ) {
					return idx;
				}
				idx++;
			}
		}
		return -1;
	}
	
	protected abstract void doProcessContent(M element);
}
