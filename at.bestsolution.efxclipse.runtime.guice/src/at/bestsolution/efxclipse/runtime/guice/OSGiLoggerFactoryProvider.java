package at.bestsolution.efxclipse.runtime.guice;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.efxclipse.runtime.core.log.LoggerFactory;

import com.google.inject.Provider;

public class OSGiLoggerFactoryProvider implements Provider<LoggerFactory> {

	private LoggerFactory instance = null;

	@Override
	public LoggerFactory get() {
		if (instance == null) {
			BundleContext context = FrameworkUtil.getBundle(getClass()).getBundleContext();
			ServiceReference<LoggerFactory> ref = context.getServiceReference(LoggerFactory.class);
			instance = context.getService(ref);
		}
		return instance;
	}

}