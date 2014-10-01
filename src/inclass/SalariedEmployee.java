package inclass;
//Note: Any time you inhered for an abstract class you need to Override the method that was abstract
public class SalariedEmployee extends Employee{
	//variable definition
	private double salary;

	public SalariedEmployee(String firstName, String lastName, int sinNumber, double salary) {
		super(firstName,lastName,sinNumber);
		if(!validateSalary(salary))
			throw new IllegalArgumentException("The salary is less than zero");
		else
			this.salary = salary;
	}
	
	/**
	 * validateSalary validates the value of the salary
	 * @param salary of the employee
	 * @return true is it is correct, false if there is an error
	 */
	private boolean validateSalary(double salary){
		if(salary>0)
			return true;
		
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * 
	 * @param salary
	 */
	public void setSalary(double salary) {
		if(!validateSalary(salary))
			throw new IllegalArgumentException("The salary is less than zero");
		else
			this.salary = salary;
	}
	
	/**
	 * 
	 */
	@Override
	public double earnings(){
		return getSalary();
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return super.toString() + String.format("\nWeekly Salary: %.2f",getSalary());
	}
}
