package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;
import com.google.inject.Injector;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.doc.CssExtDocParser;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.internal.CssExtDslActivator;

public class CssExtDialectExtension implements CssDialectExtension, CssExtendedDialectExtension {

	CssExtDocParser docParser;
	
	public CssExtDialectExtension() {
		
		docParser = new CssExtDocParser();
		
	}
	
	@Override
	public List<Property> getProperties() {
		Parser.doIt();
		List<Property> p = new ArrayList<CssDialectExtension.Property>();
		return Parser.getProperties();
	}

	@Override
	public boolean isActive(URI uri) {
		return true; // TODO for now always on
	}

	
	
	@Override
	public List<CssProperty> getPropertiesForSelector(String selector) {
		
		return null;
	}

	@Override
	public List<CssProperty> getValuesForProperty(String propertyName) {
		Parser.getValuesForProperty(propertyName);
		return null;
	}

	@Override
	public List<CssProperty> getValuesForProperty(String propertyName,
			String... preceedingValueParts) {
		return null;
	}

	@Override
	public String getDocForProperty(String propertyName) {
		
		return docParser.getDocForProperty(propertyName);
	}

	@Override
	public String getDocumentation(EObject o) {
		return docParser.getDocumentation(o);
	}

	@Override
	public String getDocForElement(String element) {
		return docParser.getDocForElement(element);
	}

	@Override
	public String getDocHeadForProperty(String name) {
		return docParser.getDocHeadForProperty(name);
	}

	@Override
	public String getDocHeadForElement(String element) {
		return docParser.getDocHeadForElement(element);
	}

	@Override
	public String getDocHead(EObject o) {
		return docParser.getDocHead(o);
	}

}
