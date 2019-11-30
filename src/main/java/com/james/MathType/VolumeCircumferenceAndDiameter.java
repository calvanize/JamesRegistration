package com.james.MathType;

import com.james.Shapes.*;

public class VolumeCircumferenceAndDiameter extends ShapesJ implements IShapes {

	private final double PI = 3.14;
	private double radius;
	private double height;
	private double length;
	private double width;
	private double base;
	double diameter;
	double circumference;
	double volume;

	protected double calculateDiameterOfCircle() {
//volume = = 2r
		diameter = 2 * radius;
		return diameter;
	}


	protected double calculateCircumferenceCircle() {
//circumference=  πd or 2πr
		circumference = 2 * (PI * radius);
		return circumference;
	}

	protected double calculateVolumeOfSphere() {
//volume = 4/3 πr3
		double total = PI * radius;
		volume = 1.3 * (Math.pow(total, 3));
		return volume;
	}

	protected double calculateVolumeOfCone() {
//volume =  1/3 πr2h
		double PIandRadius = PI * radius;
		volume = 0.3 * (Math.pow(PIandRadius, 2) * height);
		return volume;
	}

	protected double calculateVolumeOfCylinder() {
//volume = πr2h
		double PIandRadius = PI * radius;
		volume = (Math.pow(PIandRadius, 2) * height);
		return volume;
	}

	protected double calculateVolumeOfRectangularPrism() {
//volume =  lhw
		volume = length * height * width;
		return volume;
	}

	protected double calculateVolumeOfPyramid() {
//volume = 1/3 b2h
		volume = 0.3 * (Math.pow(base, 2) * height);
		return volume;
	}

	protected double calculateVolumeOfPrism() {
//volume = 1/2 (bh)l
		volume = 0.5 * ((base * height) * length);
		return volume;
	}

//<editor-fold defaultstate="collapsed" desc="Abstract Class">
	@Override
	public double calculateShape() {
		double total = 0; 
		if (super.getNAME().toLowerCase() == "diametercircle") {
			total = calculateDiameterOfCircle();
		}
		if (super.getNAME().toLowerCase() == "circumferencecircle") {
			total = calculateCircumferenceCircle();
		}
		if (super.getNAME().toLowerCase() == "sphere") {
			total = calculateVolumeOfSphere();
		}
		if (super.getNAME().toLowerCase() == "cone") {
			total = calculateVolumeOfCone();
		}
		if (super.getNAME().toLowerCase() == "cylinder") {
			total = calculateVolumeOfCylinder();
		}
		if (super.getNAME().toLowerCase() == "rectangularprism") {
			total =calculateVolumeOfRectangularPrism();
		}
		if (super.getNAME().toLowerCase() == "pyramid") {
			total = calculateVolumeOfPyramid();
		}
		if (super.getNAME().toLowerCase() == "prism") {
			total = calculateVolumeOfPrism();
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
