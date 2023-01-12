package com.sbweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sbweb.service.AuthenticationService;

@Controller
@SessionAttributes("myName")
public class LoginController {

//	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private AuthenticationService authenticationService ;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginPage() {
//		logger.info("I want info {}",name );
//		logger.debug("I want debug");
//		logger.warn("I want warn ");
//		model.put("myname", name);
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String welcomePage(@RequestParam String name,@RequestParam String password, ModelMap model ) {
		if(authenticationService.autheticate(name, password)) {
			model.put("myName", name);
			return "welcome";
		}
		model.put("errorMsg", "Invalid credentials");
		return "login";
	}
}
