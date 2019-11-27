package com.james.jamesRegistration.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.james.jamesRegistration.service.UserService;

@Controller
public class UserRegistrationController {
	public static final String USER_REG = "/user/registration";
	public static final String VIEW = "registration";
	private static final String USER = "user";
	
	
	private UserService UserService;
	
	public UserRegistrationController(UserService UserService) {
		this.UserService = UserService;
	}
	
	@GetMapping(USER_REG)
	public String getRegistrationPage(Model model) {
		UserForm userForm = new UserForm();
		model.addAttribute(USER, userForm);
		return VIEW;
	}
	
	@PostMapping(USER_REG)
	public void registerUser(@ModelAttribute(USER) UserForm userForm) {
		UserService.registerNewUserAccount(userForm);
	}

}
