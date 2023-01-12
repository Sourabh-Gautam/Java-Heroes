package com.sbweb.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public InMemoryUserDetailsManager detailsManager() {
		
		UserDetails userDetails1 = addNewUser("sumit", "s");
		UserDetails userDetails2 = addNewUser("sourabh", "sou");
		
		return new InMemoryUserDetailsManager(userDetails1, userDetails2);
		
	}

	
	public UserDetails addNewUser(String username, String password) {
		return User.builder().passwordEncoder(pwd -> passwordEncoder().encode(pwd))
				.username(username)
				.password(password)
				.roles("USER", "ADMIN")
				.build();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		http.formLogin(Customizer.withDefaults());
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
	}
	

}
