package CodeChef;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {

	public static void main(String[] args) {
		
		boolean[] prime = new boolean[100000000];
	    prime[0] = true;
	    prime[1] = true;
	    for(int i = 2; i * i < prime.length; i++) {
	        if(!prime[i]) for(int j = i + i; j < prime.length; j += i) prime[j] = true;
	    }
	        
	    List<Integer> list = new ArrayList<Integer>();
	    for(int i = 0; i < prime.length; i++) {
	    	if(!prime[i]) list.add(i);
	    }
	    
	    System.out.println(list);
	}

}
