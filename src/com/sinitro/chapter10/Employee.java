// Fig. 10.4: Employee.java - Employee abstract superclass
package com.sinitro.chapter10;

public abstract class Employee 
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	/**
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 */
	public Employee(String first, String last, String ssn) 
	{
		this.firstName = first;
		this.lastName = last;
		this.socialSecurityNumber = ssn;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the socialSecurityNumber
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	/**
	 * @param socialSecurityNumber the socialSecurityNumber to set
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// return String representation of Employee object
	@Override
	public String toString()
	{
		return String.format("%s %s\nSocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	} // end method toString
	
	// abstract method overridden by concrete subclasses
	public abstract double earnings(); // no implementation here	
} // end abstract class Employee
