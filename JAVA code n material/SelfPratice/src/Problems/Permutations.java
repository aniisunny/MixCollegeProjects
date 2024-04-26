package Problems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
	
	static public List<List<Integer>> permute(int[] nums) {
		List<String> l1 = new LinkedList<String>();
		List<String> l2 = new LinkedList<String>();
		int check = -1, hold = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0) {
				check++;
				hold = nums[i];
				for(int j = 0; j < nums.length; j++) {
					if(check == nums[j]) {
						check++;
						j = -1;
					}
				}
				nums[i] = check;
			}
			l1.add(String.valueOf(nums[i]));
		}
		System.out.println(l1);
		for(int k = 1; k < nums.length; k++) {
			Iterator<String> itr1 = l1.iterator();
			while(itr1.hasNext()) {
				String x = (String)itr1.next();
				for(int i = 0; i < nums.length; i++) {
					if(Integer.parseInt(x) != nums[i]) {
						String str = x + "" + nums[i] + "";
						String s = nums[i] + "";
						Boolean flag = true;
						for(int j = 0; j < str.length() - 1; j++) {
							if(str.charAt(j) == s.charAt(0)) {
								flag = false;
							}
						}
						if(flag == true)
							l2.add(str);
					}
				}
			}
			l1.clear();
			l1.addAll(l2);
			l2.clear();
			System.out.println(l1);
		}
		List<List<Integer>> permutations = new LinkedList<List<Integer>>();
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			String str = (String)itr.next();
			List<Integer> temp = new LinkedList<Integer>();
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(String.valueOf(check).equals(ch + "")) {
					ch = (char)hold;
				}
				temp.add(Character.getNumericValue(ch));
			}
			permutations.add(temp);
		}
		return permutations;
		
	}
	
	/*static public List<List<Integer>> permute(int[] nums) {
		
		List<Integer> l1 = new LinkedList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		for(int i = 0; i < nums.length; i++) {
			l1.add(nums[i]);
		}
		for(int k = 1; k < nums.length; k++) {
			Iterator<Integer> itr1 = l1.iterator();
			while(itr1.hasNext()) {
				Integer x = (Integer)itr1.next();
				for(int i = 0; i < nums.length; i++) {
					if(x != nums[i]) {
						String str = x + "" + nums[i] + "";
						String s = nums[i] + "";
						Boolean flag = true;
						for(int j = 0; j < str.length() - 1; j++) {
							if(str.charAt(j) == s.charAt(0)) {
								flag = false;
							}
						}
						if(flag == true)
							l2.add(Integer.valueOf(str));
					}
				}
			}
			l1.clear();
			l1.addAll(l2);
			l2.clear();
			System.out.println(l1);
		}
		List<List<Integer>> permutations = new LinkedList<List<Integer>>();
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext()) {
			String str = String.valueOf(itr.next());
			List<Integer> temp = new LinkedList<Integer>();
			for(int i = 0; i < str.length(); i++) {
				temp.add(Character.getNumericValue(str.charAt(i)));
			}
			permutations.add(temp);
		}
		return permutations;
		
	}*/

	public static void main(String[] args) {
		
		int nums[] = {0, -1, 1};
		System.out.println(permute(nums));

	}

}
