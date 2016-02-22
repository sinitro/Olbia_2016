// Fig. 3.7: GradeBook1.java - GradeBook1 class that contains a courseName instance variable and methods to set and get its value
package com.sinitro.chapter3;

public class GradeBook1 
{ 
	private String courseName; // course name for this GradeBook1
	
	// method to set the course name
	public void setCourseName(String name)
	{
		courseName = name; // store the course name
	} // end method setCourseName
	
	// method to retreive the course name
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName
	
	// display a welcome message to the GradeBook1 user
	public void displayMessage()
	{
		// calls getCourseName to get the name of
		// the course this GradeBook1 represents
		System.out.printf("Welcome to the grade book for \n%s!\n", getCourseName()) ;
	} // end method displayMessage
} // end class GradeBook1