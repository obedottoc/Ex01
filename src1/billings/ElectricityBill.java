/****
 * Program to represent elactricity bill
 * developed by
 * @author Mahesh K
 */



package billings;

import java.util.Scanner;

public class ElectricityBill {
     private long customernumber;
     private String customername;
     private double previousmonthreading;
     private String customertype;
     private double currentmonthreading;

/***
 * To create Electricity bill with initial values
 */
public ElectricityBill()
{
	this.customernumber=0;
	this.customername="unknown";
	this.previousmonthreading=0;
	this.customertype="commercial";
	this.currentmonthreading=0;
}

/***
 * 
 * @param number  Customer number like 1001 etc
 * @param name Customer name
 * @param number previous month reading
 * @param type type of the customer commercial or domestic
 * @param number current month reading
 */
public ElectricityBill(long number,String name,double reading,String type,double readings)
{
	this.customernumber=number;
	this.customername=name;
	previousmonthreading=number;
	customertype=type;
	currentmonthreading=number;
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
	System.out.print("Enter the previous month reading:");
	previousmonthreading=sc.nextDouble();
	System.out.print("Enter the customer type (commercial or domestic):");
	customertype=sc.next();
	System.out.println("current month reading:");
	currentmonthreading=sc.nextDouble();
	
}

/*****
 * To print the bill details
 */
public void printData()
{
	System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
	System.out.printf("%s%8.2f %-16s%40s\n", "previousReading:",previousmonthreading,"CustomerType:",customertype);
	System.out.printf("%-40s", "currentReading:"+currentmonthreading);
}

/***
 * To calculate the bill amount
 */
public void computeBillAmount()
{
	double totalAmount=-1;
	String divider="---------------------------------------------------------------------------------";
	
	if(customertype.equals("domestic"))
	{
		if((currentmonthreading>=0)&& (currentmonthreading<=100))
		{
			totalAmount=currentmonthreading*1.0;
		}else if((currentmonthreading>=101)&&(currentmonthreading<=200))
		{
			totalAmount=currentmonthreading*2.50;
		}else if((currentmonthreading>=201)&&(currentmonthreading<=500))
		{
			totalAmount=currentmonthreading*4.0;
		}else
		{
			totalAmount=currentmonthreading*6.0;
		}
	}else if(customertype.equals("commercial"))
	{
		if((currentmonthreading>=0)&& (currentmonthreading<=100))
		{
			totalAmount=currentmonthreading*2.0;
		}else if((currentmonthreading>=101)&&(currentmonthreading<=200))
		{
			totalAmount=currentmonthreading*4.50;
		}else if((currentmonthreading>=201)&&(currentmonthreading<=500))
		{
			totalAmount=currentmonthreading*6.0;
		}else
		{
			totalAmount=currentmonthreading*7.0;
		}			
	}	
	System.out.print("\n"+divider+"\n");
	System.out.printf("%40s", "ELECTICITY BILL");
	System.out.print("\n"+divider+"\n");
	this.printData();
	System.out.printf("%29s%8.2f Rs", "Total Amount:",totalAmount);
	System.out.print("\n"+divider+"\n");
  }
}

