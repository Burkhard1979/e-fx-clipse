/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Tom Schindl<tom.schindl@bestsolution.at> - ported to JavaFX
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.panels;


import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.WritableBooleanValue;
import javafx.beans.value.WritableIntegerValue;
import javafx.scene.Node;

public class GridLayoutPane extends AbstractLayoutPane<GridLayoutPane.GridData> {
	private WritableIntegerValue numColumnsProperty = new SimpleIntegerProperty(this, "columns", 1);
	
	private WritableBooleanValue makeColumnsEqualWidthProperty = new SimpleBooleanProperty(this,"makeColumnsEqualWidth",false);
	private WritableIntegerValue marginWidth = new SimpleIntegerProperty(this, "marginWidth", 5);
	private WritableIntegerValue marginHeight = new SimpleIntegerProperty(this, "marginHeight", 5);
	
	private WritableIntegerValue marginLeft = new SimpleIntegerProperty(this, "marginLeft", 0);
	private WritableIntegerValue marginTop = new SimpleIntegerProperty(this, "marginTop", 0);
	private WritableIntegerValue marginRight = new SimpleIntegerProperty(this, "marginRight", 0);
	private WritableIntegerValue marginBottom = new SimpleIntegerProperty(this, "marginBottom", 0);
	
	private WritableIntegerValue horizontalSpacing = new SimpleIntegerProperty(this, "horizontalSpacing", 5);
	private WritableIntegerValue verticalSpacing = new SimpleIntegerProperty(this, "verticalSpacing", 5);
	
	public static class GridData {
		/**
		 * verticalAlignment specifies how controls will be positioned 
		 * vertically within a cell. 
		 *
		 * The default value is CENTER.
		 *
		 * Possible values are: <ul>
		 *    <li>SWT.BEGINNING (or SWT.TOP): Position the control at the top of the cell</li>
		 *    <li>SWT.CENTER: Position the control in the vertical center of the cell</li>
		 *    <li>SWT.END (or SWT.BOTTOM): Position the control at the bottom of the cell</li>
		 *    <li>SWT.FILL: Resize the control to fill the cell vertically</li>
		 * </ul>
		 */
		public int verticalAlignment = CENTER;
		
		/**
		 * horizontalAlignment specifies how controls will be positioned 
		 * horizontally within a cell. 
		 *
		 * The default value is BEGINNING.
		 *
		 * Possible values are: <ul>
		 *    <li>SWT.BEGINNING (or SWT.LEFT): Position the control at the left of the cell</li>
		 *    <li>SWT.CENTER: Position the control in the horizontal center of the cell</li>
		 *    <li>SWT.END (or SWT.RIGHT): Position the control at the right of the cell</li>
		 *    <li>SWT.FILL: Resize the control to fill the cell horizontally</li>
		 * </ul>
		 */
		public int horizontalAlignment = BEGINNING;
		
		/**
		 * widthHint specifies the preferred width in pixels. This value
		 * is the wHint passed into Control.computeSize(int, int, boolean) 
		 * to determine the preferred size of the control.
		 *
		 * The default value is SWT.DEFAULT.
		 * 
		 * @see Control#computeSize(int, int, boolean)
		 */
		public int widthHint = SWT_DEFAULT;
		
		/**
		 * heightHint specifies the preferred height in pixels. This value
		 * is the hHint passed into Control.computeSize(int, int, boolean) 
		 * to determine the preferred size of the control.
		 *
		 * The default value is SWT.DEFAULT.
		 * 
		 * @see Control#computeSize(int, int, boolean)
		 */
		public int heightHint = SWT_DEFAULT;
		
		/**
		 * horizontalIndent specifies the number of pixels of indentation
		 * that will be placed along the left side of the cell.
		 *
		 * The default value is 0.
		 */
		public int horizontalIndent = 0;
		
		/**
		 * verticalIndent specifies the number of pixels of indentation
		 * that will be placed along the top side of the cell.
		 *
		 * The default value is 0.
		 * 
		 * @since 3.1
		 */
		public int verticalIndent = 0;
		
		/**
		 * horizontalSpan specifies the number of column cells that the control
		 * will take up.
		 *
		 * The default value is 1.
		 */
		public int horizontalSpan = 1;
		
		/**
		 * verticalSpan specifies the number of row cells that the control
		 * will take up.
		 *
		 * The default value is 1.
		 */
		public int verticalSpan = 1;
		
		/**
		 * <p>grabExcessHorizontalSpace specifies whether the width of the cell 
		 * changes depending on the size of the parent Composite.  If 
		 * grabExcessHorizontalSpace is <code>true</code>, the following rules
		 * apply to the width of the cell:</p>
		 * <ul>
		 * <li>If extra horizontal space is available in the parent, the cell will 
		 * grow to be wider than its preferred width.  The new width 
		 * will be "preferred width + delta" where delta is the extra 
		 * horizontal space divided by the number of grabbing columns.</li>
		 * <li>If there is not enough horizontal space available in the parent, the 
		 * cell will shrink until it reaches its minimum width as specified by 
		 * GridData.minimumWidth. The new width will be the maximum of 
		 * "minimumWidth" and "preferred width - delta", where delta is 
		 * the amount of space missing divided by the number of grabbing columns.</li>
		 * <li>If the parent is packed, the cell will be its preferred width 
		 * as specified by GridData.widthHint.</li>
		 * <li>If the control spans multiple columns and there are no other grabbing 
		 * controls in any of the spanned columns, the last column in the span will
		 * grab the extra space.  If there is at least one other grabbing control
		 * in the span, the grabbing will be spread over the columns already 
		 * marked as grabExcessHorizontalSpace.</li>
		 * </ul>
		 * 
		 * <p>The default value is false.</p>
		 * 
		 * @see GridData#minimumWidth
		 * @see GridData#widthHint
		 */	
		public boolean grabExcessHorizontalSpace = false;
		
