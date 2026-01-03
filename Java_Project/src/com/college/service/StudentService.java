package com.college.service;
import com.college.model.*;


public class StudentService {

	
	public double caluculateDiscountFee(double fee, String Department) {
		if(Department.equals("IT")) {
			double discount = fee * 0.1;
			System.out.println("Discount Applied!");
			return fee-discount;
		}
		else {
			System.out.println("No Discount!");
			
		}
		return fee;
	}
	
}
