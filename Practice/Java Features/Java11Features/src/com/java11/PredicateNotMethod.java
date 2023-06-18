package com.java11;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateNotMethod {

	public static void main(String[] args) {
		
//		// What is negate() function in Predicte ?
//		
//		Predicate<Integer> pr = e -> e%2==0;
//		Stream.of(1,2,3).filter(pr.negate()).forEach(System.out::println);
		
		// What is not() function in Predicte ?
		
		Stream.of(1,2,3).filter(Predicate.not(PredicateNotMethod::test)).forEach(System.out::println);
		
	}
	
	public static boolean test(Integer t) {
		return t%2==0 ? true:false;
	}

}
