package package1;



class Person {
	 
	String fisrtName;
	String lastName;
	char gender;
	
	
	public Person(String fisrtName, String lastName, char gender) {
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
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
	
	
}
 

public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Person p = new Person("chandana","S",'F');
				System.out.println("Person Details");
				System.out.println("-----------------");
				System.out.println("FirstName: " + p.getFisrtName());
				System.out.println("LastName: " + p.getLastName());
				System.out.println("Gender: " + p.getGender());
				}
		

	}

