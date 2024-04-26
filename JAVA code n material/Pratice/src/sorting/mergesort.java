package sorting;

import java.util.Scanner;
import java.util.Arrays;

public class mergesort {
	int i, counter = 1;
	void merge(int a[],int n){
		int mid=n/2;
		int left[]=new int[mid];
		int right[]=new int[n-mid];
		if(n>=2) {
			for(i=0;i<mid;i++)
				left[i]=a[i];
			for(i=mid;i<n;i++)
				right[i-mid]=a[i];
			System.out.println(counter + "call to left array");
			counter++;
		    merge(left,mid);
		    System.out.println(counter + "call to right array");
		    counter++;
		    merge(right,(n-mid));
		    System.out.println(counter + "call to merging array");
		    counter++;
		    mergesort(left,right,a,mid,n);
		}
	}
	
	void mergesort(int left[],int right[],int a[],int mid,int n) {
		
		int i=0,j=0,k=0;
		while(i<mid && j<(n-mid)) {
			if(left[i]>right[j]) {
				a[k]=right[j];
				j++;
			}
			else {
				a[k]=left[i];
				i++;
			}
			k++;
		}
		while(i<mid) {
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<n-mid) {
			a[k]=right[j];
			j++;
			k++;
		}
	}

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
		mergesort s=new mergesort();
		s.merge(a,n);
		System.out.print("\nAfter Merge sorting:-");
		for(i=0;i<n;i++)
			System.out.print(" " +a[i]);
		System.out.println("\nTotal iteration occur:" + (s.counter - 1));
		
	}
}