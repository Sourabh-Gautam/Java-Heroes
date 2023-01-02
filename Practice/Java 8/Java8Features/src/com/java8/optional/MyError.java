package com.java8.optional;

public class MyError extends Exception {

	public MyError() {
		super();
	}

	public MyError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyError(String message, Throwable cause) {
		super(message, cause);
	}

	public MyError(String message) {
		super(message);
	}

	public MyError(Throwable cause) {
		super(cause);
	}
	
}
