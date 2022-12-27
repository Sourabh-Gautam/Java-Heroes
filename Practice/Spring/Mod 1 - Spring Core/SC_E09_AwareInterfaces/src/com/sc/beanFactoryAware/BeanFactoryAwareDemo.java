package com.sc.beanFactoryAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryAwareDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println(context.getBean("myBean", MyBean.class));
		context.close();
	}
}
