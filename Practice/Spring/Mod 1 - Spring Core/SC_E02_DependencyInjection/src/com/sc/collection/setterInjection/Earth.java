package com.sc.collection.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Earth {

	public static void main(String[] args) {

		String p = "com/sc/collection/setterInjection/config.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(p);

		Person person = applicationContext.getBean("person", Person.class);
		System.out.println(person.getFriendList());

		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
