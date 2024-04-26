package Semester6;

import java.util.ArrayList;
import java.util.List;

public class ListConcepts {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Aniruddha");
		list.add("Omansh");
		list.add("Yash");
		list.add("Kushagra");
		System.out.println(list);
		list.remove("Yash");
		System.out.println(list);

	}

}
