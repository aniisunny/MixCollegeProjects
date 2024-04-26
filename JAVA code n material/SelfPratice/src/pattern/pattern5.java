package pattern;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows:-");
		int rows=sc.nextInt();
		for(int i=rows;i>1;i--) {
			for(int space=1;space<=rows-i;space++)
				System.out.print(" ");
				for(int j=i;j<=2*i-1;j++) 
					System.out.print(j);
				for(int j=2*i-2;j>=i;j--)
					System.out.print(j);
			System.out.println();
		}
		for(int i=1;i<=rows;i++) {
			for(int space=1;space<=rows-i;space++)
				System.out.print(" ");
				for(int j=i;j<=2*i-1;j++) 
					System.out.print(j);
				for(int j=2*i-2;j>=i;j--)
					System.out.print(j);
			System.out.println();
		}
	}
}