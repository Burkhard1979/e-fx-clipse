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
package at.bestsolution.efxclipse.runtime.model;

public class EFXListProperty<O,T,E> extends EFXProperty<O, T> {
	public final Class<E> elementType;
	
	public EFXListProperty(String name, Class<?> type, Class<E> elementType, boolean readonly, boolean lazy) {
		super(name, (Class<T>) type, readonly, lazy);
		this.elementType = elementType;
	}

}