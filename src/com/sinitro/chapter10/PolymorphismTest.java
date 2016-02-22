// Fig. 10.1: Polymorphism.java
// Assigning superclass and subclass references to superclass and subclass variables
package com.sinitro.chapter10;

import com.sinitro.chapter9.BasePlusCommissionEmployee_v2;
import com.sinitro.chapter9.CommissionEmployee_v2;

public class PolymorphismTest 
{
	public static void main(String[] args) 
	{
		// assign superclass reference to superclass variable
		CommissionEmployee_v2 commissionEmployee_v2 = new CommissionEmployee_v2("Sue", "Jones", "222-22-2222", 10000, .06);
		
		// assign subclass reference to subclass variable
		BasePlusCommissionEmployee_v2 basePlusCommissionEmployee_2 = new BasePlusCommissionEmployee_v2("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		
		// invoke toString on superclass object using superclass variable
		System.out.printf("%s %s:\n\n%s\n\n", "Call CommissionEmployee_v2's toString with superclass reference", "to superclass object", commissionEmployee_v2.toString());
		
		// invoke toString on subclass object using subclass variable
		System.out.printf("%s %s: \n\n%s\n\n", "Call BasePlusCommissionEmployee_v2's toString with subclass", "reference to subclass object", basePlusCommissionEmployee_2.toString());
		
		// invoke toString on subclass object using superclass variable
		CommissionEmployee_v2 commissionEmployee_v22 = basePlusCommissionEmployee_2;
		System.out.printf("%s %s:\n\n%s\n", "Call BasePlusCommissionEmployee_v2 toString with superclass", "reference to subclass object", commissionEmployee_v22.toString());
	} // end main
} // end class PolymorphismTest
