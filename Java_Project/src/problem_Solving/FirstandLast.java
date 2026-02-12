package problem_Solving;

public class FirstandLast {
	
	  static Boolean firstLast(String num){
		    int firstsum = 0;
		    int secondsum = 0;
		    int len = num.length();
		    for(int i=0;i<=len-1;i++){
		      char iter = num.charAt(i); 
		      int newVar = Character.getNumericValue(iter) ;
		      if (i == 0 || i == len-1){
		        firstsum = firstsum+newVar;
		        
		      }else secondsum = secondsum + newVar;
		      
		      }
		      return firstsum == secondsum;
		  }

	public static void main(String[] args) {
	      System.out.println("Is the sum is same: "+firstLast("75547"));

	}

}
