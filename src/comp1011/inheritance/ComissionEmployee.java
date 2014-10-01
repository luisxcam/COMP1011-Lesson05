package comp1011.inheritance;
/**
 * This class represents an employee working on comission
 * @author Luis Acevedo
 * @version Sept. 2014
 */
public class ComissionEmployee {
	//Instance variables
	protected final String firstName; // it means that all other children can use it. (Protected)
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double comissionRate;
	
	/*
	 * 
	 */
	public ComissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales, double comissionRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		//setGrossSales(grossSales);
		//setComissionRate(comissionRate);
		
		//check grossSales
		if(!validateGrossSales(grossSales))
			throw new IllegalArgumentException("The value is less than zero.");
		else
			setGrossSales(grossSales);
		
		//check comission rate
		if(!validateComissionRate(comissionRate))
			throw new IllegalArgumentException("The value is out of bounds. It has to be in between 0-1");
		else
			setComissionRate(comissionRate);
	}//ComissionEmployee
	
	/**
	 * 
	 * @return
	 */
	private boolean validateGrossSales(double grossSales){
		if(grossSales<0)
			return false;
		return true;
	}
	
	/*
	 * 
	 */
	public double getGrossSales() {
		return grossSales;
	}//getGrossSales

	/*
	 * 
	 */
	public void setGrossSales(double grossSales) {
		if(grossSales>0)
			this.grossSales = grossSales;
		else
			throw new IllegalArgumentException("The value is less than zero.");
	}//setGrossSales

	/*
	 * 
	 */
	public double getComissionRate() {
		return comissionRate;
	}//getComissionRate

	/**
	 * 
	 * @param comissionRate
	 */
	public boolean validateComissionRate(double comissionRate){
		if(comissionRate<=0 || comissionRate>=1)
			return false;
		
		return true;
	}
	
	/**
	 * 
	 */
	public void setComissionRate(double comissionRate) {
		if(comissionRate<=0 || comissionRate>=1)
			throw new IllegalArgumentException("The value is out of bounds. It has to be in between 0-1");
		
			this.comissionRate = comissionRate;
	}//setComissionRate

	/*
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}//getFirstName

	/*
	 * 
	 */
	public String getLastName() {
		return lastName;
	}//getLastName

	/*
	 * 
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}//getSocialSecurityNumber
	
	/**
	 * This method calculates the earnings of the employee
	 * @return The earnings of the employee
	 */
	public double getEarnings(){
		return (getGrossSales()*getComissionRate());
	}
	
	/**
	 * This method returns the information of an employee
	 * @return The information of the employee
	 */
	@Override
	public String toString(){
		return String.format("SUPERCLASS = ComissionEmployee \nFirst Name:%s \nLast Name:%s \nSocial Security Number:(%s) \nGross Sales: $%.2f \nComission Rate:$%.2f", getFirstName(),getLastName(),getSocialSecurityNumber(),getGrossSales(),getComissionRate());
	}
		
}//ComissionEmployee
