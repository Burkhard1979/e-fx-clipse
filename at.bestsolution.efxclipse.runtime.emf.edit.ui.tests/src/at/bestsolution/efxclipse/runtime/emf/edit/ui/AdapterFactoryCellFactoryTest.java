/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.emf.edit.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellCreationListener;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;

//@RunWith(PowerMockRunner.class)
public class AdapterFactoryCellFactoryTest {
	
	AdapterFactoryImpl adapterFactory;
	AdapterFactoryCellFactory cellFactory;

	@Before
	public void setUp() {
		adapterFactory = new AdapterFactoryImpl();
		cellFactory = new AdapterFactoryCellFactory(adapterFactory) {};
	}
	
	@Test
	public void getAdapterFactory() {
		assertEquals(adapterFactory, cellFactory.getAdapterFactory());
	}

	@Test
	public void addAndRemoveCellCreationListener() {
		ICellCreationListener listener = mock(ICellCreationListener.class);
		cellFactory.addCellCreationListener(listener);
		assertEquals(listener, cellFactory.cellCreationListeners.get(0));
		
		cellFactory.removeCellCreationListener(listener);
		assertTrue(cellFactory.cellCreationListeners.isEmpty());
	}
	
	@Test
	public void addAndRemoveCellUpdateListener() {
		ICellUpdateListener listener = mock(ICellUpdateListener.class);
		cellFactory.addCellUpdateListener(listener);
		assertEquals(listener, cellFactory.cellUpdateListeners.get(0));
		
		cellFactory.removeCellUpdateListener(listener);
		assertTrue(cellFactory.cellUpdateListeners.isEmpty());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructorWithNullAdapterFactory() {
		new AdapterFactoryCellFactory(null) {};
	}

}
