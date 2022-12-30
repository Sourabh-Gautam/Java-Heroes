package com.sc.beanPostProcessors;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements InitializingBean {

	private String name;

	public MyBean() {
		System.out.println("MyBean constructor called !");
	}

	@Value(value = "Spring")
	public void setName(String name) {
		this.name = name;
		System.out.println("MyBean Setter called !");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() called");
	}
	
}
