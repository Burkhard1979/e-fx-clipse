package at.bestsolution.efxclipse.runtime.emf.edit.ui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Cell;
import javafx.scene.control.TextField;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellEditHandler;

public class EAttributeCellEditHandler implements ICellEditHandler {

	EAttribute attribute;
	EditingDomain editingDomain;
	TextField textField;
	Cell<?> treeCell;

	public EAttributeCellEditHandler(EAttribute attribute, EditingDomain editingDomain) {
		this.attribute = attribute;
		this.editingDomain = editingDomain;
	}

	@Override
	public boolean canEdit(Cell<?> treeCell) {
		Object item = treeCell.getItem();
		return item instanceof EObject && ((EObject) item).eClass().getEAllAttributes().contains(attribute);
	}

	@Override
	public void startEdit(final Cell<?> treeCell) {
		this.treeCell = treeCell;
		EObject item = (EObject) treeCell.getItem();
		String string = EcoreUtil.convertToString(attribute.getEAttributeType(), item.eGet(attribute));
		textField = new TextField();
		textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (!newValue)
					commitEdit(treeCell, textField.getText());
			}

		});
		textField.setText(string);
		treeCell.setText(null);
		treeCell.setGraphic(textField);
		textField.selectAll();
	}

	@Override
	public void cancelEdit(Cell<?> treeCell) {
		// do nothing
	}

	@Override
	public void commitEdit(Cell<?> treeCell, Object newValue) {
		Object item = treeCell.getItem();
		Object value = EcoreUtil.createFromString(attribute.getEAttributeType(), (String) newValue);
		Command command = SetCommand.create(editingDomain, item, attribute, value);
		if (command.canExecute())
			editingDomain.getCommandStack().execute(command);
	}

}