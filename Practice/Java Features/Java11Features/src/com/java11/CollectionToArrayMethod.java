package com.java11;

import java.util.Arrays;
import java.util.List;

public class CollectionToArrayMethod {

	public static void main(String[] args) {
		
		List<String> list = getNameList();
		String[] names = list.toArray(String[]::new);
		System.out.println(Arrays.toString(names));
		
	}

	private static List<String> getNameList() {
		return List.of("Sourabh", "Sumit", "Rohit");
	}
	
	
}
