package CodeChef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HardCash {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		while(testCases != 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			List<Integer> coins = new ArrayList<Integer>();
			int leftSum = 0, rightSum = 0;
			for(int i = 0; i < n; i++) {
			    coins.add(sc.nextInt());
			    if(n % 2 == 0 && i < n / 2) 
			        leftSum += coins.get(i);
			    else if(n % 2 == 0 && i >= n / 2)
			        rightSum += coins.get(i);
			    else if(n % 2 != 0 && i <= n / 2)
			        leftSum += coins.get(i);
			    else 
			        rightSum += coins.get(i);
			}
			
			int result = (leftSum % k) + (rightSum % k);
			System.out.println(result);
			testCases--;
		}
		sc.close();
	}

}
