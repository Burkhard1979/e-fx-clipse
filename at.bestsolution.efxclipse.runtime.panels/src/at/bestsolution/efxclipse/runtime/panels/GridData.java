package at.bestsolution.efxclipse.runtime.panels;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Node;
import static at.bestsolution.efxclipse.runtime.panels.AbstractLayoutPane.*;


public class GridData {
	/**
	 * verticalAlignment specifies how controls will be positioned vertically
	 * within a cell.
	 * 
	 * The default value is CENTER.
	 * 
	 * Possible values are:
	 * <ul>
	 * <li>SWT.BEGINNING (or SWT.TOP): Position the control at the top of the
	 * cell</li>
	 * <li>SWT.CENTER: Position the control in the vertical center of the cell</li>
	 * <li>SWT.END (or SWT.BOTTOM): Position the control at the bottom of the
	 * cell</li>
	 * <li>SWT.FILL: Resize the control to fill the cell vertically</li>
	 * </ul>
	 */
	public IntegerProperty verticalAlignment = new SimpleIntegerProperty(this, "verticalAlignment", CENTER);

	/**
	 * horizontalAlignment specifies how controls will be positioned
	 * horizontally within a cell.
	 * 
	 * The default value is BEGINNING.
	 * 
	 * Possible values are:
	 * <ul>
	 * <li>SWT.BEGINNING (or SWT.LEFT): Position the control at the left of the
	 * cell</li>
	 * <li>SWT.CENTER: Position the control in the horizontal center of the cell
	 * </li>
	 * <li>SWT.END (or SWT.RIGHT): Position the control at the right of the cell
	 * </li>
	 * <li>SWT.FILL: Resize the control to fill the cell horizontally</li>
	 * </ul>
	 */
	public IntegerProperty horizontalAlignment = new SimpleIntegerProperty(this, "horizontalAlignment", BEGINNING);

	/**
	 * widthHint specifies the preferred width in pixels. This value is the
	 * wHint passed into Control.computeSize(int, int, boolean) to determine the
	 * preferred size of the control.
	 * 
	 * The default value is SWT.DEFAULT.
	 * 
	 * @see Control#computeSize(int, int, boolean)
	 */
	public IntegerProperty widthHint = new SimpleIntegerProperty(this, "widthHint", FX_DEFAULT);

	/**
	 * heightHint specifies the preferred height in pixels. This value is the
	 * hHint passed into Control.computeSize(int, int, boolean) to determine the
	 * preferred size of the control.
	 * 
	 * The default value is SWT.DEFAULT.
	 * 
	 * @see Control#computeSize(int, int, boolean)
	 */
	public IntegerProperty heightHint = new SimpleIntegerProperty(this, "heightHint", FX_DEFAULT);

	/**
	 * horizontalIndent specifies the number of pixels of indentation that will
	 * be placed along the left side of the cell.
	 * 
	 * The default value is 0.
	 */
	public IntegerProperty horizontalIndent = new SimpleIntegerProperty(this, "horizontalIndent");

	/**
	 * verticalIndent specifies the number of pixels of indentation that will be
	 * placed along the top side of the cell.
	 * 
	 * The default value is 0.
	 * 
	 * @since 3.1
	 */
	public IntegerProperty verticalIndent = new SimpleIntegerProperty(this, "verticalIndent");

	/**
	 * horizontalSpan specifies the number of column cells that the control will
	 * take up.
	 * 
	 * The default value is 1.
	 */
	public IntegerProperty horizontalSpan = new SimpleIntegerProperty(this, "horizontalSpan",1);

	/**
	 * verticalSpan specifies the number of row cells that the control will take
	 * up.
	 * 
	 * The default value is 1.
	 */
	public IntegerProperty verticalSpan = new SimpleIntegerProperty(this, "verticalSpan",1);

