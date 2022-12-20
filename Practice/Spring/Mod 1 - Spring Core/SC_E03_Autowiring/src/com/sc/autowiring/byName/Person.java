package com.sc.autowiring.byName;

public class Person {
	private Heart dhadkan;

public Person() {
	System.out.println("constructor czak");
}

	public void setDhadkan(Heart dhadkan) {
		System.out.println("setter czak");
		this.dhadkan = dhadkan;
	}
	public void startPumping() {
		if (dhadkan != null) {
			dhadkan.pump();
		} else {
			System.out.println("heart is not pumbing");
		}
	}
}
