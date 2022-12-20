package com.java8.fpwithlamdas;

import java.util.List;

// Find out the odd numbers in the given list.

public class WithoutFP {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(3, 43, 6, 34, 23, 68, 9);
		for(Integer n : list) {
			if(n%2!=0) {
				System.out.println(n);
			}
		}
		
	}
}
