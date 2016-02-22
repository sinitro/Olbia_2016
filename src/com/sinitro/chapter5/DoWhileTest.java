// Fig. 5.7: DoWhileTest.java - do...while repetition statement.
package com.sinitro.chapter5;

public class DoWhileTest 
{
	public static void main(String[] args) 
	{
		int counter = 1; // initialize counter
		
		do
		{
			System.out.printf("%d ", counter);
			++counter;
		} while (counter <= 10 );
		
		System.out.println();
	}

}
