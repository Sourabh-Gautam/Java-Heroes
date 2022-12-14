package com.solid.ocp;

public class FastFood implements Shop {

	@Override
	public void purchase(String productName) {
		System.out.println(productName);
	}

}
