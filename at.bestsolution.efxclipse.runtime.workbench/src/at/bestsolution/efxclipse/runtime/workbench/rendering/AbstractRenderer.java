package at.bestsolution.efxclipse.runtime.workbench.rendering;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;

@SuppressWarnings("restriction")
public abstract class AbstractRenderer<M extends MUIElement, C> {
		public abstract C createWidget(M element);
		
		public abstract IEclipseContext setupRenderingContext(M element);
		
		public abstract void bindWidget(M element, C widget);
		
		public abstract void processContent(M element);
		
		public abstract void postProcess(M element);
		
		public abstract void childRendered(M parentElement, MUIElement element);
		
		public abstract void hideChild(M container, MUIElement changedObj);
		
		public abstract void destroyWidget(M element);
		
		public abstract IEclipseContext getModelContext(M part);
		
		@SuppressWarnings("unchecked")
		public C getWidget(M element) {
			return (C) element.getWidget();
		}		
		
}