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


import java.util.List;

import at.bestsolution.efxclipse.text.jface.text.rules.IRule;


/**
 *
 */
public final class SingleTokenJavaScanner extends AbstractJavaScanner{


	private String[] fProperty;

	public SingleTokenJavaScanner(TextAttributesManager colorManager, String property) {
		super(colorManager);
		fProperty= new String[] { property };
		initialize();
	}

	/*
	 * @see AbstractJavaScanner#getTokenProperties()
	 */
	protected String[] getTokenProperties() {
		return fProperty;
	}

	/*
	 * @see AbstractJavaScanner#createRules()
	 */
	protected List<IRule> createRules() {
		setDefaultReturnToken(getToken(fProperty[0]));
		return null;
	}
}