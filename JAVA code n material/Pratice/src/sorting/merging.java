package sorting;

import java.util.Scanner;
import java.util.Arrays;

public class merging {
	
	void merge(int arr1[],int arr2[],int n1,int n2) {
		int arr[]=new int[n1+n2];
		int i=0,j=0,k=0;
		while(i<n1 && j<n2) {
			if(arr1[i]>arr2[j]) {
				arr[k]=arr2[j];
				j++;
			}
			else {
				arr[k]=arr1[i];
				i++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=arr2[j];
			j++;
			k++;
		}
		Arrays.sort(arr);
		System.out.print("\nMerge two array and sorted:-");
		for ( int var : arr )
			System.out.println(var);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.print("Enter the size of first array:-");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.print("Enter the elements of first array:-");
		for(i=0;i<n1;i++)
			arr1[i]=sc.nextInt();
		System.out.print("\nEnter the size of second array:-");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		System.out.print("Enter the elements of second array:-");
		for(i=0;i<n2;i++)
			arr2[i]=sc.nextInt();
		merging ob=new merging();
		ob.merge(arr1,arr2,n1,n2);
	}
}