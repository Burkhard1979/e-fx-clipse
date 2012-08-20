package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WToolBar;

@SuppressWarnings("restriction")
public abstract class BaseToolBarRenderer<N> extends BaseRenderer<MToolBar, WToolBar<N>> {
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
							if( e.getRenderer() instanceof ToolElementEnabledCheck<?> ) {
								final MToolBarElement tmp = e;
								final ToolElementEnabledCheck<MToolBarElement> r = (ToolElementEnabledCheck<MToolBarElement>) tmp.getRenderer();
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
	
	@Override
	public void doProcessContent(MToolBar element) {
		WToolBar<N> toolbar = getWidget(element);
		for( MToolBarElement item : element.getChildren() ) {
			WLayoutedWidget<MToolBarElement> itemWidget = engineCreateWidget(item);
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
	}

	@Override
	public void hideChild(MToolBar container, MUIElement changedObj) {
		synchronized (widgets) {
			widgets.remove(changedObj);	
		}
	}
}
