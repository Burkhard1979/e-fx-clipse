/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.text.test.app.sample.jscanners;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import at.bestsolution.efxclipse.styledtext.StyleRange;
import at.bestsolution.efxclipse.styledtext.TextStyle;
import at.bestsolution.efxclipse.text.jface.text.TextAttribute;
import at.bestsolution.efxclipse.text.jface.text.rules.BufferedRuleBasedScanner;
import at.bestsolution.efxclipse.text.jface.text.rules.IRule;
import at.bestsolution.efxclipse.text.jface.text.rules.IToken;
import at.bestsolution.efxclipse.text.jface.text.rules.Token;


/**
 * Initialized with a color manager and a preference store, its subclasses are
 * only responsible for providing a list of preference keys for based on which tokens
 * are generated and to use this tokens to define the rules controlling this scanner.
 * <p>
 * This scanner stores the color defined by the color preference key into
 * the color manager under the same key.
 * </p>
 * <p>
 * Preference color key + {@link PreferenceConstants#EDITOR_BOLD_SUFFIX} are used
 * to retrieve whether the token is rendered in bold.
 * </p>
 * <p>
 * Preference color key + {@link PreferenceConstants#EDITOR_ITALIC_SUFFIX} are used
 * to retrieve whether the token is rendered in italic.
 * </p>
 * <p>
 * Preference color key + {@link PreferenceConstants#EDITOR_STRIKETHROUGH_SUFFIX} are used
 * to retrieve whether the token is rendered in strikethrough.
 * </p>
 * <p>
 * Preference color key + {@link PreferenceConstants#EDITOR_UNDERLINE_SUFFIX} are used
 * to retrieve whether the token is rendered in underline.
 * </p>
 */
public abstract class AbstractJavaScanner extends BufferedRuleBasedScanner {

	private Map<String,Token> fTokenMap= new HashMap<String,Token>();
	/**
	 * Returns an array of preference keys which define the tokens
	 * used in the rules of this scanner.
	 * <p>
	 * The preference key is used access the color in the preference
	 * store and in the color manager.
	 * </p>
	 * <p>
	 * Preference key + {@link PreferenceConstants#EDITOR_BOLD_SUFFIX} is used
	 * to retrieve whether the token is rendered in bold.
	 * </p>
	 * <p>
	 * Preference key + {@link PreferenceConstants#EDITOR_ITALIC_SUFFIX} is used
	 * to retrieve whether the token is rendered in italic.
	 * </p>
	 * <p>
	 * Preference key + {@link PreferenceConstants#EDITOR_UNDERLINE_SUFFIX} is used
	 * to retrieve whether the token is rendered underlined.
	 * </p>
	 * <p>
	 * Preference key + {@link PreferenceConstants#EDITOR_STRIKETHROUGH_SUFFIX} is used
	 * to retrieve whether the token is rendered stricken out.
	 * </p>
	 */
	abstract protected String[] getTokenProperties();

	/**
	 * Creates the list of rules controlling this scanner.
	 */
	abstract protected List<IRule> createRules();


	private TextAttributesManager colorManager;
	
	/**
	 * Creates an abstract Java scanner.
	 */
	public AbstractJavaScanner(TextAttributesManager colorManager) {
		super();
		this.colorManager = colorManager;
	}

	/**
	 * Must be called after the constructor has been called.
	 */
	public final void initialize() {
		
		for( String tokenKey : getTokenProperties() ) {
			addToken(tokenKey);
		}

		initializeRules();
	}

	public IToken nextToken() {
		return super.nextToken();
	}

	private void addToken(String tokenKey) {
		fTokenMap.put(tokenKey, new Token(createTextAttribute(tokenKey)));
	}

	private TextAttribute createTextAttribute(String colorKey) {
		TextAttribute attribute = colorManager.getTokenAttribute(colorKey);
		return attribute == null ? new TextAttribute(null, null, StyleRange.NORMAL) : attribute;
	}

	protected Token getToken(String key) {
		return (Token) fTokenMap.get(key);
	}

	private void initializeRules() {
		List<IRule> rules= createRules();
		if (rules != null) {
			IRule[] result= new IRule[rules.size()];
			rules.toArray(result);
			setRules(result);
		}
	}


}
