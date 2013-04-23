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
package at.bestsolution.efxclipse.ecp;

import java.net.URL;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.Control;
import org.eclipse.emf.ecp.edit.Control.Factory;
import org.eclipse.emf.ecp.edit.Control.Factory.Registry;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import at.bestsolution.efxclipse.ecp.ui.ModelElementEditor;

@SuppressWarnings("restriction")
public class ModelEditorPart implements ModelElementEditor {

	private ScrollPane scrollPane;
	MPart part;

	@Inject
	public ModelEditorPart(BorderPane parent, final MApplication application, MPart part) {
		this.part = part;
		// part.setCloseable(true);

		// ECPControlContext modelElementContext = new
		// DummyControlContext(DummyWorkspace.INSTANCE.getPlayer());
		// ECPControlContext modelElementContext = new
		// DummyControlContext(DummyWorkspace.INSTANCE.getTournament());
		// ECPControlContext modelElementContext = new
		// DummyControlContext(DummyWorkspace.INSTANCE.getReferee());

		scrollPane = new ScrollPane();
		scrollPane.setFitToWidth(true);

		parent.setCenter(scrollPane);
	}

	public void setInput(ECPControlContext modelElementContext) {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryItemDelegator adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
		EObject modelElement = modelElementContext.getModelElement();

		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(modelElement, IItemLabelProvider.class);
		part.setLabel(labelProvider.getText(modelElement));
		Object image = labelProvider.getImage(modelElement);
		if (image instanceof URL)
			part.setIconURI(((URL) image).toExternalForm());

		List<IItemPropertyDescriptor> propertyDescriptors = adapterFactoryItemDelegator.getPropertyDescriptors(modelElement);
		// FormControlFactory controlFactory = new FormControlFactory();

		VBox vBox = new VBox();
		vBox.getStyleClass().add("theForm");

		vBox.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

		Button deleteButton = new Button("delete");
		vBox.getChildren().add(deleteButton);

		for (IItemPropertyDescriptor propertyDescriptor : propertyDescriptors) {

			Registry registry = Control.Factory.Registry.INSTANCE;
			Factory factory = registry.getFactory(Node.class, propertyDescriptor, modelElement);

			if (factory != null) {
				Control control = factory.createControl(propertyDescriptor, modelElementContext);

				// Node formControl =
				// controlFactory.createFormControl(propertyDescriptor,
				// modelElementContext);
				vBox.getChildren().add((Node) control);
			}
		}

		scrollPane.setContent(vBox);
	}

}
