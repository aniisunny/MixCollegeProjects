package Problems;

import java.util.ArrayList;
import java.util.Iterator;

public class san12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

String input ="23";
char cha[] = input.toCharArray();
int num [] = new int[cha.length];
int i = 0;
for(char ch : cha) {
	 num[i] = Integer.parseInt(ch+"");
	i++;
}

ArrayList al1 = new ArrayList ();
ArrayList al2 = new ArrayList ();
ArrayList al3 = new ArrayList ();


for(int index =1; index<  num.length; index++) {
if(index ==1) {
	for(int j = 0; j<s1[num[index]].length(); j++) {
		al1.add(s1[num[index-1]].charAt(j));
		}
}
	for(int j = 0; j<s1[num[index]].length(); j++) {
	al2.add(s1[num[index]].charAt(j));
	}
	Iterator it1 = al1.iterator();
	Iterator it2 = al2.iterator();

	String temp1 = "";
	String temp2 = "";
	while(it1.hasNext()) {
		temp1 = (String)(""+it1.next());
		it2 = al2.iterator();
		while(it2.hasNext()) {
			temp2 = (String)(""+it2.next());
			al3.add(temp1+temp2);
		}
	}
	System.out.println("======");
	System.out.println(al1);
	System.out.println(al2);
	System.out.println(al3);
	al1.clear();
	al2.clear();
	
	al1.addAll(al3);
	al3.clear();
	

}

System.out.println("----------------");
System.out.println(al1);
	}

}
