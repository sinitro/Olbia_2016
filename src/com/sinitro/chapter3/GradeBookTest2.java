// Fig. 3.11: GradeBookTest2.java - GradeBook2 constructor used to specify the course name at the time each GradeBook2 object is created
package com.sinitro.chapter3;

public class GradeBookTest2 
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		// create GradeBook2 object
		GradeBook2 gradeBook1 = new GradeBook2("CS101 Introduction to Java Programming");
		GradeBook2 gradeBook2 = new GradeBook2("CS102 Data Structures in Java");
		
		System.out.printf("gradeBook1 course name is: %s\n", gradeBook1.getCourseName());
		System.out.printf("gradeBook2 course name is: %s\n", gradeBook2.getCourseName());

	}

}
	