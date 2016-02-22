// Fig. 4.12: Increment.java - Prefix increment and postfix increment operators.
package com.sinitro.chapter4;

public class Increment {

	public static void main(String[] args) 
	{
		int c;
		
		// demonstrate postfix increment operator
		c = 5;
		System.out.println(c);
		System.out.println(c++);
		System.out.println(c);
		
		System.out.println();
		
		c = 5;
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
	}

}
