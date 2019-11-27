package com.james.jamesRegistration.web.formdata;

public class Hexagon implements TwoDShape {
	private double side;
	
	public Hexagon(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		return 6 * side;
	}

	@Override
	public double area() {
		return 3 * side * side * Math.sqrt(3) / 2;
	}

}