	/**
	 * <p>
	 * grabExcessHorizontalSpace specifies whether the width of the cell changes
	 * depending on the size of the parent Composite. If
	 * grabExcessHorizontalSpace is <code>true</code>, the following rules apply
	 * to the width of the cell:
	 * </p>
	 * <ul>
	 * <li>If extra horizontal space is available in the parent, the cell will
	 * grow to be wider than its preferred width. The new width will be
	 * "preferred width + delta" where delta is the extra horizontal space
	 * divided by the number of grabbing columns.</li>
	 * <li>If there is not enough horizontal space available in the parent, the
	 * cell will shrink until it reaches its minimum width as specified by
	 * GridData.minimumWidth. The new width will be the maximum of
	 * "minimumWidth" and "preferred width - delta", where delta is the amount
	 * of space missing divided by the number of grabbing columns.</li>
	 * <li>If the parent is packed, the cell will be its preferred width as
	 * specified by GridData.widthHint.</li>
	 * <li>If the control spans multiple columns and there are no other grabbing
	 * controls in any of the spanned columns, the last column in the span will
	 * grab the extra space. If there is at least one other grabbing control in
	 * the span, the grabbing will be spread over the columns already marked as
	 * grabExcessHorizontalSpace.</li>
	 * </ul>
	 * 
	 * <p>
	 * The default value is false.
	 * </p>
	 * 
	 * @see GridData#minimumWidth
	 * @see GridData#widthHint
	 */
	public BooleanProperty grabExcessHorizontalSpace = new SimpleBooleanProperty(this,"grabExcessHorizontalSpace",false);

	/**
	 * <p>
	 * grabExcessVerticalSpace specifies whether the height of the cell changes
	 * depending on the size of the parent Composite. If grabExcessVerticalSpace
	 * is <code>true</code>, the following rules apply to the height of the
	 * cell:
	 * </p>
	 * <ul>
	 * <li>If extra vertical space is available in the parent, the cell will
	 * grow to be taller than its preferred height. The new height will be
	 * "preferred height + delta" where delta is the extra vertical space
	 * divided by the number of grabbing rows.</li>
	 * <li>If there is not enough vertical space available in the parent, the
	 * cell will shrink until it reaches its minimum height as specified by
	 * GridData.minimumHeight. The new height will be the maximum of
	 * "minimumHeight" and "preferred height - delta", where delta is the amount
	 * of space missing divided by the number of grabbing rows.</li>
	 * <li>If the parent is packed, the cell will be its preferred height as
	 * specified by GridData.heightHint.</li>
	 * <li>If the control spans multiple rows and there are no other grabbing
	 * controls in any of the spanned rows, the last row in the span will grab
	 * the extra space. If there is at least one other grabbing control in the
	 * span, the grabbing will be spread over the rows already marked as
	 * grabExcessVerticalSpace.</li>
	 * </ul>
	 * 
	 * <p>
	 * The default value is false.
	 * </p>
	 * 
	 * @see GridData#minimumHeight
	 * @see GridData#heightHint
	 */
	public BooleanProperty grabExcessVerticalSpace = new SimpleBooleanProperty(this,"grabExcessVerticalSpace",false);

	/**
	 * minimumWidth specifies the minimum width in pixels. This value applies
	 * only if grabExcessHorizontalSpace is true. A value of SWT.DEFAULT means
	 * that the minimum width will be the result of Control.computeSize(int,
	 * int, boolean) where wHint is determined by GridData.widthHint.
	 * 
	 * The default value is 0.
	 * 
	 * @since 3.1
	 * @see Control#computeSize(int, int, boolean)
	 * @see GridData#widthHint
	 */
	public IntegerProperty minimumWidth = new SimpleIntegerProperty(this,"minimumWidth",0);

	/**
	 * minimumHeight specifies the minimum height in pixels. This value applies
	 * only if grabExcessVerticalSpace is true. A value of SWT.DEFAULT means
	 * that the minimum height will be the result of Control.computeSize(int,
	 * int, boolean) where hHint is determined by GridData.heightHint.
	 * 
	 * The default value is 0.
	 * 
	 * @since 3.1
	 * @see Control#computeSize(int, int, boolean)
	 * @see GridData#heightHint
	 */
	public IntegerProperty minimumHeight = new SimpleIntegerProperty(this,"minimumHeight",0);

