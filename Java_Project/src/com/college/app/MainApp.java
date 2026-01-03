package com.college.app;

import com.college.model.*;
import com.college.service.*;

import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		
		StudentService service = new StudentService();
		
		Scanner sc = new Scanner(System.in);
		
		
		//Student Details
		System.out.println("Enter Student Name: ");
		String name = sc.next();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Enetr Contact Number: ");
		long contact = sc.nextLong();
		System.out.println("Enter StudentID: ");
		int ID = sc.nextInt();
		System.out.println("Enter the Department: ");
		String departmentID = sc.next();
		System.out.println("Enter the Course Name: ");
		String courseName = sc.next();
		
		Student student = new Student(name,age,contact,ID,departmentID,courseName);
		System.out.println("Enter course Fee: ");
		double fee = sc.nextDouble();
		student.displayDetails();
		System.out.println("-------------------");
		
		
		Course c1 = new Course(90,courseName,fee);
		double discount = service.caluculateDiscountFee(fee, departmentID);
		c1.setCourseFee(discount);
		
		System.out.println("Final Payable AMount: "+ c1.getCourseFee());
		

	}
}
