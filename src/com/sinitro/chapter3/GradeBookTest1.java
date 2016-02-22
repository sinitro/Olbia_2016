// Fig. 3.8: GradeBookTest1.java - Creating and manipulating a GradeBook1 object.
package com.sinitro.chapter3;
import java.util.Scanner;

public class GradeBookTest1 
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner (System.in);
		
		// create A GradeBook1 object and assign it to myGradeBook
		GradeBook1 myGradeBook = new GradeBook1();
		
		// display initial value of courseName
		System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());
		
		// prompt for and read course name
		System.out.println("Please enter the course name: ");
		String theName = input.nextLine(); // read a line of text
		myGradeBook.setCourseName(theName); // set the course name
		System.out.println(); // outputs a blank line
		
		// display welcome message after specifying course name
		myGradeBook.displayMessage();
	} // end main
} // end class GradeBookTest1
