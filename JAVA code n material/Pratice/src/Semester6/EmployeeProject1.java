package Semester6;

import java.util.Scanner;

public class EmployeeProject1 {
	
	private static int validEmployeeId(String emp[][], String id) {
		for(int i = 1; i < emp.length; i++) {
			if(id.equals(emp[i][0])) {
				return i;
			}
		}
		return -1;
	}
	
	private static void employeeDetails(String emp[][], String[][] designation, int index) {
		String desCode = emp[index][3];
		String DA = "";
		String des = "";
		for(int i = 1; i < designation.length; i++) {
			if(desCode.equals(designation[i][0])) {
				DA = designation[i][2];
				des = designation[i][1];
				break;
			}
		}
		String salary = calculateSalary(emp[index][5], emp[index][6], DA, emp[index][7]);
		
		System.out.println(String.format("%-15s%-15s%-20s%-20s%-20s", emp[0][0], emp[0][1], emp[0][4], designation[0][1], "Salary"));
		System.out.println(String.format("%-15s%-15s%-20s%-20s%-20s", emp[index][0], emp[index][1], emp[index][4], des, salary));
	}
	
	private static String calculateSalary(String basic, String HRA, String DA, String IT) {
		int salary = 0;
		salary += Integer.parseInt(basic);
		salary += Integer.parseInt(HRA);
		salary += Integer.parseInt(DA);
		salary -= Integer.parseInt(IT);
		return String.valueOf(salary);
	}

	public static void main(String[] args) {		
		
		for(String s : args) {
			System.out.println(s);
		}
		String emp[][] = {
				{"Emp No.", "Emp Name", "Join Date", "Designation Code", "Department", "Basic", "HRA", "IT"},
				{"1001", "Ashish", "01/01/2009", "e", "R&D", "20000", "8000", "3000"},
				{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
				{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
				{"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
				{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
				{"1006", "Suman", "16/07/2005", "e", "Manufacturing", "23000", "9000", "4400"},
				{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
		};
		
		String designation[][] = {
				{"Designation Code", "Designation", "DA"},
				{"e", "Engineer", "20000"},
				{"c", "Consultant", "32000"},
				{"k", "Clerk", "12000"},
				{"r", "Receptionist", "15000"},
				{"m", "Manager", "40000"}
		};
		
		System.out.print("Enter employee id: ");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		
		int index = validEmployeeId(emp, id);
		if(index != -1) {
			employeeDetails(emp, designation, index);
		}
		else {
			System.out.println("There is no employee with empid: " + id);
		}
		sc.close();
	}

}
