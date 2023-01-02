package com.java8.optional;

import java.util.Optional;

public class Fruit {
	
	private String fruitName;
	
	public Fruit() {
	}

	public Fruit(String fruitName) {
		this.fruitName = fruitName;
	}

	public Optional<String> getFruitName() {
		return Optional.ofNullable(fruitName);
	}
	
//	public String getFruitName() {
//		return fruitName;
//	}
	
}
