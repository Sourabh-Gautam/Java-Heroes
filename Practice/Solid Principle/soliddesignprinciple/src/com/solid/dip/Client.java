package com.solid.dip;

public class Client {
	public static void main(String[] args) {
		UserController controller = new UserController();
		User user = controller.getUser("Sourabh");
		System.out.println(user);
	}
}