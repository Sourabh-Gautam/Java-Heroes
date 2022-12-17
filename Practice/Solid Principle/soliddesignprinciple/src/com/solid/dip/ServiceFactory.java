package com.solid.dip;

public class ServiceFactory {

	public static Service getService() {
		return new UserService();
	}
}
