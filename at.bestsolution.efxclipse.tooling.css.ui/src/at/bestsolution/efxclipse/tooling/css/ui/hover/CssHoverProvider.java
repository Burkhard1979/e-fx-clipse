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

import javax.swing.text.html.CSS;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.BrowserInformationControlInput;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IInputChangedListener;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.function;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.ui.internal.CssDialectExtensionComponent;
import at.bestsolution.efxclipse.tooling.css.ui.internal.CssDslActivator;

public class CssHoverProvider extends DefaultEObjectHoverProvider {
	
private CssDialectExtensionComponent extension;
	
	public CssHoverProvider() {
		BundleContext context = CssDslActivator.getInstance().getBundle().getBundleContext();
		ServiceReference<CssDialectExtensionComponent> ref = context.getServiceReference(CssDialectExtensionComponent.class);
		extension = context.getService(ref);
		
		
		
	}
	
	
	protected String getHoverInfoAsHtml(css_declaration model) {
		
		return "This is a declaration<br/>";
		
	}
	
	protected String getHoverInfoAsHtml(css_property model) {
		System.err.println("reflective hover=?");
		return extension.getDocForProperty(model.eResource().getURI(), model.getName());
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
				rv += "<a target=\"self\" href=\""+createURI(o)+"\">link</a>";
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
