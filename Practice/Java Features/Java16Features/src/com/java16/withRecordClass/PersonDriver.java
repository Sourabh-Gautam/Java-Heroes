package com.java16.withRecordClass;

public class PersonDriver {

	public static void main(String[] args) {
	
		Person person = new Person("Java", 30, "Sun Microsystem");
		Person person2 = new Person("Java", 30, "Sun Microsystem");
		Person person3 = new Person(null, 30, "Sun Microsystem");
		
		System.out.println(person.name());
		System.out.println(person.age());
		System.out.println(person.address());
		System.out.println(person);
		System.out.println(person.equals(person2));
		System.out.println(person3);
		
	}
	
}
