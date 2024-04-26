package Problems;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle2 {
	
	 static public List<Integer> getRow(int rowIndex) {
		 List<Integer> list = new LinkedList<Integer>();
		for(int j = 0; j <= rowIndex; j++) {
			 list.add(pascalTriangle(rowIndex, j));
		 }
		 return list;
	 }
	 
	 static private int pascalTriangle(int i, int j) {
		 if(j == 0 || j == i)
			 return 1;
		 return pascalTriangle(i - 1, j - 1) + pascalTriangle(i - 1, j);
	 }

	public static void main(String[] args) {
		
		int rowIndex = 29;
		System.out.println(getRow(rowIndex));

	}

}
