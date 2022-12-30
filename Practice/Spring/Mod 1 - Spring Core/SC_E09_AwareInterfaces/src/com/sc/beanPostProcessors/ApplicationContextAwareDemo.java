package com.sc.beanPostProcessors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextAwareDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		context.getBean(MyBean.class);
		context.close();
	}
}
