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
package at.bestsolution.efxclipse.formats.svg;

import java.io.OutputStream;

import java.io.InputStream;

import at.bestsolution.efxclipse.formats.svg.converter.FXMLConverter;
import at.bestsolution.efxclipse.formats.svg.handler.XMLLoader;
import at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement;

public class SVGStreamConverter {
	public void converter(InputStream inputStream, OutputStream outputStream) throws Exception {
		XMLLoader loader = new XMLLoader();
		SvgSvgElement rootElement = loader.loadDocument(null, inputStream);
		FXMLConverter converter = new FXMLConverter(rootElement);
		outputStream.write(converter.generate().toString().getBytes());
	}
}
