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
package at.bestsolution.efxclipse.tooling.css.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import at.bestsolution.efxclipse.tooling.css.cssDsl.ClassSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.PseudoClass;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class CssDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public CssDslLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(ruleset value) {
		StringBuilder b = new StringBuilder();
		
		for( selector s : value.getSelectors() ) {
			if( b.length() > 0 ) {
				b.append(", ");
			}
			b.append(text(s));
		}
		
		return b.toString();
	}
	
	String text(selector value) {
		StringBuilder b = new StringBuilder(/*"se-"*/);
		
		for( simple_selector s : value.getSimpleselectors() ) {
			b.append(text(s));
		}
		
		if( value.getSelector() != null ) {
			if( value.getCombinator() != null ) {
				b.append(" " + value.getCombinator());
			}
			b.append(" " + text(value.getSelector()));
		}
		
		return b.toString();
	}
	
	String image(ruleset ele) {
		return "selector_16x16.png";
	}
	
	String image(css_property ele) {
		return "property_16x16.png";
	}
	
	
	String text(simple_selector value) {
		StringBuilder b = new StringBuilder(/*"si-"*/);
		
		if( value.getElement() != null ) {
			b.append(value.getElement());
		}
		
		for( CssSelector sub : value.getSubSelectors() ) {
			
			if (sub instanceof IdSelector) {
				b.append(((IdSelector) sub).getName());
			}
			else if (sub instanceof ClassSelector) {
				b.append(((ClassSelector) sub).getName());
			}
			else if (sub instanceof PseudoClass) {
				b.append(((PseudoClass) sub).getName());
			}
		}
		
		return b.toString();
	}
	
//	public String text(Object t) {
//		return t.toString();
//	}
	
//	String text(Dim4Size value) {
//		StringBuilder b = new StringBuilder();
//		
//		for( String s : value.getValues() ) {
//			if( b.length() > 0 ) {
//				b.append(" ");
//			}
//			b.append(s);
//		}
//		
//		return b.toString();
//	}
//	
//	String text(PointValue value) {
//		if( value.eContainer() != null  && value.eContainer().eClass().equals(CssDslPackage.Literals.LINEAR_GRADIENT) ) {
//			if( value.eContainingFeature() != null && value.eContainingFeature().equals(CssDslPackage.Literals.LINEAR_GRADIENT__START) ) {
//				return "start";
//			} else {
//				return "end";
//			}
//		}
//		
//		return "point";
//	}
//	
//	
//	String text(StopValue value) {
//		return "stop";
//	}
//	
//	String text(LinearGradient value) {
//		return "linear-gradient";
//	}
//	
	String text(stylesheet value) {
		return "stylesheet";
	}
	
//	String text(BgSize value) {
//		if( value.getPredefined() != null ) {
//			return value.getPredefined();
//		} else {
//			return value.getYsize() != null ? value.getXsize() + " " + value.getYsize() : value.getXsize();
//		}
//	}
//	
//	String text(fx_background_image_size_property value) {
//		StringBuilder b = new StringBuilder();
//		
//		for( BgSize s : value.getValues() ) {
//			if( b.length() > 0 ) {
//				b.append(", ");
//			}
//			b.append(text(s));
//		}
//		
//		return b.toString();
//	}
	
/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}
