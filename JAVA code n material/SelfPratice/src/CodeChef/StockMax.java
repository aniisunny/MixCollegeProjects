package CodeChef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StockMax {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-- != 0) {
		    int n = sc.nextInt();
		    List<List<Integer>> list = new ArrayList<List<Integer>>();
		    for(int i = 0; i < n; i++) {
		        List<Integer> temp = new ArrayList<Integer>();
		        temp.add(sc.nextInt());
		        temp.add(sc.nextInt());
		        list.add(temp);
		    }
		    
		    Collections.sort(list, new Comparator<List<Integer>>() {
		        public int compare(List<Integer> l1, List<Integer> l2) {
		            return l1.get(0) - l2.get(0);
		        }
		    });
		    
		    int i = 1;
		    for(; i < n; i++) {
		    	if(list.get(i - 1).get(1) >= list.get(i).get(1)) break;
		    }
		    
		    Collections.sort(list, new Comparator<List<Integer>>() {
		        public int compare(List<Integer> l1, List<Integer> l2) {
		            return l1.get(1) - l2.get(1);
		        }
		    });
		    
		    int j = 1;
		    for(; j < n; j++) {
		    	if(list.get(j - 1).get(0) > list.get(j).get(0)) break;
		    }
		    
		    System.out.println(Math.max(i, j));
		}
		sc.close();
	}
}
