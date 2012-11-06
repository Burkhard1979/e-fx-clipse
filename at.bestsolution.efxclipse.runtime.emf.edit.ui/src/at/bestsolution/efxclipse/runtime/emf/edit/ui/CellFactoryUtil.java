/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.emf.edit.ui;

import java.net.URL;

import javafx.scene.Node;
import javafx.scene.control.Cell;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;

/**
 * Contains various helper functions that map values provided by EMF adapters to JavaFX styles and objects.
 */
final public class CellFactoryUtil {

	private CellFactoryUtil() {
	}

	public static Color colorFromObject(Object object) {
		if (object instanceof URI) {
			URI colorURI = (URI) object;

			if (!"color".equals(colorURI.scheme()))
				throw new IllegalArgumentException("Only 'color' scheme is recognized " + colorURI);

			if (!"rgb".equals(colorURI.authority())) {
				throw new IllegalArgumentException("Only 'rgb' authority is recognized " + colorURI);
			} else {
				if (colorURI.segmentCount() != 3)
					throw new IllegalArgumentException("Color must have 3 segments (r, g, b) " + colorURI);

				int red, green, blue;

				try {
					red = Integer.parseInt(colorURI.segment(0));
					green = Integer.parseInt(colorURI.segment(1));
					blue = Integer.parseInt(colorURI.segment(2));
					return Color.rgb(red, green, blue);
				} catch (NumberFormatException e) {
					throw new IllegalArgumentException("Cannot parse color values " + colorURI + ". " + e.getMessage());
				}

			}
		}

		return null;
	}

	public static String cssColorFromObject(Object object) {
		if (object instanceof URI) {
			URI colorURI = (URI) object;

			if (!"color".equals(colorURI.scheme()))
				throw new IllegalArgumentException("Only 'color' scheme is recognized " + colorURI);

			if (!"rgb".equals(colorURI.authority()))
				throw new IllegalArgumentException("Only 'rgb' authority is recognized " + colorURI);

			if (colorURI.segmentCount() != 3)
				throw new IllegalArgumentException("Color must have 3 segments (r, g, b) " + colorURI);

			return String.format("rgb(" + colorURI.segment(0) + ", " + colorURI.segment(1) + ", " + colorURI.segment(2) + ")");
		}

		return null;
	}

	public static Font fontFromObject(Object object) {

		if (object instanceof URI) {
			URI fontURI = (URI) object;
			if (!"font".equals(fontURI.scheme()))
				throw new IllegalArgumentException("Only 'font' scheme is recognized" + fontURI);

			// font name
			String fontNameSpecification = fontURI.authority();
			if ("".equals(fontNameSpecification))
				fontNameSpecification = null;

			// font height
			String heightSpecification = fontURI.segment(0);
			boolean delta;
			int height;
			if (heightSpecification.startsWith("+")) {
				delta = true;
				height = Integer.parseInt(heightSpecification.substring(1));
			} else if ("".equals(heightSpecification)) {
				delta = true;
				height = 0;
			} else {
				height = Integer.parseInt(heightSpecification);
				delta = height < 0;
			}

			// font style
			String styleSpecification = fontURI.segment(1);
			boolean italic = false;
			boolean bold = false;
			if ("bold".equals(styleSpecification))
				bold = true;
			else if ("italic".equals(styleSpecification))
				italic = true;
			else if ("italic+bold".equals(styleSpecification) || "bold+italic".equals(styleSpecification))
				bold = italic = true;

			double size = delta ? Font.getDefault().getSize() + height : height;

			return Font.font(fontNameSpecification, bold ? FontWeight.BOLD : FontWeight.NORMAL, italic ? FontPosture.ITALIC
					: FontPosture.REGULAR, size);
		}

		return null;
	}

	public static void applyItemProviderStyle(Object item, Cell<?> cell, AdapterFactory adapterFactory) {
		applyItemProviderLabel(item, cell, adapterFactory);
		applyItemProviderColor(item, cell, adapterFactory);
		applyItemProviderFont(item, cell, adapterFactory);
	}

	public static void applyTableItemProviderStyle(Object item, int columnIndex, Cell<?> cell, AdapterFactory adapterFactory) {
		applyTableItemProviderLabel(item, columnIndex, cell, adapterFactory);
		applyTableItemProviderColor(item, columnIndex, cell, adapterFactory);
		applyTableItemProviderFont(item, columnIndex, cell, adapterFactory);
	}

	public static void applyItemProviderLabel(Object item, Cell<?> cell, AdapterFactory adapterFactory) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(item, IItemLabelProvider.class);

		if (labelProvider != null)
			cell.setText(labelProvider.getText(item));

		if (item != null) {
			Object image = labelProvider.getImage(item);
			if (image instanceof URL) {
				Node graphic = new ImageView(((URL) image).toExternalForm());
				cell.setGraphic(graphic);
			}
		}
	}

	public static void applyTableItemProviderLabel(Object item, int columnIndex, Cell<?> cell, AdapterFactory adapterFactory) {
		ITableItemLabelProvider labelProvider = (ITableItemLabelProvider) adapterFactory.adapt(item, ITableItemLabelProvider.class);

		if (labelProvider != null)
			cell.setText(labelProvider.getColumnText(item, columnIndex));

		if (item != null) {
			Object image = labelProvider.getColumnImage(item, columnIndex);
			if (image instanceof URL) {
				Node graphic = new ImageView(((URL) image).toExternalForm());
				cell.setGraphic(graphic);
			}
		}
	}

	public static void applyItemProviderColor(Object item, Cell<?> cell, AdapterFactory adapterFactory) {
		IItemColorProvider colorProvider = (IItemColorProvider) adapterFactory.adapt(item, IItemColorProvider.class);
		if (colorProvider != null) {
			Color foreground = CellFactoryUtil.colorFromObject(colorProvider.getForeground(item));
			if (foreground != null)
				cell.setTextFill(foreground);

			String background = CellFactoryUtil.cssColorFromObject(colorProvider.getBackground(item));
			if (background != null)
				cell.setStyle("-fx-background-color: " + background);
		}
	}

	public static void applyTableItemProviderColor(Object item, int columnIndex, Cell<?> cell, AdapterFactory adapterFactory) {
		ITableItemColorProvider colorProvider = (ITableItemColorProvider) adapterFactory.adapt(item, ITableItemColorProvider.class);
		if (colorProvider != null) {
			Color foreground = CellFactoryUtil.colorFromObject(colorProvider.getForeground(item, columnIndex));
			if (foreground != null)
				cell.setTextFill(foreground);

			String background = CellFactoryUtil.cssColorFromObject(colorProvider.getBackground(item, columnIndex));
			if (background != null)
				cell.setStyle("-fx-background-color: " + background);
		}
	}

	public static void applyItemProviderFont(Object item, Cell<?> cell, AdapterFactory adapterFactory) {
		IItemFontProvider fontProvider = (IItemFontProvider) adapterFactory.adapt(item, IItemFontProvider.class);
		if (fontProvider != null) {
			Font font = CellFactoryUtil.fontFromObject(fontProvider.getFont(item));
			if (font != null)
				cell.setFont(font);
		}
	}

	public static void applyTableItemProviderFont(Object item, int columnIndex, Cell<?> cell, AdapterFactory adapterFactory) {
		ITableItemFontProvider fontProvider = (ITableItemFontProvider) adapterFactory.adapt(item, ITableItemFontProvider.class);
		if (fontProvider != null) {
			Font font = CellFactoryUtil.fontFromObject(fontProvider.getFont(item, columnIndex));
			if (font != null)
				cell.setFont(font);
		}
	}

}
