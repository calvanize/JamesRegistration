package com.james.jamesRegistration.web.formdata;

public class Rectangle implements TwoDShape {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(double side) {
		this.length = side;
		this.width = side;
	}

	@Override
	public double perimeter() {
		return 2 * (getLenght() + getWidth());
	}

	@Override
	public double area() {
		return getLenght() * getWidth();
	}

	public double getLenght() {
		return length;
	}

	public void setLenght(double lenght) {
		this.length = lenght;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
