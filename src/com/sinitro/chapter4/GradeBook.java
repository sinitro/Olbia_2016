// Fig. 4.5: GradeBook.java - GradeBook class that solves class-average problem using
//counter-controlled repetition
package com.sinitro.chapter4;
import java.util.Scanner;

public class GradeBook 
{
	private String courseName; // name of course this GradeBook represents
	
	// constructor initializes courseName
	public GradeBook(String name)
	{
		courseName = name; // initializes courseName
	}
	
	// method to set the course name
	public void setCourseName(String name)
	{
		courseName = name;
	}
	
	// method to retrieve course name
	public String getCourseName()
	{
		return courseName;
	}
	
	public void displayMessage()
	{
		// getCourseName gets the name of the course
		System.out.printf("Welcome to the grade book for \n%s!\n\n", getCourseName());
	}
	
	// determines class average based on 10 grades entered by user
	public void determineClassAverage(int numberOfGrades)
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner (System.in);
		
		int total; // sum of grades entered by user
		int counter; // number of the grade to be entered next
		int grade; // grade value entered by user
		int average; // average of grades
		int gradesCount;
		// initialization phase
		total = 0;
		counter = 1; // initialize loop counter
		
		gradesCount = numberOfGrades;
		
		// processing phase uses counter-controlled repetition
		while (counter <= gradesCount)
		{
			System.out.print("Enter grade: ");
			grade = input.nextInt();
			total = total + grade;
			counter = counter + 1;
		}
		
		average = total / gradesCount;
		
		// display total and average of grades
		System.out.printf("\nTotal of all %d grades is %d\n", gradesCount, total);
		System.out.printf("Class average is %d\n", average);
	}

}
