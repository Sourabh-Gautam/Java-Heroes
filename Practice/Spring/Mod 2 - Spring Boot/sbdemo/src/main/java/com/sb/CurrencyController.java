package com.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@Autowired
	CurrencyServiceConfiguration configuration;
	
	@GetMapping("/currency")
	public CurrencyServiceConfiguration getConfiguration(){
		
		return configuration;
	}
	
}
