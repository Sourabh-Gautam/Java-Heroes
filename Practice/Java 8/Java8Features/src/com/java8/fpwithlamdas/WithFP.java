package com.java8.fpwithlamdas;

import java.util.List;

public class WithFP {

	public static void main(String[] args) {

		List<Integer> list = List.of(3, 43, 6, 34, 23, 68, 9);

		MyPredicate myPredicate = (n) -> {
			if (n % 2 != 0) {
				return true;
			}
			return false;
		};

		Stream.of(list).filter(myPredicate).forEach();

	}

}
