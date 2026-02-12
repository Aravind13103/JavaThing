package com.library;

public class LibrarySystem {

	public static void main(String[] args) {
		
		Book obj = new Book(21,"Law",3);
		System.out.println("Book Id: " + obj.getBookId() +"\n"+
							"Book Title: " + obj.gettitle()+"\n"+
							"Available Books: "+obj.getavaliableCopies());
		
		
		
		while(obj.getavaliableCopies() > 0) {
			obj.borrowBooks();
//			System.out.println("Book being borrowed!");
		}
		System.out.println("------------------------");
		System.out.println("Returning....");
		
		while(obj.getavaliableCopies()<3) {
			obj.returnBook();
		}

	}
}

