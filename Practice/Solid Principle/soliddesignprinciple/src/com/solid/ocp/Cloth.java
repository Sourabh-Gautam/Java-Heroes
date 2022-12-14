package com.solid.ocp;

public class Cloth implements Shop  {
	@Override
	public void purchase(String productName) {
		System.out.println(productName);		
	}
}
