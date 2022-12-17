package com.sc.collection.setterInjection;

import java.util.List;

public class Person {

	private List<String> friendList;

	public Person() {

	}

	public Person(List<String> friendList) {
		super();
		this.friendList = friendList;
	}

	public List<String> getFriendList() {
		return friendList;
	}

	public void setFriendList(List<String> friendList) {
		this.friendList = friendList;
	}

}
