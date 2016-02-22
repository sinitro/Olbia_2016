// Fig. 4.8: GradeBookTest1.java - Create GradeBook1 object and invoke its determineClassAverage method.
package com.sinitro.chapter4;

public class GradeBookTest1 {

	public static void main(String[] args) 
	{
		// create GradeBook1 object myGradeBook1 and
		// pass course name to constructor
		GradeBook1 myGradeBook = new GradeBook1("CS101 Introduction to Java Programming");
		
		myGradeBook.displayMessage();
		myGradeBook.determineClassAverage();
	}

}
