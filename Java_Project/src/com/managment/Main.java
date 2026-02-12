package com.managment;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Student[] s = new Student[5];
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Student");
			System.out.println("2. View Studnet");
			System.out.println("3. Search by ID");
			System.out.println("4. Update by ID");
			System.out.println("5. Exit");
					
			int choice = sc.nextInt();
			
			switch(choice) {
			
				case 1:
					if (count>s.length) {
						System.out.println("Student list is full you cannot add more!!!");
						break;
					}
					s[count] = new Student();
					
					System.out.println("Enter the Student Name: ");
					s[count].name = sc.next();
					
					System.out.println("Enter the ID: ");
					s[count].id = sc.nextInt();
					
					System.out.println("Enter the Marks: ");
					s[count].marks  = sc.nextInt();
					
					count++;
					
					System.out.println("Studnet added successfully!!");
					break;
					
					
					
					
				case 2:
					if(count==0) {
						System.out.println("No student data available!!");
					}else {
						for(int i=0;i<count;i++) {
							s[i].display();
						}
					}
					break;
					
					
					
				case 3:
					if(count == 0) {
						System.out.println("No student data yet!!");
						break;
					}
					System.out.println("Enter the student ID: ");
					int searchId = sc.nextInt();
					Boolean found = false;
					
					for(int i = 0; i < count;i++) {
						if(searchId == s[i].id) {
							s[i].display();
							found = true;
							break;
						}
					}if(!found) {
						System.out.println("Studnet not found!!");
					}break;
				
					
					
				case 4:
					if(count==0) {
						System.out.println("No one is in here to update!!");
						break;
					}
					System.out.println("Enter the student ID:");
					int searchID = sc.nextInt();
					
					Boolean updated = false;
					
					for(int i = 0; i < count; i++) {
						if(s[i].id == searchID) {
							System.out.println("Enter new student name: ");
							s[i].name = sc.next();
							
							System.out.println("Enter new student marks: ");
							s[i].marks = sc.nextInt();
							
							System.out.println("Changes updated successfully on ID: " + s[i].id);
							updated = true;
							break;
							
						}
					}
						if(!updated) {
							System.out.println("Not Updated!!");
					}
						break;
					
					
					
				case 5:
					System.out.println("Exiting... Bye bebe");
					return;
				
				default :
					System.out.println("Enter vaild option!");
			}		
		}
	}
}