		/**
		 * <p>grabExcessVerticalSpace specifies whether the height of the cell 
		 * changes depending on the size of the parent Composite.  If 
		 * grabExcessVerticalSpace is <code>true</code>, the following rules
		 * apply to the height of the cell:</p>
		 * <ul>
		 * <li>If extra vertical space is available in the parent, the cell will 
		 * grow to be taller than its preferred height.  The new height 
		 * will be "preferred height + delta" where delta is the extra 
		 * vertical space divided by the number of grabbing rows.</li>
		 * <li>If there is not enough vertical space available in the parent, the 
		 * cell will shrink until it reaches its minimum height as specified by 
		 * GridData.minimumHeight. The new height will be the maximum of 
		 * "minimumHeight" and "preferred height - delta", where delta is 
		 * the amount of space missing divided by the number of grabbing rows.</li>
		 * <li>If the parent is packed, the cell will be its preferred height 
		 * as specified by GridData.heightHint.</li>
		 * <li>If the control spans multiple rows and there are no other grabbing 
		 * controls in any of the spanned rows, the last row in the span will
		 * grab the extra space.  If there is at least one other grabbing control
		 * in the span, the grabbing will be spread over the rows already 
		 * marked as grabExcessVerticalSpace.</li>
		 * </ul>
		 * 
		 * <p>The default value is false.</p>
		 * 
		 * @see GridData#minimumHeight
		 * @see GridData#heightHint
		 */	
		public boolean grabExcessVerticalSpace = false;

		/**
		 * minimumWidth specifies the minimum width in pixels.  This value
		 * applies only if grabExcessHorizontalSpace is true. A value of 
		 * SWT.DEFAULT means that the minimum width will be the result
		 * of Control.computeSize(int, int, boolean) where wHint is 
		 * determined by GridData.widthHint.
		 *
		 * The default value is 0.
		 *
		 * @since 3.1
		 * @see Control#computeSize(int, int, boolean)
		 * @see GridData#widthHint
		 */
		public int minimumWidth = 0;
		
		/**
		 * minimumHeight specifies the minimum height in pixels.  This value
		 * applies only if grabExcessVerticalSpace is true.  A value of 
		 * SWT.DEFAULT means that the minimum height will be the result
		 * of Control.computeSize(int, int, boolean) where hHint is 
		 * determined by GridData.heightHint.
		 *
		 * The default value is 0.
		 *
		 * @since 3.1
		 * @see Control#computeSize(int, int, boolean)
		 * @see GridData#heightHint
		 */
		public int minimumHeight = 0;
		
		/**
		 * exclude informs the layout to ignore this control when sizing
		 * and positioning controls.  If this value is <code>true</code>,
		 * the size and position of the control will not be managed by the
		 * layout.  If this	value is <code>false</code>, the size and 
		 * position of the control will be computed and assigned.
		 * 
		 * The default value is <code>false</code>.
		 * 
		 * @since 3.1
		 */
		public boolean exclude = false;
		
		/**
		 * Value for horizontalAlignment or verticalAlignment.
		 * Position the control at the top or left of the cell.
		 * Not recommended. Use SWT.BEGINNING, SWT.TOP or SWT.LEFT instead.
		 */
		public static final int BEGINNING = SWT_BEGINNING;
		
		/**
		 * Value for horizontalAlignment or verticalAlignment.
		 * Position the control in the vertical or horizontal center of the cell
		 * Not recommended. Use SWT.CENTER instead.
		 */
		public static final int CENTER = 2;
		
		/**
		 * Value for horizontalAlignment or verticalAlignment.
		 * Position the control at the bottom or right of the cell
		 * Not recommended. Use SWT.END, SWT.BOTTOM or SWT.RIGHT instead.
		 */
		public static final int END = 3;
		
		/**
		 * Value for horizontalAlignment or verticalAlignment.
		 * Resize the control to fill the cell horizontally or vertically.
		 * Not recommended. Use SWT.FILL instead.
		 */
		public static final int FILL = SWT_FILL;

