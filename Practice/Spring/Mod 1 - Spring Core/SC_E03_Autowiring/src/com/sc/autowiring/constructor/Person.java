package com.sc.autowiring.constructor;

public class Person {
	private Heart dhadkan;
	
	public Person(Heart dhadkan) {
		super();
		this.dhadkan = dhadkan;
		System.out.println("Inside the constructor.");
	}

	public void setDhadkan(Heart dhadkan) {
		this.dhadkan = dhadkan;
		System.out.println("Inside setter.");
	}

	public void startPumping() {
		if (dhadkan != null) {
			dhadkan.pump();
		} else {
			System.out.println("heart is not pumbing");
		}
	}



}
