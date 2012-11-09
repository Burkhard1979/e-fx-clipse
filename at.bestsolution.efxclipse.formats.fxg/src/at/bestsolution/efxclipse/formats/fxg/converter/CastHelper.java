/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.formats.fxg.converter;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FactoryValueElement;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty;

public class CastHelper {
	public Element castToElement(FactoryValueElement element) {
		return (Element) element;
	}

	public Element castToElement(ValueProperty property) {
		return (Element) property;
	}

	public Element castToElement(ListValueElement property) {
		return (Element) property;
	}

	public ListValueProperty castToListValueProperty(ValueProperty property) {
		return (ListValueProperty) property;
	}

	public MapValueProperty castToMapValueProperty(ValueProperty property) {
		return (MapValueProperty) property;
	}
}
