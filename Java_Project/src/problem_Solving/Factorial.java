package problem_Solving;

public class Factorial {
	
	int Fact(int num) {
		int result = 1;
		while(num>0) {
			result = result * num;
			num--;
			}
		return result;
	}

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		int result = obj.Fact(3);
		System.out.println(result);
		
	}

}
