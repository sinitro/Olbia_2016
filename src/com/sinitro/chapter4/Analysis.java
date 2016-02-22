// Fig. 4.9: Analysis.java - Analysis of examination results using nested control statements.
package com.sinitro.chapter4;
import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initializing variables in delcarations
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;
		
		// process 10 students using counter-controlled loop
		while (studentCounter <= 10)
		{
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			result = input.nextInt();
			
			// if...else is nested in the while statement
			if (result == 1)
				passes = passes + 1;
			else
				failures = failures + 1;
			
			studentCounter = studentCounter + 1;
		}
		
		// termination phase; prepare and display results
		System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);
		
		// determine whether more than 8 students passed
		if (passes > 8)
			System.out.println("Bonus to instructor!");

	}

}
