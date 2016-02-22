// Fig. 8.12: Employee.java - Static variable used to maintain a count of the number of Employee1 objects in memory.
package com.sinitro.chapter8;

public class Employee1 
{
	private String firstName;
	private String lastName;
	private static int count = 0; // number of Employees1 created
	
	// initialize Employee1, add 1 to static count and output String indicating that constructor was called
	public Employee1(String first, String last)
	{
		firstName = first;
		lastName = last;
		
		++count; // increment static count of employees
		System.out.printf("Employee constructor: %s %s; count = %d\n", firstName, lastName, count);
	} // end Employee1 constructor
	
	// get first name
	public String getFirstName()
	{
		return firstName;
	} // end method getFirstName
	
	// get last name
	public String getLastName()
	{
		return lastName;
	} // end method getLastName
	
	// static method to get static count value
	public static int getCount()
	{
		return count;
	} // end methdod getCount
} // end class Employee1
