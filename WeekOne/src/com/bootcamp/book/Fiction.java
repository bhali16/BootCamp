package com.bootcamp.book;

public class Fiction extends Book {
	public Fiction(String bookTitle) {
		super(bookTitle);
		setBookPrice();
	}

	public void setBookPrice() {
		bookPrice = 24.99;
	}

	void showDetails() {
		System.out.println("Fiction:-");
		System.out.println(getBookTitle() + " $" + getBookPrice());

	}
}