	/**
	 * exclude informs the layout to ignore this control when sizing and
	 * positioning controls. If this value is <code>true</code>, the size and
	 * position of the control will not be managed by the layout. If this value
	 * is <code>false</code>, the size and position of the control will be
	 * computed and assigned.
	 * 
	 * The default value is <code>false</code>.
	 * 
	 * @since 3.1
	 */
	public BooleanProperty exclude = new SimpleBooleanProperty(this, "exclude", false);

	/**
	 * Value for horizontalAlignment or verticalAlignment. Position the control
	 * at the top or left of the cell. Not recommended. Use SWT.BEGINNING,
	 * SWT.TOP or SWT.LEFT instead.
	 */
	public static final int BEGINNING = FX_BEGINNING;

	/**
	 * Value for horizontalAlignment or verticalAlignment. Position the control
	 * in the vertical or horizontal center of the cell Not recommended. Use
	 * SWT.CENTER instead.
	 */
	public static final int CENTER = 2;

	/**
	 * Value for horizontalAlignment or verticalAlignment. Position the control
	 * at the bottom or right of the cell Not recommended. Use SWT.END,
	 * SWT.BOTTOM or SWT.RIGHT instead.
	 */
	public static final int END = 3;

	/**
	 * Value for horizontalAlignment or verticalAlignment. Resize the control to
	 * fill the cell horizontally or vertically. Not recommended. Use SWT.FILL
	 * instead.
	 */
	public static final int FILL = FX_FILL;

	/**
	 * Style bit for <code>new GridData(int)</code>. Position the control at the
	 * top of the cell. Not recommended. Use
	 * <code>new GridData(int, SWT.BEGINNING, boolean, boolean)</code> instead.
	 */
	public static final int VERTICAL_ALIGN_BEGINNING = 1 << 1;

	/**
	 * Style bit for <code>new GridData(int)</code> to position the control in
	 * the vertical center of the cell. Not recommended. Use
	 * <code>new GridData(int, SWT.CENTER, boolean, boolean)</code> instead.
	 */
	public static final int VERTICAL_ALIGN_CENTER = 1 << 2;

	/**
	 * Style bit for <code>new GridData(int)</code> to position the control at
	 * the bottom of the cell. Not recommended. Use
	 * <code>new GridData(int, SWT.END, boolean, boolean)</code> instead.
	 */
	public static final int VERTICAL_ALIGN_END = 1 << 3;

	/**
	 * Style bit for <code>new GridData(int)</code> to resize the control to
	 * fill the cell vertically. Not recommended. Use
	 * <code>new GridData(int, SWT.FILL, boolean, boolean)</code> instead
	 */
	public static final int VERTICAL_ALIGN_FILL = 1 << 4;

	/**
	 * Style bit for <code>new GridData(int)</code> to position the control at
	 * the left of the cell. Not recommended. Use
	 * <code>new GridData(SWT.BEGINNING, int, boolean, boolean)</code> instead.
	 */
	public static final int HORIZONTAL_ALIGN_BEGINNING = 1 << 5;

	/**
	 * Style bit for <code>new GridData(int)</code> to position the control in
	 * the horizontal center of the cell. Not recommended. Use
	 * <code>new GridData(SWT.CENTER, int, boolean, boolean)</code> instead.
	 */
	public static final int HORIZONTAL_ALIGN_CENTER = 1 << 6;

	/**
	 * Style bit for <code>new GridData(int)</code> to position the control at
	 * the right of the cell. Not recommended. Use
	 * <code>new GridData(SWT.END, int, boolean, boolean)</code> instead.
	 */
	public static final int HORIZONTAL_ALIGN_END = 1 << 7;

