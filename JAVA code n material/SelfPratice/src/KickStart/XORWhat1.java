package KickStart;

import java.util.Scanner;

public class XORWhat1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		while(testCases != 0) {
			int n = scan.nextInt();
			int q = scan.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			int temp = q;
			while(q != 0) {
				int index = scan.nextInt();
				int element = scan.nextInt();
				arr[index] = element;
				q--;
			}
			System.out.print("Case #1: ");
			for(int i = 0; i < temp; i++)
				System.out.print(i + " ");
			testCases--;
			System.out.println();
		}
	}

}
