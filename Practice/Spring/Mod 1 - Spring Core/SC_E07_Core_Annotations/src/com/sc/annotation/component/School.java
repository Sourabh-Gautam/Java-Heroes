package com.sc.annotation.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {

	public static void main(String[] args) {

		String p = "com/sc/annotation/component/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(p);
		Student student = (Student) context.getBean( "student");
		System.out.println(student);
		context.close();

	}

}
