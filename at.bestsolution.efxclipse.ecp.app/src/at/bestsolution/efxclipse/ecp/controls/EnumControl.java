package at.bestsolution.efxclipse.ecp.controls;

import java.util.ArrayList;
import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class EnumControl extends HBox {

	public EnumControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		String displayName = propertyDescriptor.getDisplayName(modelElement);
		Label label = new Label(displayName);
		label.setPrefWidth(150);
		getChildren().add(label);

		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

		ChoiceBox<Enumerator> choiceBox = new ChoiceBox<>();

		EClassifier type = feature.getEType();

		EEnum eEnum = (EEnum) type;

		EList<EEnumLiteral> enumLiterals = eEnum.getELiterals();

		ArrayList<Enumerator> values = new ArrayList<Enumerator>();

		if (!feature.isRequired())
			values.add(null);

		for (EEnumLiteral literal : enumLiterals)
			values.add(literal.getInstance());

		choiceBox.getItems().addAll(values);

		SingleSelectionModel<Enumerator> selectionModel = choiceBox.getSelectionModel();

		Enumerator val = (Enumerator) modelElement.eGet(feature);

		selectionModel.select(val);

		getChildren().add(choiceBox);

		selectionModel.selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

			@Override
			public void changed(ObservableValue<? extends Enumerator> observableValue, Enumerator oldValue, Enumerator newValue) {
				Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
				if (command.canExecute())
					editingDomain.getCommandStack().execute(command);
			}

		});
	}

}
