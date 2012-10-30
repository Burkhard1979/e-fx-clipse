package at.bestsolution.efxclipse.formats.fxg.converter;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty;

public class ValuePropertyFormatter {
	private String formattedValue;

	public ValuePropertyFormatter(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("value must not be null");
		} else {
			if (value instanceof SimpleValueProperty) {
				formattedValue = ((SimpleValueProperty) value).getStringValue();
			} else if (value instanceof ListValueProperty) {
				final StringBuffer sb = new StringBuffer();
				for (int i = 0; i < ((ListValueProperty) value).getValue()
						.size(); i++) {
					ListValueElement o = ((ListValueProperty) value).getValue()
							.get(i);
					if (o instanceof SimpleValueProperty) {
						String val = ((SimpleValueProperty) o).getStringValue();
						if (sb.length() > 0) {
							sb.append("\n");
						}
						sb.append(val);
						if ((i + 1) < ((ListValueProperty) value).getValue()
								.size()) {
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
	}

	public String getFormattedValue() {
		return formattedValue;
	}
}
