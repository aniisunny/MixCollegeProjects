package learning;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		double radius = scanner.nextDouble();
		
		double area = 3.14 * radius * radius;
		double circumference = 2 * 3.14 * radius;
		
		System.out.println("Area of a circle: " + area);
		System.out.println("Circumference of a circle: " + circumference);
		
		
	}
}
