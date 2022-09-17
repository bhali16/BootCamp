package com.bootcamp.book;

abstract class Book {
	private String bookTitle;
	double bookPrice;

	public Book(String title) {
		this.bookTitle = title;
		this.bookPrice = 0;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public abstract void setBookPrice();
}
