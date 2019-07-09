package billings;

import java.util.Scanner;

public class ElectricityBill {
		private long consumernumber;
		private String consumername;
		private double previousmonthreading;
		private double currentmonthreading;
		private String consumertype;
		private int quantity;
		
		/***
		 * To create electricity bill with initial values
		 */
		public ElectricityBill()
		{
			this.consumernumber=5002;
			this.consumername="Abhijith";
			this.previousmonthreading=4916;
			this.currentmonthreading=5316;
			this.consumertype="domestic";
		}

public ElectricityBill(long number,String name,double pmr,double cmr,String type)
{
	this.consumernumber=number;
	this.consumername=name;
	this.previousmonthreading=pmr;
	this.currentmonthreading=cmr;
	this.consumertype=type;
	
}
public void getData()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.printf("\n%40s","BILLING INFORMATION");
	System.out.print("\nEnter the consumer number:");
	this.consumernumber=sc.nextLong();
	System.out.print("Enter the consumer name:");
	consumername= sc.next();
	System.out.print("Enter the previousmonthreading in watts:");
	this.previousmonthreading=sc.nextDouble();
	System.out.print("Enter the currentmonthreading in watts:");
	this.currentmonthreading=sc.nextDouble();
	System.out.println("Enter the type(commercial or domestic):");
	this.consumertype=sc.next();
	
}
/***
 * 
 * bill details
 * 
 */
public void printData()
{
	System.out.printf("%-40s%40s\n", "Consumer Number:"+consumernumber,"ConsumerName:"+consumername);
	System.out.printf("%s%8.2f %-16s %40s\n", "previousmonthreading:"+previousmonthreading,"watts","currentmonthreading:"+currentmonthreading,"watts");
	System.out.printf("%-40s", "Consumertype:"+consumertype);
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
		if((quantity>=0)&& (quantity<=100))
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
		if((quantity>=0)&& (quantity<=100))
		{
			totalAmount=quantity*2.0;
		}else if((quantity>=101)&&(quantity<=200))
		{
			totalAmount=quantity*4.50;
		}else if((quantity>=201)&&(quantity<=500))
		{
			totalAmount=quantity*6.0;
		}else
		{
			totalAmount=quantity*7.0;
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
