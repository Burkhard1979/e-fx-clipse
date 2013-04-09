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

import java.util.List;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import at.bestsolution.efxclipse.ecp.controls.FormControlFactory;
import at.bestsolution.efxclipse.runtime.ecp.dummy.DummyControlContext;
import at.bestsolution.efxclipse.runtime.ecp.dummy.DummyWorkspace;

@SuppressWarnings("restriction")
public class ModelEditorPart {

	@Inject
	public ModelEditorPart(BorderPane parent, final MApplication application) {
		
		FormControlFactory controlFactory = new FormControlFactory();

		ECPControlContext modelElementContext = new DummyControlContext(DummyWorkspace.INSTANCE.getPlayer());

		ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryItemDelegator adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(composedAdapterFactory);
		EObject modelElement = modelElementContext.getModelElement();
		List<IItemPropertyDescriptor> propertyDescriptors = adapterFactoryItemDelegator.getPropertyDescriptors(modelElement);

		VBox vBox = new VBox();

		Button deleteButton = new Button("delete");
		vBox.getChildren().add(deleteButton);

		for (IItemPropertyDescriptor propertyDescriptor : propertyDescriptors) {
			Node formControl = controlFactory.createFormControl(propertyDescriptor, modelElementContext);
			vBox.getChildren().add(formControl);
		}

		parent.setCenter(vBox);
	}



}
