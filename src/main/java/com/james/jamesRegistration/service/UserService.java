package com.james.jamesRegistration.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.james.jamesRegistration.dao.AppUserRepository;
import com.james.jamesRegistration.data.AppUser;
import com.james.jamesRegistration.web.UserForm;

@Service
public class UserService {
	private AppUserRepository appUserRepository;
	private PasswordEncoder passwordEncoder;
	
	public UserService(AppUserRepository appUserRepository, PasswordEncoder passwordEncoder) {
		this.appUserRepository = appUserRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Transactional
	public AppUser registerNewUserAccount(UserForm userForm) {
		Optional<AppUser> userP = appUserRepository.findByUsername(userForm.getEmail());
		if(userP.isPresent()) {
			throw new RuntimeException("There is an account with the email address");
		}
		
		AppUser user = new AppUser();
		user.setFirstname(userForm.getFirstname());
		user.setLastname(userForm.getLastname());
		user.setUsername(userForm.getEmail());
		user.setPassword(passwordEncoder.encode(userForm.getPassword()));
		return appUserRepository.save(user);
	}

}
