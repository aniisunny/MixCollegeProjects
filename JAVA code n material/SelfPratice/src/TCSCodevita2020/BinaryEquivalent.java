package TCSCodevita2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryEquivalent {
	
	private static List<List<Integer>> combinations (int[] binaryArray) {
		
		List<List<Integer>> combinations = new ArrayList <>();
		
		int numOfSubsets = 1 << binaryArray.length;

	    for (int bit = 0; bit < numOfSubsets; bit++) {
	        int index = binaryArray.length - 1;
	        int bitmask = bit;
	        
	        List<Integer> combination = new ArrayList <>();
	        
	        while (bitmask > 0) {
	            if ((bitmask & 1) == 1) {
	            	combination.add (binaryArray[index]);
	            }
	            bitmask >>= 1;
	            --index;
	        }
	        combinations.add (combination);
	    }
	    
	    return combinations;
	}
	
	private static int maxBits (int num) {
		
		return (int) (Math.log (num) / Math.log (2) + 1);
	}
	
	private static HashMap<Integer, Integer> oneBitMap (int[] binaryArray) {
		
		HashMap<Integer, Integer> oneBitsMap = new HashMap <>();
		
		for (int num : binaryArray) {
			int countBits = Integer.bitCount (num);
			oneBitsMap.put (num, countBits);
		}
		
		return oneBitsMap;
	}
	
	private static int binaryEquivalent (List<List<Integer>> combinations, HashMap<Integer, Integer> oneBitsMap, int maxBits) {
		
		int equivalentBits = 0;
		
		for (List<Integer> current : combinations) {
			if (current.size () == 0) {
				continue;
			}
			
			int countOneBits = 0;
			int countZeroBits = 0;
			
			for (int num : current) {
				int countBits = oneBitsMap.get (num);
				countOneBits += countBits;
				countZeroBits += maxBits - countBits;
			}
			
			if (countOneBits == countZeroBits) {
				++equivalentBits;
			}
		}
		
		return equivalentBits;
	}
	
	private static String binaryEquivalentString (int equivalentBits, int maxBits) {
		
		String binaryEquivalentString = Integer.toBinaryString (equivalentBits);
		
		while (binaryEquivalentString.length () != maxBits) {
			binaryEquivalentString = "0" + binaryEquivalentString;
		}
		
		return binaryEquivalentString;
	}

	public static void main(String[] args) throws IOException {
		
		try (BufferedReader reader = new BufferedReader (new InputStreamReader (System.in))) {
			
			int sizeOfArray = Integer.valueOf (reader.readLine ());
			
			int[] binaryArray = new int[sizeOfArray];
			int max = 0;
			
			String[] str = reader.readLine ().split (" ");
			
			for (int index = 0; index < sizeOfArray; index++) {
				binaryArray[index] = Integer.valueOf (str[index]);
				max = Math.max (max, binaryArray[index]);
			}
			
			int maxBits = Math.max (0, maxBits (max));
			
			List<List<Integer>>combinations = combinations (binaryArray);
			
			//System.out.println (maxBits);
			//System.out.println (combinations);
			
			HashMap<Integer, Integer> oneBitsMap = oneBitMap (binaryArray);
			
			//System.out.println (oneBitsMap);
			
			int equivalentBits = binaryEquivalent (combinations, oneBitsMap, maxBits);
			
			//System.out.println (equivalentBits);
			
			String binaryEquivalentString = binaryEquivalentString (equivalentBits, maxBits);
			
			System.out.println (binaryEquivalentString);
		}
	}

}
