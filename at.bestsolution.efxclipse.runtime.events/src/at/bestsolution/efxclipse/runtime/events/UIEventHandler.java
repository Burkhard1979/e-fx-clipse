package at.bestsolution.efxclipse.runtime.events;

import org.eclipse.e4.ui.di.UISynchronize;

import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

/**
 * The helper will properly place UI-aware consumers on the main thread.
 */
@SuppressWarnings("restriction")
public class UIEventHandler implements EventHandler {
	
	final private EventHandler eventHandler;
	final private UISynchronize uiSync;
	
	public UIEventHandler(EventHandler eventHandler, UISynchronize uiSync) {
		this.eventHandler = eventHandler;
		this.uiSync = uiSync;
	}
	
	/* (non-Javadoc)
	 * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
	 */
	public void handleEvent(final Event event) {
		if (uiSync == null)
			eventHandler.handleEvent(event);
		else {
			uiSync.syncExec(new Runnable() {
				
				public void run() {
					eventHandler.handleEvent(event);
				}
			});
		}
	}
}
