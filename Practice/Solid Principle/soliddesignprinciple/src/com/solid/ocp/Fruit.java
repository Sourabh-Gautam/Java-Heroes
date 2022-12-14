package com.solid.ocp;

public class Fruit implements Shop {
	@Override
	public void purchase(String productName) {
		System.out.println(productName);		
	}
}
