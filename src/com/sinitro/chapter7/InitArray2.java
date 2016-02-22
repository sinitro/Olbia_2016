// Fig. 7.3: InitArray1.java - Initializing the elements of an array with an array initializer.
package com.sinitro.chapter7;

public class InitArray2 
{
	public static void main(String[] args) 
	{
		// initializer list specifies the value for each element
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.printf("%s%32s\n", "Index", "Value"); // column headings
		
		// output each array elements value
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%3d%32d\n", counter, array[counter]);
	}

}
