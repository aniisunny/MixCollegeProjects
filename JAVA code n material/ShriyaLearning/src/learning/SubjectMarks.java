package learning;

import java.util.Scanner;

public class SubjectMarks {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter Marks of Subject 1: ");
		int marksofSubject1 = scanner.nextInt();
		System.out.print("Enter Marks of Subject 2: ");
		int marksofSubject2 = scanner.nextInt();
		System.out.print("Enter Marks of Subject 3: ");
		int marksofSubject3 = scanner.nextInt();
		System.out.print("Enter Marks of Subject 4: ");
		int marksofSubject4 = scanner.nextInt();
		System.out.print("Enter Marks of Subject 5: ");
		int marksofSubject5 = scanner.nextInt();
		
		int TotalofObtainedMarks =  marksofSubject1 +  marksofSubject2 + marksofSubject3 +  marksofSubject4 +  marksofSubject5;
		int TotalMarks = 500;
		double TotalPercentage = TotalofObtainedMarks*100.0/TotalMarks;
		
		System.out.println("Total of Obtained Marks : " + TotalofObtainedMarks);
		System.out.println("Total Percentage of a Student: " + TotalPercentage);
		}
}
