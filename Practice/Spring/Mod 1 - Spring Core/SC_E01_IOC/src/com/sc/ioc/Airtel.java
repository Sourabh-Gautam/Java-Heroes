package com.sc.ioc;

public class Airtel implements Sim {
	
		public Airtel() {
			System.out.println("Airtel constructor");
		}
		
	@Override
	public void calling() {
		System.out.println("Calling from airtel");
	}

	@Override
	public void internet() {
		System.out.println("Internet surfing form airtel");
	}

}
