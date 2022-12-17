package com.sc.object.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Earth {

	public static void main(String[] args) {

		String p = "com/sc/object/constructorInjection/config.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(p);

		Person person = applicationContext.getBean("person", Person.class);
		System.out.println(person.getAir());

		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
