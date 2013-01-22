/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.service.resolver.PlatformAdmin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import com.google.inject.Provider;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension.CssProperty;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;

/**
 * @author christoph
 *
 */
public interface CssDialectExtensionRegistry {

	public abstract void addExtension(CssDialectExtension extension);

	public abstract void removeExtension(CssDialectExtension extension);

	public abstract List<CssProperty> getAllProperties(URI uri);

	public abstract List<CssProperty> getPropertiesForSelector(URI uri,
			selector selector);

	public abstract List<Property> getProperties(URI uri);

	public abstract List<CssProperty> getValuesForProperty(URI uri,
			String propertyName);

	/**
	 * @param o
	 * @return
	 */
	public abstract String getDocumentation(URI uri, EObject o);

	/**
	 * @param uri
	 * @param o
	 * @return
	 */
	public abstract String getDocHead(URI uri, EObject o);

	public abstract List<Proposal> findProposals(URI uri, String element,
			String property, List<CssTok> prefixToks, String prefix);

	public abstract List<ValidationResult> validateProperty(URI uri, String element,
			String attribute, List<CssTok> tokens);

	
	public static class OsgiCssDialectExtensionRegistryProvider implements Provider<CssDialectExtensionRegistry> {

		private CssDialectExtensionRegistry instance = null;
		
		@Override
		public CssDialectExtensionRegistry get() {
			if (instance == null) {
				BundleContext context = FrameworkUtil.getBundle(CssDialectExtension.class).getBundleContext();
				ServiceReference<CssDialectExtensionRegistry> ref = context.getServiceReference(CssDialectExtensionRegistry.class);
				instance = context.getService(ref);
			}
			return instance;
		}
		
	}
}