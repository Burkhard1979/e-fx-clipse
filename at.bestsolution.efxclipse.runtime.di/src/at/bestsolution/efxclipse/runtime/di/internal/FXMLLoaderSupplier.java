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
package at.bestsolution.efxclipse.runtime.di.internal;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.suppliers.ExtendedObjectSupplier;
import org.eclipse.e4.core.di.suppliers.IObjectDescriptor;
import org.eclipse.e4.core.di.suppliers.IRequestor;
import org.eclipse.e4.core.internal.contexts.ContextObjectSupplier;
import org.eclipse.e4.core.internal.di.Requestor;
import org.osgi.framework.FrameworkUtil;

import at.bestsolution.efxclipse.runtime.di.FXMLBuilder;
import at.bestsolution.efxclipse.runtime.di.FXMLLoaderFactory;
import at.bestsolution.efxclipse.runtime.di.InjectingFXMLLoader;

@SuppressWarnings("restriction")
public class FXMLLoaderSupplier extends ExtendedObjectSupplier {

	@Override
	public Object get(IObjectDescriptor descriptor, IRequestor requestor, boolean track, boolean group) {
		Requestor req = (Requestor) requestor;
		ContextObjectSupplier sub = (ContextObjectSupplier) req
				.getPrimarySupplier();
		final IEclipseContext context = sub.getContext();
		final Class<?> requestingClass = requestor.getRequestingObject().getClass();
		
		return new FXMLLoaderFactory() {
			
			public <N> FXMLBuilder<N> loadRequestorRelative(String relativePath) {
				return InjectingFXMLLoader.create(context, requestingClass, relativePath);
			}
			
			public <N> FXMLBuilder<N> loadBundleRelative(String relativePath) {
				return InjectingFXMLLoader.create(context, FrameworkUtil.getBundle(requestingClass), relativePath);
			}
		};
	}

}
