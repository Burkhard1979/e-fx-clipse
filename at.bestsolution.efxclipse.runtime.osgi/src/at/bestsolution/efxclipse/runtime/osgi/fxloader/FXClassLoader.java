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
package at.bestsolution.efxclipse.runtime.osgi.fxloader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.osgi.baseadaptor.BaseAdaptor;
import org.eclipse.osgi.baseadaptor.BaseData;
import org.eclipse.osgi.baseadaptor.bundlefile.BundleEntry;
import org.eclipse.osgi.baseadaptor.hooks.AdaptorHook;
import org.eclipse.osgi.baseadaptor.hooks.ClassLoadingHook;
import org.eclipse.osgi.baseadaptor.loader.BaseClassLoader;
import org.eclipse.osgi.baseadaptor.loader.ClasspathEntry;
import org.eclipse.osgi.baseadaptor.loader.ClasspathManager;
import org.eclipse.osgi.framework.adaptor.BundleProtectionDomain;
import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegate;
import org.eclipse.osgi.framework.log.FrameworkLog;
import org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.osgi.service.urlconversion.URLConverter;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.packageadmin.PackageAdmin;
import org.osgi.util.tracker.ServiceTracker;

@SuppressWarnings("deprecation")
public class FXClassLoader implements ClassLoadingHook, AdaptorHook {

	private ServiceTracker<PackageAdmin, PackageAdmin> paTracker;

	private ServiceTracker<Location,Location> instanceLocationTracker = null;

	private ServiceTracker<?,?> preferenceServiceTracker = null;

	private ServiceTracker<Location, Location> installLocation = null;

	private BundleContext context = null;
	
	/*
	 * Remember the classloader for use in post look ups because of native classloading by javafx' native code
	 * See http://javafx-jira.kenai.com/browse/RT-20883
	 */
	static MyBundleClassLoader LOADER;
	
	@Override
	public byte[] processClass(String name, byte[] classbytes, ClasspathEntry classpathEntry, BundleEntry entry, ClasspathManager manager) {
		return null;
	}

	@Override
	public boolean addClassPathEntry(ArrayList<ClasspathEntry> cpEntries, String cp, ClasspathManager hostmanager, BaseData sourcedata, ProtectionDomain sourcedomain) {
		return false;
	}

	@Override
	public String findLibrary(BaseData data, String libName) {
		return null;
	}

	@Override
	public ClassLoader getBundleClassLoaderParent() {
		return null;
	}
	
