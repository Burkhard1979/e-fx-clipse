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
package at.bestsolution.efxclipse.tooling.converter;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

import at.bestsolution.efxclipse.formats.fxg.converter.FXMLConverter;
import at.bestsolution.efxclipse.formats.fxg.fxg.Graphic;
import at.bestsolution.efxclipse.formats.fxg.handler.XMLLoader;

public class ConvertFXGHandler extends AbstractConverterHandler {

	@Override
	protected String convert(IFile outFile, IFile file) throws ExecutionException {
		try {
			XMLLoader loader = new XMLLoader();
			Graphic g = loader.loadGrapic(file.getContents());
			return new FXMLConverter().generate(g).toString();
		} catch (CoreException e) {
			throw new ExecutionException("Conversion failed", e);
		}
	}
}