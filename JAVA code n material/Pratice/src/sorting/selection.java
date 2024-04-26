package sorting;

import java.util.Scanner;

public class selection {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:-");
		int n=sc.nextInt();
		int i,j;
		int a[]=new int[n];
		System.out.print("\nEnter the elements of array:-");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.print(" ");
		}
		for(i=0;i<n;i++)
			for(j=i+1;j<n;j++)
				if(a[i]>a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
		System.out.print("\nAfter selection sorting:-");
		for(i=0;i<n;i++)
			System.out.print(" " +a[i]);
	}
}