package com.sc.annotation.bean;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class Student {

	private int rollno;
	private String name;
	private double fee;

	public int getRollno() {
		return rollno;
	}

//	@Value(value = "${student.rollno}")
	@Required
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
