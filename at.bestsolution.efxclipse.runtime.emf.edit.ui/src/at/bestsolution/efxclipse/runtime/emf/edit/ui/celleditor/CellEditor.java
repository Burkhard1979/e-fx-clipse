package at.bestsolution.efxclipse.runtime.emf.edit.ui.celleditor;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;

public abstract class CellEditor extends Node {

	private List<ICellEditorListener> listeners = new ArrayList<>();

	/**
	 * Optional cell editor validator; <code>null</code> if none.
	 */
	private ICellEditorValidator validator = null;

}
