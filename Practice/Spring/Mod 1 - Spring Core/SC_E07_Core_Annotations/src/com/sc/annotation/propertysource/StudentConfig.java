package com.sc.annotation.propertysource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.sc.annotation.configuration")
@PropertySource(value="classpath:com/sc/annotation/propertysource/student-info.properties")
public class StudentConfig {

	@Bean(name= {"rohit","sourabh","sumit"})
	public Student getStudent() {
		return new Student();
	}
}
