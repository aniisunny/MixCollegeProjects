package Problems;

public class NextPermutation {
	static public void nextPermutation(int []nums) {
		int i, t;
		for(i = nums.length - 1; i > 0; i--) {
			if(nums[i] > nums[i - 1])
				break;
			t = nums[i];
			nums[i] = nums[i - 1];
			nums[i - 1] = t;
		}
		if(i != 0) {
			t = nums[i];
			nums[i] = nums[i - 1];
			nums[i - 1] = t;
		}
		for(i = i + 1; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {					
					t = nums[i];
					nums[i] = nums[j];
					nums[j] = t;
				}
			}
		}
		for(int var : nums)
			System.out.print ( var + " " );
	}

	public static void main(String[] args) {
		
		//int nums [] = { 2, 3, 1 };
		//int nums [] = { 3, 2, 1 };
		int nums [] = { 2, 2, 5, 7, 1, 1 };
		//int nums [] = { 5, 3, 4, 9, 7, 6 };
		//int nums [] = { 2, 2, 5, 7, 6, 1 };
		//int nums [] = { 2, 2, 5, 7, 3, 1 };
		//int nums [] = { 4, 3, 2, 1 };
		
		nextPermutation ( nums );

	}

}
