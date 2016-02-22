// Fig. 5.12: BreakTest.java - break statement exiting a for statement
package com.sinitro.chapter5;

public class BreakTest 
{
	public static void main(String[] args) 
	{
		int count;
		
		for (count = 1; count <= 10; count++)
		{
			if (count == 5)
				break;
			
			System.out.printf("%d ", count);
		}
		
		System.out.printf("\nBroke out of loop at count = %d\n", count);

	}

}
