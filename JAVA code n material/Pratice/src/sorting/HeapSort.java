package sorting;

import java.util.Arrays;

public class HeapSort {
	
	private static void swap (int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
//		arr[i] = arr[i] ^ arr[j];
//		arr[j] = arr[i] ^ arr[j];
//		arr[i] = arr[i] ^ arr[j];
	}
	
	private static void heapify (int[] arr, int length, int i) {
		
		int largestIndex = i;
		int leftChild = 2 * i + 1;
		int rightChild = 2 * i + 2;
		
		if (leftChild < length && arr[leftChild] > arr[largestIndex]) {
			largestIndex = leftChild;
		}
		if (rightChild < length && arr[rightChild] > arr[largestIndex]) {
			largestIndex = rightChild;
		}
		
		if (largestIndex != i) {
			swap (arr, i, largestIndex);
			heapify (arr, length, largestIndex);
		}
	}
	
	private static void heapSort (int[] arr, int length) {
		
		for (int i = length / 2 - 1; i >= 0; i--) { 
			heapify (arr, length, i);
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			swap (arr, 0, i);
			heapify (arr, i, 0);
		}
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] {45,24,13,78,21,55,33,11,4,18};
		heapSort (arr, arr.length);
		System.out.println (Arrays.toString (arr));
	}

}
