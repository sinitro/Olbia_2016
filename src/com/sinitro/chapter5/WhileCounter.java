// Fig. 5.1: WhileCounter.java - Counter-controlled repetition with the while repetition statement.
package com.sinitro.chapter5;

public class WhileCounter {

	public static void main(String[] args) 
	{
		int counter = 1;
		while (counter <= 10)
		{
			System.out.printf("%d - ", counter);
			++counter;
		}
	}

}
