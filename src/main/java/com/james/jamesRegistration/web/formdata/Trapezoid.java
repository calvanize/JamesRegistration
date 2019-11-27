package com.james.jamesRegistration.web.formdata;

public class Trapezoid implements TwoDShape {
	private double base;
	private double top;
	private double side1;
	private double side2;
	private double height;
	
	public Trapezoid(double base, double top, double side1, double side2, double height) {
		this.base = base;
		this.top = top;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getTop() {
		return top;
	}

	public void setTop(double top) {
		this.top = top;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	@Override
	public double perimeter() {
		return base + height + side1 + side2;
	}

	@Override
	public double area() {
		return (base * top) * height / 2;
	}

}
