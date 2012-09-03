/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.fxgraph.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.formatting.IWhitespaceInformationProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.contentassist.ImportingTypesProposalProvider;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.formatting.FXGraphWhitespaceInformationProvider;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.hover.FXHoverProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class FXGraphUiModule extends at.bestsolution.efxclipse.tooling.fxgraph.ui.AbstractFXGraphUiModule {
	public FXGraphUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return FXHoverProvider.class;
	}
	
	@Override
	public Class<? extends ITypesProposalProvider> bindITypesProposalProvider() {
		return ImportingTypesProposalProvider.class;
	}
	
	@Override
	public Class<? extends IWhitespaceInformationProvider> bindIWhitespaceInformationProvider() {
		return FXGraphWhitespaceInformationProvider.class;
	}
}
