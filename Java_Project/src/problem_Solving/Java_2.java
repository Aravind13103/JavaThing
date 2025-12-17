package problem_Solving;

public class Java_2 {
	
	static Boolean method(int num) {
		int sq = num * num;
		int temp = num;
		int sum = 0;
		while (sq!=0) {
			int rem = sq % 10;
			sum = sum + rem;
			sq/=10;
		}
		return sum == temp;
	}

	
	public static void main(String[] args) {
		System.out.println(method(9));
		
	}

}
