package com.java8.defaultmethod;

public interface CloudServerModern {
	
	void loadBalancing();
	
	void autoScaling();
	
	void hosting();
	
	default void storage() {
		
	}

	void analytics();
	
}
