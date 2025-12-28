package com.managment;
import java.util.Scanner;

public class BankApplicationELC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you Name: " );
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter your address: ");
		String address = sc.nextLine();
		
		System.out.println("Enter your phone number: ");
		long phone = sc.nextLong();
		
		System.out.println("Enter your initial deposit amount: ");
		double initialDeposit = sc.nextDouble();
		
		
		
		BankApplication obj = new BankApplication(name,address,phone,initialDeposit);
		System.out.println("Account created Succesfully!!");
		
		
		
		while(true) {
			System.out.println("----Select Option----");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			
			int opt = sc.nextInt();
			switch(opt) {
			
			case 1: 
					System.out.println("Enter the amount: ");
					double amount = sc.nextDouble();				
					double bal = obj.withdraw(amount);
					System.out.println("Current Balance: " + bal);
					break;
			
			case 2:
				System.out.println("Enter your deposit Amount: ");
				amount = sc.nextDouble();
				System.out.println("Successfull Deposit, Total Amount: " + obj.deposit(amount));
				break;
				
			case 3:
				System.out.println("Your Balance: " + obj.showBalance());
				break;
				
			case 4:
				System.out.println("Exited");
				sc.close();
				return;
				
			default:
				System.out.println("Enter correct option:");
			}
			
		}
	}

}








