/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.cssext.ui.outline;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;

/**
 * customization of the default outline structure
 * 
 */
public class CssExtDslOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	protected Object _text(CSSRuleBracket model) {
		return "CSSRuleBracket []";
	}
	
	protected Object _text(CSSRuleOr model) {
		return "CSSRuleOr |";
	}
	
	protected Object _text(CSSRuleXor model) {
		return "CSSRuleXor ||";
	}
	
	protected Object _text(CSSRuleConcat model) {
		return "CSSRuleConcat";
	}
	
	protected Object _text(CSSRuleLiteral model) {
		return model.getValue();
	}
	
	protected Object _text(CSSRuleRef model) {
		return "<" + model.getRef().getName() + ">";
	}
	
	protected Object _text(CSSRulePostfix model) {
		return "CSSRulePostfix " + model.getCardinality();
	}
	
	protected void _createNode(Object parentObject, CSSRuleId model) {
	}
	
	
}
