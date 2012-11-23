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
package at.bestsolution.efxclipse.runtime.core.internal;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.suppliers.ExtendedObjectSupplier;
import org.eclipse.e4.core.di.suppliers.IObjectDescriptor;
import org.eclipse.e4.core.di.suppliers.IRequestor;
import org.eclipse.e4.core.internal.contexts.ContextObjectSupplier;
import org.eclipse.e4.core.internal.di.Requestor;

import at.bestsolution.efxclipse.runtime.core.Log;
import at.bestsolution.efxclipse.runtime.core.LoggerFactory;

@SuppressWarnings("restriction")
public class LoggerSupplier extends ExtendedObjectSupplier {

	@Override
	public Object get(IObjectDescriptor descriptor, IRequestor requestor, boolean track, boolean group) {
		Requestor req = (Requestor) requestor;
		ContextObjectSupplier sub = (ContextObjectSupplier) req
				.getPrimarySupplier();
		final IEclipseContext context = sub.getContext();

		String loggerName = descriptor.getQualifier(Log.class).name(); 
		
		if( loggerName == null || loggerName.isEmpty() ) {
			loggerName = requestor.getRequestingObjectClass().getName();
		}
		
		return context.get(LoggerFactory.class).createLogger(loggerName);
	}

}