// Fig. 9.11: BasePlusCommissionEmployee_v2.java
// BasePlusCommissionEmployee_v2 class inherits from CommissionEmployee_v2 and accesses the superclass's private data via inherited public methods
package com.sinitro.chapter9;

public class BasePlusCommissionEmployee_v2 extends CommissionEmployee_v2
{
	private double baseSalary; // base salary per week
	
	// six-argument constructor
	public BasePlusCommissionEmployee_v2(String first, String last, String ssn, double sales, double rate, double salary)
	{
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary); // validate and store base salary
	} // end six-argument BasePlusCommissionEmployee constructor
	
	// set base salary
	public void setBaseSalary(double salary)
	{
		if (salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	} // end method setBaseSalary

	/**
	 * @return the baseSalary
	 */
	public double getBaseSalary() 
	{
		return baseSalary;
	}

	/* (non-Javadoc)
	 * @see com.sinitro.chapter9.CommissionEmployee_v2#earnings()
	 */
	@Override
	public double earnings() 
	{
		// TODO Auto-generated method stub
		return getBaseSalary() + super.earnings();
	}

	/* (non-Javadoc)
	 * @see com.sinitro.chapter9.CommissionEmployee_v2#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s\n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
	}
	
	
}
