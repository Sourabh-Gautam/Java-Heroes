package com.sc.literal.setterInjection.customMap;


import java.util.Map;

public class Person {

	private Map<Integer, Friend>  friends;

	public Map<Integer, Friend> getFriends() {
		return friends;
	}

	public void setFriends(Map<Integer, Friend> friends) {
		this.friends = friends;
	}


}
