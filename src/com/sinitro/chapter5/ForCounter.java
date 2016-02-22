// Fig. 5.2: ForCounter.java - Counter-controlled repetition with the for repetition statement.
package com.sinitro.chapter5;

public class ForCounter 
{
	public static void main(String[] args) 
	{
		// for statement header includes initialization
		// loop-continuation condition and increment
		for (int counter = 7; counter <= 70; counter+=7)
		{
			System.out.printf("%d   ", counter);	
		    if(counter % 100 == 0)
		    {
		    	System.out.println();
		    }		    
		}
	}

}
