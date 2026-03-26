package com.packages;

class String {
	public void display() {
		System.out.println("String class!");
	}
}

public class Main {

	public static void main(java.lang.String[] args) {
//		Using built-in String
		java.lang.String s = "Hello Babe!";
		
//		Using custom String class 
		com.packages.String obj = new com.packages.String();
		obj.display();
	}

}
