package com.sc.object.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Earth {

	public static void main(String[] args) {

		String p = "com/sc/object/setterInjection/config.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(p);

		Person person = applicationContext.getBean("person", Person.class);
		System.out.println(person.getAir());
		Man man = applicationContext.getBean("man", Man.class);
		System.out.println(man.getAir());
		Woman woman = applicationContext.getBean("woman", Woman.class);
		System.out.println(woman.getAir());

		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
