package Problems;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle6 {
	
	static public List<Integer> getRow(int rowIndex) {
		List<Integer> listold = new LinkedList<Integer>();
		for(int i = 1; i <= rowIndex + 1; i++) {
			List<Integer> listnew = new LinkedList<Integer>();
			listnew.add(1);
			for(int j = 2; j < i; j++) {
				int t = listold.get(j - 2) + listold.get(j - 1);
				listnew.add(t);
			}
			if(i != 1)
				listnew.add(1);
			listold = listnew;
		}
		return listold;
	 }

	public static void main(String[] args) {
		
		int rowIndex = 3;
		System.out.println(getRow(rowIndex));

	}

}
