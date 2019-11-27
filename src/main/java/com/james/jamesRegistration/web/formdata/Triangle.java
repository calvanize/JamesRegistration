package com.james.jamesRegistration.web.formdata;

public class Triangle implements TwoDShape {
	private double sidea;
	private double sideb;
	private double sidec;
	private double anglec;
	
	public Triangle(double sidea, double sideb, double sidec, double anglec) {
		this.sidea = sidea;
		this.sideb = sideb;
		this.sidec = sidec;
		this.anglec = anglec;
	}

	public double getSidea() {
		return sidea;
	}

	public void setSidea(double sidea) {
		this.sidea = sidea;
	}

	public double getSideb() {
		return sideb;
	}

	public void setSideb(double sideb) {
		this.sideb = sideb;
	}

	public double getSidec() {
		return sidec;
	}

	public void setSidec(double sidec) {
		this.sidec = sidec;
	}

	public double getAnglec() {
		return anglec;
	}

	public void setAnglec(double anglec) {
		this.anglec = anglec;
	}

	@Override
	public double perimeter() {
		return sidea + sideb + sidec;
	}

	@Override
	public double area() {
		return sidea * sideb * Math.sin(anglec);
	}

}
