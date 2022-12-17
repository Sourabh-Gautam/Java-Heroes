package com.sc.literal.constructorInjection;

public class Person {

	private double money;

	public Person() {

	}

	public Person(int money) {
		super();
		System.out.println("int");
		this.money = money;
	}

	public Person(short money) {
		super();
		System.out.println("short");
		this.money = money;
	}

	public Person(byte money) {
		super();
		System.out.println("byte");
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
