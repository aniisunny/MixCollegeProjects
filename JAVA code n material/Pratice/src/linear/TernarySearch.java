package linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernarySearch {
	
	private static int ternarySearch(int[] arr, int start, int end, int key) {
		
		if(start <= end) {
			int mid1 = start + (end - start) / 2;
			int mid2 = end - (end - start) / 2;
			if(arr[mid1] == key) return mid1;
			else if(arr[mid2] == key) return mid2;
			else if(key < arr[mid1]) ternarySearch(arr, start, mid1 - 1, key);
			else if(key > arr[mid2]) ternarySearch(arr, mid2 + 1, end, key);
			else ternarySearch(arr, mid1 + 1, mid2 - 1, key);
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		
		try(BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.valueOf(read.readLine());
			int[] arr = new int[n];
			String[] val = read.readLine().split(" ");
			for(int i = 0; i < n; i++) arr[i] = Integer.valueOf(val[i]);
			int key = Integer.valueOf(read.readLine());
			System.out.println("Index: " + ternarySearch(arr, 0, n - 1, key));
		}
	}

}
