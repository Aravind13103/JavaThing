package problem_Solving;

public class Java_2 {
	
	static Boolean neon(int num) {
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
	static Boolean palindrome(int num) {
		int temp = num;
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			rev = (rev * 10) + rem;
			num/=10;
		}
		return temp == rev;
	}

	
	public static void main(String[] args) {
		System.out.println("Is it a neon number: "+neon(9));
		System.out.println("Is it palindrome: " +palindrome(1234321));
		
	}

}
