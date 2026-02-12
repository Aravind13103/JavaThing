package practice;


//class Animal {
//	public void method() {
//		System.out.println("Animal Sound");
//	}
//}
//
//class Dog extends Animal{
//	
//	@Override
//	public void method() {
//		System.out.println("Dog Barks");
//	}
//	
//}
//-------------------------------------------------------------
//class Vechile {
//	public void start() {
//		System.out.println("Vechile Started");
//	}
//}
//class Car extends Vechile{
//	
//	@Override
//	public void start() {
//		System.out.println("Car Started");
//	}
//}

//-------------------------------------------------------------

//class Person {
//	protected void display() {
//		System.out.println("I am a person");
//	}
//}
//
//class Student extends Person {
//	@Override
//	public void display() {
//		System.out.println("I am student");
//	}
//}

//---------------------------------------------------------------

//class Parent {
//	public static void print() {
//		System.out.println("parent");
//	}
//}
//
//class Child extends Parent {
//	public static void print() {
//		System.out.println("child");
//	}
//}

class Shape {
	public void draw() {
		System.out.println("Drawing shape");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Shape[] s = new Shape[2];
		s[0] = new Circle();
		s[1] = new Square();
		
		for (Shape o : s) {
			o.draw();
		}
		
		
		
		
		
		
		
//		Parent obj = new Child();
//		obj.print();
		
//		Person p = new Student();
//		p.display();
//		
		
		
//		Vechile v = new Vechile();
//		Car c = new Car();
//		v.start();
//		c.start();
		
		
		
//		Animal a = new Animal();
//		Dog d = new Dog();
//		a.method();
//		d.method();
		
	}

}
