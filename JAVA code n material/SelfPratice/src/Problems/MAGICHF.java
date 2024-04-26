package Problems;

import java.util.Scanner;

public class MAGICHF {
	int n,x,s,a,b;
	Scanner sc=new Scanner(System.in);
	MAGICHF() {
		n=x=s=a=b=0;
	}
	void input() {
		System.out.print("\nEnter the number of boxes:-");
		n=sc.nextInt();
		System.out.print("Enter the box place the gold coin:-");
		x=sc.nextInt();
		System.out.print("Enter the number of swap:-");
		s=sc.nextInt();
	}
	void swap() {
		while(s!=0) {
			System.out.print("\nEnter the choose first box for swap:-");
			int a=sc.nextInt();
			System.out.print("Enter the choose second box for swap:-");
			int b=sc.nextInt();
			if( (a!=b) && x>=1 && a<=n && b<=n )
			{
				if( x==a || x==b ) {
					if( x==a )
						x=b;
				    else
				    	x=a;
				    a=a+b;
				    b=a-b;
				    a=a-b;
				    s--;
				}
			    else {
			    	a=a+b;
				    b=a-b;
				    a=a-b;
				    s--;
				}
			}
			else {
				System.out.println("\nwrong input test case is failed");
				break;
			}
		}
	}
	void output() {
		System.out.print("\nThe position of gold coin is " +x);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of test cases:-");
		int t=sc.nextInt();
		MAGICHF m=new MAGICHF();
		while(t!=0) {
			m.input();
			m.swap();
			m.output();
			t--;
		}
	}
}