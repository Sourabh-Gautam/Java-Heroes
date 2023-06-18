package com.java8.fpwithanonymousclass;

public class Main {

	public static void main(String[] args) {

		Fruit fruit = new Fruit() {

			@Override
			public void name() {
				System.out.println("Mango");
			}
			
		};
		
		fruit.name();
		
	}

}
