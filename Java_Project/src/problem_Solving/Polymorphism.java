package problem_Solving;

public class Polymorphism {
	
//	public void method(int i) {
//		System.out.println("Int");
//	}
//	
	public void method(byte i) {
		System.out.println("Byte");
	}
	public void method(short i) {
		System.out.println("Short");
	}
	public void method(long i) {
		System.out.println("Long");
	}
	public void method(float i) {
		System.out.println("Float");
	}
	public void method(Integer j) {
		System.out.println("Integer");
	}
	
	
	public static void main(String[] args) {
		new Polymorphism().method(10);
		
	}
}