		/**
		 * Style bit for <code>new GridData(int)</code>.
		 * Position the control at the top of the cell.
		 * Not recommended. Use 
		 * <code>new GridData(int, SWT.BEGINNING, boolean, boolean)</code>
		 * instead.
		 */
		public static final int VERTICAL_ALIGN_BEGINNING =  1 << 1;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to position the 
		 * control in the vertical center of the cell.
		 * Not recommended. Use
		 * <code>new GridData(int, SWT.CENTER, boolean, boolean)</code>
		 * instead.
		 */
		public static final int VERTICAL_ALIGN_CENTER = 1 << 2;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to position the 
		 * control at the bottom of the cell.
		 * Not recommended. Use
		 * <code>new GridData(int, SWT.END, boolean, boolean)</code>
		 * instead.
		 */
		public static final int VERTICAL_ALIGN_END = 1 << 3;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to resize the 
		 * control to fill the cell vertically.
		 * Not recommended. Use
		 * <code>new GridData(int, SWT.FILL, boolean, boolean)</code>
		 * instead
		 */
		public static final int VERTICAL_ALIGN_FILL = 1 << 4;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to position the 
		 * control at the left of the cell.
		 * Not recommended. Use
		 * <code>new GridData(SWT.BEGINNING, int, boolean, boolean)</code>
		 * instead.
		 */
		public static final int HORIZONTAL_ALIGN_BEGINNING =  1 << 5;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to position the 
		 * control in the horizontal center of the cell.
		 * Not recommended. Use
		 * <code>new GridData(SWT.CENTER, int, boolean, boolean)</code>
		 * instead.
		 */
		public static final int HORIZONTAL_ALIGN_CENTER = 1 << 6;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to position the 
		 * control at the right of the cell.
		 * Not recommended. Use
		 * <code>new GridData(SWT.END, int, boolean, boolean)</code>
		 * instead.
		 */
		public static final int HORIZONTAL_ALIGN_END = 1 << 7;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to resize the 
		 * control to fill the cell horizontally.
		 * Not recommended. Use
		 * <code>new GridData(SWT.FILL, int, boolean, boolean)</code>
		 * instead.
		 */
		public static final int HORIZONTAL_ALIGN_FILL = 1 << 8;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to resize the 
		 * control to fit the remaining horizontal space.
		 * Not recommended. Use
		 * <code>new GridData(int, int, true, boolean)</code>
		 * instead.
		 */
		public static final int GRAB_HORIZONTAL = 1 << 9;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to resize the 
		 * control to fit the remaining vertical space.
		 * Not recommended. Use
		 * <code>new GridData(int, int, boolean, true)</code>
		 * instead.
		 */
		public static final int GRAB_VERTICAL = 1 << 10;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to resize the 
		 * control to fill the cell vertically and to fit the remaining
		 * vertical space.
		 * FILL_VERTICAL = VERTICAL_ALIGN_FILL | GRAB_VERTICAL
		 * Not recommended. Use
		 * <code>new GridData(int, SWT.FILL, boolean, true)</code>
		 * instead.
		 */	
		public static final int FILL_VERTICAL = VERTICAL_ALIGN_FILL | GRAB_VERTICAL;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to resize the 
		 * control to fill the cell horizontally and to fit the remaining
		 * horizontal space.
		 * FILL_HORIZONTAL = HORIZONTAL_ALIGN_FILL | GRAB_HORIZONTAL
		 * Not recommended. Use
		 * <code>new GridData(SWT.FILL, int, true, boolean)</code>
		 * instead.
		 */	
		public static final int FILL_HORIZONTAL = HORIZONTAL_ALIGN_FILL | GRAB_HORIZONTAL;
		
		/**
		 * Style bit for <code>new GridData(int)</code> to resize the 
		 * control to fill the cell horizontally and vertically and 
		 * to fit the remaining horizontal and vertical space.
		 * FILL_BOTH = FILL_VERTICAL | FILL_HORIZONTAL
		 * Not recommended. Use
		 * <code>new GridData(SWT.FILL, SWT.FILL, true, true)</code>
		 * instead.
		 */	
		public static final int FILL_BOTH = FILL_VERTICAL | FILL_HORIZONTAL;

		double cacheWidth = -1, cacheHeight = -1;
		double defaultWhint, defaultHhint, defaultWidth = -1, defaultHeight = -1;
		double currentWhint, currentHhint, currentWidth = -1, currentHeight = -1;
		
		/**
		 * Constructs a new instance of GridData using
		 * default values.
		 */
		public GridData () {
			super ();
		}

		/**
		 * Constructs a new instance based on the GridData style.
		 * This constructor is not recommended.
		 * 
		 * @param style the GridData style
		 */
		public GridData (int style) {
			super ();
			if ((style & VERTICAL_ALIGN_BEGINNING) != 0) verticalAlignment = BEGINNING;
			if ((style & VERTICAL_ALIGN_CENTER) != 0) verticalAlignment = CENTER;
			if ((style & VERTICAL_ALIGN_FILL) != 0) verticalAlignment = FILL;
			if ((style & VERTICAL_ALIGN_END) != 0) verticalAlignment = END;
			if ((style & HORIZONTAL_ALIGN_BEGINNING) != 0) horizontalAlignment = BEGINNING;
			if ((style & HORIZONTAL_ALIGN_CENTER) != 0) horizontalAlignment = CENTER;
			if ((style & HORIZONTAL_ALIGN_FILL) != 0) horizontalAlignment = FILL;
			if ((style & HORIZONTAL_ALIGN_END) != 0) horizontalAlignment = END;
			grabExcessHorizontalSpace = (style & GRAB_HORIZONTAL) != 0;
			grabExcessVerticalSpace = (style & GRAB_VERTICAL) != 0;
		}

		/**
		 * Constructs a new instance of GridData according to the parameters.
		 * 
		 * @param horizontalAlignment how control will be positioned horizontally within a cell,
		 * 		one of: SWT.BEGINNING (or SWT.LEFT), SWT.CENTER, SWT.END (or SWT.RIGHT), or SWT.FILL
		 * @param verticalAlignment how control will be positioned vertically within a cell,
		 * 		one of: SWT.BEGINNING (or SWT.TOP), SWT.CENTER, SWT.END (or SWT.BOTTOM), or SWT.FILL
		 * @param grabExcessHorizontalSpace whether cell will be made wide enough to fit the remaining horizontal space
		 * @param grabExcessVerticalSpace whether cell will be made high enough to fit the remaining vertical space
		 * 
		 * @since 3.0
		 */
		public GridData (int horizontalAlignment, int verticalAlignment, boolean grabExcessHorizontalSpace, boolean grabExcessVerticalSpace) {
			this (horizontalAlignment, verticalAlignment, grabExcessHorizontalSpace, grabExcessVerticalSpace, 1, 1);
		}

