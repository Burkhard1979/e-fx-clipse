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
package at.bestsolution.efxclipse.formats.fxg.converter;

import java.io.File;
import java.net.MalformedURLException;

import at.bestsolution.efxclipse.formats.fxg.fxg.Graphic;
import at.bestsolution.efxclipse.formats.fxg.handler.XMLLoader;

public class TestConverter {
	public static void main(String[] args) {
		XMLLoader l = new XMLLoader();
		try {
			Graphic g = l.loadGrapic(new File("C:/e-ws/fxclipse/fxg-examples/Duke Billboard T-Shirt CLEAN.fxg").toURL().openStream());
			FXMLConverter c = new FXMLConverter();
			System.out.println(c.generate(g));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
