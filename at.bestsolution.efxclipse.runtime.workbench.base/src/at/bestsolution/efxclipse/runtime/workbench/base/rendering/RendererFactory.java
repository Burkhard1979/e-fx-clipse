package at.bestsolution.efxclipse.runtime.workbench.base.rendering;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

@SuppressWarnings("restriction")
public interface RendererFactory {
		public <R extends AbstractRenderer<?,?>> R getRenderer(MUIElement modelObject);
	}