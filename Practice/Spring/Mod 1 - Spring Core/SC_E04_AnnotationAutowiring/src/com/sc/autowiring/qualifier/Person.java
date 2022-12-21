package com.sc.autowiring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	
	private Heart dhadkan;

	public Person() {
		System.out.println("Non-paramaterised consturctor called.");
	}

	public Person(Heart dhadkan) {
		super();
		this.dhadkan = dhadkan;
		System.out.println("Inside constructor.");
	}

	@Autowired
	@Qualifier(value = "heart")
	public void setDhadkan(Heart dhadkan) {
		this.dhadkan = dhadkan;
		System.out.println("Inside Setter.");
	}

	public void startPumping() {
		if (dhadkan != null) {
			dhadkan.pump();
		} else {
			System.out.println("heart is not pumbing");
		}
	}
}
