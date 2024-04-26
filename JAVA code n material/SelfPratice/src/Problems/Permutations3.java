package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations3 {
	
	static public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if(nums == null || nums.length == 0)
			return list;
		helper(nums, new LinkedList<Integer>(), list);
		return list;
	}
	
	static private void helper(int[] nums, List<Integer> temp, List<List<Integer>> list) {
		System.out.println("Helper...");
		if(temp.size() == nums.length) {
			list.add(new ArrayList<>(temp));
			System.out.println(list);
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.println("1::"+i);
			if(temp.contains(nums[i]))
				continue;
			System.out.println("2::"+i);
			temp.add(nums[i]);
			System.out.println("3::"+temp);
			helper(nums, temp, list);
			System.out.println("4::"+temp);
			temp.remove(temp.size() - 1);
			System.out.println("5::"+temp);
		}
	}

	public static void main(String[] args) {
		
		int nums[] = {1, 2, 3};
		System.out.println(permute(nums));

	}

}
