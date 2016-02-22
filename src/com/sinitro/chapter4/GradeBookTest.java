// Fig. 4.6: GradeBookTest.java - Create GradeBook object and invoke its determineClassAverage method.
package com.sinitro.chapter4;
import java.util.Scanner;

public class GradeBookTest 
{

	public static void main(String[] args) 
	{
		// create GradeBook object myGradeBook and
		// pass course name to constructor
		GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming");
		
		myGradeBook.displayMessage();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number total number of grades: ");
		int numberOfGrades = input.nextInt();
		System.out.printf("Total number of grades is: %d\n", numberOfGrades);
		myGradeBook.determineClassAverage(numberOfGrades);

	}

}
