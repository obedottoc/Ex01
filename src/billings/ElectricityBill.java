package billings;

import java.util.Scanner;


/****
 * Class to represent SaleBill of LED Lamp
 * 
 * @author vijaykumarkaranam
 *
 */
public class ElectricityBill {
	private long customernumber;
	private String customername;
	private double currentmonthreading;
	private double previousmonthreading;
	private String typeofEBconnection;
	private Scanner sc;

	
	/***
	 * To create electricityBill with initial values
	 */
	public ElectricityBill()
	{
		this.customernumber=1000;
		this.customername="unknown";
		this.previousmonthreading=10;
		this.currentmonthreading=10;
		this.typeofEBconnection="domestic";
	}
	
	/***
	 * 
	 * @param number  Customer number like 1001 etc
	 * @param name Customer name
	 * @param rating LED lamp power rating in watts
	 * @param type type of the customer user or vendor
	 * @param qty number LED lamps to be purchased
	 */
	public ElectricityBill(long number,String name,double rating,String type,int qty)
	{
		this.customernumber=1000;
		this.customername=name;
		this.previousmonthreading=10;
		this.currentmonthreading=10;
		this.typeofEBconnection="domestic";
	}
	
	/***
	 * To get billing information from the user
	 */
	public void getData()
	{
		sc = new Scanner(System.in);
		
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the customer number:");
		this.customernumber=sc.nextLong();
		System.out.print("Enter the customer name:");
		customername= sc.next();
		System.out.print("Enter the previousmonthreading :");
		previousmonthreading=sc.nextDouble();
		System.out.print("Enter the currentmonthreading:");
		currentmonthreading=sc.nextLong();
		System.out.println("type of EB conection(domestic or commercial):");
		customername=sc.next();
		
	}
	
	/*****
	 * To print the bill details
	 */
	public void printData()
	{
		System.out.printf( "Customer Number:"+customernumber,"CustomerName:"+customername);
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
		
		if((typeofEBconnection).equals("domestic"))
		{
			if((unitsconsumed>=0)&& (unitsconsumed<=5))
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
		}else if(typeofEBconnection.equals("commercial"))
		{
			if((unitsconsumed>=0)&&(unitsconsumed<=5))
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

