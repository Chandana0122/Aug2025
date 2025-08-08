package pack3;

import java.util.Scanner;


public class lab31{

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter first name");
			String firstName = sc.nextLine();
			

			System.out.println("Enter Last name");
			String lastName = sc.nextLine();
			
			System.out.println("Enter gender M/F:");
			String g = sc.next();
			
			Employee_3_1 emp = new Employee_3_1(firstName, lastName, g);
			emp.displayEmployee();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

