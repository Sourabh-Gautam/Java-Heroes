package com.sc.annotation.requiredAlternate;

import org.springframework.beans.factory.annotation.Value;

public class Student {


	private final int rollno;
	private String name;
	private double fee;

	
	public Student(int rollno) {
		super();
		this.rollno = rollno;
		System.out.println("Constructor called");
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	@Value(value = "sumit")
	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	@Value(value = "4000.6")
	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fee=" + fee + "]";
	}

}
