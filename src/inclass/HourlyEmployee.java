package inclass;

public class HourlyEmployee extends Employee{
	//variable definitions
	private double wage, hour;
	
	public HourlyEmployee(String firstName, String lastName, int sinNumber, double wage, double hour){
		super(firstName, lastName, sinNumber);
		
		if(validateWage(wage))
			this.wage = wage;
		else
			throw new IllegalArgumentException("The wage is less than zero");
		
		if(validateHour(hour))
			this.hour = hour;
		else
			throw new IllegalArgumentException("Hours is less than zero");
	}
	
	private boolean validateWage(double wage){
		if(wage>0)
			return true;
		return false;
	}
	
	private boolean validateHour(double hour){
		if(hour>0)
			return true;
		return false;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if(validateWage(wage))
			this.wage = wage;
		else
			throw new IllegalArgumentException("The wage is less than zero");
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		if(validateHour(hour))
			this.hour = hour;
		else
			throw new IllegalArgumentException("Hours is less than zero");
	}
	
	@Override
	public double earnings(){
		return getWage()*getHour();
	}
	
	@Override
	public String toString(){
		return super.toString() + String.format("\nWage: %.2f \nHours:%f",getWage(), getHour());
	}
		
}