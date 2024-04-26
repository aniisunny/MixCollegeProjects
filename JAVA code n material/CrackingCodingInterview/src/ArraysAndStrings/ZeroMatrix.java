package ArraysAndStrings;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ZeroMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 0) {
					List<Integer> temp = new LinkedList<Integer>();
					temp.add(i);
					temp.add(j);
					list.add(temp);
				}
			}
		}
		
		for(List<Integer> temp : list) {
			for(int i = 0; i < n; i++) {
				arr[temp.get(0)][i] = 0;
			}
			for(int i = 0; i < m; i++) {
				arr[i][temp.get(1)] = 0;
			}
		}
		
		for(int[] a : arr) {
			for(int t : a) {
				System.out.print(t + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
