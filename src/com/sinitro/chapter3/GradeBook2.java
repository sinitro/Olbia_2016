// Fig. 3.10: GradeBook2.java - GradeBook1 class with a constructor to initialize the course name.
package com.sinitro.chapter3;

public class GradeBook2 
{
	private String courseName; // course name for this GradeBook2
	
	// constructor initializes courseName with String argument
	public GradeBook2 (String name) // constructor name is class name
	{
		courseName = name; // initializes courseName
	}
	
	// method to set the course name
	public void setCourseName (String name)
	{
		courseName = name; // store the course name
	}
	
	//method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	}
	
	// display a welcome message to the GradeBook2 user
	public void displayMesasge()
	{
		// this statement calls getCourseName to get the
		// name of the course this GradeBook2 represents
		System.out.printf("Welcome to the grade book for \n%s!\n", getCourseName());
	}
}
