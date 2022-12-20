package com.java8.fpwithclass;

public class MyPredicateImpl implements MyPredicate {

	@Override
	public boolean test(Integer n) {
		if(n%2!=0) {
			return true;
		}
		return false;
	}

}
