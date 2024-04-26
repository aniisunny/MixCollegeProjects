package Problems;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle5 {
	
	static public List<Integer> getRow(int rowIndex) {
		List<Integer> listold = new LinkedList<Integer>();
		for(int i = 1; i <= rowIndex + 1; i++) {
			List<Integer> listnew = new LinkedList<Integer>();
			for(int j = 1; j <= i; j++) {
				if(j == 1 || i == j) {
					listnew.add(1);
				}
				else {
					int t = listold.get(j - 2) + listold.get(j - 1);
					listnew.add(t);
				}
			}
			listold.clear();
			listold.addAll(listnew);
			//listnew.clear();
		}
		return listold;
	 }

	public static void main(String[] args) {
		
		int rowIndex = 3;
		System.out.println(getRow(rowIndex));

	}

}
