package com.java8.optional;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) throws MyError {
		
		Fruit fruit = new Fruit();
		
//		String fruitName = fruit.getFruitName();
//		
//		if(fruitName!=null) {
//			System.out.println(fruitName.charAt(0));
//		}else {
//			System.out.println("Fruit not present !");
//		}
		
		Optional<String> fruitNameOpt = fruit.getFruitName();
		System.out.println(fruitNameOpt.orElseThrow(() -> new MyError("Record not found !")).charAt(0));
//		if(fruitNameOpt.isPresent()) {
//		}else {
//			System.out.println("Fruit not present !");
//		}
		
		System.out.println("Bye bro !");
	}
	
}
