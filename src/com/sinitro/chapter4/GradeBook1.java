// Fig. 4.7: GradeBook1.java
// GradBook1 class that solves the class-average problem using sentinel-controlled repetition.
package com.sinitro.chapter4;
import java.util.Scanner;

public class GradeBook1 
{
	private String courseName;
	
	// constructor initializes coursName
	public GradeBook1(String name)
	{
		courseName = name;
	}
	
	// method to set the course name
	public void setCourseName(String name)
	{
		courseName = name;
	}
	
	// method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	}
	
	// display a welcome message to the GradeBook1 user
	public void displayMessage()
	{
		System.out.printf("Welcome to the grade book for \n\n%s!\n\n", getCourseName());
	}
	
	// determine the average of an arbitrary number of grades
	public void determineClassAverage()
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner (System.in);
		
		int total;
		int gradeCounter;
		int grade;
		double average;
		
		// initialization phase
		total = 0;
		gradeCounter = 0;
		
		System.out.print("Enter grade or -1 to quit: ");
		grade = input.nextInt();
		
		// loop until sentinel value read from user
		while (grade != -1)
		{
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();			
		}
		
		if (gradeCounter != 0)
		{
			average = (double) total / gradeCounter;
			
			System.out.printf("\nTotal of the %d grades entered is %d\n", gradeCounter, total);
			System.out.printf("Class average is %.2f\n", average);
		}
		else
			System.out.println("No grades were entered");
	}
}
