package com.james.jamesRegistration.web.formdata;

public class Ellipse implements TwoDShape{
	private double radiusA;
	private double radiusB;
	
	public Ellipse(double radiusA, double radiusB) {
		this.radiusA = radiusA;
		this.radiusB = radiusB;
	}

	@Override
	public double perimeter() {
		return 0;
	}

	@Override
	public double area() {
		return Math.PI * radiusA * radiusB;
	}

}
