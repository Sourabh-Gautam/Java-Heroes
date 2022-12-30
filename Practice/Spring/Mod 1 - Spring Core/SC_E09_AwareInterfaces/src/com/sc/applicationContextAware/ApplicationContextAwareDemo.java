package com.sc.applicationContextAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextAwareDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		context.getBean("myBean", MyBean.class).numberOfBeans();
		context.close();
	}
}
