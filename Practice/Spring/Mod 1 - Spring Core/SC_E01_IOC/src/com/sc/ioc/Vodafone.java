package com.sc.ioc;

public class Vodafone implements Sim {
		public Vodafone() {
				System.out.println("Voda constructor");
		}
	@Override
	public void calling() {
		System.out.println("Calling from vodafone");
	}

	@Override
	public void internet() {
		System.out.println("Internet surfing from vodafone");
	}
}
