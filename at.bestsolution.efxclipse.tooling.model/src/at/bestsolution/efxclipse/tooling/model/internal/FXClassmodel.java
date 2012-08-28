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
package at.bestsolution.efxclipse.tooling.model.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;

import at.bestsolution.efxclipse.tooling.model.IFXClass;
import at.bestsolution.efxclipse.tooling.model.IFXClassmodel;
import at.bestsolution.efxclipse.tooling.model.IFXCtrlClass;

public class FXClassmodel implements IFXClassmodel {
	private Map<String, FXClass> fxClassCache = new HashMap<String, FXClass>();
	private Map<String, FXCtrlClass> fxCtrlClassCache = new HashMap<String, FXCtrlClass>();
	
	public IFXClass findClass(IJavaProject javaProject, IType type) {
		IFXClass rv = fxClassCache.get(type.getFullyQualifiedName());
		
		if( rv == null ) {
			FXClass c = new FXClass(javaProject, type);
			fxClassCache.put(c.getFQN(), c);
			rv = c;
		}
		return rv;
	}
	
	@Override
	public IFXCtrlClass findCtrlClass(IJavaProject javaProject, IType type) {
		IFXCtrlClass rv = fxCtrlClassCache.get(type.getFullyQualifiedName());
		
		if( rv == null ) {
			FXCtrlClass c = new FXCtrlClass(javaProject, type);
			fxCtrlClassCache.put(c.getFQN(), c);
			rv = c;
		}
		return rv;
	}
	
	@Override
	public void clearCache(IType type) {
		String fqn = type.getFullyQualifiedName();
		fxClassCache.remove(fqn);
		fxCtrlClassCache.remove(fqn);
		System.err.println(fxCtrlClassCache);
	}
}
