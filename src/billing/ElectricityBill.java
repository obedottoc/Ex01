
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
		public ElectricityBill(long number,String name,double preading,double creading,String type)
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
																																									}
	
/*****
 * To calculate the bill amount
 */
public void printData()
{
	System.out.printf("%-40s%40s\n", "Consumer Number:"+consumernumber,"Consumer Name:"+consumername);
	System.out.printf("%s%fwatts  %s%f%s\n","previousmonthreading",previousmonthreading,"currentmonthreading:",currentmonthreading,"watts");
	System.out.printf("%-40s", "consumertype"+type);
}
	/***
	 * To calculate the bill amount
	 */
	public void computeBillAmount()
	{
		double totalAmount=-1;
		String divider="---------------------------------------------------------------------------------";
		double unitsconsumed;
		
		unitsconsumed=currentmonthreading-previousmonthreading;
		
	     if(type.equals("domestic"))
		{
			if((unitsconsumed>=0)&& (unitsconsumed<100))
			{
				totalAmount=unitsconsumed*1.0;
			}else if((unitsconsumed>=101)&&(unitsconsumed<=200))
			{
				totalAmount=unitsconsumed*2.50;
			}else if((unitsconsumed>=201)&&(unitsconsumed<=500))
			{
				totalAmount=unitsconsumed*4.0;
			}else
			{
				totalAmount=unitsconsumed*6.0;
			}
		}else if(type.equals("vendor"))
		{
			if((unitsconsumed>=0)&& (unitsconsumed<=100))
			{
				totalAmount=unitsconsumed*2.0;
			}else if((unitsconsumed>=101)&&(unitsconsumed<=200))
			{
				totalAmount=unitsconsumed*4.50;
			}else if((unitsconsumed>=201)&&(unitsconsumed<=500))
			{
				totalAmount=unitsconsumed*6.0;
			}else
			{
				totalAmount=unitsconsumed*7.0;
			}			
		}	
		System.out.print("\n"+divider+"\n");
		System.out.printf("%40s", "Electricity BILL");
		System.out.print("\n"+divider+"\n");
		this.printData();
		System.out.printf("%29s%8.2f Rs", "Total Amount:",totalAmount);
		System.out.print("\n"+divider+"\n");
	}
}


	
