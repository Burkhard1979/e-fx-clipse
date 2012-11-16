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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.junit.Before;
import org.junit.Test;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellCreationListener;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;

public class AdapterFactoryCellFactoryTest {

	AdapterFactoryImpl adapterFactory;
	AdapterFactoryCellFactory cellFactory;

	@Before
	public void setUp() {
		adapterFactory = new AdapterFactoryImpl();
		cellFactory = new AdapterFactoryCellFactory(adapterFactory) {
		};
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

	@Test(expected = IllegalArgumentException.class)
	public void constructorWithNullAdapterFactory() {
		new AdapterFactoryCellFactory(null) {
		};
	}

	@Test
	public void fontFromObjectWithNonURI() {
		cellFactory.fontFromObject(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void fontFromObjectWithIllegalScheme() {
		URI uri = URI.createURI("http://Arial/8/bold");
		cellFactory.fontFromObject(uri);
	}

	@Test(expected = IllegalArgumentException.class)
	public void fontFromObjectWithoutSegments() {
		URI uri = URI.createURI("font://");
		cellFactory.fontFromObject(uri);
	}

	@Test
	public void fontFromObjectWithoutFontName() {
		URI uri = URI.createURI("font:///8/");
		Font font = cellFactory.fontFromObject(uri);
		assertEquals(8, font.getSize(), 0);
	}

	@Test
	public void fontFromObjectWithPositiveHeightDelta() {
		URI uri = URI.createURI("font://Arial/+1/");
		Font font = cellFactory.fontFromObject(uri);
		assertEquals(Font.getDefault().getSize() + 1, font.getSize(), 0);
	}

	@Test
	public void fontFromObjectWithNegativeHeightDelta() {
		URI uri = URI.createURI("font://Arial/-2/");
		Font font = cellFactory.fontFromObject(uri);
		assertEquals(Font.getDefault().getSize() - 2, font.getSize(), 0);
	}

	@Test
	public void fontFromObjectWithoutHeight() {
		URI uri = URI.createURI("font://Arial//");
		cellFactory.fontFromObject(uri);
		Font font = cellFactory.fontFromObject(uri);
		assertEquals("Arial", font.getName());
	}

	@Test
	public void fontFromObjectBold() {
		URI uri = URI.createURI("font://Arial/8/bold");
		Font font = cellFactory.fontFromObject(uri);
		assertEquals("Arial Bold", font.getName());
		assertEquals(8, font.getSize(), 0);
	}

	@Test
	public void fontFromObjectItalic() {
		URI uri = URI.createURI("font://Arial/8/italic");
		Font font = cellFactory.fontFromObject(uri);
		assertEquals("Arial Italic", font.getName());
		assertEquals(8, font.getSize(), 0);
	}

	@Test
	public void fontFromObjectBoldAndItalic() {
		URI uri = URI.createURI("font://Arial/8/bold+italic");
		Font font = cellFactory.fontFromObject(uri);
		assertEquals("Arial Bold Italic", font.getName());
		assertEquals(8, font.getSize(), 0);
	}

	@Test
	public void fontFromObjectItalicAndBold() {
		URI uri = URI.createURI("font://Arial/8/italic+bold");
		Font font = cellFactory.fontFromObject(uri);
		assertEquals("Arial Bold Italic", font.getName());
		assertEquals(8, font.getSize(), 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void colorFromObjectWithIllegalScheme() {
		URI uri = URI.createURI("http://");
		cellFactory.colorFromObject(uri);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void colorFromObjectWithIllegalAuthority() {
		URI uri = URI.createURI("color://hsb");
		cellFactory.colorFromObject(uri);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void colorFromObjectWithIllegalSegmentCount() {
		URI uri = URI.createURI("color://rgb/120/100");
		cellFactory.colorFromObject(uri);
	}
	
	@Test
	public void colorFromObjectWithIllegalNumberFormat() {
		URI uri = URI.createURI("color://rgb/100/XXX/0");
		Color color = cellFactory.colorFromObject(uri);
		assertEquals(Color.rgb(100, 200, 0), color);
	}
	
	@Test
	public void colorFromObjectValidURI() {
		URI uri = URI.createURI("color://rgb/100/200/0");
		Color color = cellFactory.colorFromObject(uri);
		assertEquals(Color.rgb(100, 200, 0), color);
	}

}
