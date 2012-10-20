package at.bestsolution.efxclipse.runtime.emf.edit.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellCreationListener;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;

public class AdapterFactoryCellFactoryTest {
	
	AdapterFactoryImpl adapterFactory;
	private AdapterFactoryCellFactory cellFactory;

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
