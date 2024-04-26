package Problems;

import java.util.Scanner;

public class timeinwords {
	
	Scanner sc=new Scanner(System.in);
	int hr;
	int min;
	void input() {
		System.out.print("Enter the hour:-");
		hr=sc.nextInt();
		System.out.print("\nEnter the minute:-");
		min=sc.nextInt();
	}
	void words() {
		String s[]= {"","one","two","three","four","five","six","seven","eight","nine","ten",
				" eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen",
				"twenty","twenty one","twenty two","twenty three","twenty four","twenty five",
				"twenty six","twenty seven","twenty eight","twenty nine"};
		if(min==0)
			System.out.print("\n" +s[hr] +" o'clock");
		else if(min>0 && min<15)
			System.out.print("\n" +s[min] +" minutes past " +s[hr]);
		else if(min==15)
			System.out.print("\nQuarter past " + hr);
		else if(min>16 && min<30)
			System.out.print("\n" +s[min] +" minutes past " +s[hr]);
		else if(min==30)
			System.out.print("\nHalf past " + hr);
		else if(min>30 && min<45)
			System.out.print("\n" +s[(60-min)] +" minutes to " +s[((hr%12)+1)]);
		else if(min==45)
			System.out.print("\nQuarter to " + s[(hr+1)]);
		else if(min>45 && min<60)
			System.out.print("\n" +s[(60-min)] +" minutes to " +s[((hr%12)+1)]);
		else 
			System.out.print("\nminutes is not valid form");
		
	}

	public static void main(String[] args) {
		
		timeinwords t=new timeinwords();
		t.input();
		t.words();
	}
}