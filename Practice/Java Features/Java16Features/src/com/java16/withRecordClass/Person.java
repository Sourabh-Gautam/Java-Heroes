package com.java16.withRecordClass;

public record Person(String name, int age, String address) {
	
	public Person(String name, int age, String address) {
		if(name==null) {
			this.name = "Unknown";
		}else {
			this.name = name;
		}
		this.age= age;
		this.address = address;
	}
	
//	Cononical Constructor 
	
//	public Person {
//	}
	
	public String toString() {
		return "Name - "+name;
	}
	
}
