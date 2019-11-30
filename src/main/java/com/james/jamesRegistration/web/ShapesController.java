package com.james.jamesRegistration.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.james.jamesRegistration.web.formdata.ShapeType;

@Controller
public class ShapesController {
	private static final String PERIMETER_MAPPING = "/perimeter/{type}";
	private static final String AREA_MAPPING = "/area/{type}";
	private static final String SURFACE_AREA_MAPPING = "/surface_area/{type}";
	private static final String VOLUME_MAPPING = "/volume/{type}";

	@PostMapping(PERIMETER_MAPPING)
	public void calculatePerimeter(ShapeForm form, ShapeType type) {
		
	}
	
	@PostMapping(AREA_MAPPING)
	public void calculateArea(ShapeForm form, ShapeType type) {
		
	}
	
	@PostMapping(SURFACE_AREA_MAPPING)
	public void calculateSurfaceArea(ShapeForm form, ShapeType type) {
		
	}
	
	@PostMapping(VOLUME_MAPPING)
	public void calculateVolume(ShapeForm form, ShapeType type) {
		
	}
}
