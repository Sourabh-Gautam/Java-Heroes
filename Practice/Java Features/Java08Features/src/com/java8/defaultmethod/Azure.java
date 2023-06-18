package com.java8.defaultmethod;

public class Azure implements CloudServer, CloudServerModern {

	@Override
	public void loadBalancing() {
		System.out.println("Load balancing with Azure");
	}
	
	@Override
	public void autoScaling() {
		System.out.println("Auto Scaling with Azure");
	}

	@Override
	public void hosting() {
		System.out.println("Hosting with Azure");
	}
	
	@Override
	public void storage() {
		System.out.println("Storage from Azure");
	}

	@Override
	public void analytics() {
		System.out.println("Analytics from Azure");
	}
	
}
