package com.sc.annotation.value;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {

	public static void main(String[] args) {

		String p = "com/sc/annotation/value/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(p);
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		context.close();

	}

}
