package package1;

public class lab7 {
	String firstName;
	String lastName;
	char gender;
	String mobileno;
	
	
	public lab7(String firstName, String lastName, char gender, String mobileno) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobileno = mobileno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getmobile() {
		return mobileno;
	}
	public void setmobile(String mobileno) {
		this.mobileno = mobileno;
	}
	
	
	void display() {
		System.out.println("First Name: "+getFirstName());
		System.out.println("Last Name: "+getLastName());
		System.out.println("gender: "+getGender());
		System.out.println("mobileNo: " + getmobile());
	}
	
	public static void main(String[] args) {
		lab7 p=new lab7("chandana", "S",'f', "345678932177");
		p.display();
	}
	
}
 



