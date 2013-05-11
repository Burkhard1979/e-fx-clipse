package at.bestsolution.efxclipse.gefx.demo.util;

public class BoundingBox {

	private double x;
	private double y;
	private double width;
	private double height;

	public BoundingBox(double x, double y, double width, double height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getMinX() {
		return 0;
	}

}
