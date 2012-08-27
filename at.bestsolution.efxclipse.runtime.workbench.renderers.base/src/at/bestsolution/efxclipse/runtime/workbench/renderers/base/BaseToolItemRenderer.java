package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WToolItem;

@SuppressWarnings("restriction")
public abstract class BaseToolItemRenderer<N> extends BaseItemRenderer<MToolItem, WToolItem<N>> {
	@Inject
	UISynchronize sync;
	
	@Override
	protected void initWidget(final MToolItem element, final WToolItem<N> widget) {
		super.initWidget(element, widget);
		
		final IEclipseContext modelContext = getModelContext(element);
		widget.setOnActionCallback(new Runnable() {
			
			@Override
			public void run() {
				executeAction(element,modelContext.getActiveLeaf());
			}
		});
	}
	
	@Override
	public void checkEnablement(final MToolItem toolbarElement) {
		@SuppressWarnings("unchecked")
		final WToolItem<N> widget = (WToolItem<N>) toolbarElement.getWidget();

		// can we call canExecute in the none ui thread????
		sync.syncExec(new Runnable() {
			
			@Override
			public void run() {
				try {
					widget.setHandled(canExecute(toolbarElement, getModelContext(toolbarElement)));	
				} catch(Throwable t) {
					//TODO Log it
					t.printStackTrace();
				}
				
			}
		});
		
	}
	
	@Override
	public void doProcessContent(MToolItem element) {
		if( element.getMenu() != null ) {
			engineCreateWidget(element.getMenu());
		}
	}

	@Override
	public void childRendered(MToolItem parentElement, MUIElement element) {
		
	}
	
	@Override
	public void hideChild(MToolItem container, MUIElement changedObj) {
		
	}

}
