package com.solid.srp;

public class Main {
	public static void main(String[] args) {
		Book book = new Book("Java", 500);
		Invoice invoice = new Invoice(book, 2);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
		invoicePrinter.printInvoice();
	}
}