package problem_Solving;

public class B extends A{
	void method2() {
		System.out.println("This is a Child");
	}

	public static void main(String[] args) {
		//This causes Runtime error!!
//		A parent = new A();		
//		B child = (B) parent;
		
		
		// This is a correct way to handle the Down Casting the objects
		A var = new B();
		B newVar = (B) var;
		newVar.method2();
		newVar.method();
		
	}

}
