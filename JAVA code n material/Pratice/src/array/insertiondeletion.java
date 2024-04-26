package array;

import java.util.Scanner;
import java.lang.System;

public class insertiondeletion {

	void traverse(int a[],int n) {
		System.out.print("\nElements of an array:-");
		for(int i=0;i<n;i++) 
			System.out.print(" " +a[i]);
		System.out.println();
	}
	
	void insertion(int a[],int n) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the insertion element:-");
		int ins=sc.nextInt();
		System.out.print("\nEnter the position of insertion element:-");
		int pos=sc.nextInt();
		n=n+1;
		int i=n;
		for(i=n-1;i>=pos;i--) {
			a[i]=a[i-1];
		}
		a[pos-1]=ins;
		System.out.print("\nAfter insertion in an array:-");
		for(i=0;i<n;i++)
			System.out.print(" " +a[i]);
	System.out.println();
	}

	void deletion(int a[],int n) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the deletion element:-");
		int del=sc.nextInt();
		int counter=0;
		System.out.print("\nEnter the position of deletion element:-");
		int pos=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(pos==i+1) {
				for(int j=i;j<n;j++) {
					a[j]=a[j+1];
				}
				counter++;
				break;
			}
		}
		if(counter==0) {
			System.out.println("Deleted elements is not found in an array");
		}
		System.out.print("\nAfter deletion in an array:-");
		for(int i=0;i<n;i++)
			System.out.print(" " +a[i]);
	System.out.println();
	}
	
	void location(int a[],int n) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the location element:-");
		int loc=sc.nextInt();
		int counter=0,pos=0;
		for(int i=0;i<n;i++) {
			if(a[i]==loc) {
				pos=i+1;
				counter++;
				break;
			}
		}
		if(counter==0) 
			System.out.println("location elements is not found in an array");
		else
			System.out.println("\nLocation of an element is " +pos);
	}
	
	void exit() {
		System.exit(0);
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
		while(true) {
			System.out.println("\nPress 1 if you work with insertion");
			System.out.println("Press 2 if you work with deletion");
			System.out.println("Press 3 if you work with location");
			System.out.println("Press 4 if you work with traverse");
			System.out.println("Press 5 if you work with exit");
			System.out.print("Enter the choice:-");
			int ch=sc.nextInt();
			insertiondeletion  b=new insertiondeletion();
			switch(ch) {
			case 1:
				b.insertion(a,n);
				break;
			case 2:
				b.deletion(a,n);
				break;
			case 3:
				b.location(a,n);
				break;
			case 4:
				b.traverse(a,n);
			case 5:
				b.exit();
			}
		}
	}
}