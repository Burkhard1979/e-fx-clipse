package at.bestsolution.efxclipse.ecp.controls;

import java.net.URL;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class ReferenceControl extends HBox {

	public ReferenceControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {

		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		String displayName = propertyDescriptor.getDisplayName(modelElement);
		Label label = new Label(displayName);
		label.setPrefWidth(150);
		getChildren().add(label);

		final EReference feature = (EReference) propertyDescriptor.getFeature(modelElement);

		Object value = modelElement.eGet(feature);

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(value, IItemLabelProvider.class);

		HBox hBox = new HBox();

		Label label2 = new Label(labelProvider.getText(value));

		URL image = (URL) labelProvider.getImage(value);

		hBox.getChildren().add(new ImageView(image.toExternalForm()));
		hBox.getChildren().add(label2);
		hBox.getChildren().add(new Button("..."));

		HBox.setHgrow(label2, Priority.ALWAYS);

		getChildren().add(hBox);
	}

}
