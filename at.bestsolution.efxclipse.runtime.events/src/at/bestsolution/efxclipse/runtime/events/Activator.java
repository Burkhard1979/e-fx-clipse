package at.bestsolution.efxclipse.runtime.events;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.event.EventAdmin;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private static ServiceTracker<EventAdmin,EventAdmin> eventAdminTracker;

	/*
	 * Return the debug options service, if available.
	 */
	public static EventAdmin getEventAdmin() {
		if (eventAdminTracker == null) {
			eventAdminTracker = new ServiceTracker<EventAdmin,EventAdmin>(context, EventAdmin.class.getName(), null);
			eventAdminTracker.open();
		}
		return eventAdminTracker.getService();
	}

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		
		if (eventAdminTracker != null) {
			eventAdminTracker.close();
			eventAdminTracker = null;
		}
	}

}
