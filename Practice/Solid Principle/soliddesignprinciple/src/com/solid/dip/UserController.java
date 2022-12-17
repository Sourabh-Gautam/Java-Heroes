package com.solid.dip;

public class UserController {

	private Service service;
	
	public UserController() {
		service = ServiceFactory.getService();
	}
	
	public User getUser(String userName) {
		return service.getUserByUserName(userName);
	}
	
}