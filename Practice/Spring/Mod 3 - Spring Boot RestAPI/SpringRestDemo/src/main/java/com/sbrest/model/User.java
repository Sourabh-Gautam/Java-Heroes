package com.sbrest.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


public class User {

	private long id;

	@Size(min = 2, message = "Username should contains atleast two character")
	private String username;
	
	@Past
	private LocalDate dob;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public User(long id, String username, LocalDate dob) {
		super();
		this.id = id;
		this.username = username;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", dob=" + dob + "]";
	}

	public User() {
	}

}
