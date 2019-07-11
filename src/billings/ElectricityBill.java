package billings;
import java.util.Scanner;
/****
 * Class to show the electricity bill
 * 
 * @author B.karthik
 *
 */
public class ElectricityBill {
	private long customernumber;
	private String customername;
	private String customertype;
	private double lastmonthreading;
	private double currentmonthreading; 

/***
 * To create sale bill with initial values
 */
public ElectricityBill()
{
	this.customernumber=1000;
	this.customername="unknown";
	this.customertype="domestic";
	this.lastmonthreading=100;
	this.currentmonthreading=0;
}
public ElectricityBill(long number,String name,String type,double previous,double current)
{
	this.customernumber=number;
	this.customername=name;
	customertype=type;
	lastmonthreading=previous;
	currentmonthreading=current;
}

/***
 * To get electricity bill from the user
 */
public void getData()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.printf("\n%40s","ELECTRICITY BILL");
	System.out.print("\nEnter the customer number:");
	this.customernumber=sc.nextLong();
	System.out.print("Enter the customer name:");
	customername= sc.next();
	System.out.print("Enter the type of EB connection(DOMESTIC OR COMMERCIAL:");
	customertype=sc.next();
	System.out.print("Enter the last month coustomer reading :");
	lastmonthreading=sc.nextInt();
	System.out.println("Enter the current month coustomer reading:");
	currentmonthreading=sc.nextInt();
	
}
/*****
 * To print the electricity bill details
 */
public void printData()
{
	System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
	System.out.printf("%s40%s %-16s %f\n", "Type of EB Connection:",customertype,"last month reading:",lastmonthreading);
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
	if(customertype.equals("DOMESTIC"))
	
		
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
	}else if(customertype.equals("COMMERCIAL"))
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
