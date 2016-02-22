// Fig. 5.13: ContinueTest.java - continue statement terminating an iteration of a for statement.
package com.sinitro.chapter5;

public class ContinueTest 
{
	public static void main(String[] args) 
	{
		for (int count = 1; count <= 10; count++)
		{
			if (count == 5)
				continue;
			
			System.out.printf("%d", count);
		}
		
		System.out.println("\nUsed continue to skip printing 5");
	}

}
