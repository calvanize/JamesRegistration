package com.james.jamesRegistration.service;

import org.springframework.stereotype.Service;

import com.james.jamesRegistration.web.ShapeForm;
import com.james.jamesRegistration.web.formdata.Circle;
import com.james.jamesRegistration.web.formdata.Cone;
import com.james.jamesRegistration.web.formdata.Cylinder;
import com.james.jamesRegistration.web.formdata.Ellipse;
import com.james.jamesRegistration.web.formdata.Hexagon;
import com.james.jamesRegistration.web.formdata.Octagon;
import com.james.jamesRegistration.web.formdata.Parallelogram;
import com.james.jamesRegistration.web.formdata.Rectangle;
import com.james.jamesRegistration.web.formdata.RectangularPrism;
import com.james.jamesRegistration.web.formdata.ShapeType;
import com.james.jamesRegistration.web.formdata.Sphere;
import com.james.jamesRegistration.web.formdata.ThreeDShape;
import com.james.jamesRegistration.web.formdata.Trapezoid;
import com.james.jamesRegistration.web.formdata.Triangle;
import com.james.jamesRegistration.web.formdata.TriangularPrism;
import com.james.jamesRegistration.web.formdata.TwoDShape;

@Service
public class ShapeService {
	
	public double calculateArea(ShapeForm form, ShapeType type) {
		TwoDShape shape = getTwoDShape(form, type);
		return shape == null ? 0.0 : shape.area();
	}
	
	public double calculatePerimeter(ShapeForm form, ShapeType type) {
		TwoDShape shape = getTwoDShape(form, type);
		return shape == null ? 0.0 : shape.perimeter();
	}
	
	public double calculateSurfaceArea(ShapeForm form, ShapeType type) {
		ThreeDShape shape = getThreeDShape(form, type);
		return shape == null ? 0.0 : shape.surfaceArea();
	}
	
	public double calculateVolume(ShapeForm form, ShapeType type) {
		ThreeDShape shape = getThreeDShape(form, type);
		return shape == null ? 0.0 : shape.volume();
	}

	private TwoDShape getTwoDShape(ShapeForm form, ShapeType type) {
		TwoDShape shape = null;
		if(ShapeType.CIRCLE == type) {
			shape = new Circle(form.getRadius());
		} else if (ShapeType.ELLIPSE == type) {
			shape = new Ellipse(form.getRadiusA(), form.getRadiusB());
		} else if (ShapeType.HEXAGON == type) {
			shape = new Hexagon(form.getSide());
		} else if (ShapeType.OCTAGON == type) {
			shape = new Octagon(form.getSide());
		} else if (ShapeType.PARALLELOGRAM == type) {
			shape = new Parallelogram(form.getBase(), form.getSide(), form.getHeight());
		} else if (ShapeType.RECTANGLE == type) {
			shape = new Rectangle(form.getLength(), form.getWidth());
		} else if (ShapeType.SQUARE == type) {
			shape = new Rectangle(form.getLength());
		} else if (ShapeType.TRAPEZOID == type) {
			shape = new Trapezoid(form.getBase(), form.getTop(), form.getSide1(), form.getSide2(), form.getHeight());
		} else if (ShapeType.TRIANGLE == type) {
			shape = new Triangle(form.getSidea(), form.getSideb(), form.getSidec(), form.getAnglec());
		}
		return shape;
	}
	
	private ThreeDShape getThreeDShape(ShapeForm form, ShapeType type) {
		ThreeDShape shape = null;
		if(ShapeType.CONE == type) {
			shape = new Cone(form.getRadius(), form.getHeight());
		} else if (ShapeType.CYLINDER == type) {
			shape = new Cylinder(form.getRadius(), form.getHeight());
		} else if (ShapeType.RECTANGULAR_PRISM == type) {
			shape = new RectangularPrism(form.getWidth(), form.getLength(), form.getHeight());
		} else if (ShapeType.SQUARE_PRISM == type) {
			shape = new RectangularPrism(form.getLength(), form.getHeight());
		} else if (ShapeType.SPHERE == type) {
			shape = new Sphere(form.getRadius());
		} else if (ShapeType.TRIANGULAR_PRISM == type) {
			shape = new TriangularPrism(form.getLengthA(), form.getLengthB(), form.getLengthC(), form.getHeight());
		}
		return shape;
	}

}
