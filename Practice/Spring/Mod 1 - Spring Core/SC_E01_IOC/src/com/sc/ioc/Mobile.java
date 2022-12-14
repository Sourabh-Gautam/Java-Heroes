package com.sc.ioc;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Sim sim = applicationContext.getBean( "sim", Sim.class);
		sim.calling();
		sim.internet();
		
		((ClassPathXmlApplicationContext)applicationContext).close();
		
	}

}
