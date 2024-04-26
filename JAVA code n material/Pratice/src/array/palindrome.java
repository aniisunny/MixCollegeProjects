package array;

import java.util.Scanner;

public class palindrome {
	
	void palindroame(int a[],int counter,int pos) {
		int n=(2*counter)+1;
		int i,j;
		for(i=pos-1,j=pos+1;i>=0;i--,j++) {
				a[j]=a[i];
		}
		System.out.print("\nPalindroame Number:-");
		for(i=0;i<n;i++) 
			System.out.print(a[i]);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a size of array:-");
		int n=sc.nextInt();
		int a[]=new int[20];
		int i,j,pos=0,counter=0;
		System.out.print("\nEnter the elements of array:-");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		palindrome p=new palindrome();
		for(i=0;i<n;i++) {
			if(a[i]==a[i+1]) {
				counter=0;
				pos=i;
				for(j=i-1;j>=0;j--)
					counter++;
				p.palindroame(a,counter,pos);
			}
		}
		if (counter==0) {
			System.out.println("Palindroame is not possible");
		}
	}
}