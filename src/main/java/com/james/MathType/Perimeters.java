package com.james.MathType;

import com.james.Shapes.*;

public class Perimeters extends ShapesJ implements IShapes {
	private double sideLength;
	private double baseLength;
	private double height;
	private double width;
	private double sideOne;
	private double sideTwo;
	private double baseOne;
	private double baseTwo;
	double perimeter;

	protected double calculatePerimeterOfTriangle() {
		// Perimeter = a + b + c
		perimeter = sideLength * 3;
		return perimeter;
	}

	protected double calculatePerimeterOfParallelogram() {
		// Perimeter = 2a + 2b
		perimeter = (2 * sideLength) + (2 * baseLength);
		return perimeter;
	}

	protected double calculatePerimeterOfRectangle() {
		// perimeter = = 2h + 2w
		perimeter = (2 * height) + (2 * width);
		return perimeter;
	}

	protected double calculatePerimeterOfSquare() {
		// perimeter = = 4s
		perimeter = 4 * sideLength;
		return perimeter;
	}

	protected double calculatePerimeterOfTrapezoid() {
		// perimeter = a + b1 + b2 + c
		perimeter = sideOne + baseOne + baseTwo + sideTwo;
		return perimeter;
	}

	protected double calculatePerimeterOfHexagon() {
		// perimeter = 6r
		perimeter = 6 * sideLength;
		return perimeter;
	}

	protected double calculatePerimeterOfOctagon() {
		// perimeter = 8a
		perimeter = 8 * sideLength;
		return perimeter;
	}

	@Override
	public double calculateShape() {
		double total = 0; 
		if (super.getNAME().toLowerCase() == "triangle") {
			total = calculatePerimeterOfTriangle();
		}
		if (super.getNAME().toLowerCase() == "parallelogram") {
			total = calculatePerimeterOfParallelogram();
		}
		if (super.getNAME().toLowerCase() == "rectangle") {
			total = calculatePerimeterOfRectangle();
		}
		if (super.getNAME().toLowerCase() == "sqaure") {
			total = calculatePerimeterOfSquare();
		}
		if (super.getNAME().toLowerCase() == "trapezoid") {
			total = calculatePerimeterOfTrapezoid();
		}
		if (super.getNAME().toLowerCase() == "hexagon") {
			total =calculatePerimeterOfHexagon();
		}
		if (super.getNAME().toLowerCase() == "octagon") {
			total = calculatePerimeterOfOctagon();
		}
		return total;
	}

	@Override
	public String displayShape() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public boolean saveShape() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}
	// </editor-fold>
}