	/**
	 * Style bit for <code>new GridData(int)</code> to resize the control to
	 * fill the cell horizontally. Not recommended. Use
	 * <code>new GridData(SWT.FILL, int, boolean, boolean)</code> instead.
	 */
	public static final int HORIZONTAL_ALIGN_FILL = 1 << 8;

	/**
	 * Style bit for <code>new GridData(int)</code> to resize the control to fit
	 * the remaining horizontal space. Not recommended. Use
	 * <code>new GridData(int, int, true, boolean)</code> instead.
	 */
	public static final int GRAB_HORIZONTAL = 1 << 9;

	/**
	 * Style bit for <code>new GridData(int)</code> to resize the control to fit
	 * the remaining vertical space. Not recommended. Use
	 * <code>new GridData(int, int, boolean, true)</code> instead.
	 */
	public static final int GRAB_VERTICAL = 1 << 10;

	/**
	 * Style bit for <code>new GridData(int)</code> to resize the control to
	 * fill the cell vertically and to fit the remaining vertical space.
	 * FILL_VERTICAL = VERTICAL_ALIGN_FILL | GRAB_VERTICAL Not recommended. Use
	 * <code>new GridData(int, SWT.FILL, boolean, true)</code> instead.
	 */
	public static final int FILL_VERTICAL = VERTICAL_ALIGN_FILL | GRAB_VERTICAL;

	/**
	 * Style bit for <code>new GridData(int)</code> to resize the control to
	 * fill the cell horizontally and to fit the remaining horizontal space.
	 * FILL_HORIZONTAL = HORIZONTAL_ALIGN_FILL | GRAB_HORIZONTAL Not
	 * recommended. Use <code>new GridData(SWT.FILL, int, true, boolean)</code>
	 * instead.
	 */
	public static final int FILL_HORIZONTAL = HORIZONTAL_ALIGN_FILL | GRAB_HORIZONTAL;

	/**
	 * Style bit for <code>new GridData(int)</code> to resize the control to
	 * fill the cell horizontally and vertically and to fit the remaining
	 * horizontal and vertical space. FILL_BOTH = FILL_VERTICAL |
	 * FILL_HORIZONTAL Not recommended. Use
	 * <code>new GridData(SWT.FILL, SWT.FILL, true, true)</code> instead.
	 */
	public static final int FILL_BOTH = FILL_VERTICAL | FILL_HORIZONTAL;

	double cacheWidth = -1, cacheHeight = -1;
	double defaultWhint, defaultHhint, defaultWidth = -1, defaultHeight = -1;
	double currentWhint, currentHhint, currentWidth = -1, currentHeight = -1;

	/**
	 * Constructs a new instance of GridData using default values.
	 */
	public GridData() {
		super();
	}

	/**
	 * Constructs a new instance based on the GridData style. This constructor
	 * is not recommended.
	 * 
	 * @param style
	 *            the GridData style
	 */
	public GridData(int style) {
		super();
		if ((style & VERTICAL_ALIGN_BEGINNING) != 0)
			verticalAlignment.set(BEGINNING);
		if ((style & VERTICAL_ALIGN_CENTER) != 0)
			verticalAlignment.set(CENTER);
		if ((style & VERTICAL_ALIGN_FILL) != 0)
			verticalAlignment.set(FILL);
		if ((style & VERTICAL_ALIGN_END) != 0)
			verticalAlignment.set(END);
		if ((style & HORIZONTAL_ALIGN_BEGINNING) != 0)
			horizontalAlignment.set(BEGINNING);
		if ((style & HORIZONTAL_ALIGN_CENTER) != 0)
			horizontalAlignment.set(CENTER);
		if ((style & HORIZONTAL_ALIGN_FILL) != 0)
			horizontalAlignment.set(FILL);
		if ((style & HORIZONTAL_ALIGN_END) != 0)
			horizontalAlignment.set(END);
		grabExcessHorizontalSpace.set((style & GRAB_HORIZONTAL) != 0);
		grabExcessVerticalSpace.set((style & GRAB_VERTICAL) != 0);
	}

