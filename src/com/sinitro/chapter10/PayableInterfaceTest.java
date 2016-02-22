// Fig. 10.15: PayableInterfaceTest.java - Test interface Payable.
package com.sinitro.chapter10;

public class PayableInterfaceTest 
{
	public static void main(String[] args) 
	{
		// create four-element Payable array
		Payable[] payableObjects = new Payable[4];
		
		// populate array with objects that implement Payble
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee_v2("List", "Smith", "111-11-1111", 800.00);
		payableObjects[3] = new SalariedEmployee_v2("List", "Barnes", "888-88-8888", 1200.00);
		
		System.out.println("Invoices and Employees processed polimorphyically:\n");
		
		// generically process each element in array payableObjects
		for(Payable currentPayable: payableObjects)
		{
			// output currentPayable and its appropriate payment amount
			System.out.printf("%s \n%s: $%,.2f\n\n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
		} // end for
	} // end main
} // end class PayableInterfaceTest
