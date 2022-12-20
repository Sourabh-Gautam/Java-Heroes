package com.java8.fpwithclass;

import java.util.List;

public class WithFP {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(3, 43, 6, 34, 23, 68, 9);
		Stream.of(list).filter(new MyPredicateImpl()).forEach();
		
	}

}
