package com.sc.beanFactoryAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements BeanFactoryAware {

	private String name;
	private BeanFactory beanFactory;

	public MyBean() {
		System.out.println("MyBean constructor called !");
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.println("setBeanFactory() called !");
	}

	@Value(value = "Spring")
	public void setName(String name) {
		this.name = name;
		System.out.println("MyBean Setter called !");
	}

	@Override
	public String toString() {
		return "MyBean [name=" + name + ", beanFactory=" + beanFactory + "]";
	}
	
}
