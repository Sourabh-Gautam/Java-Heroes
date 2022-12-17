package com.sc.collection.setterInjection.map;

import java.util.Map;

public class Person {

	private Map<Integer, String> friendList;

	public Person() {

	}

	public Map<Integer, String> getFriendList() {
		return friendList;
	}

	public void setFriendList(Map<Integer, String> friendList) {
		this.friendList = friendList;
	}

}