package com.sc.propertiesFile.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {

	public static void main(String[] args) {

		String p = "com/sc/propertiesFile/demo/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(p);
		Student student = context.getBean(Student.class);
		System.out.println(student);
		context.close();

	}

}
