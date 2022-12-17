package com.solid.dip2;

public class Sourabh {
	
	private Girl girl;
	
	public Sourabh() {
		girl = GirlFactory.getGirl();
	}
	
	public void relationship() {
		System.out.println("Sourabh is in relationship with "+girl.about());
	}

}
