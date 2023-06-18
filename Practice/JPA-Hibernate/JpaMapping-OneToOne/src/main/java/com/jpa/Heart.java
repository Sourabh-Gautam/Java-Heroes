package com.jpa;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Heart {

	@Id
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Human human;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}
	
}
