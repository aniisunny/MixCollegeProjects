package pattern;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows:-");
		int rows=sc.nextInt();
		for(int i=rows;i>=0;i--) {
			for(int space=1;space<=rows-i;space++)
				System.out.print(" ");
				for(int j=i;j>=0;j--) 
					System.out.print(j);
				for(int j=1;j<=i;j++)
					System.out.print(j);
			System.out.println();
		}
		for(int i=1;i<=rows;i++) {
			for(int space=1;space<=rows-i;space++)
				System.out.print(" ");
				for(int j=i;j>=0;j--) 
					System.out.print(j);
				for(int j=1;j<=i;j++)
					System.out.print(j);
			System.out.println();
		}
	}
}