package com.solid.srp;

public class InvoicePrinter {
	
	Invoice invoice;
	
	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printInvoice() {
		System.out.println(invoice.quantity 
				+ "x " + invoice.book.bookName + " " + invoice.book.bookPrice + "$");
		System.out.println("Total: " + invoice.calculateTotal());
	}
	
}
