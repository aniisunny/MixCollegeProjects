package sorting;

import java.util.Scanner;

public class bubblesort {

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
			for(j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					System.out.println(a[j] + " " + a[j + 1]);
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		System.out.print("\nAfter bubble sorting:-");
		for(i=0;i<n;i++)
			System.out.print(" " +a[i]);
	}
}