package Problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TripletsSum3 {
	
	static private class Pair {
		int occurence;
		Boolean flag;
		
		public Pair(int occurence, Boolean flag) {
			this.occurence = occurence;
			this.flag = flag;
		}
	}
	
static List<List<Integer>> threeSum (int[] nums) {
	
	List<List<Integer>> list = new LinkedList<List<Integer>>();
	HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();
	
	if (nums.length < 3) {	
		return list;
	}
	
	for(int i = 0; i < nums.length; i++) {
		if(map.containsKey(nums[i])) {
			Pair p = map.get(nums[i]);
			int a = p.occurence;
			map.put(nums[i], new Pair(a+1,true));
		}
			
		else 
			map.put(nums[i], new Pair(1,true));
	}
	
	for(int i = 0; i < nums.length; i++) {
		for(int j = i+1; j < nums.length; j++) {
			int sum = nums[i]+nums[j];
			List<Integer> temp = new LinkedList<Integer>();
			if(-sum == nums[i]) {
				Pair p = map.get(nums[i]);
				if(p.occurence > 1 && p.flag==true) {
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(-sum);
					list.add(temp);
					map.put(-sum, new Pair(p.occurence,false));
					Pair p1 = map.get(nums[j]);
					map.put(nums[j], new Pair(p1.occurence,false));
				}
			}
				
			else if(-sum == nums[j]) {
				Pair p = map.get(nums[j]);
				if(p.occurence > 1 &&  p.flag==false) {			
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(-sum);
					list.add(temp);
					map.put(-sum, new Pair(p.occurence,false));
					Pair p1 = map.get(nums[i]);
					map.put(nums[i], new Pair(p1.occurence,false));
				}
			}
					
			else if(map.containsKey(-sum)) {
				Pair p = map.get(-sum);
				if ( p.flag==true) {
					temp.add(nums[i]);
					temp.add(nums[j]);
					list.add(temp);
					temp.add(-sum);
					map.put(-sum, new Pair(p.occurence,false));
					Pair p1 = map.get(nums[j]);
					map.put(nums[j], new Pair(p1.occurence,false));
					Pair p2 = map.get(nums[i]);
					map.put(nums[i], new Pair(p1.occurence,false));
				}
			}
		}
	}
		
	return list;
		
	}

	public static void main(String[] args) {
		
		int nums [] = { -4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6 };
		//int nums [] = { -4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6 };
		
		System.out.println ( threeSum ( nums ) );

	}

}
