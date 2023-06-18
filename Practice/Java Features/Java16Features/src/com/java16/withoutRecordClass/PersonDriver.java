package com.java16.withoutRecordClass;

public class PersonDriver {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Java");
		person.setAge(30);
		person.setAddress("Sun Microsystem");
		
		Person person2 = new Person("Java", 30, "Sun Microsystem");
		
		System.out.println(person.getName());
		System.out.println(person2.getName());
		System.out.println(person);
		System.out.println(person2);
		System.out.println(person.equals(person2));
		
	}
	
}
