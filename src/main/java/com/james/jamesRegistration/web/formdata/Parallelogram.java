package com.james.jamesRegistration.web.formdata;

public class Parallelogram implements TwoDShape {
	
	private double base;
	private double side;
	private double height;

	public double getBase() {
		return base;
	}

	public void setBase(double parSideA) {
		this.base = parSideA;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double parSideC) {
		this.side = parSideC;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double perimeter() {
		return 2 * ( height + base );
	}

	@Override
	public double area() {
		return base * height;
	}

}