	/**
	 * Constructs a new instance of GridData according to the parameters.
	 * 
	 * @param horizontalAlignment
	 *            how control will be positioned horizontally within a cell, one
	 *            of: SWT.BEGINNING (or SWT.LEFT), SWT.CENTER, SWT.END (or
	 *            SWT.RIGHT), or SWT.FILL
	 * @param verticalAlignment
	 *            how control will be positioned vertically within a cell, one
	 *            of: SWT.BEGINNING (or SWT.TOP), SWT.CENTER, SWT.END (or
	 *            SWT.BOTTOM), or SWT.FILL
	 * @param grabExcessHorizontalSpace
	 *            whether cell will be made wide enough to fit the remaining
	 *            horizontal space
	 * @param grabExcessVerticalSpace
	 *            whether cell will be made high enough to fit the remaining
	 *            vertical space
	 * 
	 * @since 3.0
	 */
	public GridData(int horizontalAlignment, int verticalAlignment, boolean grabExcessHorizontalSpace, boolean grabExcessVerticalSpace) {
		this(horizontalAlignment, verticalAlignment, grabExcessHorizontalSpace, grabExcessVerticalSpace, 1, 1);
	}

	/**
	 * Constructs a new instance of GridData according to the parameters.
	 * 
	 * @param horizontalAlignment
	 *            how control will be positioned horizontally within a cell, one
	 *            of: SWT.BEGINNING (or SWT.LEFT), SWT.CENTER, SWT.END (or
	 *            SWT.RIGHT), or SWT.FILL
	 * @param verticalAlignment
	 *            how control will be positioned vertically within a cell, one
	 *            of: SWT.BEGINNING (or SWT.TOP), SWT.CENTER, SWT.END (or
	 *            SWT.BOTTOM), or SWT.FILL
	 * @param grabExcessHorizontalSpace
	 *            whether cell will be made wide enough to fit the remaining
	 *            horizontal space
	 * @param grabExcessVerticalSpace
	 *            whether cell will be made high enough to fit the remaining
	 *            vertical space
	 * @param horizontalSpan
	 *            the number of column cells that the control will take up
	 * @param verticalSpan
	 *            the number of row cells that the control will take up
	 * 
	 * @since 3.0
	 */
	public GridData(int horizontalAlignment, int verticalAlignment, boolean grabExcessHorizontalSpace, boolean grabExcessVerticalSpace, int horizontalSpan, int verticalSpan) {
		super();
		this.horizontalAlignment.set(horizontalAlignment);
		this.verticalAlignment.set(verticalAlignment);
		this.grabExcessHorizontalSpace.set(grabExcessHorizontalSpace);
		this.grabExcessVerticalSpace.set(grabExcessVerticalSpace);
		this.horizontalSpan.set(horizontalSpan);
		this.verticalSpan.set(verticalSpan);
	}

	/**
	 * Constructs a new instance of GridData according to the parameters. A
	 * value of SWT.DEFAULT indicates that no minimum width or no minimum height
	 * is specified.
	 * 
	 * @param width
	 *            a minimum width for the column
	 * @param height
	 *            a minimum height for the row
	 * 
	 * @since 3.0
	 */
	public GridData(int width, int height) {
		super();
		this.widthHint.set(width);
		this.heightHint.set(height);
	}

