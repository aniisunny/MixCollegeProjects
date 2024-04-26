package Problems;

import java.util.Scanner;

public class Pythagorean_Triples {
	
	Scanner sc=new Scanner(System.in);
	int a,limit;
	int b=1;
	int c=1;
	Pythagorean_Triples() {
		System.out.print("Enter the limit:-");
		limit=sc.nextInt();
		System.out.print("\nEnter the one side of triangle:-");
		a=sc.nextInt();
	}
	void triples1() {
		while(b<=limit) {
			if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
				System.out.print("\nOther sides of traingles:-");
				System.out.print(b +" " +c);
				break;
			}
			b++;
			triples1();
			triples2();
		}
	}
		void triples2() {
			while(c<=limit) {
				if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
					System.out.print("\nOther sides of traingles:-");
					System.out.print(b +" " +c);
					break;
				}
				c++;
				triples2();
				triples1();
			}
		}

	public static void main(String[] args) {
		
		Pythagorean_Triples p=new Pythagorean_Triples();
		p.triples1();
	}
}