package com.sc.literal.setterInjection.customList;

import java.util.List;

public class Person {

	private List<Friend>  friends;

	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	
}
