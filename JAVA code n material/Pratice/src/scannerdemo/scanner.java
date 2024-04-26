package scannerdemo;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Integer:-");
		int i=sc.nextInt();
		System.out.print("Enter String:-");
		String s=sc.nextLine();
		s = s + sc.nextLine();
		System.out.println("String = " +s);
		System.out.print("Enter String:-");
		String s1=sc.next();
		System.out.println("String = " +s1);
		System.out.println("Integer = " +i);
		System.out.print("Enter Float value:-");
		float f=sc.nextFloat();
		System.out.println("Float value = " +f);
		System.out.print("Enter Char:-");
		char ch=sc.next().charAt(2);
		System.out.println("Char = " +ch);
	}
}