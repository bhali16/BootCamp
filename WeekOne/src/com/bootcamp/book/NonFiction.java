package com.bootcamp.book;

public class NonFiction extends Book {
	public NonFiction(String bookTitle) {
		super(bookTitle);
		setBookPrice();
	}

	public void setBookPrice() {
		bookPrice = 24.99;
	}

	void showDetails() {
		System.out.println("NonFiction:- ");
		System.out.println(getBookTitle() + " $" + getBookPrice());
	}
}