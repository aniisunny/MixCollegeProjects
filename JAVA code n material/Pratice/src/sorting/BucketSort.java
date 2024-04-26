package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class BucketSort {
	
	static void bucketSort(double arr[]) {
		HashMap<Integer, List> map = new HashMap<Integer, List>();
		
		for(int i = 0; i < arr.length; i++) {
			int key = (int) (arr[i] * 10);
			if(map.containsKey(key)) {
				List<Double> list = map.get(key);
				list.add(arr[i]);
				map.put(key, list);
			}
			else {
				List<Double> list = new ArrayList<Double>();
				list.add(arr[i]);
				map.put(key, list);
			}
		}
		
		System.out.println(map);
		
		int i = 0;
		for(Entry<Integer, List> entry : map.entrySet()) {
			List<Double> temp = entry.getValue();
			Collections.sort(temp);
			Iterator<Double> itr = temp.iterator();
			while(itr.hasNext()) {
				arr[i] = (Double) itr.next();
				i++;
			}
		}
		
		for(Double var : arr) 
			System.out.print(var + " ");
	}

	public static void main(String[] args) {
		
		double arr[] = new double[] {0.21, 0.59, 0.10, 0.54, 0.62, 0.90};
		bucketSort(arr);

	}

}
