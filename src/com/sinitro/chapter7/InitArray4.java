// Fig. 7.17: InitArray.java - Initializing two-dimensional arrays.
package com.sinitro.chapter7;

import java.lang.reflect.Array;

public class InitArray4 
{
	// create and output two-dimensional arrays
	public static void main(String[] args) 
	{
		int[][] array1 = {{1,2,3}, {4,5,6}};
		int[][] array2 = {{1,2},{3},{4,5,6}};
		
		System.out.println("Values in array1 by row are");
		outputArray(array1); // display array1 by row
		
		System.out.println("Values in array2 by row are");
		outputArray(array2); // display array2 by row		
	} // end main
	
	// output rows and columns of a two-dimensional array
	public static void outputArray(int[][] array)
	{
		// loop through array's rows
		for (int row = 0; row < array.length; row++)
			{
				// loop through columns of current row
				for (int column = 0; column < array[row].length; column++)
					System.out.printf("%d ", array[row][column]);
				
				System.out.println(); // start new line of output
			} // end outer for
	} // end method outputArray
} // end class InitArray4
