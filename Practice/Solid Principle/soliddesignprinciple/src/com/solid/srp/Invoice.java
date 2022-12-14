package com.solid.srp;

public class Invoice {

	Book book;

	int quantity;

	public Invoice(Book book, int quantity) {
		super();
		this.book = book;
		this.quantity = quantity;
	}

	public double calculateTotal() {
		return book.bookPrice * this.quantity;
	}

}
