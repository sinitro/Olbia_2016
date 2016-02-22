// Fig. 8.2: Time1Test.java - Time1 object used in an application
package com.sinitro.chapter8;

public class Time1Test 
{
	public static void main(String[] args) 
	{
		// create and initialize a Time1 object
		Time1 time = new Time1(); // invokes Time1 constructor
		
		// output string representations of the time
		System.out.print("The initial universal time is: ");
		System.out.println(time.toUniversalString());
		System.out.print("The initial standard time is: ");
		System.out.println(time.toString());
		System.out.println(); // output a blank line
		
		// change time and output updated time
		time.setTime(13, 27, 6);
		System.out.print("Universal time after setTime is: ");
		System.out.println(time.toUniversalString());
		System.out.print("Standard time after setTime is: ");
		System.out.println(time.toString());
		System.out.println(); // output a blank line
		
		// attempt to set time with invalid values
		try
		{
			time.setTime(99, 99, 99);			
		} // end try
		catch (IllegalArgumentException e)
		{
			System.out.printf("Exception: %s\n\n", e.getMessage());
		} // end catch
		
		// display time after attempt to set invalid values
		System.out.print("After attempting invalid settings: ");
		System.out.println(time.toUniversalString());
		System.out.print("Standard time is: ");
		System.out.println(time.toString());
		System.out.println(); // output a blank line
		
	}
}
