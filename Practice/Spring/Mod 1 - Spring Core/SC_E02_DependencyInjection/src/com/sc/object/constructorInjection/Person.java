package com.sc.object.constructorInjection;

public class Person {

	private Air air;

	public Person() {

	}

	public Person(Air air) {
		super();
		this.air = air;
	}

	public Air getAir() {
		return air;
	}

	public void setAir(Air air) {
		this.air = air;
	}

}
