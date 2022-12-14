package com.solid.ocp;

public class Shopify {

	public static void main(String[] args) {
		
		Shop product = new Vegetable();
		product.purchase("Potato");
		
		Shop product2 = new Fruit();
		product2.purchase("Apple");
		
		Shop product3 = new FastFood();
		product3.purchase("Chilli Potato");
		
	}

}