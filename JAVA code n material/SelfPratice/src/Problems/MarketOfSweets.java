package Problems;

import java.util.Scanner;

public class MarketOfSweets {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int i;
		int temp1=0;
		int arr[]=new int[size];
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++) {
			temp1=temp1+(arr[i]*arr[i]);
			if(i!=size-1)
				if(arr[i+1]==arr[i]+1)
					temp1=temp1+(arr[i]*arr[i+1])+(arr[i+1]*arr[i+1]);
			if(i!=size-2 && i<size-2)
				if(arr[i+2]==arr[i+1]+1  && arr[i+1]==arr[i]+1)
					temp1=temp1+(arr[i]*arr[i+2])+(arr[i+1]*arr[i+2])+(arr[i+2]*arr[i+2]);
		}
			System.out.println(temp1);

	}

}