		/**
		 * Constructs a new instance of GridData according to the parameters.
		 *  
		 * @param horizontalAlignment how control will be positioned horizontally within a cell,
		 * 		one of: SWT.BEGINNING (or SWT.LEFT), SWT.CENTER, SWT.END (or SWT.RIGHT), or SWT.FILL
		 * @param verticalAlignment how control will be positioned vertically within a cell,
		 * 		one of: SWT.BEGINNING (or SWT.TOP), SWT.CENTER, SWT.END (or SWT.BOTTOM), or SWT.FILL
		 * @param grabExcessHorizontalSpace whether cell will be made wide enough to fit the remaining horizontal space
		 * @param grabExcessVerticalSpace whether cell will be made high enough to fit the remaining vertical space
		 * @param horizontalSpan the number of column cells that the control will take up
		 * @param verticalSpan the number of row cells that the control will take up
		 * 
		 * @since 3.0
		 */
		public GridData (int horizontalAlignment, int verticalAlignment, boolean grabExcessHorizontalSpace, boolean grabExcessVerticalSpace, int horizontalSpan, int verticalSpan) {
			super ();
			this.horizontalAlignment = horizontalAlignment;
			this.verticalAlignment = verticalAlignment;
			this.grabExcessHorizontalSpace = grabExcessHorizontalSpace;
			this.grabExcessVerticalSpace = grabExcessVerticalSpace;
			this.horizontalSpan = horizontalSpan;
			this.verticalSpan = verticalSpan;
		}

		/**
		 * Constructs a new instance of GridData according to the parameters.
		 * A value of SWT.DEFAULT indicates that no minimum width or
		 * no minimum height is specified.
		 * 
		 * @param width a minimum width for the column
		 * @param height a minimum height for the row
		 * 
		 * @since 3.0
		 */
		public GridData (int width, int height) {
			super ();
			this.widthHint = width;
			this.heightHint = height;
		}

		void computeSize (Node control, int wHint, int hHint, boolean flushCache) {
			if (cacheWidth != -1 && cacheHeight != -1) return;
			if (wHint == this.widthHint && hHint == this.heightHint) {
				if (defaultWidth == -1 || defaultHeight == -1 || wHint != defaultWhint || hHint != defaultHhint) {
//					Point size = control.computeSize (wHint, hHint, flushCache);
					defaultWhint = wHint;
					defaultHhint = hHint;
					defaultWidth = control.prefWidth(wHint);
					defaultHeight = control.prefHeight(hHint);
				}
				cacheWidth = defaultWidth;
				cacheHeight = defaultHeight;
				return;
			}
			if (currentWidth == -1 || currentHeight == -1 || wHint != currentWhint || hHint != currentHhint) {
//				Point size = control.computeSize (wHint, hHint, flushCache);
				currentWhint = wHint;
				currentHhint = hHint;
				currentWidth = control.getLayoutBounds().getWidth();
				currentHeight = control.getLayoutBounds().getHeight();
			}
			cacheWidth = currentWidth;
			cacheHeight = currentHeight;
		}

		void flushCache () {
			cacheWidth = cacheHeight = -1;
			defaultWidth = defaultHeight = -1;
			currentWidth = currentHeight = -1;
		}

		String getName () {
			String string = getClass ().getName ();
			int index = string.lastIndexOf ('.');
			if (index == -1) return string;
			return string.substring (index + 1, string.length ());
		}

		/**
		 * Returns a string containing a concise, human-readable
		 * description of the receiver.
		 *
		 * @return a string representation of the GridData object
		 */
		public String toString () {
			String hAlign = "";
			switch (horizontalAlignment) {
				case SWT_FILL: hAlign = "SWT.FILL"; break;
				case SWT_BEGINNING: hAlign = "SWT.BEGINNING"; break;
				case SWT_LEFT: hAlign = "SWT.LEFT"; break;
				case SWT_END: hAlign = "SWT.END"; break;
				case END: hAlign = "GridData.END"; break;
				case SWT_RIGHT: hAlign = "SWT.RIGHT"; break;
				case SWT_CENTER: hAlign = "SWT.CENTER"; break;
				case CENTER: hAlign = "GridData.CENTER"; break;
				default: hAlign = "Undefined "+horizontalAlignment; break;
			}
			String vAlign = "";
			switch (verticalAlignment) {
				case SWT_FILL: vAlign = "SWT.FILL"; break;
				case SWT_BEGINNING: vAlign = "SWT.BEGINNING"; break;
				case SWT_TOP: vAlign = "SWT.TOP"; break;
				case SWT_END: vAlign = "SWT.END"; break;
				case END: vAlign = "GridData.END"; break;
				case SWT_BOTTOM: vAlign = "SWT.BOTTOM"; break;
				case SWT_CENTER: vAlign = "SWT.CENTER"; break;
				case CENTER: vAlign = "GridData.CENTER"; break;
				default: vAlign = "Undefined "+verticalAlignment; break;
			}
		 	String string = getName()+" {";
		 	string += "horizontalAlignment="+hAlign+" ";
		 	if (horizontalIndent != 0) string += "horizontalIndent="+horizontalIndent+" ";
		 	if (horizontalSpan != 1) string += "horizontalSpan="+horizontalSpan+" ";
		 	if (grabExcessHorizontalSpace) string += "grabExcessHorizontalSpace="+grabExcessHorizontalSpace+" ";
		 	if (widthHint != SWT_DEFAULT) string += "widthHint="+widthHint+" ";
		 	if (minimumWidth != 0) string += "minimumWidth="+minimumWidth+" ";
		 	string += "verticalAlignment="+vAlign+" ";
		 	if (verticalIndent != 0) string += "verticalIndent="+verticalIndent+" ";
			if (verticalSpan != 1) string += "verticalSpan="+verticalSpan+" ";
		 	if (grabExcessVerticalSpace) string += "grabExcessVerticalSpace="+grabExcessVerticalSpace+" ";
		 	if (heightHint != SWT_DEFAULT) string += "heightHint="+heightHint+" ";
		 	if (minimumHeight != 0) string += "minimumHeight="+minimumHeight+" ";
		 	if (exclude) string += "exclude="+exclude+" ";
		 	string = string.trim();
		 	string += "}";
			return string;
		}

	}
	
