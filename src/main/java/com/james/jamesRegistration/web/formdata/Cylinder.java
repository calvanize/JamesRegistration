package com.james.jamesRegistration.web.formdata;

public class Cylinder implements ThreeDShape {
	
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double surfaceArea() {
		return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
	}

	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}

}
