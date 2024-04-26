package sorting;

public class RadixSort {
	
	static int largest(int arr[]) {
		int large = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > large)
				large = arr[i];
		}
		return large;
	}
	
	static void radixSort(int arr[]) {
		int large = largest(arr);
		int noofPass = 0;
		while(large > 0) {
			noofPass++;
			large /= 10;
		}
		
		int divisor = 1, remainder = 0;
		int bucketCount[] = new int[10];
		int bucket[][] = new int[10][10];
		for(int pass = 0; pass < noofPass; pass++) {
			for(int i = 0; i < bucketCount.length; i++)
				bucketCount[i] = 0;
			
			for(int i = 0; i < arr.length; i++) {
				remainder = (arr[i] / divisor) % 10;
				bucket[remainder][bucketCount[remainder]] = arr[i];
				bucketCount[remainder]++;
			}
			
			int i = 0;
			for(int j = 0; j < bucket.length; j++) {
				for(int k = 0; k < bucketCount[j]; k++) {
					arr[i] = bucket[j][k];
					i++;
				}
			}
			
			divisor *= 10;
		}
		
		for(int var : arr)
			System.out.print(var + " ");
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {10, 912, 2, 1024, 853};
		radixSort(arr);

	}

}
