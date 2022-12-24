package com.java8.defaultmethod;

public interface CloudServer {
	
	void loadBalancing();
	
	void autoScaling();
	
	void hosting();
	
	default void storage() {
		
	}
	
}