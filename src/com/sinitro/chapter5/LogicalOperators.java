// Fig. 5.18: LogicalOperators.java - Logical operators.
package com.sinitro.chapter5;

public class LogicalOperators 
{

	public static void main(String[] args) 
	{
//		// create truth table for && (conditional AND) operator
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Conitional AND (&&)", "false && false", (false && false),
				"false && true", (false && true),
				"true && false", (true && false),
				"true && true", (true && true));
		
		// create truth table for || (conditional OR) operator
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Conitional OR (||)", 
				"false || false", (false || false),
				"false || true", (false || true),
				"true || false", (true || false),
				"true || true", (true || true));
		
		// create truth table for & (boolean logical AND) operator
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean logical AND (&)", 
				"false & false", (false & false),
				"false & true", (false & true),
				"true & false", (true & false),
				"true & true", (true | true));
		
//		// create truth table for | (boolean logical OR) operator
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean logical OR (|)", 
				"false | false", (false | false),
				"false | true", (false | true),
				"true | false", (true | false),
				"true | true", (true | true));
		
		// create truth table for ^ (boolean exclusive OR) operator
				System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
						"Boolean exclusive OR (^)", 
						"false ^ false", (false ^ false),
						"false ^ true", (false ^ true),
						"true ^ false", (true ^ false),
						"true ^ true", (true ^ true));
	}

}
