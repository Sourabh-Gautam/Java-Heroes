package com.sc.beanlifecycle.usingannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Person {

	@PostConstruct
	public void init() {
		System.out.println("Entry - Take entry coin");
	}
	
	public void chilling() {
		System.out.println("Consuming alcohol, dancing and watching beauties");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Exit - Give back entry coin");
	}

}
