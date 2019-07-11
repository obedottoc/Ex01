package billings;

import java.util.Scanner;

public class ElectricityBill {
	

private long consumernumber;
private String consumername;
private double previousmonthreadingg;
private String currentmonthreading;
private int consumertype;

/***
 * To create sale bill with initial values
 */
public ElectricityBill()
{
	this.consumernumber=1000;
	this.consumername="unknown";
	this.previousmonthreading=10;
	this.currentmonthreading=5;
	this.consumertype="domestic";
}
public ElectricityBill(long number,String name,double reading1,double reading2,String type)
{
	this.consumernumber=number;
	this.consumername=name;
	previousmonthreading=reading1;
	currenttmonthreading=reading2;
	consumertype=type;
}
public void getData()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.printf("\n%40s","BILLING INFORMATION");
	System.out.print("\nEnter the consumer number:");
	this.consumernumber=sc.nextLong();
	System.out.print("Enter the consumer name:");
	consumername= sc.next();
	System.out.print("Enter the power rating in watts:");
	powerrating=sc.nextDouble();
	System.out.print("Enter the customer type (user or vendor):");
	customertype=sc.next();
}