package com.james.jamesRegistration.web;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.james.jamesRegistration.service.ShapeService;
import com.james.jamesRegistration.service.UserService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest
public class ShapesControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private UserService userService;
	
	@MockBean
	private ShapeService shapeService;
	
	@Test
	public void calculatePerimenter() throws Exception {
		Mockito.when(shapeService.calculateArea(Mockito.any(), Mockito.any())).thenReturn(89.36);
		mvc.perform(post("/area/SQUARE")
				.param("length", "8.0"))
			.andDo(print());
		
	}

}
