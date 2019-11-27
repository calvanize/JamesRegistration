package com.james.jamesRegistration.web.formdata;

public class Octagon implements TwoDShape {
	private double side;
	
	public Octagon(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		return 8 * side;
	}

	@Override
	public double area() {
		return 2 * side * side * (1 + Math.sqrt(2));
	}

}
