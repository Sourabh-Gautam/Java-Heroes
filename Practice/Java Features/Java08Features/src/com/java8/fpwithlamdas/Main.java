package com.java8.fpwithlamdas;

public class Main {

	public static void main(String[] args) {

		Fruit fruit = () -> System.out.println("Mango");
		fruit.name();

	}

}
