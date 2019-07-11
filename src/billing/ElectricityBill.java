
package billing;

import java.util.Scanner;

public class ElectricityBill {
	private long consumernumber;
	private String consumername;
	private double previousmonthreading;
	private double currentmonthreading;
	private String consumertype;
	/***
	 * To create sale bill with initial values
	 */
	public ElectricityBill()
	{
		this.consumernumber=1000;
		this.consumername="aakash";
		this.previousmonthreading=10;
		this.currentmonthreading=25;
		this.consumertype="domestic";
	}
	/***
	 * 
	 * @param number
	 * @param name
	 * @param rating
	 * @param type
	 * @param qty
	 */
	public ElectricityBill(long number,String name,double preading,double creading,String type)
	{
		this.consumernumber=number;
		this.consumername=name;
		this.previousmonthreading=preading;
		this.currentmonthreading=creading;
		this.consumertype=type;
	}
	/**
	 *to get the billing operation from the
	 */
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the customer number:");
		this.consumernumber=sc.nextLong();
		System.out.print("Enter the consumer name:");
		consumername= sc.next();
		System.out.print("Enter the power rating in watts:");
		previousmonthreading=sc.nextDouble();
		currentmonthreading=sc.nextDouble();
		System.out.print("Enter the customer type (user or vendor):");
		consumertype=sc.next();
		
		
	}
		/*****
		 * To print the bill details
		 */
		public void printData()
		{
			System.out.printf("%-40s%40s\n", "Customer Number:"+consumernumber,"CustomerName:"+consumername);
			System.out.printf("%s%fwatts   %s%f%s\n",previousmonthreading,"Watts","CustomerType:"+consumertype);
			System.out.printf("%-40s", "consumertype"+consumertype);
		}
		public void computeBillAmount()
		{
			double totalAmount=-1;
			String divider="---------------------------------------------------------------------------------";
			double unitsconsumed;
			
			unitsconsumed=currentmonthreading-previousmonthreading;
			
			
			if(consumertype.equals("domestic"))
			{
				if((unitsconsumed>=0)&& (unitsconsumed<=100))
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
			}else if(consumertype.equals("commercial"))
			{
				if((unitsconsumed>=0)&& (unitsconsumed<=100))
				{
					totalAmount=unitsconsumed*2;
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
			System.out.printf("%40s", "ElectricityBill");
			System.out.print("\n"+divider+"\n");
			this.printData();
			System.out.printf("%29s%8.2f Rs", "Total Amount:",totalAmount);
			System.out.print("\n"+divider+"\n");
		}
	}

		
		

	 
	