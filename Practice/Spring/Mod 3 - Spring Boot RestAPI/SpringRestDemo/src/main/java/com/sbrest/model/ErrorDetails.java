package com.sbrest.model;

import java.time.LocalDate;

public class ErrorDetails {

	private LocalDate timestamp ;
	private String message ;
	private String description ;
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ErrorDetails(LocalDate timestamp, String message, String description) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}
	public ErrorDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ErrorDetails [timestamp=" + timestamp + ", message=" + message + ", description=" + description + "]";
	}
	
	 
}
