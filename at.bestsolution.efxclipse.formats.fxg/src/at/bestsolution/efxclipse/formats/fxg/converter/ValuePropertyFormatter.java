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

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ConstValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.LocationValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueReference;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticCallValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty;

public class ValuePropertyFormatter {
	private String formattedValue;

	public ValuePropertyFormatter(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("value must not be null");
		} else if (value instanceof Property) {
			Property p = (Property) value;
			StringBuffer sb = new StringBuffer();
			if (p.getModifier() != null) {
				sb.append(p.getModifier() + " ");
			}
			sb.append(p.getName() + " : ");
			sb.append(new ValuePropertyFormatter(p.getValue())
					.getFormattedValue());
			formattedValue = sb.toString();
		} else if (value instanceof ResourceValueProperty) {
			ResourceValueProperty p = (ResourceValueProperty) value;
			formattedValue = "rstring \"" + p.getValue().getValue() + "\"";
		} else if (value instanceof LocationValueProperty) {
			LocationValueProperty p = (LocationValueProperty) value;
			formattedValue = "location \"" + p.getValue() + "\"";
		} else if (value instanceof BindValueProperty) {
			BindValueProperty p = (BindValueProperty) value;
			formattedValue = "bind " + p.getElementReference().getName() + "#"
					+ p.getAttribute();
		} else if (value instanceof ControllerHandledValueProperty) {
			formattedValue = "controllermethod "
					+ ((ControllerHandledValueProperty) value).getMethodname();
		} else if (value instanceof ScriptHandlerHandledValueProperty) {
			formattedValue = "scriptmethod "
					+ ((ScriptHandlerHandledValueProperty) value)
							.getFunctionname();
		} else if (value instanceof ScriptValueExpression) {
			formattedValue = "scriptexpression "
					+ ((ScriptValueExpression) value).getSourcecode();
		} else if (value instanceof ScriptValueReference) {
			formattedValue = "scriptvalue "
					+ ((ScriptValueReference) value).getReference();

		} else if (value instanceof StaticValueProperty) {
			StaticValueProperty p = (StaticValueProperty) value;
			StringBuffer sb = new StringBuffer();
			if (p.getModifier() != null) {
				sb.append(p.getModifier() + " ");
			}
			sb.append("static " + p.getName() + " : ");
			sb.append(new ValuePropertyFormatter(p.getValue())
					.getFormattedValue());
			formattedValue = sb.toString();
		} else if (value instanceof StaticCallValueProperty) {
			StaticCallValueProperty p = (StaticCallValueProperty) value;
			StringBuffer sb = new StringBuffer();
			if (p.getModifier() != null) {
				sb.append(p.getModifier() + " ");
			}
			sb.append("call " + p.getType().getSimpleName() + " # "
					+ p.getName() + " : ");
			sb.append(new ValuePropertyFormatter(p.getValue())
					.getFormattedValue());
			formattedValue = sb.toString();
		} else if (value instanceof ConstValueProperty) {
			ConstValueProperty p = (ConstValueProperty) value;
			StringBuffer sb = new StringBuffer();
			sb.append("const " + p.getType().getSimpleName() + "#"
					+ p.getField());
			formattedValue = sb.toString();
		} else if (value instanceof ReferenceValueProperty) {
			ReferenceValueProperty ref = (ReferenceValueProperty) value;
			StringBuffer sb = new StringBuffer();
			sb.append("idref ");
			sb.append(ref.getReference()); // TODO get the name
			if (!ref.getStaticCallProperties().isEmpty()
					|| !ref.getStaticProperties().isEmpty()) {
				// TODO
				sb.append("{");
				boolean comma = false;
				for (StaticCallValueProperty p : ref.getStaticCallProperties()) {
					if (comma) {
						sb.append(",");
					}
					sb.append(new ValuePropertyFormatter(p).getFormattedValue());
					comma = true;
				}
				for (StaticValueProperty p : ref.getStaticProperties()) {
					if (comma) {
						sb.append(",");
					}
					sb.append(new ValuePropertyFormatter(p).getFormattedValue());
					comma = true;
				}
				sb.append("}");
			}
			formattedValue = sb.toString();
		} else if (value instanceof IncludeValueProperty) {
			IncludeValueProperty inc = (IncludeValueProperty) value;
			formattedValue = "include " + "source=" + inc.getSource()
					+ " name=" + inc.getName(); // TODO

		} else if (value instanceof SimpleValueProperty) {
			SimpleValueProperty v = (SimpleValueProperty) value;
			if (v.getBooleanValue() != null) {
				formattedValue = v.getBooleanValue();
			} else if (v.getStringValue() != null) {
				formattedValue = "\"" + v.getStringValue() + "\"";
			} else {
				formattedValue = "" + v.getIntValue();
			}
		} else if (value instanceof ListValueProperty) {
			final StringBuffer sb = new StringBuffer();
			for (int i = 0; i < ((ListValueProperty) value).getValue().size(); i++) {
				ListValueElement o = ((ListValueProperty) value).getValue()
						.get(i);
				if (o instanceof SimpleValueProperty) {
					String val = ((SimpleValueProperty) o).getStringValue();
					if (sb.length() > 0) {
						sb.append("\n");
					}
					sb.append(val);
					if ((i + 1) < ((ListValueProperty) value).getValue().size()) {
						sb.append(",");
					}
				}
			}
			if (sb.length() == 0) {
				sb.append("value : \"no value found\"");
			}
			formattedValue = sb.toString();
		} else {
			formattedValue = value.toString();
		}

	}

	public String getFormattedValue() {
		return formattedValue;
	}
}
