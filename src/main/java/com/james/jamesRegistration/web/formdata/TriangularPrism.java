package com.james.jamesRegistration.web.formdata;

public class TriangularPrism implements ThreeDShape {
	private double lengthA;
	private double lengthB;
	private double lengthC;
	private double height;
	
	public TriangularPrism(double lengthA, double lengthB, double lengthC, double height) {
		this.lengthA = lengthA;
		this.lengthB = lengthB;
		this.lengthC = lengthC;
		this.height = height;
	}

	@Override
	public double surfaceArea() {
		return Math.sqrt(- Math.pow(lengthA, 4) + 2*Math.pow(lengthA*lengthB, 2) +
				2*Math.pow(lengthA*lengthC, 2) - Math.pow(lengthB, 4) + 2*Math.pow(lengthB*lengthC, 2)
				- Math.pow(lengthC, 4))/ 2 + (lengthA*height + lengthB * height + lengthC * height);
	}

	@Override
	public double volume() {
		return Math.sqrt(- Math.pow(lengthA, 4) + 2*Math.pow(lengthA*lengthB, 2) +
			2*Math.pow(lengthA*lengthC, 2) - Math.pow(lengthB, 4) + 2*Math.pow(lengthB*lengthC, 2)
			- Math.pow(lengthC, 4)) * height / 4;
	}

}
