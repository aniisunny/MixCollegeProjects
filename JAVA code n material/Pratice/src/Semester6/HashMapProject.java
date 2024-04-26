package Semester6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapProject {
	
	static HashMap<String, String> map1, map2;
	
	static {
		map1 = new HashMap<String, String>();
		map2 = new HashMap<String, String>();
	}
	
	static void saveCountryCapital(String countryName, String capital) {
		map1.put(countryName, capital);
	}
	
	static String getCapital(String countryName) {
		if(map1.containsKey(countryName)) return map1.get(countryName);
		return "";
	}
	
	static String getCountry(String capitalName) {
		for(Entry<String, String> e : map1.entrySet()) {
			if(e.getValue() == capitalName) return e.getKey();
		}
		return "";
	}
	
	static HashMap<String, String> changes() {
		for(Entry<String, String> e: map1.entrySet()) map2.put(e.getValue(), e.getKey());
		return map2;
	}
	
	static List<String> iteratesKey() {
		List<String> list = new ArrayList<String>();
		for(String s : map1.keySet()) list.add(s);
		return list;
	}

	public static void main(String[] args) {
		
		saveCountryCapital("India", "Delhi");
		saveCountryCapital("Japan", "Tokyo");
		System.out.println(getCapital("India"));
		System.out.println(getCountry("Tokyo"));
		System.out.println(changes());
		System.out.println(iteratesKey());
	}

}
