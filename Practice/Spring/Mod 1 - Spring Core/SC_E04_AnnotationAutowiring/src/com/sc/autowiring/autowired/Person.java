package com.sc.autowiring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	@Autowired
	private Heart dhadkan;

	public Person() {
		System.out.println("Non-paramaterised consturctor called.");
	}

	public Person(Heart dhadkan) {
		super();
		this.dhadkan = dhadkan;
		System.out.println("Inside constructor.");
	}

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
