package com.java8.defaultmethod;

public class Zomato extends Azure {
	
	public Zomato() {
		this.autoScaling();
		this.loadBalancing();
	}

	void orderFood() {
		System.out.println("Food ordered");
	}
	
}
