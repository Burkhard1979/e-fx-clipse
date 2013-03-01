package at.bestsolution.efxclipse.jface.resources;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.Assert;

import at.bestsolution.efxclipse.jface.RGB;

public class StringConverter {
	/**
     * Converts the given value into an SWT RGB color value.
     * Returns the given default value if the 
     * value does not represent an RGB color value.
     *
     * @param value the value to be converted
     * @param dflt the default value
     * @return the value as a RGB color value, or the default value
     */
    public static RGB asRGB(String value, RGB dflt) {
        try {
            return asRGB(value);
        } catch (DataFormatException e) {
            return dflt;
        }
    }
    
    /**
     * Converts the given value into an SWT RGB color value.
     * This method fails if the value does not represent an RGB
     * color value.
     * <p>
     * A valid RGB color value representation is a string of the form
     * <code><it>red</it>,<it>green</it></code>,<it>blue</it></code> where
     * <code><it>red</it></code>, <it>green</it></code>, and 
     * <code><it>blue</it></code> are valid ints.
     * </p>
     *
     * @param value the value to be converted
     * @return the value as an RGB color value
     * @exception DataFormatException if the given value does not represent
     *	an RGB color value
     */
    public static RGB asRGB(String value) throws DataFormatException {
        if (value == null) {
			throw new DataFormatException("Null doesn't represent a valid RGB"); //$NON-NLS-1$
		}
        StringTokenizer stok = new StringTokenizer(value, ","); //$NON-NLS-1$

        try {
            String red = stok.nextToken().trim();
            String green = stok.nextToken().trim();
            String blue = stok.nextToken().trim();
            double rval = 0, gval = 0, bval = 0;
            try {
                rval = Double.parseDouble(red);
                gval = Integer.parseInt(green);
                bval = Integer.parseInt(blue);
            } catch (NumberFormatException e) {
                throw new DataFormatException(e.getMessage());
            }
            return new RGB(rval, gval, bval, 0);
        } catch (NoSuchElementException e) {
            throw new DataFormatException(e.getMessage());
        }
    }
    
    /**
     * Converts the given SWT RGB color value object to a string.
     * <p>
     * The string representation of an RGB color value has the form
     * <code><it>red</it>,<it>green</it></code>,<it>blue</it></code> where
     * <code><it>red</it></code>, <it>green</it></code>, and 
     * <code><it>blue</it></code> are string representations of integers.
     * </p>
     *
     * @param value the RGB color value object
     * @return the string representing the given RGB color value
     */
    public static String asString(RGB value) {
        Assert.isNotNull(value);
        StringBuffer buffer = new StringBuffer();
        buffer.append(value.red);
        buffer.append(',');
        buffer.append(value.green);
        buffer.append(',');
        buffer.append(value.blue);
        buffer.append(',');
        buffer.append(value.opacity);
        return buffer.toString();
    }
    
	/**
     * Converts the given value into an int.
     * This method fails if the value does not represent an int.
     *
     * @param value the value to be converted
     * @return the value as an int
     * @exception DataFormatException if the given value does not represent
     *	an int
     */
    public static int asInt(String value) throws DataFormatException {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new DataFormatException(e.getMessage());
        }
    }

    /**
     * Converts the given value into an int.
     * Returns the given default value if the 
     * value does not represent an int.
     *
     * @param value the value to be converted
     * @param dflt the default value
     * @return the value as an int, or the default value
     */
    public static int asInt(String value, int dflt) {
        try {
            return asInt(value);
        } catch (DataFormatException e) {
            return dflt;
        }
    }
    
    /**
     * Converts the given value into a boolean.
     * Returns the given default value if the 
     * value does not represent a boolean.
     *
     * @param value the value to be converted
     * @param dflt the default value
     * @return the value as a boolean, or the default value
     */
    public static boolean asBoolean(String value, boolean dflt) {
        try {
            return asBoolean(value);
        } catch (DataFormatException e) {
            return dflt;
        }
    }
    
    /**
     * Converts the given value into a boolean.
     * This method fails if the value does not represent a boolean.
     * <p>
     * Valid representations of <code>true</code> include the strings
     * "<code>t</code>", "<code>true</code>", or equivalent in mixed
     * or upper case.
     * Similarly, valid representations of <code>false</code> include the strings
     * "<code>f</code>", "<code>false</code>", or equivalent in mixed
     * or upper case. 
     * </p>
     *
     * @param value the value to be converted
     * @return the value as a boolean
     * @exception DataFormatException if the given value does not represent
     *	a boolean
     */
    public static boolean asBoolean(String value) throws DataFormatException {
        String v = value.toLowerCase();
        if (v.equals("t") || v.equals("true")) { //$NON-NLS-1$ //$NON-NLS-2$
			return true;
		}
        if (value.equals("f") || v.equals("false")) { //$NON-NLS-1$ //$NON-NLS-2$
			return false;
		}
        throw new DataFormatException(
                "Value " + value + "doesn't represent a boolean"); //$NON-NLS-2$//$NON-NLS-1$
    }
}
