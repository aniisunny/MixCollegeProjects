package ArraysAndStrings;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
	
	private static void removeCharacters(char[] ch) {
		int tail = 1;
		for(int i = 1; i < ch.length; i++) {
			int j = 0;
			for(j = 0; j < tail; j++) {
				if(ch[i] == ch[j])
					break;
			}
			if(j == tail) {
				ch[tail] = ch[i];
				++tail;
			}
		}
		ch[tail] = 0;  //0 means null character in ascii table
		System.out.println(ch[tail]);
		for(char c: ch) {
			if(c == 0) 
				break;
			System.out.print(c + " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch[] = s.toCharArray();
		removeCharacters(ch);
		sc.close();

	}

}
