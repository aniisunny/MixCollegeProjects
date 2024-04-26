package Problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class majoritysan {

	
static	int majorityele(int num[]) {
	
		int rval = 0;
		HashMap hm1 = new HashMap();
		for(int var : num) {
			if(hm1.containsKey(var)) {
				Integer ob = (Integer)hm1.get(var);
				hm1.replace(var, ob+1);
				}
			else {
			hm1.put(var,1);
			}
		}
		System.out.println(hm1);
		
		Set set1 = hm1.entrySet();
		Iterator it1 = set1.iterator();
		int max = -1;
		int value = -1;
		while(it1.hasNext()) {
			Object temp = it1.next();
			Entry me = (Entry)temp;
				if(max < (Integer)me.getValue()) {
					max = (Integer)me.getValue();
					value = (Integer)(me.getKey());
				}
		}
		if(max > num.length/2)
			rval = value;
					
		return rval;
		
	}
	public static void main(String[] args) {
	
int num [] = {1,1,1,4,5,7,3,6,4,7,4,7,54,76,56,7,4,67,5,4,4,6,54,4,6,5,4,54,1,1,1,4,5,7,3,6,4,7,4,7,54,76,56,7,4,67,5,4,4,6,54,4,6,5,4,54
		,1,1,1,4,5,7,3,6,4,7,4,7,54,76,56,7,4,67,5,4,4,6,54,4,6,5,4,54,1,1,1,4,5,7,3,6,4,7,4,7,54,76,56,7,4,67,5,4,4,6,54,4,6,5,4,54,1,1,1,4,5,7,3,6,4,7,4,7,54,76,56,7,4,67,5,4,4,6,54,4,6,5,4,54,
		1,1,1,4,5,7,3,6,4,7,4,7,54,76,56,7,4,67,5,4,4,6,54,4,6,5,4,54,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4
		};
System.out.println("half length=" + num.length/2);
System.out.println(majorityele(num));
	}

}
