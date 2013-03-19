package at.bestsolution.efxclipse.jface;

import javafx.scene.paint.Color;

public class RGB {
	public final double red;
	public final double green;
	public final double blue;
	public final double opacity;
	
	public RGB(double red, double green, double blue, double opacity) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.opacity = opacity;
	}

	public RGB(Color color) {
		this.red = color.getRed();
		this.green = color.getGreen();
		this.blue = color.getBlue();
		this.opacity = color.getOpacity();
	}
	
	public static RGB iRGB(int red, int green, int blue) {
		return new RGB(red/255.0,green/255.0,blue/255.0,1.0);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(opacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(blue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(green);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(red);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RGB other = (RGB) obj;
		if (Double.doubleToLongBits(opacity) != Double
				.doubleToLongBits(other.opacity))
			return false;
		if (Double.doubleToLongBits(blue) != Double
				.doubleToLongBits(other.blue))
			return false;
		if (Double.doubleToLongBits(green) != Double
				.doubleToLongBits(other.green))
			return false;
		if (Double.doubleToLongBits(red) != Double.doubleToLongBits(other.red))
			return false;
		return true;
	}

	
}
