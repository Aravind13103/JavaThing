package practice;

 abstract class PayingSystem {
	abstract void method();
}

class child extends PayingSystem{
	void method() {
		System.out.println("Child");
	}
}
public class Payment {
	public static void main(String[] args) {
		PayingSystem p;
		p = new child();
		p.method();
	}
}
