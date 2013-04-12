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
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import at.bestsolution.efxclipse.ecp.controls.FormControlFactory;
import at.bestsolution.efxclipse.runtime.ecp.dummy.DummyControlContext;
import at.bestsolution.efxclipse.runtime.ecp.dummy.DummyWorkspace;

@SuppressWarnings("restriction")
public class ModelEditorPart {

	@Inject
	public ModelEditorPart(BorderPane parent, final MApplication application, MPart part) {
		
		part.setCloseable(true);
		
		FormControlFactory controlFactory = new FormControlFactory();

		ECPControlContext modelElementContext = new DummyControlContext(DummyWorkspace.INSTANCE.getReferee());

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryItemDelegator adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
		EObject modelElement = modelElementContext.getModelElement();
		
		IItemLabelProvider labelProvider = (IItemLabelProvider)adapterFactory.adapt(modelElement, IItemLabelProvider.class);
		part.setLabel(labelProvider.getText(modelElement));
		Object image = labelProvider.getImage(modelElement);
		if(image instanceof URL)
			part.setIconURI(((URL) image).toExternalForm());
		
		List<IItemPropertyDescriptor> propertyDescriptors = adapterFactoryItemDelegator.getPropertyDescriptors(modelElement);

		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setFitToWidth(true);
		
		VBox vBox = new VBox();
		vBox.getStyleClass().add("theForm");
		
		vBox.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

		Button deleteButton = new Button("delete");
		vBox.getChildren().add(deleteButton);

		for (IItemPropertyDescriptor propertyDescriptor : propertyDescriptors) {
			Node formControl = controlFactory.createFormControl(propertyDescriptor, modelElementContext);
			vBox.getChildren().add(formControl);
		}
		
		scrollPane.setContent(vBox);

		parent.setCenter(scrollPane);
	}



}
