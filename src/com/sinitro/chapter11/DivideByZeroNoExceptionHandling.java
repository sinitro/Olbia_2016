// Fig. 11.1: DivideByZeroExceptionHandling.java - Integer division without exception handling.
package com.sinitro.chapter11;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling 
{
	// demonstrates throwing an exception when a divide-by zero occurs
	public static int quatient(int numerator, int denominator)
	{
		return numerator / denominator; // possible division by zero
	} // end method quotient
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); // scanner for input
		
		System.out.print("Please enter an integer numerator: ");
		int numerator = scanner.nextInt();
		System.out.print("Please enter an integer denominator: ");
		int denominator = scanner.nextInt();
		
		int result = quatient(numerator, denominator);
		System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
	} // end main
} // end class DivideByZeroNoExceptionHandling
