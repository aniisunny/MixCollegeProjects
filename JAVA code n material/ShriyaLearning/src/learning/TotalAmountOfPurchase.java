package learning;

import java.util.Scanner;

public class TotalAmountOfPurchase {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);	
		
		System.out.print("Enter rate of item: ");
		int rate = scanner.nextInt();
		System.out.print("Enter quantity of item: ");
		int quantity = scanner.nextInt();
		
		int totalamount = rate*quantity;
		
		if (totalamount>=2000) {
			double discountamount = (totalamount*15)/100;
			double netamount = totalamount - discountamount;
			System.out.println("Net Amount: " + netamount);
		}
		else {
			System.out.println("Total Amount: " + totalamount);
		}
	}

}
