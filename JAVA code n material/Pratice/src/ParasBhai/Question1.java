package ParasBhai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Question1 {
	
	static List<String> popularFeatures(int numFeatures, int topFeatures, List<String> possibleFeatures, int numFeatureRequests, List<String> featureRequests) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < possibleFeatures.size(); i++) {
			if(!map.containsKey(possibleFeatures.get(i))) 
				map.put(possibleFeatures.get(i).toLowerCase(), 0);
		}
		
		for(int i = 0; i < featureRequests.size(); i++) {
			String s[] = featureRequests.get(i).split(" ");
			for(int j = 0; j < s.length; j++) {
				if(map.containsKey(s[j].toLowerCase())) {
					map.put(s[j].toLowerCase(), map.get(s[j]) + 1);
				}
			}
		}
		
		List<String> popular = new ArrayList<String>();
		if(topFeatures > numFeatures) {
			for(int i = 0; i < possibleFeatures.size(); i++) {
				if(map.get(possibleFeatures.get(i)) != 0)
					popular.add(possibleFeatures.get(i));
			}
		}
		
		if(popular.size() > 0) return popular;
		
		Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				return e2.getValue() - e1.getValue();
			}
		};
		
		TreeMap<String, Integer> sortByKey = new TreeMap<String, Integer>(map);
		Set<Entry<String, Integer>> entries = sortByKey.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entries);
		Collections.sort(list, valueComparator);
		
		for(int i = 0; i < topFeatures; i++) {
			Entry<String, Integer> e = list.get(i);
			popular.add(e.getKey());
		}
		
		return popular;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numFeatures = sc.nextInt();
		int topFeatures = sc.nextInt();
		List<String> possibleFeatures = new ArrayList<String>();
		
		for(int i = 0; i < numFeatures; i++)
			possibleFeatures.add(sc.next());
		
		System.out.print(possibleFeatures);
		int numFeatureRequests = sc.nextInt();
		List<String> featureRequests = new ArrayList<String>();
		sc.nextLine();
		
		for(int i = 0; i < numFeatureRequests; i++)
			featureRequests.add(sc.nextLine());
		
		System.out.println(featureRequests);
		System.out.println(popularFeatures(numFeatures, topFeatures, possibleFeatures, numFeatureRequests, featureRequests));
		sc.close();
	}

}
