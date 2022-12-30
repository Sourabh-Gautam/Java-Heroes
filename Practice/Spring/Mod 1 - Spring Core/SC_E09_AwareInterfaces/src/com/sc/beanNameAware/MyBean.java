package com.sc.beanNameAware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements BeanNameAware {

	private String name;
	private String myBeanName;

	public MyBean() {
		System.out.println("MyBean constructor called !");
	}

	@Override
	public void setBeanName(String myBeanName) {
		this.myBeanName = myBeanName;
		System.out.println("setBeanName() called !");
	}

	@Value(value = "Spring")
	public void setName(String name) {
		this.name = name;
		System.out.println("MyBean Setter called !");
	}
	
	@Override
	public String toString() {
		return "MyBean [name=" + name + ", myBeanName=" + myBeanName + "]";
	}

}
