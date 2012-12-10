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
package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import at.bestsolution.efxclipse.runtime.core.log.LoggerFactory;
import at.bestsolution.efxclipse.runtime.guice.FXLoggerListener;
import at.bestsolution.efxclipse.runtime.guice.OSGiLoggerFactoryProvider;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.doc.CssExtDocParser;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.highlighting.CssExtHighlightingConfiguration;
import at.bestsolution.efxclipse.tooling.css.cssext.ui.highlighting.CssExtSemanticHighlightingCalculator;

import com.google.inject.Binder;
import com.google.inject.matcher.Matchers;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CssExtDslUiModule extends at.bestsolution.efxclipse.tooling.css.cssext.ui.AbstractCssExtDslUiModule {
	public CssExtDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configure(Binder binder) {
		
		binder.bind(ISemanticHighlightingCalculator.class).to(CssExtSemanticHighlightingCalculator.class);
		binder.bind(IHighlightingConfiguration.class).to(CssExtHighlightingConfiguration.class);
		
		binder.bind(ICssExtManager.class).toInstance(new CssExtManager());
		binder.bind(CssExtDocParser.class).toInstance(new CssExtDocParser());
		
		binder.bind(LoggerFactory.class).toProvider(OSGiLoggerFactoryProvider.class);
		binder.bindListener(Matchers.any(), new FXLoggerListener());
		
		super.configure(binder);
	}
}
