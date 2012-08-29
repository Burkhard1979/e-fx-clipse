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

public class EFXMapProperty<O,T,K,V> extends EFXProperty<O, T> {
	public final Class<K> keyType;
	public final Class<V> valueType;
	
	public EFXMapProperty(String name, Class<T> type, Class<K> keyType, Class<V> valueType, boolean readonly, boolean lazy) {
		super(name, type, readonly, lazy);
		this.keyType = keyType;
		this.valueType = valueType;
	}
}