
package billing;

import java.util.Scanner;

public class ElectricityBill {
	private long consumernumber;
	private String consumername;
	private double previousmonthreading;
	private double currentmonthreading;
	private String type;
	/***
	 * To create sale bill with initial values
	 */
	public ElectricityBill()
	{
	    this.consumernumber=5000;
	    this.consumername="sarju";
		this.previousmonthreading=1410;
		this.currentmonthreading=2500;
		this.type="domestic";
	}
	
	/***
	 * 
	 * @param number
	 * @param name
	 * @param reading
	 * @param type
	 * @param qty
	 */
		public ElectricityBill(long number,String name,double reading,String type,int qty)
		{
			this.consumernumber=number;
			this.consumername=name;
			this.previousmonthreading=1410;
			this.currentmonthreading=2500;
			this.type="domestic";
		}
		
		/**
		 * to get billing information from the 
		 */

public void getData()
{
	Scanner sc=new Scanner(System.in);
	System.out.printf("\n%40s","BILLING INFORMATION");
	System.out.print("\nEnter the consumer number:");
	this.consumernumber=sc.nextLong();
	System.out.print("Enter the consumer name:");
	consumername= sc.next();
	System.out.print("Enter the previousmonthreading:");
	previousmonthreading=sc.nextDouble();
	System.out.print("Enter the currentmonthreading:");
	currentmonthreading=sc.nextDouble();
	System.out.println("Enter the consumer type (commerical or dometic):");
	type=sc.next();
}																																									}
	
/*****
 * To print the bill details
 */
public void printData()
{
	System.out.printf("%-40s%40s\n", "Consumer Number:"+consumernumber,"Consumer Name:"+consumername);
	System.out.printf("%s%8.2f %-16s %40s\n", "previousmonthreading:","Watts",type:"+consumertype);
	System.out.printf("%-40s", "Number LED lamps:"+quantity);
}

	
