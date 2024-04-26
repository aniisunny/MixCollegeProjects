
package sorting;

import java.util.Scanner;

public class QuickSort1 {
	
	static int partition ( int arr [], int low, int high ) { 
		
        int pivot = arr [ high ];  
        int i = low; 
        
        for ( int j = low; j < high ; j++ ) {
			
			if ( arr [ j ] <= pivot ) {
				
				int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
				i++;
			}
			
		}
		
        int temp = arr[i]; 
        arr[i] = arr[high]; 
        arr[high] = temp; 
		
		for ( int var : arr ) 
			System.out.print ( var + " " ); 
		
		System.out.println();
  
        return i; 
    } 
  
    static void sort ( int arr [], int low, int high ) {
    	
        if (low < high) { 
            
            int pi = partition ( arr, low, high ); 
            
            sort ( arr, low, pi-1 ); 
            sort ( arr, pi+1, high ); 
            
        } 
        
    } 
  
    static void printArray ( int arr [] ) {
        
        for ( int i = 0; i < arr.length; ++i ) 
            System.out.print ( arr [ i ] + " " ); 
        
        System.out.println (); 
        
    } 

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		System.out.print ( "Enter the size of array :- " );
		int n = scan.nextInt ();
		int arr [] = new int [ n ];
		System.out.print ( "\nEnter the elements of array :- " );
		
		for ( int i = 0; i < n; i++ )
			arr [ i ] = scan.nextInt ();
		
        sort ( arr, 0, n-1 ); 
  
        System.out.println ( "\nSorted array :-" ); 
        printArray ( arr ); 

	}

}