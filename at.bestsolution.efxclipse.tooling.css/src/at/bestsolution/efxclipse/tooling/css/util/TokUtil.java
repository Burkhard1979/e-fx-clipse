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
package at.bestsolution.efxclipse.tooling.css.util;

import java.util.Iterator;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.cssDsl.ColorTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FuncTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.NumberTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.SymbolTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.UrlTok;

/**
 * @author ccaks
 *
 */
public class TokUtil {

	public static String toString(CssTok token) {
		if (token == null) { 
			return "<null>";
		}
		switch(token.eClass().getClassifierID()) {
		case CssDslPackage.IDENTIFIER_TOK: return "'" + ((IdentifierTok)token).getName() + "'";
		case CssDslPackage.WS_TOK: return "WS";
		case CssDslPackage.NUMBER_TOK: return "" + ((NumberTok)token).getVal() + "";
		case CssDslPackage.COLOR_TOK: return "color(" + ((ColorTok)token).getValue() + ")";
		case CssDslPackage.URL_TOK: return "url(" + ((UrlTok)token).getUrl().getUrl() + ")";
		case CssDslPackage.SYMBOL_TOK: return "[" + ((SymbolTok)token).getSymbol() + "]";
		case CssDslPackage.FUNC_TOK: return "f(" + ((FuncTok)token).getName().getName() /*+ "("+toString(((FuncTok)token).getParams(), ", ")+")"*/+ ")";
		default: return token.toString();
		}
	}
		
	public static String toString(List<CssTok> token, String join) {
		StringBuilder b = new StringBuilder();
		Iterator<CssTok> iterator = token.iterator();
		while (iterator.hasNext()) {
			b.append(toString(iterator.next()));
			if (iterator.hasNext()) {
				b.append(join);
			}
		}
		return b.toString();
	}
	
}
