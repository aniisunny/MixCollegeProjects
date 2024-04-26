package Semester6;

public class Series2 {

	public static void main(String[] args) {
		
		int value = 1;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i + j >= 3) {
					System.out.print(value + " ");
					value++;
				}
			}
			System.out.println();
		}

	}

}
