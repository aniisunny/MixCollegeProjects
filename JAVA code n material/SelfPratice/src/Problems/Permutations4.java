package Problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Permutations4 {
	
	static public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if(nums.length == 0 || nums == null)
			return list;
		/*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]))
				map.put(nums[i],(map.get(nums[i])) + 1);
			else
				map.put(nums[i], 1);
		}
		System.out.println(map);*/
		helper(nums, new LinkedList<Integer>(), list);
		return list;
	}
	
	static private void helper(int[] nums, List<Integer> temp, List<List<Integer>> list) {
		if(temp.size() == nums.length) {
			//if(!list.contains(temp))
				list.add(new LinkedList<Integer>(temp));
		}
		for(int i = 0; i < nums.length; i++) {
			/*if(temp.contains(nums[i])) {
				continue;
			}*/
			temp.add(nums[i]);
			helper(nums, temp, list);
			temp.remove(temp.size() - 1);
		}
	}

	public static void main(String[] args) {
		
		int nums[] = {1, 2, 1};
		System.out.println(permute(nums));

	}

}
