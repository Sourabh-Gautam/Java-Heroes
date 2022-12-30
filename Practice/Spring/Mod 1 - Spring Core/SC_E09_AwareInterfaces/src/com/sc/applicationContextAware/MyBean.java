package com.sc.applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements ApplicationContextAware {

	private String name;
	private ApplicationContext applicationContext;

	public MyBean() {
		System.out.println("MyBean constructor called !");
	}

	@Value(value = "Spring")
	public void setName(String name) {
		this.name = name;
		System.out.println("MyBean Setter called !");
	}

	public void numberOfBeans() {
		System.out.println("Number of beans object avaialable : "+applicationContext.getBeanDefinitionCount());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
}
