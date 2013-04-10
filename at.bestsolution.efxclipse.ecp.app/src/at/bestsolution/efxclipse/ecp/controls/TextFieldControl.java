package at.bestsolution.efxclipse.ecp.controls;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import com.google.common.collect.Sets;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.celleditor.EDataTypeValueHandler;

public class TextFieldControl extends HBox {

	final Collection<EDataType> supportedTypes = Sets.newHashSet(EcorePackage.Literals.EBIG_DECIMAL, EcorePackage.Literals.EBIG_INTEGER,
			EcorePackage.Literals.EBOOLEAN, EcorePackage.Literals.ECHAR, EcorePackage.Literals.ECHARACTER_OBJECT,
			EcorePackage.Literals.EDATE, EcorePackage.Literals.EDOUBLE, EcorePackage.Literals.EDOUBLE_OBJECT, EcorePackage.Literals.EFLOAT,
			EcorePackage.Literals.EFLOAT_OBJECT, EcorePackage.Literals.EINT, EcorePackage.Literals.EINTEGER_OBJECT,
			EcorePackage.Literals.ELONG, EcorePackage.Literals.ELONG_OBJECT, EcorePackage.Literals.ESHORT,
			EcorePackage.Literals.ESHORT_OBJECT, EcorePackage.Literals.ESTRING);

	public boolean isControlFor(EDataType type) {
		return supportedTypes.contains(type);
	}

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
		
		textField.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observableValue, String oldText, String newText) {
				String message = valueHandler.isValid(newText);
				if(message == null)
					textField.getStyleClass().remove("invalid");
				else
					textField.getStyleClass().add("invalid");
			}
			
		});

		textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
				if (!newFocused) {
					Object oldValue = modelElement.eGet(feature);
					String text = textField.getText();
					String message = valueHandler.isValid(text);

					if (message == null) {
						Object newValue = valueHandler.toValue(text);

						// only commit if the value has changed
						if (!Objects.equals(oldValue, newValue)) {
							Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
							if (command.canExecute())
								editingDomain.getCommandStack().execute(command);
						}
					} else {
						System.err.println(message);						
					}
				}
			}

		});

		HBox.setHgrow(textField, Priority.ALWAYS);

		getChildren().add(textField);
	}

}
