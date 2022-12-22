package com.sc.annotation.primary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class School {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PenConfig.class);
		Teacher teacher = context.getBean( "teacher", Teacher.class);
		teacher.teach();
		context.close();

	}
	
}
