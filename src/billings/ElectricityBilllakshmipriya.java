package billings;

import java.util.Scanner;

public class ElectricityBill 
{
	

private long consumernumber;
private String consumername;
private double previousmonthreading;
private double currentmonthreading;
private String consumertype;

/***
 * To create Electricity bill with initial values
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
	currentmonthreading=reading2;
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
	System.out.print("Enter the previous reading in watts:");
	currentmonthreading=sc.nextDouble();
	System.out.print("Enter the customer type (domestic or commercial):");
	consumertype=sc.next();
}
/***
 * bill details
 * 
 */
public void printdata()
{
	System.out.printf("%40s%40s\n","Consumer Number:"+consumernumber,"ConsumerName:"+consumername);
	System.out.printf("%s%8.2f%-16s%40s\n",
	"previousmonthreading:"+previousmonthreading,"watts","currentmonthreading:"+currentmonthreading,"watts");
	System.out.printf("%-40s","Consumertype:"+consumertype);
}
/***
 * To calculate the bill amount
 */
public void computeBillAmount()
{
	double totalAmount=-1;
	String divider="----------------------------------------------------------------------------------";
	
	if(consumertype.equals("domestic"))
	{
		int quantity;
		if((quantity>=0)&&(quantity<=100))
		{
			totalAmount=quantity*1.0;
		}else if((quantity>=101)&&(quantity<=200))
		{
			totalAmount=quantity*2.50;
		}else if((quantity>=201)&&(quantity<=500))
		{
			totalAmount=quantity*4.0;
		}else
		{
			totalAmount=quantity*6.0;
		}
	}else if(consumertype.equals("commercial"))
	{
		double quantity;
		if((quantity>=0)&&(quantity<=100))
		{
			totalAmount=quantity*2.0;
		}else if((quantity>=101)&&(quantity<=200))
		{
			totalAmount=quantity*4.50;
		}else if((quantity>201)&&(quantity<=500))
		{
			totalAmount=quantity*6.0;
		}else
		{
			totalAmount=quantity*7.0;
		}
	}
	System.out.print("\n"+divider+"\n");
	System.out.printf("%40s","Electicitry Bill");
	System.out.print("\n"+divider+"\n");
	this.printdata();
	System.out.printf("%29s%8.2f Rs","Total Amount:",totalAmount);
	System.out.print("\n"+divider+"\n");
}


			
			
			
			
			
			
			
	
}

	
	


	
	
	
	
	
	
	

	
	
