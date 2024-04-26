package TCSCodevita2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorOf3 {
	
	private static boolean divisibleBy3 (int[] array) {
		
		int remainderZero = 0;
		int remainderOne = 0;
		int remainderTwo = 0;
		
		for (int num : array) {
			if (num % 3 == 0) {
				++remainderZero;
			}
			else if (num % 3 == 1) {
				++remainderOne;
			}
			else {
				++remainderTwo;
			}
		}
		
		return (remainderZero == 0 && remainderOne != 0 && remainderTwo != 0) || (remainderZero > remainderOne + remainderTwo + 1) ? false : true;
	}

	public static void main(String[] args) throws IOException {
		
		try (BufferedReader reader = new BufferedReader (new InputStreamReader (System.in))) {
			
			int testCases = Integer.valueOf (reader.readLine ());
			
			while (testCases-- != 0) {
				int sizeOfArray = Integer.valueOf (reader.readLine ());
				
				int[] array = new int[sizeOfArray];
				
				String[] str = reader.readLine ().split (" ");
				
				for (int index = 0; index < sizeOfArray; index++) {
					array[index] = Integer.valueOf (str[index]);
				}
				
				if (divisibleBy3 (array)) {
					System.out.println ("Yes");
				}
				else {
					System.out.println ("No");
				}
			}
		}
	}

}
