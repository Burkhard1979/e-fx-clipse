/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.demo.contacts.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javafx.beans.property.Property;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;

import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;
import at.bestsolution.efxclipse.runtime.demo.contacts.model.ContactsManager;
import at.bestsolution.efxclipse.runtime.emf.databinding.edit.EMFEditFXProperties;

@SuppressWarnings("restriction")
public class GenericDetailsView {

	DetailsViewController controller;

	@Inject
	ContactsManager contactsManager;

	BorderPane parent;

	@Inject
	public GenericDetailsView(BorderPane parent, final MApplication application) {
		this.parent = parent;

	}

	@Inject
	public void setSelection(@Optional Object selectedItem) {

		try {

			Contact contact = selectedItem instanceof Contact ? (Contact) selectedItem : null;

			if (contact == null)
				return;

			// final Accordion accordion = new Accordion();
			VBox vBox = new VBox();

			TitledPane titledPane = new TitledPane();
			titledPane.setAlignment(Pos.CENTER);

			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));

			IItemPropertySource adapter = (IItemPropertySource) contactsManager.getAdapterFactory().adapt(contact,
					IItemPropertySource.class);

			List<IItemPropertyDescriptor> propertyDescriptors = adapter.getPropertyDescriptors(contact);

			HashMap<String, List<IItemPropertyDescriptor>> hashMap = new HashMap<>();
			List<IItemPropertyDescriptor> uncategorizedItemDescriptors = new ArrayList<>();

			// sort the property descriptors
			for (IItemPropertyDescriptor itemDescriptor : propertyDescriptors) {
				String category = itemDescriptor.getCategory(contact);

				if (category == null) {
					uncategorizedItemDescriptors.add(itemDescriptor);
				} else {
					List<IItemPropertyDescriptor> itemDescriptors = hashMap.get(category);

					if (itemDescriptors == null)
						hashMap.put(category, itemDescriptors = new ArrayList<IItemPropertyDescriptor>());

					itemDescriptors.add(itemDescriptor);
				}
			}

			for (Entry<String, List<IItemPropertyDescriptor>> entry : hashMap.entrySet()) {
				TitledPane pane = createPane(contact, entry.getValue(), entry.getKey());
				// accordion.getPanes().add(pane);
				vBox.getChildren().add(pane);

			}

			int row = 0;
			for (IItemPropertyDescriptor descriptor : uncategorizedItemDescriptors) {
				Label label = new Label(descriptor.getDisplayName(contact));
				grid.add(label, 0, row);

				Object feature = descriptor.getFeature(contact);
				if (feature instanceof EStructuralFeature) {
					if (((EStructuralFeature) feature).getEType().equals(EcorePackage.Literals.ESTRING)) {
						TextField textField = new TextField();

						String category = descriptor.getCategory(contact);
						textField.setText(category);

						// Object propertyValue =
						// descriptor.getPropertyValue(contact);
						// userTextField
						// .setText(propertyValue instanceof
						// PropertyValueWrapper ? ((PropertyValueWrapper)
						// propertyValue)
						// .getText(contact) : null);
						grid.add(textField, 1, row);
					}
				}

				row++;
			}

			// EList<EStructuralFeature> features =
			// contact.eClass().getEAllStructuralFeatures();
			//
			// int row = 0;
			// for (EStructuralFeature feature : features) {
			// Label label = new Label(feature.getName());
			// grid.add(label, 0, row);
			//
			// TextField userTextField = new TextField();
			// userTextField.setText((String) contact.eGet(feature));
			// grid.add(userTextField, 1, row);
			//
			// row++;
			// }

			// Text scenetitle = new Text("Welcome");
			// scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			// grid.add(scenetitle, 0, 0, 2, 1);
			//
			// Label userName = new Label("User Name:");
			// grid.add(userName, 0, 1);
			//
			// TextField userTextField = new TextField();
			// grid.add(userTextField, 1, 1);
			//
			// Label pw = new Label("Password:");
			// grid.add(pw, 0, 2);
			//
			// PasswordField pwBox = new PasswordField();
			// grid.add(pwBox, 1, 2);

			titledPane.setText("General");
			titledPane.setContent(grid);

			// accordion.getPanes().add(titledPane);

			// parent.setCenter(titledPane);
			parent.setCenter(vBox);

		} catch (Exception e) {
			System.out.println("On noohhhh!" + e);
		}
	}

	TitledPane createPane(Object object, List<IItemPropertyDescriptor> propertyDescriptors, String category) {
		TitledPane titledPane = new TitledPane();
		titledPane.setText(category);
		titledPane.setAlignment(Pos.CENTER);

		// GridPane grid = new GridPane();
		// grid.setAlignment(Pos.CENTER);
		// grid.setHgap(10);
		// grid.setVgap(10);
		// grid.setPadding(new Insets(25, 25, 25, 25));

		VBox vBox = new VBox();
		titledPane.setContent(vBox);

		for (IItemPropertyDescriptor propertyDescriptor : propertyDescriptors) {
			FormEntry formEntry = new FormEntry((EObject) object, contactsManager.getEditingDomain(), propertyDescriptor);
			vBox.getChildren().add(formEntry);
		}

		return titledPane;
	}

	static class FormEntry extends HBox {

		IItemPropertyDescriptor descriptor;
		Object object;
		EditingDomain editingDomain;

		public FormEntry(EObject object, EditingDomain editingDomain, IItemPropertyDescriptor descriptor) {
			super();
			this.object = object;
			this.descriptor = descriptor;
			this.editingDomain = editingDomain;

			Label label = new Label(descriptor.getDisplayName(object));
			getChildren().add(label);
			label.setPrefWidth(150);

			Object feature = descriptor.getFeature(object);
			if(feature instanceof EAttribute) {
				EAttribute attribute = (EAttribute) feature;
				if(attribute.getEAttributeType() == EcorePackage.Literals.ESTRING) {
					TextField textField = new TextField();
					setHgrow(textField, Priority.ALWAYS);
					getChildren().add(textField);
					
					Property<String> textProperty = EMFEditFXProperties.value(editingDomain, object, attribute);
					textField.textProperty().bindBidirectional(textProperty);
				}
			}
			
		}

	}

}
