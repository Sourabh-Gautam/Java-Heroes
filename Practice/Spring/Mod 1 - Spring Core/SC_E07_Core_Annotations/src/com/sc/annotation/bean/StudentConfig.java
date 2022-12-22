package com.sc.annotation.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sc.annotation.configuration")
public class StudentConfig {

	@Bean(name= {"rohit","sourabh","sumit"})
	public Student getStudent() {
		return new Student();
	}
}
