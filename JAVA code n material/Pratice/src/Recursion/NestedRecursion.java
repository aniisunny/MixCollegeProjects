package Recursion;

import java.util.Scanner;

 class NestedRecursion {
	 
	 public static int h(int n) {
		 if(n == 0)
			 return 0;
		 if(n > 4)
			 return n;
		 if(n <= 4) {
			 //int temp = h(2 * n);
			 //return h(2 + temp);
			 return h(2 + h(2 * n));
		 }
		 return 0;
	 }

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n for function: ");
		int n = scan.nextInt();
		System.out.println(h(n));
	}

}
