package at.bestsolution.efxclipse.runtime.emf.edit.ui;

import static org.junit.Assert.*;

import org.junit.Test;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.dnd.LocalTransfer;

public class LocalTransferTest {

	@Test
	public void setAndGetObjbect() {
		final Object object = new Object();
		LocalTransfer.INSTANCE.setObject(object);
		assertEquals(object, LocalTransfer.INSTANCE.getObject());
	}

}
