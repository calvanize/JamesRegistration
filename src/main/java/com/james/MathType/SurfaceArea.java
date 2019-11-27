package com.james.MathType;

import com.james.Shapes.*;

public class SurfaceArea extends ShapesJ implements IShapes {

	private final double PI = 3.14;
	private double length;
	private double height;
	private double sideLength;
	private double radius;
	private double width;
	private double baseLength;
	private double seminorAxis;
	private double semiMajorAxis;
	private double baseOne;
	private double baseTwo;
	double area;

	protected double calculateAreaOfSquare() {
//area = s2
		area = Math.pow(sideLength, 2);
		return area;
	}

	protected double calculateRectangle() {
//area = h x w
		area = height * width;
		return area;
	}

	protected double calculateAreaOfFullCircle() {
//area= πr2
		area = PI * Math.pow(radius, 2);
		return area;
	}

	protected double calculateSurfaceAreaOfSphere() {
//area = 4πr2
		area = 4 * PI * Math.pow(radius, 2);
		return area;
	}

	protected double calculateSurfaceAreaOfCone() {
//area = πr2 + πrs
		area = (PI * radius * sideLength) + (PI * Math.pow(radius, 2));
		return area;
	}

	protected double calculateSurfaceAreaOfCylinder() {
//area =  2πr2 + 2πrh
		double theAreaOfBottom = PI * Math.pow(radius, 2);
		double theAreaOfSide = PI * radius * height;
		area = (2 * theAreaOfBottom) + (2 * theAreaOfSide);
		return area;
	}

	protected double calculateSurfaceAreaOfRectangularPrism() {
//area = 2(lh) + 2(lw) + 2(wh)
		area = 2 * ((width * height) + (length * width) + (length * height));
		return area;
	}

	protected double calculateSurfaceAreaOfSqaureBasedPyramid() {
//area = 2bs + b2;
		double getBase = Math.pow(baseLength, 2);
		area = (2 * baseLength * sideLength) + getBase;
		return area;
	}

	protected double calculateSurfaceAreaOfTriangularPrism() {
//area = bh + 2ls + lb;
		area = (baseLength * height) + (2 * (length * sideLength) + (length * baseLength));
		return area;
	}

	protected double calculateSurfaceAreaOfEllipse() {
//area = πab
//Semiminor Axis (a): The shortest distance
//between the center point and the edge.
//Semimajor Axis (b): The longest distance 
//between the center point and the edge.
		area = PI * seminorAxis * semiMajorAxis;
		return area;
	}

	protected double calculateSurfaceAreaOfTriangle() {
//area = 1/2 bh
		area = 0.5 * baseLength * height;
		return area;
	}

	protected double calculateSurfaceAreaOfParallelogram() {
//area = b x h
		area = baseLength * height;
		return area;
	}

	protected double calculateSurfaceAreaOfTrapezoid() {
//area = 1/2 (b1 + b2) x h

		area = 0.5 * ((baseOne + baseTwo) * height);
		return area;
	}

	@Override
	public double calculateShape() {
		double total=0;
		if (super.getNAME().toLowerCase() == "sqaure") {
			total = calculateAreaOfSquare();
		}
		if (super.getNAME().toLowerCase() == "circle") {
			total = calculateAreaOfFullCircle();
		}
		if (super.getNAME().toLowerCase() == "sphere") {
			total = calculateSurfaceAreaOfSphere();
		}
		if (super.getNAME().toLowerCase() == "cone") {
			total = calculateSurfaceAreaOfCone();
		}
		if (super.getNAME().toLowerCase() == "cylinder") {
			total = calculateSurfaceAreaOfCylinder();
		}
		if (super.getNAME().toLowerCase() == "rectangularprism") {
			total = calculateSurfaceAreaOfRectangularPrism();
		}
		if (super.getNAME().toLowerCase() == "sqaurebasedprism") {
			total = calculateSurfaceAreaOfSqaureBasedPyramid();
		}
		if (super.getNAME().toLowerCase() == "triangularprism") {
			total = calculateSurfaceAreaOfTriangularPrism();
		}
		if (super.getNAME().toLowerCase() == "ellipse") {
			total = calculateSurfaceAreaOfEllipse();
		}
		if (super.getNAME().toLowerCase() == "triangle") {
			total = calculateSurfaceAreaOfTriangle();
		}
		if (super.getNAME().toLowerCase() == "parallelogram") {
			total = calculateSurfaceAreaOfParallelogram();
		}
		if (super.getNAME().toLowerCase() == "trapezoid") {
			total = calculateSurfaceAreaOfTrapezoid();
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
//</editor-fold>
}
