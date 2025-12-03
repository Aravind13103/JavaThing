package problem_Solving;

public class Reverse {
	boolean numberReversing(int num){
	    int copy = num;
	    int rem = 0;
	    int reve = 0;
	    while (num>0){
	      rem = (num % 10);
	      reve = (reve*10)+rem;
	      num = num / 10;
	    }
	    return reve == copy;
	  }
	
	public static void main(String [] args) {
		Reverse obj = new Reverse();
		  
	      boolean result = obj.numberReversing(102);
	      System.out.println("Is this number is Palindrom: "+result);
	}

}
