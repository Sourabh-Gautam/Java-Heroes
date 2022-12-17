package com.solid.dip3;

public class Person {

	private Mobile mobile = new OnePlus();
	
	void doCalling() {
		System.out.println("Person is calling "+mobile.calling());
	}
	
}
