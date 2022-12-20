package com.java8.fpwithclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream {
	
	private static List<Integer> list;
	
	public static Stream of(List<Integer> myList) {
		list = myList;
		return new Stream();
	}
	
	public Stream filter(MyPredicate myPredicate) {
		List<Integer> newList = new ArrayList<>();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			if(myPredicate.test(n)) {
				newList.add(n);
			}
		}
		list = newList;
		return new Stream();
	}
	
	public void forEach() {
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
