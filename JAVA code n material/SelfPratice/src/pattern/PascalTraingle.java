package pattern;

import java.util.Scanner;

public class PascalTraingle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows:-");
		int rows=sc.nextInt();
		int temp=1;
		for(int i=0;i<rows;i++) {
			for(int space=1;space<=rows-i;space++)
				System.out.print(" ");
			for(int j=0;j<=i;j++) {
				if(j==0 || i==0)
					temp=1;
				else
					temp=temp*(i-j+1)/j;
				System.out.print(temp +" ");
			}
			System.out.println();
		}
	}
}