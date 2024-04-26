package Problems;

import java.util.Scanner;

public class AdjacentDiagonals {
	
	static void diagonal(int arr[][], int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j) {
					System.out.println("1" + " " + i + " " + j);
					arr[i][j] = 0;
				}
				else 
					arr[i][j] = arr[i][j];
				if(i != j + 1) {
					System.out.println("2" + " " + i + " " + j);
					arr[i][j] = 0;
				}
				else 
					arr[i][j] = arr[i][j];
				if(i + 1 != j) {
					System.out.println("3" + " " + i + " " + j);
					arr[i][j] = 0;
				}
				else 
					arr[i][j] = arr[i][j];
			}
		}
		for(int a[] : arr) {
			for(int var : a)
				System.out.print(var + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = scan.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = scan.nextInt();
		diagonal(arr, n);

	}

}
