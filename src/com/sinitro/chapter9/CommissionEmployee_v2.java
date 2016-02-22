// Fig. 9.10: CommissionEmployee_v2.java - CommissionEmployee class uses methods to manipulate its private instance variables
package com.sinitro.chapter9;

public class CommissionEmployee_v2 
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	// five-argument constructor
	public CommissionEmployee_v2( String first, String last, String ssn, double sales, double rate)
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales(sales); // validate and store gross sales
		setCommissionRate(rate); // validate and store commission rate
	} // end five-argument CommissionEmployee_v2 constructor

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

	/**
	 * @return the grossSales
	 */
	public double getGrossSales() {
		return grossSales;
	}

	/**
	 * @param grossSales the grossSales to set
	 */
	public void setGrossSales(double grossSales) {
		if(grossSales >= 0.0)
		this.grossSales = grossSales;
		else
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}

	/**
	 * @return the commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate >= 0.0 && commissionRate < 1.0)
		this.commissionRate = commissionRate;
		else
			throw new IllegalArgumentException("Commission reate must be > 0.0 and < 1.0");
	}
	
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommissionEmployee_v2 [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSocialSecurityNumber()=" + getSocialSecurityNumber() + ", getGrossSales()=" + getGrossSales()
				+ ", getCommissionRate()=" + getCommissionRate() + "]";
	}	
}
