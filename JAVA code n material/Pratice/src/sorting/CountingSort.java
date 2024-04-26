package sorting;

public class CountingSort {
	
	static int largest(int arr[]) {
		int large = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > large)
				large = arr[i];
		}
		return large;
	}
	
	static void countingSort(int arr[]) {
		int large = largest(arr);
		int count[] = new int[large + 1];
		
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		int i = 0;
		for(int j = 0; j < count.length; j++) {
			for(int k = 1; k <= count[j]; k++) {
				arr[i] = j;
				i++;
			}
		}
		
		for(int var : arr)
			System.out.print(var + " ");
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {2, 1, 2, 3, 2, 1, 4, 4, 5, 2, 1};
		countingSort(arr);

	}

}