	@Override
	protected at.bestsolution.efxclipse.runtime.panels.AbstractLayoutPane.Size computeSize(
			double width, double height, boolean flushCache) {
		return calculateLayout(false, 0, 0, width, height, flushCache);
	}
	
	@Override
	protected void layoutChildren() {
		super.layoutChildren();
		calculateLayout(true, getLayoutBounds().getMinX(), getLayoutBounds().getMinY(), getLayoutBounds().getWidth(), getLayoutBounds().getHeight(), true);
	}
	
	
	private Size calculateLayout( boolean move, double x, double y, double width, double height, boolean flushCache) {
		if (numColumnsProperty.get() < 1) {
			return new Size (marginLeft.get() + marginWidth.get() * 2 + marginRight.get(), marginTop.get() + marginHeight.get() * 2 + marginBottom.get());
		}
		
		Node[] children = getChildren().toArray(new Node[0]);
		
		int count = 0;
		for (int i=0; i<children.length; i++) {
			Node control = children [i];
			GridData data = getConstraint(control);
			if (data == null || !data.exclude) {
				children [count++] = children [i];
			} 
		}
		if (count == 0) {
			return new Size (marginLeft.get() + marginWidth.get() * 2 + marginRight.get(), marginTop.get() + marginHeight.get() * 2 + marginBottom.get());
		}
		for (int i=0; i<count; i++) {
			Node child = children [i];
			GridData data = getConstraint(child);
			if (data == null) {
				data = new GridData ();
				setConstraint(child, data);
			}
			if (flushCache) data.flushCache ();
			data.computeSize (child, data.widthHint, data.heightHint, flushCache);
			if (data.grabExcessHorizontalSpace && data.minimumWidth > 0) {
				if (data.cacheWidth < data.minimumWidth) {
					int trim = 0;
					//TEMPORARY CODE
//FIXME					
//					if (child instanceof Scrollable) {
//						Rectangle rect = ((Scrollable) child).computeTrim (0, 0, 0, 0);
//						trim = rect.width;
//					} else {
//						trim = child.getBorderWidth () * 2;
//					}
					data.cacheWidth = data.cacheHeight = SWT_DEFAULT;
					data.computeSize (child, Math.max (0, data.minimumWidth - trim), data.heightHint, false);
				}
			}
			if (data.grabExcessVerticalSpace && data.minimumHeight > 0) {
				data.cacheHeight = Math.max (data.cacheHeight, data.minimumHeight);
			}
		}

		/* Build the grid */
		int row = 0, column = 0, rowCount = 0, columnCount = numColumnsProperty.get();
		Node [][] grid = new Node [4] [columnCount];
		for (int i=0; i<count; i++) {	
			Node child = children [i];
			GridData data = getConstraint(child);
			int hSpan = Math.max (1, Math.min (data.horizontalSpan, columnCount));
			int vSpan = Math.max (1, data.verticalSpan);
			while (true) {
				int lastRow = row + vSpan;
				if (lastRow >= grid.length) {
					Node [][] newGrid = new Node [lastRow + 4] [columnCount];
					System.arraycopy (grid, 0, newGrid, 0, grid.length);
					grid = newGrid;
				}
				if (grid [row] == null) {
					grid [row] = new Node [columnCount];
				}
				while (column < columnCount && grid [row] [column] != null) {
					column++;
				}
				int endCount = column + hSpan;
				if (endCount <= columnCount) {
					int index = column;
					while (index < endCount && grid [row] [index] == null) {
						index++;
					}
					if (index == endCount) break;
					column = index;
				}
				if (column + hSpan >= columnCount) {
					column = 0;
					row++;
				}
			}
			for (int j=0; j<vSpan; j++) {
				if (grid [row + j] == null) {
					grid [row + j] = new Node [columnCount];
				}
				for (int k=0; k<hSpan; k++) {
					grid [row + j] [column + k] = child;
				}
			}
			rowCount = Math.max (rowCount, row + vSpan);
			column += hSpan;
		}

		/* Column widths */
		double availableWidth = width - horizontalSpacing.get() * (columnCount - 1) - (marginLeft.get() + marginWidth.get() * 2 + marginRight.get());
		int expandCount = 0;
		double [] widths = new double [columnCount];
		double [] minWidths = new double [columnCount];
		boolean [] expandColumn = new boolean [columnCount];
		for (int j=0; j<columnCount; j++) {
			for (int i=0; i<rowCount; i++) {
				GridData data = getData (grid, i, j, rowCount, columnCount, true);
				if (data != null) {
					int hSpan = Math.max (1, Math.min (data.horizontalSpan, columnCount));
					if (hSpan == 1) {
						double w = data.cacheWidth + data.horizontalIndent;
						widths [j] = Math.max (widths [j], w);
						if (data.grabExcessHorizontalSpace) {
							if (!expandColumn [j]) expandCount++;
							expandColumn [j] = true;
						}
						if (!data.grabExcessHorizontalSpace || data.minimumWidth != 0) {
							w = !data.grabExcessHorizontalSpace || data.minimumWidth == SWT_DEFAULT ? data.cacheWidth : data.minimumWidth;
							w += data.horizontalIndent;
							minWidths [j] = Math.max (minWidths [j], w);
						}
					}
				}
			}
			for (int i=0; i<rowCount; i++) {
				GridData data = getData (grid, i, j, rowCount, columnCount, false);
				if (data != null) {
					int hSpan = Math.max (1, Math.min (data.horizontalSpan, columnCount));
					if (hSpan > 1) {
						int spanWidth = 0, spanMinWidth = 0, spanExpandCount = 0;
						for (int k=0; k<hSpan; k++) {
							spanWidth += widths [j-k];
							spanMinWidth += minWidths [j-k];
							if (expandColumn [j-k]) spanExpandCount++;
						}
						if (data.grabExcessHorizontalSpace && spanExpandCount == 0) {
							expandCount++;
							expandColumn [j] = true;
						}
						double w = data.cacheWidth + data.horizontalIndent - spanWidth - (hSpan - 1) * horizontalSpacing.get();
						if (w > 0) {
							if (makeColumnsEqualWidthProperty.get()) {
								double equalWidth = (w + spanWidth) / hSpan;
								double remainder = (w + spanWidth) % hSpan;
								int last = -1;
								for (int k = 0; k < hSpan; k++) {
									widths [last=j-k] = Math.max (equalWidth, widths [j-k]);
								}
								if (last > -1) widths [last] += remainder;
							} else {
								if (spanExpandCount == 0) {
									widths [j] += w;
								} else {
									double delta = w / spanExpandCount;
									double remainder = w % spanExpandCount;
									int last = -1;
									for (int k = 0; k < hSpan; k++) {
										if (expandColumn [j-k]) {
											widths [last=j-k] += delta;
										}
									}
									if (last > -1) widths [last] += remainder;
								}
							}
						}
						if (!data.grabExcessHorizontalSpace || data.minimumWidth != 0) {
							w = !data.grabExcessHorizontalSpace || data.minimumWidth == SWT_DEFAULT ? data.cacheWidth : data.minimumWidth;
							w += data.horizontalIndent - spanMinWidth - (hSpan - 1) * horizontalSpacing.get();
							if (w > 0) {
								if (spanExpandCount == 0) {
									minWidths [j] += w;
								} else {
									double delta = w / spanExpandCount;
									double remainder = w % spanExpandCount;
									int last = -1;
									for (int k = 0; k < hSpan; k++) {
										if (expandColumn [j-k]) {
											minWidths [last=j-k] += delta;
										}
									}
									if (last > -1) minWidths [last] += remainder;
								}
							}
						}
					}
				}
			}
		}
		if (makeColumnsEqualWidthProperty.get()) {
			double minColumnWidth = 0;
			double columnWidth = 0;
			for (int i=0; i<columnCount; i++) {
				minColumnWidth = Math.max (minColumnWidth, minWidths [i]);
				columnWidth = Math.max (columnWidth, widths [i]);
			}
			columnWidth = width == SWT_DEFAULT || expandCount == 0 ? columnWidth : Math.max (minColumnWidth, availableWidth / columnCount);
			for (int i=0; i<columnCount; i++) {
				expandColumn [i] = expandCount > 0;
				widths [i] = columnWidth;
			}
		} else {
			if (width != SWT_DEFAULT && expandCount > 0) {
				int totalWidth = 0;
				for (int i=0; i<columnCount; i++) {
					totalWidth += widths [i];
				}
				int c = expandCount;
				double delta = (availableWidth - totalWidth) / c;
				double remainder = (availableWidth - totalWidth) % c;
				int last = -1;
				while (totalWidth != availableWidth) {
					for (int j=0; j<columnCount; j++) {
						if (expandColumn [j]) {
							if (widths [j] + delta > minWidths [j]) {
								widths [last = j] = widths [j] + delta;
							} else {
								widths [j] = minWidths [j];
								expandColumn [j] = false;
								c--;
							}
						}
					}
					if (last > -1) widths [last] += remainder;
					
					for (int j=0; j<columnCount; j++) {
						for (int i=0; i<rowCount; i++) {
							GridData data = getData (grid, i, j, rowCount, columnCount, false);
							if (data != null) {
								int hSpan = Math.max (1, Math.min (data.horizontalSpan, columnCount));
								if (hSpan > 1) {
									if (!data.grabExcessHorizontalSpace || data.minimumWidth != 0) {
										int spanWidth = 0, spanExpandCount = 0;
										for (int k=0; k<hSpan; k++) {
											spanWidth += widths [j-k];
											if (expandColumn [j-k]) spanExpandCount++;
										}
										double w = !data.grabExcessHorizontalSpace || data.minimumWidth == SWT_DEFAULT ? data.cacheWidth : data.minimumWidth;
										w += data.horizontalIndent - spanWidth - (hSpan - 1) * horizontalSpacing.get();
										if (w > 0) {
											if (spanExpandCount == 0) {
												widths [j] += w;
											} else {
												double delta2 = w / spanExpandCount;
												double remainder2 = w % spanExpandCount;
												int last2 = -1;
												for (int k = 0; k < hSpan; k++) {
													if (expandColumn [j-k]) {
														widths [last2=j-k] += delta2;
													}
												}
												if (last2 > -1) widths [last2] += remainder2;	
											}
										}
									}
								}
							}
						}
					}
					if (c == 0) break;
					totalWidth = 0;
					for (int i=0; i<columnCount; i++) {
						totalWidth += widths [i];
					}
					delta = (availableWidth - totalWidth) / c;
					remainder = (availableWidth - totalWidth) % c;
					last = -1;
				}
			}
		}

		/* Wrapping */
		GridData [] flush = null;
		int flushLength = 0;
		if (width != SWT_DEFAULT) {
			for (int j=0; j<columnCount; j++) {
				for (int i=0; i<rowCount; i++) {
					GridData data = getData (grid, i, j, rowCount, columnCount, false);
					if (data != null) {
						if (data.heightHint == SWT_DEFAULT) {
							Node child = grid [i][j];
							//TEMPORARY CODE
							int hSpan = Math.max (1, Math.min (data.horizontalSpan, columnCount));
							int currentWidth = 0;
							for (int k=0; k<hSpan; k++) {
								currentWidth += widths [j-k];
							}
							currentWidth += (hSpan - 1) * horizontalSpacing.get() - data.horizontalIndent;
							if ((currentWidth != data.cacheWidth && data.horizontalAlignment == SWT_FILL) || (data.cacheWidth > currentWidth)) {
								int trim = 0;
//FIXME								
//								if (child instanceof Scrollable) {
//									Rectangle rect = ((Scrollable) child).computeTrim (0, 0, 0, 0);
//									trim = rect.width;
//								} else {
//									trim = child.getBorderWidth () * 2;
//								}
								data.cacheWidth = data.cacheHeight = SWT_DEFAULT;
								data.computeSize (child, Math.max (0, currentWidth - trim), data.heightHint, false);
								if (data.grabExcessVerticalSpace && data.minimumHeight > 0) {
									data.cacheHeight = Math.max (data.cacheHeight, data.minimumHeight);
								}
								if (flush == null) flush = new GridData [count];
								flush [flushLength++] = data;
							}
						}
					}
				}
			}
		}

		/* Row heights */
		double availableHeight = height - verticalSpacing.get() * (rowCount - 1) - (marginTop.get() + marginHeight.get() * 2 + marginBottom.get());
		expandCount = 0;
		double [] heights = new double [rowCount];
		double [] minHeights = new double [rowCount];
		boolean [] expandRow = new boolean [rowCount];
		for (int i=0; i<rowCount; i++) {
			for (int j=0; j<columnCount; j++) {
				GridData data = getData (grid, i, j, rowCount, columnCount, true);
				if (data != null) {
					int vSpan = Math.max (1, Math.min (data.verticalSpan, rowCount));
					if (vSpan == 1) {
						double h = data.cacheHeight + data.verticalIndent;
						heights [i] = Math.max (heights [i], h);
						if (data.grabExcessVerticalSpace) {
							if (!expandRow [i]) expandCount++;
							expandRow [i] = true;
						}
						if (!data.grabExcessVerticalSpace || data.minimumHeight != 0) {
							h = !data.grabExcessVerticalSpace || data.minimumHeight == SWT_DEFAULT ? data.cacheHeight : data.minimumHeight;
							h += data.verticalIndent;
							minHeights [i] = Math.max (minHeights [i], h);
						}
					}
				}
			}
			for (int j=0; j<columnCount; j++) {
				GridData data = getData (grid, i, j, rowCount, columnCount, false);
				if (data != null) {
					int vSpan = Math.max (1, Math.min (data.verticalSpan, rowCount));
					if (vSpan > 1) {
						int spanHeight = 0, spanMinHeight = 0, spanExpandCount = 0;
						for (int k=0; k<vSpan; k++) {
							spanHeight += heights [i-k];
							spanMinHeight += minHeights [i-k];
							if (expandRow [i-k]) spanExpandCount++;
						}
						if (data.grabExcessVerticalSpace && spanExpandCount == 0) {
							expandCount++;
							expandRow [i] = true;
						}
						double h = data.cacheHeight + data.verticalIndent - spanHeight - (vSpan - 1) * verticalSpacing.get();
						if (h > 0) {
							if (spanExpandCount == 0) {
								heights [i] += h;
							} else {
								double delta = h / spanExpandCount;
								double remainder = h % spanExpandCount;
								int last = -1;
								for (int k = 0; k < vSpan; k++) {
									if (expandRow [i-k]) {
										heights [last=i-k] += delta;
									}
								}
								if (last > -1) heights [last] += remainder;	
							}
						}
						if (!data.grabExcessVerticalSpace || data.minimumHeight != 0) {
							h = !data.grabExcessVerticalSpace || data.minimumHeight == SWT_DEFAULT ? data.cacheHeight : data.minimumHeight;
							h += data.verticalIndent - spanMinHeight - (vSpan - 1) * verticalSpacing.get();
							if (h > 0) {
								if (spanExpandCount == 0) {
									minHeights [i] += h;
								} else {
									double delta = h / spanExpandCount;
									double remainder = h % spanExpandCount;
									int last = -1;
									for (int k = 0; k < vSpan; k++) {
										if (expandRow [i-k]) {
											minHeights [last=i-k] += delta;
										}
									}
									if (last > -1) minHeights [last] += remainder;	
								}
							}
						}
					}
				}
			}
		}
		if (height != SWT_DEFAULT && expandCount > 0) {
			int totalHeight = 0;
			for (int i=0; i<rowCount; i++) {
				totalHeight += heights [i];
			}
			int c = expandCount;
			double delta = (availableHeight - totalHeight) / c;
			double remainder = (availableHeight - totalHeight) % c;
			int last = -1;
			while (totalHeight != availableHeight) {
				for (int i=0; i<rowCount; i++) {
					if (expandRow [i]) {
						if (heights [i] + delta > minHeights [i]) {
							heights [last = i] = heights [i] + delta;
						} else {
							heights [i] = minHeights [i];
							expandRow [i] = false;
							c--;
						}
					}
				}
				if (last > -1) heights [last] += remainder;
				
				for (int i=0; i<rowCount; i++) {
					for (int j=0; j<columnCount; j++) {
						GridData data = getData (grid, i, j, rowCount, columnCount, false);
						if (data != null) {
							int vSpan = Math.max (1, Math.min (data.verticalSpan, rowCount));
							if (vSpan > 1) {
								if (!data.grabExcessVerticalSpace || data.minimumHeight != 0) {
									int spanHeight = 0, spanExpandCount = 0;
									for (int k=0; k<vSpan; k++) {
										spanHeight += heights [i-k];
										if (expandRow [i-k]) spanExpandCount++;
									}
									double h = !data.grabExcessVerticalSpace || data.minimumHeight == SWT_DEFAULT ? data.cacheHeight : data.minimumHeight;
									h += data.verticalIndent - spanHeight - (vSpan - 1) * verticalSpacing.get();
									if (h > 0) {
										if (spanExpandCount == 0) {
											heights [i] += h;
										} else {
											double delta2 = h / spanExpandCount;
											double remainder2 = h % spanExpandCount;
											int last2 = -1;
											for (int k = 0; k < vSpan; k++) {
												if (expandRow [i-k]) {
													heights [last2=i-k] += delta2;
												}
											}
											if (last2 > -1) heights [last2] += remainder2;
										}
									}
								}
							}
						}
					}
				}
				if (c == 0) break;
				totalHeight = 0;
				for (int i=0; i<rowCount; i++) {
					totalHeight += heights [i];
				}
				delta = (availableHeight - totalHeight) / c;
				remainder = (availableHeight - totalHeight) % c;
				last = -1;
			}
		}

		/* Position the controls */
		if (move) {
			double gridY = y + marginTop.get() + marginHeight.get();
			for (int i=0; i<rowCount; i++) {
				double gridX = x + marginLeft.get() + marginWidth.get();
				for (int j=0; j<columnCount; j++) {
					GridData data = getData (grid, i, j, rowCount, columnCount, true);
					if (data != null) {
						int hSpan = Math.max (1, Math.min (data.horizontalSpan, columnCount));
						int vSpan = Math.max (1, data.verticalSpan);
						int cellWidth = 0, cellHeight = 0;
						for (int k=0; k<hSpan; k++) {
							cellWidth += widths [j+k];
						}
						for (int k=0; k<vSpan; k++) {
							cellHeight += heights [i+k];
						}
						cellWidth += horizontalSpacing.get() * (hSpan - 1);
						double childX = gridX + data.horizontalIndent;
						double childWidth = Math.min (data.cacheWidth, cellWidth);
						switch (data.horizontalAlignment) {
							case SWT_CENTER:
							case GridData.CENTER:
								childX += Math.max (0, (cellWidth - data.horizontalIndent - childWidth) / 2);
								break;
							case SWT_RIGHT:
							case SWT_END:
							case GridData.END:
								childX += Math.max (0, cellWidth - data.horizontalIndent - childWidth);
								break;
							case SWT_FILL:
								childWidth = cellWidth - data.horizontalIndent;
								break;
						}
						cellHeight += verticalSpacing.get() * (vSpan - 1);
						double childY = gridY + data.verticalIndent;
						double childHeight = Math.min (data.cacheHeight, cellHeight);
						switch (data.verticalAlignment) {
							case SWT_CENTER:
							case GridData.CENTER:
								childY += Math.max (0, (cellHeight - data.verticalIndent - childHeight) / 2);
								break;
							case SWT_BOTTOM:
							case SWT_END:
							case GridData.END:
								childY += Math.max (0, cellHeight - data.verticalIndent - childHeight);
								break;
							case SWT_FILL:
								childHeight = cellHeight - data.verticalIndent;
								break;
						}
						Node child = grid [i][j];
						if (child != null) {
							child.resizeRelocate(childX, childY, childWidth, childHeight);
						}
					}
					gridX += widths [j] + horizontalSpacing.get();
				}
				gridY += heights [i] + verticalSpacing.get();
			}
		}

		// clean up cache
		for (int i = 0; i < flushLength; i++) {
			flush [i].cacheWidth = flush [i].cacheHeight = -1;
		}

		int totalDefaultWidth = 0;
		int totalDefaultHeight = 0;
		for (int i=0; i<columnCount; i++) {
			totalDefaultWidth += widths [i];
		}
		for (int i=0; i<rowCount; i++) {
			totalDefaultHeight += heights [i];
		}
		totalDefaultWidth += horizontalSpacing.get() * (columnCount - 1) + marginLeft.get() + marginWidth.get() * 2 + marginRight.get();
		totalDefaultHeight += verticalSpacing.get() * (rowCount - 1) + marginTop.get() + marginHeight.get() * 2 + marginBottom.get();
		return new Size (totalDefaultWidth, totalDefaultHeight);
	}
	
