// Fig. 3.5: GradeBookTest.java - Create GradeBook object and pass a String to
// its displayMessage method.
package com.sinitro.chapter3;

import java.util.Scanner;

public class GradeBookTest {

	// main method begins program execution
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window	
		Scanner input = new Scanner(System.in);
		
		// create a GradeBook object and assign it to myGradeBook
		GradeBook myGradeBook = new GradeBook();
		
		// prompt for and input course name
		System.out.println("Please enter the course name:");
		String nameOfCourse = input.nextLine(); // read a line of text
		System.out.println(); // outputs a blank line
		
		// call my GradeBook's displayMessage method
		// and pass nameOfCourse as an argument
		myGradeBook.displayMessage(nameOfCourse);
	} // end main
} // end class GradeBookTest