	@Override
	public BaseClassLoader createClassLoader(ClassLoader parent, final ClassLoaderDelegate delegate, BundleProtectionDomain domain, BaseData data, String[] bundleclasspath) {
		if (data.getBundle().getSymbolicName().equals("at.bestsolution.efxclipse.runtime.javafx")) {
			try {
				MyBundleClassLoader cl = new MyBundleClassLoader(getPackageAdmin(), getPreferencesService(), parent, delegate, domain, data, bundleclasspath, context);
				LOADER = cl;
				return cl;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void initializedClassLoader(BaseClassLoader baseClassLoader, BaseData data) {
	}

	static class ReflectivePreferenceService {
		private ServiceTracker<?, ?> tracker;

		private static final String SCOPE = "instance";

		public ReflectivePreferenceService(ServiceTracker<?, ?> tracker) {
			this.tracker = tracker;
		}

		public String getInstanceValue(String qualifier, String key, String defaultValue) {
			// IEclipsePreferences pref =
			// IPreferencesService.getDefault().getRootNode().node(getName()).node(qualifier)
			// pref.get(key,defaultValue)

			try {
				Object preferenceService = tracker.getService();
				if (preferenceService != null) {
					Method m = preferenceService.getClass().getMethod("getRootNode");
					Object rootNode = m.invoke(preferenceService);
					if (rootNode == null) {
						return null;
					}
					m = rootNode.getClass().getMethod("node", String.class);
					Object instanceNode = m.invoke(rootNode, SCOPE);

					if (instanceNode == null) {
						return null;
					}
					m = instanceNode.getClass().getMethod("node", String.class);
					Object pref = m.invoke(instanceNode, qualifier);

					if (pref == null) {
						return null;
					}
					m = pref.getClass().getMethod("get", String.class, String.class);
					return (String) m.invoke(pref, key, defaultValue);
				}
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Throwable e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			return null;
		}
	}

	static class MyBundleClassLoader extends DefaultClassLoader {
		private URLClassLoader fxClassLoader;

		public MyBundleClassLoader(PackageAdmin admin, ReflectivePreferenceService prefService, ClassLoader parent, ClassLoaderDelegate delegate, ProtectionDomain domain, BaseData bundledata, String[] classpath, BundleContext context) throws Exception {
			super(parent, delegate, domain, bundledata, classpath);

			// Trying to locate swt bundle so that if the swt integration is
			// used
			// we can load those
			Bundle[] bundles = admin.getBundles("org.eclipse.swt", null);

			if (bundles != null) {
				for (int i = 0; i < bundles.length; i++) {
					if ((bundles[i].getState() & Bundle.INSTALLED) == 0) {
						// Ensure the bundle is started else we are unable to
						// extract the
						// classloader
						if ((bundles[i].getState() & Bundle.ACTIVE) != 0) {
							bundles[i].start();
						}
						parent = bundles[i].adapt(BundleWiring.class).getClassLoader();
						break;
					}
				}
			}

			fxClassLoader = createClassloader(parent, prefService, admin, bundledata, context);
		}

		private static URLClassLoader createJREBundledClassloader(ClassLoader parent) {
			if( FXClassLoadingConfigurator.DEBUG ) {
				System.err.println("MyBundleClassLoader#createJREBundledClassloader - Started");
			}
			
			try {
				File javaHome; 
				try {
					javaHome= new File (System.getProperty("java.home")).getCanonicalFile(); //$NON-NLS-1$
				} catch (IOException e) {
					throw new IllegalStateException("Unable to locate java home", e);
				}
				if (!javaHome.exists()) {
					throw new IllegalStateException("The java home '"+javaHome.getAbsolutePath()+"' does not exits");
				}
				
				// Java 8 and maybe one day Java 7
				File jarFile = new File(new File(new File(javaHome.getAbsolutePath(),"lib"),"ext"),"jfxrt.jar");
				if( FXClassLoadingConfigurator.DEBUG ) {
					System.err.println("MyBundleClassLoader#createJREBundledClassloader - Assumed location (Java 8/Java 7): " + jarFile.getAbsolutePath());
				}
				
				if( jarFile.exists() ) {
					URL url = jarFile.getCanonicalFile().toURI().toURL();
					return new URLClassLoader(new URL[] { url }, parent);
				} 
				
				// Java 7
				jarFile = new File(new File(javaHome.getAbsolutePath(),"lib"),"jfxrt.jar");
				if( FXClassLoadingConfigurator.DEBUG ) {
					System.err.println("MyBundleClassLoader#createJREBundledClassloader - Assumed location (Java 7): " + jarFile.getAbsolutePath());
				}
				
				if( jarFile.exists() ) {
					URL url = jarFile.getCanonicalFile().toURI().toURL();
					return new URLClassLoader(new URL[] { url }, parent);
				} else {
					if( FXClassLoadingConfigurator.DEBUG ) {
						System.err.println("MyBundleClassLoader#createJREBundledClassloader - File does not exist.");
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				if( FXClassLoadingConfigurator.DEBUG ) {
					System.err.println("MyBundleClassLoader#createJREBundledClassloader - Ended");
				}
			}
			
			return null;
		}

		private static URLClassLoader createClassloader(ClassLoader parent, ReflectivePreferenceService prefService, PackageAdmin admin, BaseData bundledata, BundleContext context) throws Exception {
			URLClassLoader loader;
			
			{
				if( FXClassLoadingConfigurator.DEBUG ) {
					System.err.println("MyBundleClassLoader#createClassloader - checking for JRE bundled javafx");
				}
				
				loader = createJREBundledClassloader(parent);
			}
			
			if (loader != null) {
				return loader;
			}
			
			throw new IllegalStateException("You need to run at least Java7u6");
		}

		@Override
		public Class<?> findLocalClass(String classname) throws ClassNotFoundException {
			try {
				Class<?> cl = fxClassLoader.loadClass(classname);
				return cl;
			} catch (ClassNotFoundException e) {
				return super.findLocalClass(classname);
			} catch (NoClassDefFoundError e) {
				return super.findLocalClass(classname);
			}
		}

		@Override
		public URL findLocalResource(String resource) {
			try {
				URL url = fxClassLoader.findResource(resource);
				if (url == null) {
					url = super.findLocalResource(resource);
				}
				return url;
			} catch (Throwable e) {
				return super.findLocalResource(resource);
			}
		}

		@Override
		protected Enumeration<URL> findResources(String name) throws IOException {
			try {
				List<URL> tmp = new ArrayList<URL>();

				Enumeration<URL> rv = fxClassLoader.findResources(name);
				while (rv.hasMoreElements()) {
					tmp.add(rv.nextElement());
				}

				rv = super.findResources(name);
				while (rv.hasMoreElements()) {
					tmp.add(rv.nextElement());
				}

				return Collections.enumeration(tmp);
			} catch (Throwable e) {
				return super.findResources(name);
			}
		}
	}

	@Override
	public void initialize(BaseAdaptor adaptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void frameworkStart(BundleContext context) throws BundleException {
		this.context = context;

		paTracker = new ServiceTracker<PackageAdmin, PackageAdmin>(context, PackageAdmin.class.getName(), null);
		paTracker.open();

		try {
			Filter filter = context.createFilter(Location.INSTANCE_FILTER);
			instanceLocationTracker = new ServiceTracker<Location,Location>(context, filter, null);
			instanceLocationTracker.open();
		} catch (InvalidSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Filter filter = context.createFilter(Location.INSTALL_FILTER);
			installLocation = new ServiceTracker<Location,Location>(context, filter, null);
			installLocation.open();
		} catch (InvalidSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		preferenceServiceTracker = new ServiceTracker<Object,Object>(context, "org.eclipse.core.runtime.preferences.IPreferencesService", null);
		preferenceServiceTracker.open();
	}

	@Override
	public void frameworkStop(BundleContext context) throws BundleException {
		paTracker.close();
		paTracker = null;

		instanceLocationTracker.close();
		instanceLocationTracker = null;

		installLocation.close();
		installLocation = null;

		preferenceServiceTracker.close();
		preferenceServiceTracker = null;
	}

	public Bundle ensureStarted(String symbolicName) {
		Bundle[] bundles = getPackageAdmin().getBundles(symbolicName, null);

		if (bundles != null) {
			for (int i = 0; i < bundles.length; i++) {
				if ((bundles[i].getState() & Bundle.INSTALLED) == 0) {
					// Ensure the bundle is started else we are unable to
					// extract the
					// classloader
					if ((bundles[i].getState() & Bundle.ACTIVE) != 0) {
						try {
							bundles[i].start();
						} catch (BundleException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							return null;
						}
					}
					return bundles[i];
				}
			}
		}

		return null;
	}

	private PackageAdmin getPackageAdmin() {
		ServiceTracker<PackageAdmin, PackageAdmin> tracker = paTracker;
		if (tracker == null)
			return null;
		return tracker.getService();
	}

	public Location getInstanceLocation() {
		if (instanceLocationTracker != null)
			return (Location) instanceLocationTracker.getService();
		return null;
	}

	public ReflectivePreferenceService getPreferencesService() {
		if (preferenceServiceTracker != null) {
			ensureStarted("org.eclipse.equinox.preferences");
			return new ReflectivePreferenceService(preferenceServiceTracker);
		}
		return null;
	}

	@Override
	public void frameworkStopping(BundleContext context) {

	}

	@Override
	public void addProperties(Properties properties) {

	}

	@Override
	public URLConnection mapLocationToURLConnection(String location) throws IOException {
		return null;
	}

	@Override
	public void handleRuntimeError(Throwable error) {

	}

	@Override
	public FrameworkLog createFrameworkLog() {
		return null;
	}
}
