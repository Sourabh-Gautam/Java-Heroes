package com.java8.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Sourabh");
		list.add("Mohit");
		list.add("Pobin");

//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String name = it.next();
//			if(name.startsWith("P")) {
//				it.remove();
//			}
//		}
		
		list.forEach( e -> {
			if(e.startsWith("P")) {
				list.add("Po");
//				list.remove(e);
			}
		});
		
		System.out.println(list);

	}

}

