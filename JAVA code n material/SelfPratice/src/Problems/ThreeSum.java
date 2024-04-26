package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
	
	@SuppressWarnings("unchecked")
	static public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		@SuppressWarnings("rawtypes")
		HashSet<List> set = new HashSet<List>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++) {
			for(int j = i + 1; j < nums.length - 1; j++) {
				int sum = nums[i] + nums[j];
				if(-sum < nums[j])
					break;
				else if(-sum <= nums[nums.length - 1]) {
					for(int k = j + 1; k < nums.length; k++) {
						if(nums[k] == -sum) {
							List<Integer> temp = new LinkedList<Integer>();
							set.add(Arrays.asList(nums[i], nums[j], -sum));
							break;
						}
					}
				}
			}
		}
		@SuppressWarnings("rawtypes")
		Iterator<List> itr = set.iterator ();
		while(itr.hasNext())
			list.add((List<Integer>)itr.next());
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
