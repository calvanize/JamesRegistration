package com.james.jamesRegistration.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.james.jamesRegistration.service.ShapeService;
import com.james.jamesRegistration.service.UserService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

//@SpringBootTest
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
		
		mvc.perform(post("/perimeter/circle"))
			.andDo(print());
		
	}

}
