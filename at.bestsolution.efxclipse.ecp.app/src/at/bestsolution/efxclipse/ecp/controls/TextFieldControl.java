package at.bestsolution.efxclipse.ecp.controls;

import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.celleditor.EDataTypeValueHandler;

public class TextFieldControl extends HBox {

	public TextFieldControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {

		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		String displayName = propertyDescriptor.getDisplayName(modelElement);
		Label label = new Label(displayName);
		label.setPrefWidth(150);
		getChildren().add(label);

		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

		final EDataTypeValueHandler valueHandler = new EDataTypeValueHandler((EDataType) feature.getEType());

		Object value = modelElement.eGet(feature);

		final TextField textField = new TextField(valueHandler.toString(value));

		textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocus, Boolean newFocus) {
				if (!newFocus) {
					Object oldValue = modelElement.eGet(feature);
					Object newValue = valueHandler.toValue(textField.getText());

					if (!Objects.equals(oldValue, newValue)) {
						Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
						if (command.canExecute())
							editingDomain.getCommandStack().execute(command);
					}
				}
			}

		});

		HBox.setHgrow(textField, Priority.ALWAYS);

		getChildren().add(textField);
	}

}