	GridData getData (Node [][] grid, int row, int column, int rowCount, int columnCount, boolean first) {
		Node control = grid [row] [column];
		if (control != null) {
			GridData data = getConstraint(control);
			int hSpan = Math.max (1, Math.min (data.horizontalSpan, columnCount));
			int vSpan = Math.max (1, data.verticalSpan);
			int i = first ? row + vSpan - 1 : row - vSpan + 1;
			int j = first ? column + hSpan - 1 : column - hSpan + 1;
			if (0 <= i && i < rowCount) {
				if (0 <= j && j < columnCount) {
					if (control == grid [i][j]) return data;
				}
			}
		}
		return null;
	}
	
	public void setNumColumns(int numColumns) {
		this.numColumnsProperty.set(numColumns);
	}
	
	public int getNumColumns() {
		return this.numColumnsProperty.get();
	}
	
	public WritableIntegerValue getNumColumnsProperty() {
		return numColumnsProperty;
	}
	
	public void setMakeColumnsEqualWidth(boolean makeColumnsEqualWidth) {
		this.makeColumnsEqualWidthProperty.set(makeColumnsEqualWidth);
	}
	
	public boolean isMakeColumnsEqualWidth() {
		return this.makeColumnsEqualWidthProperty.get();
	}
	
	public WritableBooleanValue getMakeColumnsEqualWidthProperty() {
		return makeColumnsEqualWidthProperty;
	}
	
}