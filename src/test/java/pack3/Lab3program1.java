package pack3;
import java.util.Scanner;

class CustomNameException extends Exception {
	public CustomNameException(String msg) {
		super(msg);
	}
}

class Employee_3_1{
	String firstName;
	String LastName;
	String gender;

	public Employee_3_1(String firstName, String lastName, String gender) throws CustomNameException {
		if (firstName == null || firstName.trim().isEmpty() || 
	            lastName == null || lastName.trim().isEmpty()) {
			throw new CustomNameException("First name and Last name cannot be blank");
		}
		this.firstName = firstName;
		this.LastName = lastName;
		this.gender = gender;
	}

	public void displayEmployee() {
		System.out.println("firstName=" + firstName + "LastName=" + LastName + "gender=" + gender);
	}

}

