package linear;

import java.util.Scanner;
import java.util.Arrays;

public class binarysearch {

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
		Arrays.sort(a);
		int first=0,last=n-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(a[mid]==s) {
				System.out.print("\nSearched elements is found in " +(mid+1) + " position");
				break;
			}
			else if(a[mid]<s) {
				first=mid+1;
			}
			else if(a[mid]>s) {
				last=mid-1;
			}
		}
		if(first>last) {
			System.out.print("\nSearched element is not found");
		}
	}
}