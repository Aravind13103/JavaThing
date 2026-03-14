package com.jvm;

public class Example1 {
	int a = 10;
	void add() {
		System.out.println("Adding numbers");
	}

	public static void main(String[] args) {
		
		Example1 obj = new Example1();
		obj.a = 20;
		System.out.println(obj.a);
		obj = null;
		System.out.println(obj.a);
		Example1 obj2 = new Example1();
		obj2 = null;
		System.out.println(obj2.a);
	}
}
