package at.bestsolution.efxclipse.runtime.emf.edit.ui;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn.CellDataFeatures;

import org.junit.Test;

public class ProxyCellValueFactoryTest {

	@Test
	@SuppressWarnings({"rawtypes", "unchecked"})
 	public void call() {
		ProxyCellValueFactory factory = new ProxyCellValueFactory();
		CellDataFeatures features = mock(CellDataFeatures.class);
		Object dummy = new Object();
		when(features.getValue()).thenReturn(dummy);
		ObservableValue<Object> observableValue = factory.call(features);
		assertEquals(dummy, observableValue.getValue());
	}

}
