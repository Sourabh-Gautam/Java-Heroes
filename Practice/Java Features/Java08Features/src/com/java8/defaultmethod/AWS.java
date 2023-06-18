package com.java8.defaultmethod;

public class AWS implements CloudServer, CloudServerModern {

	@Override
	public void loadBalancing() {
		System.out.println("Load balancing with AWS");
	}
	
	@Override
	public void autoScaling() {
		System.out.println("Auto Scaling with AWS");
	}

	@Override
	public void hosting() {
		System.out.println("Hosting with AWS");
	}
	
	@Override
	public void analytics() {
		System.out.println("Analytics from AWS");
	}

	@Override
	public void storage() {
		
	}
	
}
