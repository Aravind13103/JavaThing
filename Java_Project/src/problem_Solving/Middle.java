package problem_Solving;

public class Middle {
	String middleCharater(String input) {
		int len = input.length();
		System.out.println(len);
		int mid = len/2;
		if (len%2==0) {
			char first_middle_term = input.charAt(mid-1);
			char second_middle_term =  input.charAt(mid);
			String mix = "Middle characters are: "+first_middle_term +","+ second_middle_term;
			return mix;
			}else {
				char middle_char = input.charAt(mid);
				String mix1 = String.valueOf(middle_char);
				return mix1;
			}
		
	}
	
    public static void main(String[] args) {
    	Middle obj = new Middle();
    	String something = obj.middleCharater("Some");
    	System.out.println("Middle character is: "+something);
    	
        
    }
}
