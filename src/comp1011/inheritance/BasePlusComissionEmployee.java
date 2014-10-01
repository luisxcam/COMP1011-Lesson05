package comp1011.inheritance;
/**
 * The purpose of this class is to add a salary to the ComissionEmployee class
 * @author Luis Miguel
 * @version 2014/Sept/24
 */
public class BasePlusComissionEmployee extends ComissionEmployee{
	//instance variables
	private double baseSalary;
	
	/**
	 * This is a constructor blah blah blah
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param grossSales
	 * @param comissionRate
	 * @param baseSalary
	 */
	public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
		setBaseSalary(baseSalary);
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
		if(baseSalary<0)
			throw new IllegalArgumentException("Base salary must be greater than zero");
		
		this.baseSalary = baseSalary;
	}
	
	/**
	 * This method will override the getEarnings from the ComissionEmployee
	 * @return The total salary of the employee
	 */
	@Override
	public double getEarnings(){
		return getBaseSalary() + super.getEarnings();
		//OR return (getBaseSalary()+(getGrossSales()*getComissionRate()));
	}
	
	public void dummy(){
		System.out.println("First Name: "+ getFirstName());
		System.out.println("Last Name: "+ getLastName());
		System.out.println("Sin Number: "+ getSocialSecurityNumber());
		System.out.println("Gross Sales: "+ getGrossSales());
		System.out.println("Comission Rate: "+ getComissionRate());
		System.out.println("Base Salary: "+ getBaseSalary());
		System.out.println("Total Earnings" + getEarnings());
	}
	
	@Override
	public String toString(){
		return String.format ("SUBCLASS I'M NOT THE\n")+ super.toString() + String.format("\nSalary: %.2f \nEarnings: %.2f",getBaseSalary(),getEarnings());
	}
	
	

}
