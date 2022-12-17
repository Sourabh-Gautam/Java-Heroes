package com.solid.dip;

public class UserService implements Service {
	public User getUserByUserName(String userName) {
		return new User(userName, "admin");
	}
}
