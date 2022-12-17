package com.sc.collection.constructorInjection;

import java.util.Set;

public class Person {

	private Set<String> friendSet;

	public Person() {

	}

	public Person(Set<String> friendSet) {
		super();
		this.friendSet = friendSet;
	}

	public Set<String> getFriendSet() {
		return friendSet;
	}

	public void setFriendSet(Set<String> friendSet) {
		this.friendSet = friendSet;
	}

}
