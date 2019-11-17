package com.james.jamesRegistration.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.james.jamesRegistration.data.AppUser;

public interface AppUserRepository extends CrudRepository<AppUser, Long>{
	
	public Optional<AppUser> findByUsername(String username);

}
