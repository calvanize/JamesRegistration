package com.james.jamesRegistration.web.formdata;

public class Cone implements ThreeDShape {
	private double radius;
	private double height;

	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double surfaceArea() {
		return Math.PI * radius * ( radius + Math.sqrt(radius * radius + height * height));
	}

	@Override
	public double volume() {
		return Math.PI * radius * radius * height / 3;
	}

}
