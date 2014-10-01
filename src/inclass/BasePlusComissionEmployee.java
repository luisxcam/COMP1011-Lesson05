package inclass;

/**
 * The purpose of this class is to add a salary to the ComissionEmployee class
 * @author Luis Miguel
 * @version 2014/Sept/24
 */
public class BasePlusComissionEmployee extends ComissionEmployee{
	//instance variables
	private double baseSalary;

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param grossSales
	 * @param comissionRate
	 * @param baseSalary
	 */
	public BasePlusComissionEmployee(String firstName, String lastName, int sinNumber, double grossSales, double comissionRate, double baseSalary) {
		super(firstName, lastName, sinNumber, grossSales, comissionRate);
		if(validateBaseSalary(baseSalary))
			this.baseSalary = baseSalary;
		else
			throw new IllegalArgumentException("Base salary is less than zero");
	}
	
	/**
	 * 
	 */
	private boolean validateBaseSalary(double baseSalary){
		if(baseSalary>0)
			return true;
		
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

	/**
	 * This method sets the salary of the employee
	 * @param baseSalary of the employee
	 */
	public void setBaseSalary(double baseSalary) {
		if(validateBaseSalary(baseSalary))
			this.baseSalary = baseSalary;
		else
			throw new IllegalArgumentException("Base salary is less than zero");
	}
	
	/**
	 * This method will override the getEarnings from the ComissionEmployee
	 * @return The total salary of the employee
	 */
	@Override
	public double earnings(){
		return getBaseSalary() + super.earnings();
	}

	
	@Override
	public String toString(){
		return super.toString() + String.format("\nBase Salary: %.2f",getBaseSalary());
	}
	
	

}
