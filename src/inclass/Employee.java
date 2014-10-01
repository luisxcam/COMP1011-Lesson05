package inclass;

//The abstract class can be used as a template to become a superclass for any class. To make an abstract class you need at least an abstract method
public abstract class Employee {
	//instance variables
	private final String firstName, lastName;
	private final int sinNumber;
	
	public Employee(String firstName, String lastName, int sinNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getSinNumber() {
		return sinNumber;
	}
	
	//to String
	@Override
	public String toString(){
		return String.format("Employee: %s, %s \nSIN#: %d",getLastName(),getFirstName(),getSinNumber());
	}
	
	//Abstract method: Is a method with not body at all. It is used as a placeholder for future methods
	public abstract double earnings();
	
}
