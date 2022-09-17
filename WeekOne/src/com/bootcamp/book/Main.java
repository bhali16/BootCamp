package com.bootcamp.book;

public class Main {

	public static void main(String[] args) {
		Book books[] = new Book[5];

		books[0] = new Fiction("Divergent");
		books[1] = new Fiction("Insurgent");
		books[2] = new NonFiction("Atomic Habits");
		books[3] = new NonFiction("The Road Less Travelled");
		books[4] = new NonFiction("Power of Now");
		
		System.out.println("List of Fiction and Non-Fiction Books:-");
		System.out.println("----------------------------------------");
		for (int i = 0; i < books.length; i++) {
			System.out.println("Name:" + books[i].getBookTitle());
			System.out.println("Price:$" + books[i].getBookPrice());
			System.out.println("----------------------------------------");
		}
	}
}
