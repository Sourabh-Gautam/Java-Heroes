package com.sbweb.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean autheticate(String username, String password) {
		
		return username.equalsIgnoreCase("sumit") && password.equalsIgnoreCase("sumit");
		
	}
}
