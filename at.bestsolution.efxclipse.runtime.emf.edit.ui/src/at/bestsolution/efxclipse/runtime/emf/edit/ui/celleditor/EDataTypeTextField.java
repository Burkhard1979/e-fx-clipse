package at.bestsolution.efxclipse.runtime.emf.edit.ui.celleditor;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.TextField;

import org.eclipse.emf.ecore.EDataType;

public class EDataTypeTextField extends TextField {
	
	protected EDataType eDataType;
	protected EDataTypeValueHandler valueHandler;
	private ObjectProperty<?> valueProperty = new SimpleObjectProperty<>();

	public EDataTypeTextField(EDataType eDataType) {
		this.eDataType = eDataType;
		valueHandler = new EDataTypeValueHandler(eDataType);
	}
	
	public Object getValue() {
		return valueProperty.getValue();
		//return valueHandler.toValue(getText());
	}

	public void doSetValue(Object value) {
		
		value = valueHandler.toString(value);
		//setText((String) value);
	}

}
