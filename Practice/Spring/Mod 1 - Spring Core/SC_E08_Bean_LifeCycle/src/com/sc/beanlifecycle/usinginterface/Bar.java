package com.sc.beanlifecycle.usinginterface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bar {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Person p = context.getBean("person", Person.class);
		p.chilling();
		context.close();
	}
}
