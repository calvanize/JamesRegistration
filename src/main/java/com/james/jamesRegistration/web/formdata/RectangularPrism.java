package com.james.jamesRegistration.web.formdata;

public class RectangularPrism implements ThreeDShape {
	private double width;
	private double length;
	private double height;

	public RectangularPrism(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public RectangularPrism(double length, double height) {
		this.width = length;
		this.length = length;
		this.height = height;
	}
	@Override
	public double surfaceArea() {
		return 2 * (width * length + height * length + width * height);
	}

	@Override
	public double volume() {
		return width * length * height;
	}

}
