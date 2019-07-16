package billing;

import java.util.Scanner;

/****
 * Class to represent ElectricityBill of LED Lamp
 * 
 * @author nihkil
 *
 */
public class ElectricityBill {
	private long customernumber;
	private String customername;
	private double previousmonthreading;
	private double currentmonthreading;
	private String customertype;
	
	/***
	 * To create Electricity bill with initial values
	 */
	public ElectricityBill()
	{
		this.customernumber=1000;
		this.customername="unknown";
		this.previousmonthreading=10;
		this.currentmonthreading=12;
		this.customertype="domestic";
	}
	
	
	public ElectricityBill(long number,String name,long pmr,long cmr,String type)
	{
		this.customernumber=number;
		this.customername=name;
		previousmonthreading=pmr;
		currentmonthreading=cmr;
		customertype=type;
	}
	
	/***
	 * To get billing information from the user
	 */
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the customer number:");
		this.customernumber=sc.nextLong();
		System.out.print("Enter the customer name:");
		customername= sc.next();
		System.out.print("Enter the previousmonthreading");
		previousmonthreading=sc.nextDouble();
		System.out.print("Enter the currentmonthreading");
		currentmonthreading=sc.nextDouble();
		System.out.print("Enter the customertype(Domestic OR commercial)");
		customertype=customername;
		
	}
	
	/*****
	 * To print the bill details
	 */
	public void printData()
	{
		System.out.printf("Customer Number:"+customernumber,"CustomerName:"+customername);
		System.out.printf("PreviousMonthReading:"+previousmonthreading+"CurrentMonthReading:"+currentmonthreading+"Customer Number:"+customernumber);
	}
	
	/***
	 * To calculate the bill amount
	 */
	public void computeBillAmount()
	{
		double totalAmount=-1;
		double unitsconsumed=currentmonthreading-previousmonthreading;
		String divider="---------------------------------------------------------------------------------";
		
		if(customertype.equals("user"))
		{
			if((unitsconsumed>=0)&&(unitsconsumed<=5))
			{
				totalAmount=unitsconsumed*250.0;
			}else if((unitsconsumed>=6)&&(unitsconsumed<=10))
			{
				totalAmount=unitsconsumed*230.0;
			}else if((unitsconsumed>=11)&&(unitsconsumed<=15))
			{
				totalAmount=unitsconsumed*215.0;
			}else
			{
				totalAmount=unitsconsumed*200.0;
			}
		}else if(customertype.equals("vendor"))
		{
			if((unitsconsumed>=0)&& (unitsconsumed<=5))
			{
				totalAmount=unitsconsumed*230.0;
			}else if((unitsconsumed>=6)&&(unitsconsumed<=10))
			{
				totalAmount=unitsconsumed*210.0;
			}else if((unitsconsumed>=11)&&(unitsconsumed<=15))
			{
				totalAmount=unitsconsumed*195.0;
			}else
			{
				totalAmount=unitsconsumed*180.0;
			}			
		}	
		System.out.print("\n"+divider+"\n");
		System.out.printf("%40s", "SALE BILL");
		System.out.print("\n"+divider+"\n");
		this.printData();
		System.out.printf("%29s%8.2f Rs", "Total Amount:",totalAmount);
		System.out.print("\n"+divider+"\n");
	}
}
