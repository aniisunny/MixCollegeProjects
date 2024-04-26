package Problems;

import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
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
		System.out.print("\nMissing Arithmetic Progession:-");
		int d=a[n-1]-a[n-2];
		for(i=0;i<n-1;i++)
		{
			if(d!=a[i+1]-a[i])
				System.out.print((a[i]+d) +" ");
		}
	}
}