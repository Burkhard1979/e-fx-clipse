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
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Method;

import javafx.scene.control.Cell;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellCreationListener;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;

@SuppressWarnings("unchecked")
public class AdapterFactoryListCellFactoryTest {

	AdapterFactory adapterFactory;
	AdapterFactoryListCellFactory cellFactory;
	Adapter adapter1;
	Adapter adapter2;
	ArgumentCaptor<AdapterFactoryListCellFactory> itemCaptor;
	@SuppressWarnings("rawtypes")
	ArgumentCaptor<ListCell> listCellCaptor;
	ArgumentCaptor<AdapterFactory> adapterFactoryCaptor;

	@Before
	public void setUp() {
		adapterFactory = mock(AdapterFactory.class);
		cellFactory = spy(new AdapterFactoryListCellFactory(adapterFactory));
		itemCaptor = ArgumentCaptor.forClass(AdapterFactoryListCellFactory.class);
		listCellCaptor = ArgumentCaptor.forClass(ListCell.class);
		adapterFactoryCaptor = ArgumentCaptor.forClass(AdapterFactory.class);
	}

	@Test
	public void call() {
		cellFactory.call(null);
	}

	@Test
	public void cellCreationNotification() {
		ICellCreationListener listener = mock(ICellCreationListener.class);
		cellFactory.addCellCreationListener(listener);
		cellFactory.call(null);
		verify(listener).cellCreated((Cell<?>) any());
	}
	

	@Test
	@SuppressWarnings("rawtypes")
	public void updateItem() throws Exception {
		ICellUpdateListener listener = mock(ICellUpdateListener.class);
		cellFactory.addCellUpdateListener(listener);
		ListView<Object> listView = new ListView<>();
		ListCell<Object> listCell = cellFactory.call(listView);
		
		// mock the first item
		final Notifier item1 = mock(Notifier.class);
		final EList adapterList1 = mock(EList.class);
		when(item1.eAdapters()).thenReturn(adapterList1);
		when(adapterList1.add(any())).then(new Answer() {

			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				adapter1 = (Adapter) invocation.getArguments()[0];
				return null;
			}

		});
		
		// update the cell
		invokeUpdateItem(listCell, item1, false);
		
		assertNotNull("No adapter was added", adapter1);
		
		verify(cellFactory, times(1)).applyItemProviderStyle(itemCaptor.capture(), listCellCaptor.capture(), adapterFactoryCaptor.capture());
		assertEquals(item1, itemCaptor.getValue());
		assertEquals(listCell, listCellCaptor.getValue());
		assertEquals(adapterFactory, adapterFactoryCaptor.getValue());
				
		// mock the second item
		final Notifier item2 = mock(Notifier.class);
		final EList adapterList2 = mock(EList.class);
		when(item2.eAdapters()).thenReturn(adapterList2);
		when(adapterList2.add(any())).then(new Answer() {

			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				adapter2 = (Adapter) invocation.getArguments()[0];
				return null;
			}

		});
		
		// update the cell again
		invokeUpdateItem(listCell, item2, false);
		
		verify(adapterList1).remove(adapter1);
		
		assertNotNull("No adapter was added", adapter2);

		verify(cellFactory, times(2)).applyItemProviderStyle(itemCaptor.capture(), listCellCaptor.capture(), adapterFactoryCaptor.capture());
		assertEquals(item2, itemCaptor.getValue());
		assertEquals(listCell, listCellCaptor.getValue());
		assertEquals(adapterFactory, adapterFactoryCaptor.getValue());
		
		// notify the adapter
		Notification notification = mock(Notification.class);
		when(notification.getNotifier()).thenReturn(item2);
		adapter2.notifyChanged(notification);
		
		verify(cellFactory, times(3)).applyItemProviderStyle(itemCaptor.capture(), listCellCaptor.capture(), adapterFactoryCaptor.capture());
		assertEquals(item2, itemCaptor.getValue());
		assertEquals(listCell, listCellCaptor.getValue());
		assertEquals(adapterFactory, adapterFactoryCaptor.getValue());
		
		
	}

	/**
	 * Helper method to call protected method {@link Cell#updateItem}
	 */
	static void invokeUpdateItem(Cell<?> cell, Object item, boolean empty) throws Exception {
		Method updateItem = Cell.class.getDeclaredMethod("updateItem", Object.class, boolean.class);
		updateItem.setAccessible(true);
		updateItem.invoke(cell, item, empty);
	}

}
