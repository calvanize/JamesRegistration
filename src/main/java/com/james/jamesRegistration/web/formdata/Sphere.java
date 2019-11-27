package com.james.jamesRegistration.web.formdata;

public class Sphere implements ThreeDShape {
	private double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double surfaceArea() {
		return 4 * Math.PI * radius * radius;
	}

	@Override
	public double volume() {
		return 4 * Math.PI * radius * radius * radius / 3;
	}

}
