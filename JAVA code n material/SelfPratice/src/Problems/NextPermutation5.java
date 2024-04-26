package Problems;

import java.util.Arrays;

public class NextPermutation5 {
	
	static public void nextPermutation(int []nums) {
		int i;
		for(i = nums.length - 1; i > 0; i--) {
			if(nums[i] > nums[i - 1]) {
				Arrays.sort(nums, i, nums.length);
				for(int j = i; j < nums.length; j++) {
					if(nums[j] > nums[i - 1]) {
						nums[i - 1] = nums[i - 1] + nums[j];
						nums[j] = nums[i - 1] - nums[j];
						nums[i - 1] = nums[i - 1] - nums[j];
						break;
					}
				}
				break;
			}
		}
		Arrays.sort(nums, i, nums.length);
		for(int var : nums)
			System.out.print( var + " " );
	}

	public static void main(String[] args) {
		
		//int nums[] = {1, 2, 3};
		//int nums[] = {1, 5, 7, 6, 4, 2}; 
		//int nums [] = { 2, 3, 1 };
		//int nums [] = { 3, 2, 1 };
		//int nums [] = { 2, 2, 5, 7, 1, 1 };
		int nums [] = { 5, 3, 4, 9, 7, 6 };
		//int nums [] = { 2, 2, 5, 7, 6, 1 };
		//int nums [] = { 2, 2, 5, 7, 3, 1 };
		//int nums [] = { 4, 3, 2, 1 };
		
		nextPermutation ( nums );

	}

}
