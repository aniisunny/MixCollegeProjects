package Problems;

import java.util.Scanner;

public class TwoSum {
	public int[] twoSum( int[] nums, int target ) {
        int i,j;
        int arr[] = new int [2];
        for( i=0; i<nums.length; i++ ) {
            for( j=i+1; j<nums.length; j++ )
                if( nums[i]+nums[j]==target ) {
                	 arr =  new int[] { i, j };
                	 break;
                	//return new int [] { i, j };
                }
       //break;
	}
    return arr;            
       // throw new IllegalArgumentException ( "No two sum solution" );
    }

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print( "Enter the size of array:-" );
		int n= sc.nextInt();
		System.out.print( "\nEnter the elements of arrays:-" );
		int i;
		int nums[]= new int[n]; 
		for( i=0; i<n; i++ )
			nums[i]= sc.nextInt();
		System.out.print( "Enter the target:-" );
		int target= sc.nextInt();
		TwoSum ob= new TwoSum();
		int a[]= ob.twoSum( nums, target );
		System.out.print( "\nIndices of array:-" );
		for( int var: a )
			System.out.print(var + " "); 
	}
}