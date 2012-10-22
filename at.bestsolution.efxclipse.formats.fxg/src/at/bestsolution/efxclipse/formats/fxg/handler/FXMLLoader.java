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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphFactory;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration;

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

		private Stack<FXGElement> elementStack = new Stack<FXGElement>();
		private Stack<EStructuralFeature> targetFeatureStack = new Stack<EStructuralFeature>();
		private Stack<String> foreignNamespace = new Stack<String>();
		private boolean inRichText;
		private boolean inRichTextContent;
		private StringBuilder richtTextContent;
		// private Stack<RichTextContent> richtTextContentStack = new
		// Stack<RichTextContent>();

		private static final String FXG_NS = "http://ns.adobe.com/fxg/2008";

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
		}

		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			System.err.println("uri: " + uri);
			System.err.println(" localName: " + localName);
			System.err.println(" qName: " + qName);
			System.err.println(" attributes: " + attributes.getLength());

			if (Character.isUpperCase(localName.charAt(0))) {
				EClassifier classifier = FxgPackage.eINSTANCE
						.getEClassifier(localName);
				//System.err.println(classifier.getName());
			}

			// if (FXG_NS.equals(uri)) {
			// if (foreignNamespace.isEmpty()) {
			// if (Character.isUpperCase(localName.charAt(0))) {
			// EClassifier classifier = FxgPackage.eINSTANCE
			// .getEClassifier(localName);
			// FXGElement element = null;
			//
			// if (classifier == null) {
			// if (graphic.get_children().get(0) instanceof Library) {
			// Library l = (Library) graphic.get_children()
			// .get(0);
			// for (Definition d : l.get_children()) {
			// if (localName.equals(d.getName())) {
			// element = EcoreUtil.copy(d
			// .get_children().get(0));
			// break;
			// }
			// }
			// }
			// } else {
			// element = (FXGElement) EcoreUtil
			// .create((EClass) classifier);
			// }
			//
			// if (element == null) {
			// throw new IllegalStateException();
			// }
			//
			// if (element instanceof Graphic) {
			// graphic = (Graphic) element;
			// }
			//
			// EStructuralFeature feature = null;
			// if (!targetFeatureStack.isEmpty()) {
			// feature = targetFeatureStack.lastElement();
			// }
			//
			// if (feature != null && !elementStack.isEmpty()) {
			// if (feature.isMany()) {
			// List<FXGElement> list = (List<FXGElement>) elementStack
			// .lastElement().eGet(feature);
			// list.add(element);
			// } else {
			// elementStack.lastElement().eSet(feature,
			// element);
			// }
			// }
			//
			// for (int i = 0; i < attributes.getLength(); i++) {
			// if (FXG_NS.equals(attributes.getURI(i))
			// || "".equals(attributes.getURI(i))) {
			// String name = attributes.getLocalName(i);
			// EStructuralFeature f = element.eClass()
			// .getEStructuralFeature(name);
			// if (f != null) {
			// Object o = EcoreUtil.createFromString(
			// (EDataType) f.getEType(),
			// attributes.getValue(i));
			// element.eSet(f, o);
			// } else {
			// System.err
			// .println("Could not find feature '"
			// + name
			// + "' in "
			// + element.eClass()
			// .getName());
			// }
			// }
			// }
			//
			// if (element instanceof ContainerElement<?>) {
			// targetFeatureStack
			// .add(FxgPackage.Literals.CONTAINER_ELEMENT__CHILDREN);
			// } else {
			// targetFeatureStack.add(null);
			// }
			// elementStack.add(element);
			//
			// if (element instanceof RichText) {
			// inRichText = true;
			// }
			//
			// } else {
			// if (!elementStack.isEmpty()) {
			// if (inRichTextContent) {
			// richtTextContent.append("<" + localName);
			// richtTextContent.append(toString(attributes));
			// richtTextContent.append(">");
			// } else {
			// EStructuralFeature f = elementStack
			// .lastElement().eClass()
			// .getEStructuralFeature(localName);
			// targetFeatureStack.add(f);
			// if (inRichText
			// && f == FxgPackage.Literals.RICH_TEXT__CONTENT) {
			// inRichTextContent = true;
			// richtTextContent = new StringBuilder();
			// }
			// }
			// }
			// }
			// }
			// } else {
			// foreignNamespace.add(uri);
			// }
		}

		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			if (inRichTextContent) {
				richtTextContent.append(new String(ch, start, length));
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			System.err.println("END uri: " + uri);
			System.err.println("END  localName: " + localName);
			System.err.println("END  qName: " + qName);

			// if (FXG_NS.equals(uri)) {
			// if (!"Graphic".equals(localName) && foreignNamespace.isEmpty()) {
			// if (Character.isUpperCase(localName.charAt(0))) {
			// targetFeatureStack.pop();
			// if (elementStack.pop() instanceof RichText) {
			// inRichText = false;
			// }
			// } else {
			// if (inRichText) {
			// if ("content".equals(localName)) {
			// inRichTextContent = false;
			// targetFeatureStack.pop();
			// ((RichText) elementStack.lastElement())
			// .set_tempcontent(richtTextContent
			// .toString());
			// } else {
			// richtTextContent.append("</" + localName + ">");
			// }
			// } else {
			// targetFeatureStack.pop();
			// }
			// }
			// }
			// } else {
			// foreignNamespace.pop();
			// }
		}
	}
}
