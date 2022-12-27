package com.sc.beanNameAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameAwareDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println(context.getBean("myBean", MyBean.class));
	}
}
