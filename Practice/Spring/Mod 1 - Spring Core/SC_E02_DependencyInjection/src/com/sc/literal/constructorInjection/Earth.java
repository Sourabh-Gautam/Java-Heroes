package com.sc.literal.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Earth {

	public static void main(String[] args) {

		String p = "com/sc/literal/constructorInjection/config.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(p);

		Person person = applicationContext.getBean("person", Person.class);
		System.out.println(person.getMoney());

		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
