package Problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle3 {
	
	static public List<List<Integer>> generate ( int numRows ) {
		List<List<Integer>> pascal = new LinkedList<List<Integer>>();
		//List<Integer> listold = new LinkedList<Integer>();
		for(int i = 0; i < numRows; i++) {
			List<Integer> listnew = new LinkedList<Integer>();
			for(int j = 0; j <= i; j++) {
				if(j == 0 || i == j) {
					listnew.add(1);
				}
				else {
					int t = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
					listnew.add(t);
				}
			}
			//listold.clear();
			//listold.addAll(listnew);
			pascal.add(listnew);
			//listnew.clear();
		}
		return pascal;
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner ( System.in );
		System.out.print("Enter the number of rows :- ");
		int numRows = sc.nextInt();
		
		System.out.println(generate(numRows));	

	}

}
