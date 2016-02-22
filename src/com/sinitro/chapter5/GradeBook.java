// Fig. 5.9: GradeBook.java - GradeBook class uses switch statement to count letter grades
package com.sinitro.chapter5;
import java.util.Scanner;

public class GradeBook 
{
	private String courseName;
	
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;
	
	// constructor initializes courseName;
	public GradeBook(String name)
	{
		courseName = name;
	}
	
	// method to set the course name
	public void setCourseName(String name)
	{
		courseName = name;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void displayMessage()
	{
		System.out.printf("Welcom to the grade boof for\n%s!\n\n", getCourseName());
	}
	
	// input arbitrary number of grades from user
	public void inputGrades()
	{
		Scanner input = new Scanner(System.in);
		
		int grade;
		
		System.out.printf("%s\n%s\n   %s\n   %s\n", "Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z then press Enter");
		
		// loop until user enters the end-of-file indicator
		while (input.hasNext())
		{ 
			grade = input.nextInt(); // read grade
			total += grade; // add grade to total
			++gradeCounter; // increment number of grades
			
			// call method to increment appropriate counter
			incrementLetterGradeCounter(grade);
			
		}
	}
	
	// add 1 to appropriate counter for specified grade
	private void incrementLetterGradeCounter(int grade)
	{ 
		// determine which grade was entered
		switch (grade / 10)
		{
		case 9: //grade was between 90
		case 10: // and 100, inclusive
			++aCount;
			break; // necessary to exit switch
		case 8: // grade was between 80 and 89
			++bCount;
			break;
		case 7: // grade was between 70 and 79
			++cCount;
			break;
		case 6: // grade was between 60 and 69
			++dCount;
			break;
		default: // grade was less than 60
			++fCount;
			break;			
		}
	}
	
	public void displayGradeReport()
	{
		System.out.println("\nGrade Report:");
		
		// if user entered at least one grade...
		if (gradeCounter != 0)
		{
			// calculate average of all grades entered
			double average = (double) total / gradeCounter;
			
			// output summary of results
			System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
			System.out.printf("Class average is %.2f\n", average);
			System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
					"Number of students who received each grade:",
					"A: ", aCount,
					"B: ", bCount,
					"C: ", cCount,
					"D: ", dCount,
					"F: ", fCount);
		}
		else
			System.out.println("No grades were entered");
	}
}
