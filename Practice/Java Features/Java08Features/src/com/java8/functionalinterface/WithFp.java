package com.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class WithFp {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().filter( e -> e%2==0 ).forEach(System.out::println);;
		
	}
	
}
