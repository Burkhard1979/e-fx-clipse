package at.bestsolution.efxclipse.ecp.controls;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class CheckBoxControl extends HBox {

	public CheckBoxControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		getStyleClass().add("formControl");
		
		EObject modelElement = context.getModelElement();

		String displayName = propertyDescriptor.getDisplayName(modelElement);
		Label label = new Label(displayName);
		label.setPrefWidth(150);
		getChildren().add(label);

		EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		Object val = modelElement.eGet(feature);

		CheckBox checkBox = new CheckBox();
		checkBox.setSelected((Boolean) val);

		getChildren().add(checkBox);
	}

}
