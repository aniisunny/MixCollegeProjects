package pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows:-");
		int rows=sc.nextInt();
		for(int i=rows;i>=1;i--) {
			int k=0;
			for(int space=1;space<=rows-i;space++)
				System.out.print(" ");
			while(k!=2*i-1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
		}
		for(int i=2;i<=rows;i++) {
			int k=0;
			for(int space=1;space<=rows-i;space++)
				System.out.print(" ");
			while(k!=2*i-1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
		}
	}
}