package com.sc.autowiring.byName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
			String p = "com/sc/autowiring/byName/config.xml";
			
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(p);
			
			Person person = applicationContext.getBean("person", Person.class);
			person.startPumping();
			applicationContext.close();
	}
}
