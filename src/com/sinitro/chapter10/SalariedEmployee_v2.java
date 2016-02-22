// Fig. 10.14: SalariedEmployee.java - SalariedEmployee_v2 class extends Employee, which implements Payable
package com.sinitro.chapter10;

public class SalariedEmployee_v2 extends Employee_v2 
{
	private double weeklySalary;
	
	// four-argument constructor
	public SalariedEmployee_v2(String first, String last, String ssn, double salary)
	{
		super(first, last, ssn); // pass to Employee_v2 constructor
		setWeeklySalary(salary); // validate and store salary
	} // end four-argument SalariedEmployee_v2 constructor
	
	// set salary
	public void setWeeklySalary(double salary)
	{
		if (salary >= 0)
			weeklySalary = salary;
		else
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
	} // end method setWeeklySalary
	
	// return salary
	public double getWeeklySalary()
	{
		return weeklySalary;
	} // end method getWeekly
	
	// calculate earnings; implement interface Payable method that was 
	// abstract in superclass Employee_v2
	@Override
	public double getPaymentAmount()
	{
		return getWeeklySalary();
	} // end method getPaymentAmount
	
	// return String representation fo SalariedEmployee_v2 object
	@Override
	public String toString()
	{
		return String.format("Salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	} // end method toString
} // end class SalariedEmployee_v2
