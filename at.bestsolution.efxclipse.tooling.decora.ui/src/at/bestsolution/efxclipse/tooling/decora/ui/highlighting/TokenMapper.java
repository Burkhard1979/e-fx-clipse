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
package at.bestsolution.efxclipse.tooling.decora.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

import com.google.inject.Singleton;

/**
 * @author ccaks
 *
 */
@Singleton
public class TokenMapper extends DefaultAntlrTokenToAttributeIdMapper {

//	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		switch (tokenName) {
		case "RULE_TYPE":
		case "RULE_BOOLCONSTANT":
		case "RULE_IF":
		case "RULE_ELSE":
		case "RULE_WHILE":
		case "RULE_DO":
		case "RULE_FOR":
		case "RULE_UNROLL":
		case "RULE_CONTINUE":
		case "RULE_BREAK":
		case "RULE_DISCARD":
		case "RULE_RETURN":
		case "RULE_VOID":
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		default:
			break;
		}
		return super.calculateId(tokenName, tokenType);
//		if(PUNCTUATION.matcher(tokenName).matches()) {
//			return DefaultHighlightingConfiguration.PUNCTUATION_ID;
//		}
//		if("RULE_STRING".equals(tokenName)) {
//			return DefaultHighlightingConfiguration.STRING_ID;
//		}
//		if("RULE_INT".equals(tokenName)) {
//			return DefaultHighlightingConfiguration.NUMBER_ID;
//		}
//		if("RULE_ML_COMMENT".equals(tokenName) || "RULE_SL_COMMENT".equals(tokenName)) {
//			return DefaultHighlightingConfiguration.COMMENT_ID;
//		}
//		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}

}
