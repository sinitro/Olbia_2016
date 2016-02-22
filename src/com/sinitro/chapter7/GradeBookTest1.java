// Fig. 7.19: GradeBookTest1.java - GradeBookTest.java
// GradeBookTest1 creates GradeBook1 object using a two-dimensional array of grades, then invokes method processGrades to analyze themm
package com.sinitro.chapter7;

public class GradeBookTest1 
{	
	// main method begins program execution
	public static void main(String[] args) 
	{
		int[][] gradesArray = {{87, 96, 70},
							   {68, 87, 90},
							   {94, 100, 90},
							   {100, 81, 82},
							   {83, 65, 85},
							   {78, 87, 65},
							   {85, 75, 83},
							   {91, 94, 100},
							   {76, 72, 84},
							   {87, 93, 73} };
		
		GradeBook1 myGradeBook = new GradeBook1("CS101 Introduction to Java Programming", gradesArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	} // end main
} // end class GradeBookTest1
