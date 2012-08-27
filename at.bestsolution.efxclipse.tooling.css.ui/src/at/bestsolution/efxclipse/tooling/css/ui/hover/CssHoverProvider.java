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
package at.bestsolution.efxclipse.tooling.css.ui.hover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.ui.internal.util.BundleUtility;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.function;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.ui.internal.CssDialectExtensionComponent;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class CssHoverProvider extends DefaultEObjectHoverProvider {

	@Inject
	private CssDialectExtensionComponent extension;
	
	@Inject(optional = true)
	@Named("at.bestsolution.efxclipse.tooling.css.ui.styleSheetFileName")
	private String styleSheetFileName = "/CssDocsStyleSheet.css"; //$NON-NLS-1$
	
	// DBG
	@Inject(optional = true)
	@Named("org.eclipse.xtext.ui.editor.hover.XtextEditorHover.font")
	private String fontSymbolicName = "org.eclipse.jdt.ui.javadocfont"; //$NON-NLS-1$ 

	protected String getStyleSheet() {
		String css = loadStyleSheet();
	
		if (css != null) {
			FontData fontData = JFaceResources.getFontRegistry().getFontData(fontSymbolicName)[0];
			css = HTMLPrinter.convertTopLevelFont(css, fontData);
		}
		return css;
	}
	
	/**
	 * Loads and returns the hover style sheet.
	 * 
	 * @return the style sheet, or <code>null</code> if unable to load
	 */
	protected String loadStyleSheet() {
		URL styleSheetURL = Platform.getBundle("at.bestsolution.efxclipse.tooling.css.ui").getEntry(styleSheetFileName); 
		if (styleSheetURL != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new InputStreamReader(styleSheetURL.openStream()));
				StringBuffer buffer = new StringBuffer(1500);
				String line = reader.readLine();
				while (line != null) {
					buffer.append(line);
					buffer.append('\n');
					line = reader.readLine();
				}
				return buffer.toString();
			} catch (IOException ex) {
				return ""; //$NON-NLS-1$
			} finally {
				try {
					if (reader != null)
						reader.close();
				} catch (IOException e) {
				}
			}
		}
		return null;
	}
	
	protected String getHoverInfoAsHtml(EObject o) {
		System.err.println(o);
		if( o instanceof function ) {
			function f = (function) o;
			if( "rgb".equals(f.getName()) ) {
				EList<termGroup> g = f.getExpression().getTermGroups();
				String red = g.get(0).getTerms().get(0).getNumber();
				String green = g.get(1).getTerms().get(0).getNumber();
				String blue = g.get(2).getTerms().get(0).getNumber();
				String style = "rgb("+red+","+green+","+blue+")";
				String hexRed = Integer.toHexString(Integer.parseInt(red));
				String hexGreen = Integer.toHexString(Integer.parseInt(green));
				String hexBlue = Integer.toHexString(Integer.parseInt(blue));
				String hexVal = "#" + (hexRed.length() == 1 ? "0" : "") + hexRed;
				hexVal += (hexGreen.length() == 1 ? "0" : "") + hexGreen;
				hexVal += (hexBlue.length() == 1 ? "0" : "") + hexBlue;
				
				String rv = "<table><tr><td><div style='height: 20px; width: 20px;border:1;border-style:solid;background-color: "+style+"'></div></td><td>"+hexVal+"</td></tr></table>";
				return rv;
			}
		} else if( o instanceof term ) {
			term t = (term) o;
			if( t.getHexColor() != null ) {
				String rv = "<table><tr><td><div style='height: 20px; width: 20px;border:1;border-style:solid;background-color: "+t.getHexColor()+"'></div></td><td>"+t.getHexColor()+"</td></tr></table>";
				return rv;
			}
		}
		return super.getHoverInfoAsHtml(o);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider#getFirstLine(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected String getFirstLine(EObject o) {
		
		
		if (o instanceof css_property) {
			// Properties
			return extension.getDocHeadForProperty(o.eResource().getURI(), ((css_property) o).getName());
		}
		
		if (o instanceof simple_selector) {
			simple_selector s = ((simple_selector)o);
			return extension.getDocForHeadElement(o.eResource().getURI(), s.getElement());
		}
		
		String firstLine =  extension.getDocHead(o.eResource().getURI(), o);
		
		if (firstLine==null) {
			firstLine = super.getFirstLine(o);
		}
		return firstLine;
	}
	
	protected boolean hasHover(EObject o) {
		return true;
//		if( o instanceof function ) {
//			function f = (function) o;
//			if( "rgb".equals(f.getName()) ) {
//				return true;
//			}
//		} else if( o instanceof term ) {
//			term t = (term) o;
//			if( t.getHexColor() != null ) {
//				return true;
//			}
//		}
//		return super.hasHover(o);
	}
}
