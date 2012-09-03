/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author ccaks
 *
 */
public interface CssExtendedDialectExtension extends CssDialectExtension {

	public abstract static class CssProperty {
		public final String name;
		public final String fQName;
		public final CssElement parent;
		public final int eqHash;
		
		private String doc;
		
		public CssProperty(String name, String fQName, CssElement parent, int eqHash) {
			this.name = name;
			this.fQName = fQName;
			this.parent = parent;
			this.eqHash = eqHash;
		}
		
		public String getDoc() {
			if (doc == null) {
				doc = doGetDoc();
			}
			return doc;
		}
		protected abstract String doGetDoc();
	}
	
	public static class CssElement {
		public final String name;
		public final String fQName;
		
		public CssElement(String name, String fQName) {
			this.name = name;
			this.fQName = fQName;
		}
	}
	
	public List<CssProperty> getAllProperties();
	
	
	public List<CssProperty> getPropertiesForSelector(String selector);
	
	
	public static class CssValuePart {
		public final String value;
		public final String doc;
		
		
		public CssValuePart(String value, String doc) {
			this.value = value;
			this.doc = doc;
		}
		
	}
	
	public List<CssProperty> getValuesForProperty(String propertyName);
	public List<CssProperty> getValuesForProperty(String propertyName, String... preceedingValueParts);
	
	public String getDocForProperty(String propertyName);
	
	/**
	 * @param o
	 * @return
	 */
	public String getDocumentation(EObject o);
	/**
	 * @param element
	 * @return
	 */
	public String getDocForElement(String element);
	/**
	 * @param name
	 * @return
	 */
	public String getDocHeadForProperty(String name);
	/**
	 * @param element
	 * @return
	 */
	public String getDocHeadForElement(String element);
	/**
	 * @param o
	 * @return
	 */
	public String getDocHead(EObject o);
	
}
