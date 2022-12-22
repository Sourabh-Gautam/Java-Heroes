package com.sc.annotation.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class School {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = (Student) context.getBean("student", Student.class);
		System.out.println(student);
		context.close();

	}

}
