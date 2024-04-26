package Problems;

import java.util.Iterator;
import java.util.LinkedList;

public class linklistdemo {

	public static void main(String[] args) {
		
		LinkedList ll1 = new LinkedList<>();
		LinkedList ll2 = new LinkedList<>();
		LinkedList ll3 = new LinkedList<>();
		LinkedList ll4 = new LinkedList<>();
		
		ll1.add(1); 		ll1.add(2); 		ll1.add(3);
		ll2.add(11); 		ll2.add(12); 		ll2.add(13);
		ll3.add(21); 		ll3.add(22); 		ll3.add(23);
		ll4.add(31); 		ll4.add(32); 		ll4.add(33);
		
		
		
		LinkedList llall = new LinkedList<>();
		
		llall.add(ll1);
		llall.add(ll2);
		llall.add(ll3);
		llall.add(ll4);
		
		System.out.println(llall);
System.out.println(llall.size());
System.out.println();
Iterator  itr = llall.iterator();
while(itr.hasNext()) {
	System.out.println ( itr.next () );
}
System.out.println();
itr = llall.iterator();
while(itr.hasNext()) {
	LinkedList temp = (LinkedList)itr.next();
		Iterator itrt = temp.iterator();
		while(itrt.hasNext()) {
			System.out.print(" " + itrt.next());
		}
		System.out.println();
}
	}

}
