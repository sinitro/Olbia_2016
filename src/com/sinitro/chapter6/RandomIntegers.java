// Fig. 6.5: RandomIntegers.java - Shifted and scaled random integers.
package com.sinitro.chapter6;
import java.util.Random; // progam uses class Random

public class RandomIntegers 
{
	public static void main(String[] args) 
	{
		Random randomNumbers = new Random();
		int face; // stores each random integer generated
		
		// loop 20 times
		for (int counter = 1; counter <= 20; counter++)
		{
			// pick random integer from 1 to 6
			face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d\t", face); // display genearted value
			
			// if counter is divisible by 5, start a new line of output
			if (counter % 5 == -0)
				System.out.println();
		}
	}

}
