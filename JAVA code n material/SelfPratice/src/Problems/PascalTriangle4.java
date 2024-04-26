package Problems;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle4 {
	
	static public List<List<Integer>> generate ( int numRows ) {
		List<List<Integer>> pascal = new LinkedList<List<Integer>>();
		for(int i = 0; i < numRows; i++) {
			List<Integer> list = new LinkedList<Integer>();
			for(int j = 0; j <= i; j++) {
				BigInteger p = factorial(i).divide(factorial(j).multiply(factorial(i - j))); 
				list.add(p.intValue());
			}
			System.out.println(list);
			pascal.add(list);
		}
		return pascal;
	}
	
	static BigInteger factorial(int n) {
		BigInteger f = new BigInteger("1");
		if(n == 0 || n == 1)
			return f;
		 for (int i = 2; i <= n; i++) 
	            f = f.multiply(BigInteger.valueOf(i)); 
	        return f; 
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner ( System.in );
		System.out.print("Enter the number of rows :- ");
		int numRows = sc.nextInt();
		
		System.out.println(generate(numRows));

	}

}
