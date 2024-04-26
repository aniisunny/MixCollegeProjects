package Problems;

public class FirstMissingPositive {
	
	public static int firstMissingPositive(int[] nums) {
		int positive = 1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == positive) {
				positive++;
				i = -1;
			}
		}
		return positive;
	}

	public static void main(String[] args) {
		
		int nums[] = {3, 4, -1, 1};
		System.out.println(firstMissingPositive(nums));

	}

}
