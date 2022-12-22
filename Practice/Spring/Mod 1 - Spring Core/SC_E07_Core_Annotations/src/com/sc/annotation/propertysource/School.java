package com.sc.annotation.propertysource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class School {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = (Student) context.getBean("sourabh", Student.class);
		System.out.println(student);
		context.close();

	}

}
