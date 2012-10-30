/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.formats.fxg.handler;

import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphFactory;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty;

public class FXMLLoader {

	public Model loadModel(IFile file) {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setNamespaceAware(true);
			SAXParser parser = factory.newSAXParser();
			FXMLHandler handler = new FXMLHandler(file);
			parser.parse(file.getContents(), handler);
			return handler.model;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	static class FXMLHandler extends DefaultHandler {
		private final IFile fxmlFile;
		private Model model;

		private Stack<Element> elementStack = new Stack<Element>();
		private boolean inRichTextContent;
		private StringBuilder richtTextContent = new StringBuilder();
		private boolean isProperty = false;
		private String propertyName;
		private Property property = null;

		public FXMLHandler(IFile fxmlFile) {
			this.fxmlFile = fxmlFile;
		}

		@Override
		public void startDocument() {
			model = FXGraphFactory.eINSTANCE.createModel();

			String packName = null;
			IJavaElement j = JavaCore.create(fxmlFile.getParent());
			if (j instanceof IPackageFragment) {
				IPackageFragment p = (IPackageFragment) j;
				packName = p.getElementName();
			}

			if (packName != null) {
				PackageDeclaration pack = FXGraphFactory.eINSTANCE
						.createPackageDeclaration();
				pack.setName(packName);
				model.setPackage(pack);
			}

			ComponentDefinition compDef = FXGraphFactory.eINSTANCE
					.createComponentDefinition();

			String name = fxmlFile.getName();
			if (name.toLowerCase().endsWith(".fxml")) {
				name = name.substring(0, name.length() - 5);
			}
			compDef.setName(name);

			model.setComponentDef(compDef);
		}

		@Override
		public void processingInstruction(String target, String data)
				throws SAXException {
			if ("import".equals(target)) {
				Import i = FXGraphFactory.eINSTANCE.createImport();
				i.setImportedNamespace(data);
				model.getImports().add(i);
			}
			else if ("scenebuilder-stylesheet".equals(target)) {
				// TODO what if there are more than one?
				model.getComponentDef().getPreviewCssFiles().add(data);
			}
			else if ("scenebuilder-preview-i18n-resource".equals(target)) {
				model.getComponentDef().setPreviewResourceBundle(data);
			}
		}

		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			System.err.println("start " + localName);
			if (!"children".equals(localName)) {
				if (Character.isLowerCase(localName.charAt(0))) {
					if (isProperty) {
						// TODO
					} else {
						isProperty = true;
						property = null;
						propertyName = localName;
					}
				} else {
					Element e = createElement(localName, attributes);
					if (isProperty) {
						if (property == null) {
							property = FXGraphFactory.eINSTANCE
									.createProperty();
							property.setName(propertyName);
							property.setModifier(localName);
							ListValueProperty vp = FXGraphFactory.eINSTANCE
									.createListValueProperty();
							for (Property p : e.getProperties()) {
								SimpleValueProperty v = FXGraphFactory.eINSTANCE
										.createSimpleValueProperty();
								v.setStringValue(p.getName()
										+ " : \""
										+ ((SimpleValueProperty) p.getValue())
												.getStringValue()+"\"");
								vp.getValue().add(v);
							}
							property.setValue(vp);
							elementStack.peek().getProperties().add(property);
						} else {
							System.err
									.println("irgendwasssssssssssssssssssssssssssssssssssssssssssssssssss");
						}
					} else {
						// root element
						if (model.getComponentDef().getDefines().isEmpty()) {
							Define d = FXGraphFactory.eINSTANCE.createDefine();
							model.getComponentDef().getDefines().add(d);
							d.setElement(e);
						} else {
							// if ()
							elementStack.peek().getDefaultChildren().add(e);
						}
						System.err.println("push " + localName);
						elementStack.push(e);
					}
				}
			}
		}

		/**
		 * @param localName
		 * @param attributes
		 * @return
		 */
		private Element createElement(String localName, Attributes attributes) {
			Element root = FXGraphFactory.eINSTANCE.createElement();
			root.setName(localName);
			for (int i = 0; i < attributes.getLength(); i++) {
				String name = attributes.getLocalName(i);
				String value = attributes.getValue(i);
				Property p = FXGraphFactory.eINSTANCE.createProperty();
				SimpleValueProperty vp = FXGraphFactory.eINSTANCE
						.createSimpleValueProperty();
				vp.setStringValue(value);
				p.setName(name);
				p.setValue(vp);
				root.getProperties().add(p);
			}
			return root;
		}

		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			if (isProperty) {
				richtTextContent = new StringBuilder().append(new String(ch,
						start, length));
				richtTextContent.trimToSize();
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			System.err.println("end " + localName);
			if (!"children".equals(localName)) {
				if (isProperty && property != null
						&& richtTextContent.length() > 0) {
					String text = richtTextContent.toString()
							.replaceAll("\n", "").replaceAll("\t", "").trim();
					if (text.length() > 0) {
						ListValueProperty vp = (ListValueProperty) property
								.getValue();
						SimpleValueProperty v = FXGraphFactory.eINSTANCE
								.createSimpleValueProperty();
						v.setStringValue(localName + " : "
								+ richtTextContent.toString());
						System.err.println("richtTextContent "
								+ richtTextContent);
						vp.getValue().add(v);
					}
				}

				if (!isProperty && Character.isUpperCase(localName.charAt(0))) {
					// if (!isProperty) {
					Element e = elementStack.pop();
					System.err.println("pop " + e.getName());
					// }
				} else {
					if (localName.equals(propertyName)) {
						isProperty = false;
					}
				}
			}
		}
	}
}
