package Semester6;

import java.util.Scanner;

abstract class Account {
	double interestRate;
	double amount;
	
	abstract double calculateInterest();
}

class FDAccount extends Account {
	double interestRate, amount;
	int noOfDays, ageOfACHolder;
	
	double calculateInterest() {
		
		if(amount < 0) throw new InterestException("amount");
		if(noOfDays < 0) throw new InterestException("number of days");
		if(ageOfACHolder < 0) throw new InterestException("age");
		else {
			interestRate = new FDInterest().fetchInterest(noOfDays, amount, ageOfACHolder);
			return amount * interestRate / 100;
		}
	}
}

class SBAccount extends Account {
	double interestRate, amount;
	int accountType;
	
	double calculateInterest() {
		
		if(accountType == 1) return amount * 4.00 / 100;
		else if(accountType == 2) return amount * 6.00 / 100;
		else throw new InterestException("accountType");
	}
}

class RDAccount extends Account {
	double interestRate, amount;
	int noOfMonths, age;
	
	double calculateInterest() {
		
		if(amount < 0) throw new InterestException("amount");
		if(noOfMonths < 0) throw new InterestException("number of months");
		if(age < 0) throw new InterestException("age");
		if(age <= 50) interestRate = 7.50 + ((noOfMonths - 6) / 3) * 0.25;
		else interestRate = 8.00 + ((noOfMonths - 6) / 3) * 0.25;
		return amount * interestRate / 100;
	}
}

public class InterestCalculator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nSelect the option:");
			System.out.println("\n\t1. Interest Calculator - SB");
			System.out.println("\t2. Interest Calculator - FD");
			System.out.println("\t3. Interest Calculator - RD");
			System.out.println("\t4. Exit\n");
			
			int option = sc.nextInt();
			
			switch(option) {
				case 1: {
					SBAccount account = new SBAccount();
					System.out.println("\nEnter the average amount in your account:");
					account.amount = sc.nextDouble();
					System.out.println("Enter the account type(Normal for 1 or NRI for 2): ");
					account.accountType = sc.nextInt();
					try {
						System.out.println("Interest gained: Rs." + account.calculateInterest());
					} catch(Exception e) {
						System.err.println(e.getMessage());
					}
					break;
				}
				case 2: {
					FDAccount account = new FDAccount();
					System.out.println("\nEnter the FD amount:");
					account.amount = sc.nextDouble();
					System.out.println("Enter the number of days:");
					account.noOfDays = sc.nextInt();
					System.out.println("Enter the age: ");
					account.ageOfACHolder = sc.nextInt();
					try {
						System.out.println("Interest gained: Rs." + account.calculateInterest());
					} catch(Exception e) {
						System.err.println(e.getMessage());
					}
					break;
					
				}
				case 3: {
					RDAccount account = new RDAccount();
					System.out.println("\nEnter the RD amount: ");
					account.amount = sc.nextDouble();
					System.out.println("Enter the number of months: ");
					account.noOfMonths = sc.nextInt();
					System.out.println("Enter the age: ");
					account.age = sc.nextInt();
					try {
						System.out.println("Inetrest gained: Rs." + account.calculateInterest());
					} catch(Exception e) {
						System.err.println(e.getMessage());
					}
					break;
				}
				case 4: {
					System.exit(0);
				}
				default: 
					System.out.println("Please enter the correct options");
			}
		}

	}

}
