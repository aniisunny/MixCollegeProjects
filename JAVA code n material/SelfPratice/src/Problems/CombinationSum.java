package Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CombinationSum {
	
	static public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		Arrays.sort(candidates);
		
		for(int i= 0; i < candidates.length; i++) {
			int quotient = target / candidates[i];
			while(quotient != 0) {
				List<Integer> temp = new LinkedList<Integer>();
				int remainder = target - (quotient * candidates[i]);
				if(remainder != 0) {
					if(remainder < candidates[i]) {
						Boolean flag = leftCandidates(candidates, remainder, i);
						if(flag == true) {
							for(int j = 1; j <= quotient; j++) {
								temp.add(candidates[i]);
							}
							temp.add(remainder);
							Collections.sort(temp);
							set.add(temp);
						}
					}
					else {
						Boolean flag = rightCandidates(candidates, remainder, i);
						if(flag == true) {
							for(int j = 1; j <= quotient; j++) {
								temp.add(candidates[i]);
							}
							temp.add(remainder);
							Collections.sort(temp);
							set.add(temp);
						}
					}
				}
				else {
					for(int j = 1; j <= quotient; j++) {
						temp.add(candidates[i]);
					}
					Collections.sort(temp);
					set.add(temp);
				}
				quotient--;
			}
		}

		List<List<Integer>> list = new LinkedList<List<Integer>>();
		Iterator<List<Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			List<Integer> temp = itr.next();
			list.add(temp);
		}
        return list;
    }
	
	static private Boolean leftCandidates(int[] candidates, int remainder, int i) {
		for(int j = 0; j < i; j++) {
			if(candidates[j] == remainder)
				return true;
		}
		return false;
	}
	
	static private Boolean rightCandidates(int[] candidates, int remainder, int i) {
		for(int j = i + 1; j < candidates.length; j++) {
			if(candidates[j] == remainder)
				return true;
			else if(candidates[j] > remainder)
				return false;
		}
		return false;
	}

	public static void main(String[] args) {

		int candidates[] = {7, 3, 2};
		System.out.println(combinationSum(candidates, 18));

	}

}
