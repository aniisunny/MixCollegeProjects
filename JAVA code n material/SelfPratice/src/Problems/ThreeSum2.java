package Problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum2 {
	
	static public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++) {
			if(i == 0 || i > 0 && nums[i] != nums[i - 1]) {
				int l = i + 1, h = nums.length - 1, sum = nums[i];
				while(l < h) {
					if(nums[l] + nums[h] == -sum) {
						list.add(Arrays.asList(sum, nums[l], nums[h]));
						while(l < h && nums[l] == nums[l + 1])
							l++;
						while(l < h && nums[h] == nums[h - 1])
							h--;
						l++;
						h--;
					}
					else if(nums[l] + nums[h] < -sum)
						l++;
					else
						h--;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		
		int nums[] = { -1,0,1,2,-1,-4 };
		//int nums[] = { 0,0 };
		//int nums[] = { 1,2,-2,-1 };
		//int nums[] = { -4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6 };
		//int nums[] = { -4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0 };
		System.out.println(threeSum(nums));

	}

}
