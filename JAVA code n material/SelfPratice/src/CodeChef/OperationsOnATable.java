package CodeChef;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OperationsOnATable {
	
	private static boolean areAllEquals (long[] beforeTupple, long[] afterTupple) {
		
		for (int i = 0; i < 3; i++) {
			if (beforeTupple[i] != afterTupple[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean checkOne (long[] beforeTupple, long[] afterTupple) {
		
		HashMap<Long, Long> map = new HashMap<>();
		int count = 0;
		
		for (int i = 0; i < 3; i++) {
			if (beforeTupple[i] == afterTupple[i]) {
				continue;
			}
			
			else if (beforeTupple[i] == 0 || afterTupple[i] % beforeTupple[i] != 0) {
				count++;
			}
			
			else {
				long val = afterTupple[i] / beforeTupple[i];
				map.put (val, map.getOrDefault (val, (long) 0) + 1);
			}
		}
		
		if (map.size() == 1 && count == 0) {
			return true;
		}
		
		map.clear();
		
		for (int i = 0; i < 3; i++) {
			if (beforeTupple[i] != afterTupple[i]) {
				long val = afterTupple[i] - beforeTupple[i];
				map.put (val, map.getOrDefault (val, (long) 0) + 1);
			}
		}
		
		if (map.size() == 1) {
			return true;
		}
		
		return false;
	}
	
	private static boolean checkTwo (long[] beforeTupple, long[] afterTupple) {
		
		HashMap<Long, Long> map = new HashMap<>();
		int count = 0;
		
		for (int i = 0; i < 3; i++) {
			if (beforeTupple[i] == afterTupple[i]) {
				continue;
			}
			
			else if (beforeTupple[i] == 0 || afterTupple[i] % beforeTupple[i] != 0) {
				count++;
			}
			
			else {
				long val = afterTupple[i] / beforeTupple[i];
				map.put (val, map.getOrDefault (val, (long) 0) + 1);
			}
		}
		
		if (map.size() == 2 && count == 0) {
			return true;
		}
		
		if (map.size() == 1 && count == 1) {
			return true;
		}
		
		map.clear();
		
		for (int i = 0; i < 3; i++) {
			if (beforeTupple[i] != afterTupple[i]) {
				long val = afterTupple[i] - beforeTupple[i];
				map.put (val, map.getOrDefault (val, (long) 0) + 1);
			}
		}
		
		return map.size() == 2;
	}
	
	private static List<Long> horizontalDifference (long[] beforeTupple, long[] afterTupple) {
		
		List<Long> list = new LinkedList<>();
		
		for (int i = 0; i < 2; i++) {
			if (beforeTupple[i + 1] - beforeTupple[i] == 0) {
				list.add ((long) 0);
			}
			
			else {
				long val = (afterTupple[i + 1] - afterTupple[i]) / (beforeTupple[i + 1] - beforeTupple[i]);
				list.add (val);
				list.add (-val);
			}
		}
		
		if(beforeTupple[2] - beforeTupple[0] == 0) {
			list.add ((long) 0);
		}
		
		else {
			long val = (afterTupple[2] - afterTupple[0]) / (beforeTupple[2] - afterTupple[0]);
			list.add (val);
			list.add (-val);
		}
		
		return list;
	}
	
	private static boolean checkHorizontalDifference (long[] beforeTupple, long[] afterTupple) {
		
		List<Long> list = horizontalDifference (beforeTupple, afterTupple);
		
		for (int i = 0; i < list.size() ; i++) {
			long[] tempTupple = new long[3];
			long difference = list.get (i);
			
			for (int j = 0; j < 3; j++) {
				tempTupple[j] = beforeTupple[j] * difference;
			}
			
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] = beforeTupple[2];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] *= difference;
			tempTupple[0] = beforeTupple[0];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[0] *= difference;
			tempTupple[1] = beforeTupple[1];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] = beforeTupple[2];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[0] = beforeTupple[0];
			tempTupple[1] *= beforeTupple[1];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[1] = beforeTupple[1];
			tempTupple[2] *= beforeTupple[2];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
		}
		
		return false;
	}
	
	private static List<Long> add (long[] beforeTupple, long[] afterTupple) {
		
		List<Long> list = new LinkedList<>();
			
		for (int i = 0; i < 3; i++) {
			long val = afterTupple[i] - beforeTupple[i];
			list.add (val);
		}
		
		return list;
	}
	
	private static boolean checkAdd (long[] beforeTupple, long[] afterTupple) {
		
		List<Long> list = add (beforeTupple, afterTupple);
		
		for (int i = 0; i < list.size(); i++) {
			long[] tempTupple = new long[3];
			long difference = list.get (i);
			
			for (int j = 0; j < 3; j++) {
				tempTupple[j] = beforeTupple[j] + difference;
			}
			
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] = beforeTupple[2];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] += difference;
			tempTupple[0] = beforeTupple[0];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[0] += difference;
			tempTupple[1] = beforeTupple[1];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] = beforeTupple[2];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[1] += difference;
			tempTupple[0] = beforeTupple[0];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] += difference;
			tempTupple[1] = beforeTupple[1];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
		}
		
		return false;
	}
	
	private static List<Long> multiply (long[] beforeTupple, long[] afterTupple) {
		
		List<Long> list = new LinkedList<>();
		
		for(int i = 0; i < 3; i++) {
			if (beforeTupple[i] == afterTupple[i] || beforeTupple[i] == 0) {
				continue;
			}
			
			else if (afterTupple[i] == 0 || afterTupple[i] / beforeTupple[i] == 0) {
				list.add ((long) 0);
			}
			
			else {
				long val = afterTupple[i] / beforeTupple[i];
				list.add (val);
				list.add (-val);
			}
		}
		
		return list;
	}
	
	private static boolean checkMultiply (long[] beforeTupple, long[] afterTupple) {
		
		List<Long> list = multiply(beforeTupple, afterTupple);
		
		for (int i = 0; i < list.size(); i++) {
			long[] tempTupple = new long[3];
			long difference = list.get (i);
			
			for(int j = 0; j < 3; j++) {
				tempTupple[j] = beforeTupple[j] * difference;
			}
			
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] = beforeTupple[2];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] *= difference;
			tempTupple[0] = beforeTupple[0];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[0] *= difference;
			tempTupple[1] = beforeTupple[1];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[2] = beforeTupple[2];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[0] = beforeTupple[0];
			tempTupple[1] *= difference;
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
			
			tempTupple[1] = beforeTupple[1];
			tempTupple[2] += beforeTupple[1];
			if (checkOne (tempTupple, afterTupple)) {
				return true;
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		while (testCases-- != 0) {
			long[] beforeTupple = new long[3];
			long[] afterTupple = new long[3];
			
			for (int i = 0; i < 3; i++) {
				beforeTupple[i] = sc.nextLong();
			}
			
			for (int i = 0; i < 3; i++) {
				afterTupple[i] = sc.nextLong();
			}
			
			if (areAllEquals (beforeTupple, afterTupple)) {
				System.out.println (0);
			}
			
			else if (checkOne (beforeTupple, afterTupple)) {
				System.out.println (1);
			}
			
			else if (checkTwo (beforeTupple, afterTupple) 
					|| checkHorizontalDifference (beforeTupple, afterTupple)
					|| checkAdd (beforeTupple, afterTupple)) {
				System.out.println (2);
			}
			
			else System.out.println (3);
		}
		
		sc.close();

	}

}
