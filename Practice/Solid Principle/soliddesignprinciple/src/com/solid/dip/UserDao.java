package com.solid.dip;

public class UserDao implements Service {

	@Override
	public User getUserByUserName(String userName) {
		return new User(userName, "admin");
	}
	
}
