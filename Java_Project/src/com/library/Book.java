package com.library;

public class Book {

	private int bookId;
	private String title;
	private int availableCopies;
	
	// parameterized constructor
	public Book( int bookId, String title, int availableCopies) {
		this.bookId = bookId;
		this.title = title;
		this.availableCopies = availableCopies;
	}
	
	//Getter methods to retrieve the data
	public int getBookId() {
		return this.bookId;
	}
	
	public String gettitle() {
		return this.title;
	}
	
	public int getavaliableCopies() {
		return this.availableCopies;
	}
	
	//borrow Method
	int borrowBooks(){
		System.out.println("Book Being borrowed..");
		if(this.availableCopies!=0) {
			this.availableCopies-=1;
			System.out.println("Available Books: "+ this.availableCopies);
			return this.availableCopies;
		}
		
		return 0;
	}
	
	// Returning Books
	void returnBook() {
		System.out.println("Returning Books..");
		this.availableCopies++;
		System.out.println("Available book: " + this.availableCopies);
	}
}




