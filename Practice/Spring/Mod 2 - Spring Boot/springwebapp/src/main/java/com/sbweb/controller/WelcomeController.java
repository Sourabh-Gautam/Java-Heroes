package com.sbweb.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomePage(ModelMap model ) {
		model.put("myName", getLoggedInUser());
//		System.out.println(getLoggedInUser()); --- userName
		return "welcome";
	}
	
	public String getLoggedInUser() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
		
}