	void computeSize(Node control, int wHint, int hHint, boolean flushCache) {
		if (cacheWidth != -1 && cacheHeight != -1)
			return;
		if (wHint == this.widthHint.get() && hHint == this.heightHint.get()) {
			if (defaultWidth == -1 || defaultHeight == -1 || wHint != defaultWhint || hHint != defaultHhint) {
				// Point size = control.computeSize (wHint, hHint, flushCache);
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
			// Point size = control.computeSize (wHint, hHint, flushCache);
			currentWhint = wHint;
			currentHhint = hHint;
			currentWidth = control.getLayoutBounds().getWidth();
			currentHeight = control.getLayoutBounds().getHeight();
		}
		cacheWidth = currentWidth;
		cacheHeight = currentHeight;
	}

	void flushCache() {
		cacheWidth = cacheHeight = -1;
		defaultWidth = defaultHeight = -1;
		currentWidth = currentHeight = -1;
	}

	String getName() {
		String string = getClass().getName();
		int index = string.lastIndexOf('.');
		if (index == -1)
			return string;
		return string.substring(index + 1, string.length());
	}

	public void setExclude(boolean value) {
		exclude.set(value);
	}
	
	public boolean isExclude() {
		return exclude.get();
	}
	
	public BooleanProperty excludeProperty() {
		return exclude;
	}
	
	
	
	/**
	 * Returns a string containing a concise, human-readable description of the
	 * receiver.
	 * 
	 * @return a string representation of the GridData object
	 */
	public String toString() {
		String hAlign = "";
		switch (horizontalAlignment.get()) {
		case FX_FILL:
			hAlign = "SWT.FILL";
			break;
		case FX_BEGINNING:
			hAlign = "SWT.BEGINNING";
			break;
		case FX_LEFT:
			hAlign = "SWT.LEFT";
			break;
		case FX_END:
			hAlign = "SWT.END";
			break;
		case END:
			hAlign = "GridData.END";
			break;
		case FX_RIGHT:
			hAlign = "SWT.RIGHT";
			break;
		case FX_CENTER:
			hAlign = "SWT.CENTER";
			break;
		case CENTER:
			hAlign = "GridData.CENTER";
			break;
		default:
			hAlign = "Undefined " + horizontalAlignment;
			break;
		}
		String vAlign = "";
		switch (verticalAlignment.get()) {
		case FX_FILL:
			vAlign = "SWT.FILL";
			break;
		case FX_BEGINNING:
			vAlign = "SWT.BEGINNING";
			break;
		case FX_TOP:
			vAlign = "SWT.TOP";
			break;
		case FX_END:
			vAlign = "SWT.END";
			break;
		case END:
			vAlign = "GridData.END";
			break;
		case FX_BOTTOM:
			vAlign = "SWT.BOTTOM";
			break;
		case FX_CENTER:
			vAlign = "SWT.CENTER";
			break;
		case CENTER:
			vAlign = "GridData.CENTER";
			break;
		default:
			vAlign = "Undefined " + verticalAlignment;
			break;
		}
		String string = getName() + " {";
		string += "horizontalAlignment=" + hAlign + " ";
		if (horizontalIndent.get() != 0)
			string += "horizontalIndent=" + horizontalIndent + " ";
		if (horizontalSpan.get() != 1)
			string += "horizontalSpan=" + horizontalSpan + " ";
		if (grabExcessHorizontalSpace.get())
			string += "grabExcessHorizontalSpace=" + grabExcessHorizontalSpace + " ";
		if (widthHint.get() != FX_DEFAULT)
			string += "widthHint=" + widthHint + " ";
		if (minimumWidth.get() != 0)
			string += "minimumWidth=" + minimumWidth + " ";
		string += "verticalAlignment=" + vAlign + " ";
		if (verticalIndent.get() != 0)
			string += "verticalIndent=" + verticalIndent + " ";
		if (verticalSpan.get() != 1)
			string += "verticalSpan=" + verticalSpan + " ";
		if (grabExcessVerticalSpace.get())
			string += "grabExcessVerticalSpace=" + grabExcessVerticalSpace + " ";
		if (heightHint.get() != FX_DEFAULT)
			string += "heightHint=" + heightHint + " ";
		if (minimumHeight.get() != 0)
			string += "minimumHeight=" + minimumHeight + " ";
		if (exclude.get())
			string += "exclude=" + exclude + " ";
		string = string.trim();
		string += "}";
		return string;
	}

}