package Problems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Permutations2 {
	
	static public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		list.add(new LinkedList<Integer>());
		for(int i = 0; i < nums.length; i++) {
			Set<LinkedList<Integer>> set = new HashSet<LinkedList<Integer>>();
			for(List<Integer> l : list) {
				System.out.println("1 " + l);
				for(int j = 0; j < l.size() + 1; j++) {
					l.add(j, nums[i]);
					System.out.println("2 " + l);
					LinkedList<Integer> temp = new LinkedList<Integer>(l);
					System.out.println("3 " + temp);
					l.remove(j);
					System.out.println("4 " + l);
					set.add(temp);
					System.out.println("5 " + set);
				}
			}
			System.out.println("hello");
			list = new LinkedList<List<Integer>>(set);
		}
		return list;
	}

	public static void main(String[] args) {
		int nums[] = {1, 1, 2};
		System.out.println(permute(nums));
	}

}
