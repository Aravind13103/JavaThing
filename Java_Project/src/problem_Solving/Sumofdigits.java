package problem_Solving;

public class Sumofdigits {
	  
	   int sumOfDigits(int num){
	     int sum = 0;
	     int rem=0;
	     while (num>0){
	       rem = num%10;
	       sum = sum + rem;
	       num = num / 10;
	     }
	     return sum;
   }
	  
	  
	  
	public static void main(String[] args) {
		Sumofdigits obj = new Sumofdigits();
	       int result = obj.sumOfDigits(336293);
	       System.out.print(result);
	      
	    
	}

}
