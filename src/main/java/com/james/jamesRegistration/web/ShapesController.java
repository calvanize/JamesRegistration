package com.james.jamesRegistration.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.james.jamesRegistration.service.ShapeService;
import com.james.jamesRegistration.web.formdata.ShapeType;

@Controller
public class ShapesController {
	private static final String DATA = "data";
	private static final String VIEW = "shapecalculator";
	private static final String PERIMETER_MAPPING = "/perimeter/{type}";
	private static final String AREA_MAPPING = "/area/{type}";
	private static final String SURFACE_AREA_MAPPING = "/surface_area/{type}";
	private static final String VOLUME_MAPPING = "/volume/{type}";
	private static final String FORM_MAPPING = "/shape/calculate";
	
	private ShapeService shapeService;
	
	public ShapesController(ShapeService shapeService) {
		this.shapeService = shapeService;
	}
	
	@GetMapping(FORM_MAPPING)
	public String getShapeCalculator(Model model) {
		ShapeForm form = new ShapeForm();
		model.addAttribute(DATA, form);
		return VIEW;
	}

	@PostMapping(PERIMETER_MAPPING)
	public double calculatePerimeter(ShapeForm form, @PathVariable ShapeType type) {
		return shapeService.calculatePerimeter(form, type);
	}
	
	@PostMapping(AREA_MAPPING)
	public double calculateArea(ShapeForm form, @PathVariable ShapeType type) {
		return shapeService.calculateArea(form, type);		
	}
	
	@PostMapping(SURFACE_AREA_MAPPING)
	public double calculateSurfaceArea(ShapeForm form, @PathVariable ShapeType type) {
		return shapeService.calculateSurfaceArea(form, type);
	}
	
	@PostMapping(VOLUME_MAPPING)
	public double calculateVolume(ShapeForm form, @PathVariable ShapeType type) {
		return shapeService.calculateVolume(form, type);
	}
	
}
