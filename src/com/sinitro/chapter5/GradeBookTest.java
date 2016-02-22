// Fig. 5.10: GradeBookTest.java - Create GradeBook object, input grades and display grade report
package com.sinitro.chapter5;

public class GradeBookTest 
{
	public static void main(String[] args) 
	{
		// create GradeBook object myGradeBook and
		// pass course name to constructor
		GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming");
		
		myGradeBook.displayMessage();
		myGradeBook.inputGrades();
		myGradeBook.displayGradeReport();
	}

}
