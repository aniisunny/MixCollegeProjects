package JavaLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class sanlinklist {

	public static void main(String[] args) {

LinkedList<Integer> l1 = new LinkedList<Integer>();
LinkedList<Integer> l2 = new LinkedList<Integer>();
LinkedList<Integer> l3 = new LinkedList<Integer>();
String s1 = "";
String s2 = "";

l1.add(2);
l1.add(4);
l1.add(3);

l2.add(5);
l2.add(6);
l2.add(4);

Iterator<Integer> it1 = l1.iterator();
while(it1.hasNext()) {
s1	= it1.next().toString() + s1;
}

 it1 = l2.iterator();
while(it1.hasNext()) {
s2	= it1.next().toString() + s2;
}

int result = Integer.parseInt(s1) + Integer.parseInt(s2);

String temp = Integer.toString(result);
StringBuffer sb = new StringBuffer(temp);
String res = sb.reverse().toString();

for (int i = 0 ; i< res.length(); i++) {
	l3.add(Integer.parseInt(res.charAt(i)+""));
}
System.out.println(l3);
}

}
