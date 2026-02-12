package practice;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayClassTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = Integer.parseInt(sc.nextLine());
		
		String []arr = new String[size];
		for(int i = 0; i < size;i++) {
			if(size <= 0 || size > 10) {
				System.out.println("Invalid size");
				sc.close();
				break;
			}
			else {
			System.out.println("Enter names: ");
			String name = sc.nextLine();
			arr[i] = name;
			System.out.println(Arrays.toString(arr));
			}
			
		}
		
		sc.close();
	}

}
