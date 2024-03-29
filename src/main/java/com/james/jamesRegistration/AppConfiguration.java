package com.james.jamesRegistration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(final AuthenticationManagerBuilder auth) throws Exception{
		auth.jdbcAuthentication().passwordEncoder(passwordEncoder());
	}
	
	@Override
	protected void configure(final HttpSecurity http) throws Exception{
		http.csrf().disable().formLogin();
	}

	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
