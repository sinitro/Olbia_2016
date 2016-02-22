// Fig. 10.13: Employee.java - Employee abstract superclass that implements Payable
package com.sinitro.chapter10;

public abstract class Employee_v2 implements Payable  
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	// three-argument constructor
	public Employee_v2 (String first, String last, String ssn)
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	} // end three-argument Employee constructor
	
	// set first name
	public void setFirstName(String first)
	{
		firstName = first; // should validate
	} // end method setFirstName
	
	// return first name
	public String getFirstName()
	{
		return firstName;
	} // end method getFirstName
	
	// set last name
	public void setLastName(String last)
	{
		lastName = last; // should validate
	} // end method setLastName
	
	// return last name
	public String getLastName()
	{
		return lastName; // should validate
	} // end method getLastName
	
	// set social security number
	public void setSocialSecurityNumber (String ssn)
	{
		socialSecurityNumber = ssn; // should validate
	} // end method setSocialSecurityNumber
	
	// return social security number
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	} // end method getSocialSecurityNumber
	
	// return String representation of Employee object
	@Override
	public String toString()
	{
		return String.format("%s %s\nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	} // end method toString
	
	// Note: We do not implement Payable method getPaymentAmount here so this class must be declared abstract to avoid a compilation error.
} // end abstract class Employee
