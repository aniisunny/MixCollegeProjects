package Problems;

import java.util.Scanner;

public class atleastthree {
	void three ( int n ) {
		
		int og = n, counter = 0;
		while ( n != 0 ) {
			if ( n % 10 == 3 ) 
				counter++;
			n /= 10;
		}
		
		if ( counter >= 0 && counter <= 2 ) {
			og++;
			three ( og );
		}
		else
			System.out.println( "Balsa for the three:-" + og );
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of test cases:-");
		int t=sc.nextInt();
		while ( t != 0 ) {
			System.out.print("\nEnter the Number:-");
			int n=sc.nextInt();
			new atleastthree () . three ( n );
			t--;
		}
	}
}