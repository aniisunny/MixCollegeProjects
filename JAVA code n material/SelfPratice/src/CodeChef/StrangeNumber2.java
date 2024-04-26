package CodeChef;

import java.util.Scanner;

public class StrangeNumber2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-- != 0) {
			int X = sc.nextInt();
			int K = sc.nextInt();
			
			int primeFactors = 0, i = 2;
			while(i * i <= X) {
				if(X % i != 0) ++i;
				else {
					X /= i;
					++primeFactors;
				}
			}
			if(X > 1) ++primeFactors;
			
			if(primeFactors >= K) System.out.println(1); 
			else System.out.println(0);
		}
		sc.close();
	}

}
