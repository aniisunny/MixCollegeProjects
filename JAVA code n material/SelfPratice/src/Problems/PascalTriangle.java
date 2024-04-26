package Problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
	
	static public List<List<Integer>> generate ( int numRows ) {
		List<List<Integer>> pascal = new LinkedList<List<Integer>>();
		for(int i = 1; i <= numRows; i++) {
			List<Integer> list = new LinkedList<Integer>();
			for(int j = 1; j <= i; j++) {
				list.add(pascalTriangle(i, j));
			}
			pascal.add(list);
		}
		return pascal;
	}
	
	static private int pascalTriangle(int i, int j) {
		if(j == 1 || j == i) {
			System.out.println("inner i = " + i + "  j=" + j) ;
			return 1;
		}
		System.out.println("outer  i = " + i + "  j=" + j) ;
		return pascalTriangle(i - 1, j - 1) + pascalTriangle(i - 1, j);
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner ( System.in );
		System.out.print("Enter the number of rows :- ");
		int numRows = sc.nextInt();
		
		System.out.println(generate(numRows));
	}
}
