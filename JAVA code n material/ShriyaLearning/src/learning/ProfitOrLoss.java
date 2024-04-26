package learning;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Selling Price: ");
		int sellingPrice = scanner.nextInt();
		
		System.out.print("Costing Price: ");
		int costingPrice = scanner.nextInt();
		
		if (costingPrice > sellingPrice) {
			int amountofloss = costingPrice - sellingPrice;
			System.out.print("amount of loss: " + amountofloss);
		}
		else {
			int amountofprofit = sellingPrice - costingPrice;
			System.out.print("amount of profit: " + amountofprofit);
		}
	}
}
