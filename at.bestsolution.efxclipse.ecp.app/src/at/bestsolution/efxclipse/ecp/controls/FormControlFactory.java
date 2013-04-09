package at.bestsolution.efxclipse.ecp.controls;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class FormControlFactory {

	public Node createFormControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {

		EObject modelElement = context.getModelElement();
		EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

		EClassifier type = feature.getEType();

		if (!feature.isMany()) {

			if (type == EcorePackage.Literals.EBOOLEAN) {
				return new CheckBoxControl(propertyDescriptor, context);
			} else if (type == EcorePackage.Literals.ESTRING) {
				return new TextFieldControl(propertyDescriptor, context);
			}

		}

		return new DummyControl(propertyDescriptor, context);

	}

}
