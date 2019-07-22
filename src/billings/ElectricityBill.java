/*****
 * Package for representing billing information
 * 
 * Developed by n.pavithra
 * student,Saveetha Engineering College.
 * 
 * npavithra1405@gmail.com
 */
package billings;

import java.util.Scanner;

/****
 * Class to represent generating of Electricity bill  
 * 
 * @author obedotto
 *
 */
public class ElectricityBill {
	private long consumernumber;
	private String consumername;
	private double previousmonthreadings;
	private double presentmonthreadings;
	private String connectiontype;
	
	/***
	 * To create Electricity Bill with initial values
	 */
	public ElectricityBill()
	{
		this.consumernumber=1000;
		this.consumername="unknown";
		this.previousmonthreadings=10;
		this.presentmonthreadings=10;
		this.connectiontype="domastic";
	}
	public ElectricityBill(long number,String name,double previous,double present,String type)
	{
		this.consumernumber=number;
		this.consumername=name;
		connectiontype=type;
		previousmonthreadings=previous;
		presentmonthreadings=present;
	}
	
	/*
	 * To get billing information from the user
	 */
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("\n%40s","ELECTRICITY BILL");
		System.out.print("\nEnter the consumer number:");
		this.consumernumber=sc.nextLong();
		System.out.print("Enter the consumer name:");
		consumername= sc.next();
		System.out.print("Enter the type of EB connection(DOMASTIC OR COMMERCIAL:");
		connectiontype=sc.next();
		System.out.print("Enter the previous month reading:");
		previousmonthreadings=sc.nextInt();
		System.out.println("Enter the present month reading:");
		presentmonthreadings=sc.nextInt();
		
	}
	
	/*****
	 * To print the electricity bill details
	 */
	public void printData()
	{
		System.out.printf("%-40s%40s\n", "consumer Number:"+consumernumber,"consumerName:"+consumername);
		System.out.printf("%s%8.2f %-16s %40s\n", "Previous month readings:",+previousmonthreadings,"Watts","type of EB connection:"+connectiontype);
		System.out.printf("%-40s", "present month readings:"+presentmonthreadings);
	}
	
	/***
	 * To calculate the bill amount
	 */
	public void computeBillAmount()
	{
		double totalAmount=-1;
		double quantity=presentmonthreadings-previousmonthreadings;
		String divider="---------------------------------------------------------------------------------";
		
		if(connectiontype.equals("DOMASTIC"))
		{
			if((quantity>=0)&& (quantity<=100))
			{
				totalAmount=quantity*1;
			}else if((quantity>=101)&&(quantity<=200))
			{
				totalAmount=quantity*2.50;
			}else if((quantity>=201)&&(quantity<=500))
			{
				totalAmount=quantity*4;
			}else
			{
				totalAmount=quantity*6;
			}
		}else if(connectiontype.equals("COMMERSIAL"))
		{
			if((quantity>=0)&& (quantity<=100))
			{
				totalAmount=quantity*2;
			}else if((quantity>=101)&&(quantity<=200))
			{
				totalAmount=quantity*4.50;
			}else if((quantity>=201)&&(quantity<=500))
			{
				totalAmount=quantity*6;
			}else
			{
				totalAmount=quantity*7;
			}			
		}	
		System.out.print("\n"+divider+"\n");
		System.out.printf("%40s", "ELECTRICITY BILL");
		System.out.print("\n"+divider+"\n");
		this.printData();
		System.out.printf("%29s%8.2f Rs", "Total Amount:",totalAmount);
		System.out.print("\n"+divider+"\n");
	}
}
