package linear;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:-");
		int n=sc.nextInt();
		int i;
		int a[]=new int[n];
		System.out.print("\nEnter the elements of array:-");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.print(" ");
		}
		System.out.print("\nEnter the Search element in an array:-");
		int s=sc.nextInt();
		int counter=0;
		for(i=0;i<n;i++) {
			if(a[i]==s) {
				System.out.print("\nSearched element is found in position " +(i+1));
				counter++;
			}
		}
		if(counter==0)
			System.out.print("\nSearched element is not found");
	}
}