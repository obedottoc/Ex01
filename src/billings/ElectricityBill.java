package billings;

import java.util.Scanner;

public class ElectricityBill {
	
	private long customer_number;
	private String customer_name;
	private String customer_type;
	private double lastmonthreading;
	private double currentmonthreading; 


public ElectricityBill()
{
	this.customer_number=1000;
	this.customer_name="noname";
	this.customer_type="domestic";
	this.lastmonthreading=100;
	this.currentmonthreading=0;
}
public ElectricityBill(long number,String name,String type,double previous,double current)
{
	this.customer_number=number;
	this.customer_name=name;
	this.customer_type=type;
	lastmonthreading=previous;
	currentmonthreading=current;
}



 
public void getData()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.printf("\n%40s","ELECTRICITY BILL");
	System.out.print("\nEnter the customer number:");
	this.customer_number=sc.nextLong();
	System.out.print("Enter the customer name:");
	customer_name= sc.next();
	System.out.print("Enter the type of EB connection(DOMESTIC OR COMMERCIAL:");
	customer_type=sc.next();
	System.out.print("Enter the last month coustomer reading :");
	lastmonthreading=sc.nextInt();
	System.out.println("Enter the current month coustomer reading:");
	currentmonthreading=sc.nextInt();
	
}
 
 
public void printData()
{
	System.out.printf("%-40s%40s\n", "Customer Number:"+customer_number,"CustomerName:"+customer_name);
	System.out.printf("%s40%s %-16s %f\n", "Type of EB Connection:",customer_type,"last month reading:",lastmonthreading);
	System.out.printf("%-40s", "current month reading:"+currentmonthreading);
}
/***
 * To calculate the electricity bill amount
 */
public void computeBillAmount()
{
	double totalAmount=-1; 
	double quantity=currentmonthreading-lastmonthreading;
	String divider="---------------------------------------------------------------------------------";
	if(customer_type.equals("DOMESTIC"))
	
		
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
	}else if(customer_type.equals("COMMERCIAL"))
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
