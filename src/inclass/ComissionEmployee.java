package inclass;

/**
 * This class represents an employee working on commission
 * @author Luis Acevedo
 * @version Sept. 2014
 */
public class ComissionEmployee extends Employee{
	//Instance variables
	private double grossSales;
	private double comissionRate;
	
	/*
	 * 
	 */
	public ComissionEmployee(String firstName, String lastName,
			int sinNumber, double grossSales, double comissionRate) {
		super(firstName, lastName, sinNumber);
		
		//check grossSales
		if(!validateGrossSales(grossSales))
			throw new IllegalArgumentException("The value is less than zero.");
		else
			this.grossSales = grossSales;
		
		//check commission rate
		if(!validateComissionRate(comissionRate))
			throw new IllegalArgumentException("The value is out of bounds. It has to be in between 0-1");
		else
			this.comissionRate = comissionRate;
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
	
	/**
	 * 
	 * @param comissionRate
	 */
	public boolean validateComissionRate(double comissionRate){
		if(comissionRate<=0 || comissionRate>=1)
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
	 */
	public void setComissionRate(double comissionRate) {
		if(comissionRate<=0 || comissionRate>=1)
			throw new IllegalArgumentException("The value is out of bounds. It has to be in between 0-1");
		
			this.comissionRate = comissionRate;
	}//setComissionRate


	/**
	 * This method calculates the earnings of the employee
	 * @return The earnings of the employee
	 */
	@Override
	public double earnings(){
		return getComissionRate()*getGrossSales();
	}
	
	/**
	 * This method returns the information of an employee
	 * @return The information of the employee
	 */
	@Override
	public String toString(){
		return super.toString() + String.format("\nComission Rate: %.2f \nGross Sales: %.2f",getComissionRate(), getGrossSales());
	}
		
}//ComissionEmployee
