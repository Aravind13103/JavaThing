package com.managment;

public class BankApplication {
	
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	
	public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance){
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		
	}
	
	
	double deposit(double depositAmount) {
		if(depositAmount<=0) {
			System.out.println("Invalid Deposit!");
			return balance;
		}
		balance+=depositAmount;
		return balance;
	}
	
	double withdraw(double withdrawAmount) {
		if(withdrawAmount <= 0) {
			System.out.println("Invalid");
		}
		if(this.balance <= 0) {
			System.out.println("Nothing to withdraw");
			return this.balance;
		}
		if(this.balance < withdrawAmount) {
			System.out.println("Insufficient Amount");
			return this.balance;
		} 
			balance-=withdrawAmount;
			return this.balance;	
		}
	
	double showBalance() {
		return balance;
	}
	
}







