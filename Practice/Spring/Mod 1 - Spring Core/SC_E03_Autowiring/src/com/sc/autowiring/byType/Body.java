package com.sc.autowiring.byType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
			String p = "com/sc/autowiring/byType/config.xml";
			
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(p);
			
			Person person = applicationContext.getBean("person", Person.class);
			person.startPumping();
			applicationContext.close();
	}
}
