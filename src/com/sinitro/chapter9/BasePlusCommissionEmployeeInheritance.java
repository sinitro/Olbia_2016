// Fig. 9.8: BasePlusCommissionEmployeeInheritance.java - private superclass members cannot be accessed in a subclass.
package com.sinitro.chapter9;

public class BasePlusCommissionEmployeeInheritance extends CommissionEmployee
{
	private double baseSalary;
	
	// six-argument constructor
	public BasePlusCommissionEmployeeInheritance(String first, String last, String ssn, double sales, double rate, double salary)
	{
		// explicit call to superclass CommissionEmployee constructor
		super(first, last, ssn, sales, rate);
		
		setBaseSalary(salary); // validate and store base salary
	} // end six-argument BasePlusCommissionEmployee constructor
	
	// set base salary
	public void setBaseSalary(double salary)
	{
		if(salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary musty be >= 0.0");
	} // end method setBaseSalary
	
	// return base salary
	public double getBaseSalary()
	{
		return baseSalary;
	} // end method getBaseSalary
	
	// calculate earnings
	@Override // indicates that this method overrides a superClass method
	public double earnings()
	{
		// not allowed: commissionRate and grossSales private in superclass
		return baseSalary + (commissionRate * grossSales);
	} // end method earnings
	
	// return String representation of BasePlusCommissionEmployeeInheritance
	@Override // indicates that this method overrides a superclass method
	public String toString()
	{
		return String.format("%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
				"base-salaried commission employee", firstName, lastName,
				"Social Security Number", socialSecurityNumber,
				"gross sales", grossSales,
				"commission rate", commissionRate,
				"base salary", baseSalary);
	} // end method toString
} // end class BasePlusCommissionEmployeeInheritance
