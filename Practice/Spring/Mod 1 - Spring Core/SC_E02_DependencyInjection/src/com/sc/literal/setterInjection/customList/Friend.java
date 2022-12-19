package com.sc.literal.setterInjection.customList;

public class Friend {

	private String friend;

	public String getFriend() {
		return friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return friend;
	}

}
