/*****package for representing electricity bill
 */
package Billings;

import java.util.Scanner;

/****class to represent electricity bill  of consumer
 * */
public class ElectricityBill {
	
	private long consumernumber;
	private String consumername;
	private int previousmonthreading;
	private String consumertype;
	private int currentmonthreading;
	
	/***
	 * To create electricity bill with initial values
	 */
	public ElectricityBill()
	{
		this.consumernumber=2000;
		this.consumername="Sarathi";
		this.previousmonthreading=300;
		this.consumertype="domestic";
		this.currentmonthreading=200;
	}
	/***
	 * 
	 * @param number  Consumer number like 1001 etc
	 * @param name Consumer name
	 * @param units previous month reading
	 * @param type type of the customer domestic or commercial
	 * @param units current month reading
	 */
	public ElectricityBill(long number,String name,int units,String type,int units)
	{
		this.consumernumber=number;
		this.consumername=name;
		previousmonthreading=units;
		consumertype=type;
		currentmonthreading=units;
	}
	
	/***
	 * To get billing information from the user
	 */
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the consumer number:");
		this.consumernumber=sc.nextLong();
		System.out.print("Enter the consumer name:");
		consumername= sc.next();
		System.out.print("Enter the previousmonthreading in watts:");
		previousmonthreading=sc.nextInt();
		System.out.print("Enter the customer type (domestic or commercial):");
		consumertype=sc.next();
		System.out.println("currentmonthreading in watts:");
		currentmonthreading=sc.nextInt();
		
	}
	/*****
	 * To print the bill details
	 */
	public void printData()
	{
		System.out.printf("%-40s%40s\n", "Customer Number:"+consumernumber,"ConsumerName:"+consumername);
		System.out.printf("%s%8.2f %-16s %40s\n", "PreviousMonthReading:",previousmonthreading,"Units","ConsumerType:"+consumertype);
		System.out.printf("%-40s", "CurrentMonthreading:"+currentmonthreading);
	}

	/***
	 * To calculate the bill amount
	 */
	public void computeBillAmount()
	{
		double totalAmount=-1;
		String divider="---------------------------------------------------------------------------------";
		
		
		if(consumertype.equals("domestic"))
		{
			if((currentmonthreading-previousmonthreading>=0)&& (currentmonthreading-previousmonthreading<=100))
			{
				totalAmount=currentmonthreading-previousmonthreading*1.0;
			}else if((currentmonthreading-previousmonthreading>=101)&&(currentmonthreading-previousmonthreading<=200))
			{
				totalAmount=currentmonthreading-previousmonthreading*2.50;
			}else if((currentmonthreading-previousmonthreading>=201)&&(currentmonthreading-previousmonthreading<=500))
			{
				totalAmount=currentmonthreading-previousmonthreading*4.0;
			}else
			{
				totalAmount=currentmonthreading-previousmonthreading*6.0;
			}
		}else if(consumertype.equals("commercial"))
		{
			if((currentmonthreading-previousmonthreading>=0)&& (currentmonthreading-previousmonthreading<=100))
			{
				totalAmount=currentmonthreading-previousmonthreading*2.0;
			}else if((currentmonthreading-previousmonthreading>=101)&&(currentmonthreading-previousmonthreading<=200))
			{
				totalAmount=currentmonthreading-previousmonthreading*4.50;
			}else if((currentmonthreading-previousmonthreading>=201)&&(currentmonthreading-previousmonthreading<=500))
			{
				totalAmount=currentmonthreading-previousmonthreading*6.0;
			}else
			{
				totalAmount=currentmonthreading-previousmonthreading*7.0;
			}			
		}	
		System.out.print("\n"+divider+"\n");
		System.out.printf("%40s", "ELCTRICITY BILL");
		System.out.print("\n"+divider+"\n");
		this.printData();
		System.out.printf("%29s%8.2f Rs", "Total Amount:",totalAmount);
		System.out.print("\n"+divider+"\n");
	}
}
