package com.solid.ocp;

public class Vegetable implements Shop {

	@Override
	public void purchase(String productName) {
		System.out.println(productName);		
	}

}
