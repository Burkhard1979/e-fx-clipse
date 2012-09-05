/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.jemmy;

import java.util.Collection;

import org.jemmy.input.AWTRobotInputFactory;
import org.junit.BeforeClass;
import org.osgi.framework.ServiceReference;
import org.osgi.service.application.ApplicationDescriptor;
import org.osgi.service.application.ApplicationException;

import at.bestsolution.efxclipse.runtime.jemmy.internal.Activator;

public class OSGiJemmyBootstrapTestCase {

	private static final String osName = System.getProperty("os.name").toLowerCase();;

	static {
		if (osName.contains("mac os")) {
			AWTRobotInputFactory.runInOtherJVM(true);
		}
	}

	@BeforeClass
	public static void setUp() {
		final String applicationId = System.getProperty("osgi.jemmyapp.id");
		try {
			Collection<ServiceReference<ApplicationDescriptor>> col = Activator.getContext().getServiceReferences(ApplicationDescriptor.class, "(service.pid=" + applicationId + ")");

			if (col.isEmpty()) {
				System.err.println("There's no application with ID '" + applicationId + "' known.");
				throw new IllegalStateException("There's no application with ID '" + applicationId + "' known.");
			} else if (col.size() > 1) {
				System.err.println("There are more than 1 application with ID '" + applicationId + "' known.");
				throw new IllegalStateException("There are more than 1 application with ID '" + applicationId + "' known.");
			} else {
				ServiceReference<ApplicationDescriptor> ref = col.iterator().next();
				final ApplicationDescriptor desc = Activator.getContext().getService(ref);
				new Thread() {
					public void run() {
						try {
							desc.launch(null);
						} catch (ApplicationException e) {
							System.err.println("Failed to launch application '" + applicationId + "'");
							e.printStackTrace();
						}
					}
				}.start();

				// FIXME Need to find a better way to wait
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
}
