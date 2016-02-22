// Fig. 10.12: Invoice.java - Invoice class that implements Payable.
package com.sinitro.chapter10;

public class Invoice implements Payable 
{
	private String partNumber;
	private String partDesscription;
	private int quantity;
	private double pricePerItem;
	
	// four-argument constructor
	public Invoice(String part, String description, int count, double price)
	{
		partNumber = part;
		partDesscription = description;
		setQuantity(count); // validate and store quanity
		setPricePerItem (price); // validate and store price per item
	} // end four-argument Invoice constructor
	
	// set part nunber
	public void setPartNumber(String part)
	{
		partNumber = part; // should validate		
	} // end method setPartNumber
	
	// get part number
	public String getPartNumber()
	{
		return partNumber;
	} // end method getPartNumber
	
	// set description
	public void setPartDescription(String description)
	{
		partDesscription = description; // should validate
	} // end method setPartDescripttion
	
	// get description
	public String getPartDescription()
	{
		return partDesscription;
	} // end method getPartDescription
	
	// set quantity
	public void setQuantity(int count)
	{
		if(count >= 0)
			quantity = count;
		else
			throw new IllegalArgumentException("Quantity must be >= 0");
	} // end method setQuantity
	
	// get quantity
	public int getQuantity()
	{
		return quantity;
	} // end method getQuantity
	
	
	// set price per item
	public void setPricePerItem(double price)
	{
		if (price >= 0)
			pricePerItem = price;
		else
			throw new IllegalArgumentException("Price per item must be >= 0");
	} // end method setPricePerItem
	
	// get price per item
	public double getPricePerItem()
	{
		return pricePerItem;
	} // end method getPricePerItem
	
	// return String representation of Invoice object
	@Override
	public String toString()
	{
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "invoice", "part number", getPartNumber(), getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem());		
	} // end method toString
	
	// method required to carry out contract with interface Payable
	@Override
	public double getPaymentAmount()
	{
		return getQuantity() * getPricePerItem(); // calculate total cost				
	} // end method getPaymentAmount
} // end class Invoice
