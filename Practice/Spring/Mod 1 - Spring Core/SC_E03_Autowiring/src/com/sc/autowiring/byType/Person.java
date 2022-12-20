package com.sc.autowiring.byType;

public class Person {
	private Heart dhadkan;


	public void setDhadkan(Heart dhadkan) {
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
