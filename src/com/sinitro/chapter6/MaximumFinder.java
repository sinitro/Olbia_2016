// Fig. 6.2: MaximumFinder.java - Programmer-declared method maximum with three double parameters.
package com.sinitro.chapter6;
import java.util.Scanner;

public class MaximumFinder 
{	
	// obtain three floating-point values and locate the maximum value
	public static void main(String[] args) 
	{
		// create Scanner for input from command window
		Scanner input = new Scanner(System.in);
		
		// prompt for and input three floating-point values
		System.out.print(
				"Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// determine the maximum value
		double result = maximum(number1, number2, number3);
		
		// display maximum value
		System.out.println("Maximum is: " + result);
	}
	
	// returns the maximum of its three double parameters
	public static double maximum(double x, double y, double z)
	{
		double maximumValue = x; // assume x is the largest to start
		
		if (y > maximumValue)
			maximumValue = y;
		
		if (z > maximumValue)
			maximumValue = z;
		
		return maximumValue;
		
//		return Math.max(x, Math.max(y, z));
	}
}
