package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthMissingElementInArray {
	
	static public int kthMissingElement(int arr[], int k) {
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length - 1; i++) {
			int value = arr[i];
			while(++value < arr[i + 1]) {
				list.add(value);
			}
		}
		System.out.println(list);
		if(k > list.size())
			return -1;
		return list.get(k - 1);
	}

	public static void main(String[] args) {
		
		int arr[] = {1, 3, 4};
		System.out.println(kthMissingElement(arr, 5));

	}

}
