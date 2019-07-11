package billings;

import java.util.scanner;

public class ElectricityBill {
	private long consumernumber;
	private String consumername;
	private double previousmonthreading;
	private double currentmonthreading ;
	private string consumertype;
	
	/***
	 * To create ElecticityBill with initial values
	 */
public ElectricityBill()
{
		this.consumernumber=5500;
		this.consumername="Agnal";
		this.previousmonthreading=1500;
		this.currentmonthreading=2500;
		this."consumertype"="domestic";
}
/***
 * 
 * @param number
 * @param name
 * @param preading
 * @param creading
 * @param type
	*/
public ElectricityBill(long number,String name,double preading,double creading,string type)
{
		this.consumernumber=number;
		this.consumername=name;
		this.previousmonthreading=preading;
		this.currentmonthreading=creading;
		this.consumertype=type;
}
	/**
	* to get billing information 
	*/
public void getdata()
{
	Scanner sc=new scanner(system.in);
	
	
	System.out.printf("\n%40s","BILLING INFORMATION");
	System.out.print("\nEnter the consumer number:");
	this.customernumber=sc.nextLong();
	System.out.print("Enter the consumer name:");
	customername= sc.next();
	System.out.print("Enter the previousmonthreading:");
	powerrating=sc.nextDouble();
	System.out.print("Enter the currentmonthreading:");
	customertype=sc.next();
	System.out.println("Enter the consumer type(commercial or domestic):");
	consumertype=sc.nextInt();
	
}	
/*****
 * To print the bill details	
 */
public void printData()
{
System.out.printf("%-40s%40s\n", "Consumer Number:"+consumernumber,"ConsumerName:"+consumername);
System.out.printf("%s%8.2f %-16s %40s\n", "Previousmonthreading:",previousmonthreading,"currentmonthreading:",+currentmonthreading);
System.out.printf("%-40s", "consumertype:"+consumertype);

}
/***
 * To calculate the bill amount
 */
public void computeBillamount()
{
	double totalAmount=-1;
	double unitsconsumed=currentmonthreading-previousmonthreading;
	String divider="---------------------------------------------------------------------------------";

	if(customertype.equals("user"))
	{
		if((quantity>=0)&& (quantity<=5))
		{
			totalAmount=quantity*250.0;
		}else if((quantity>=6)&&(quantity<=10))
		{
			totalAmount=quantity*230.0;
		}else if((quantity>=11)&&(quantity<=15))
		{
			totalAmount=quantity*215.0;
		}else
		{
			totalAmount=quantity*200.0;
		}
	}else if(customertype.equals("vendor"))
	{
		if((quantity>=0)&& (quantity<=5))
		{
			totalAmount=quantity*230.0;
		}else if((quantity>=6)&&(quantity<=10))
		{
			totalAmount=quantity*210.0;
		}else if((quantity>=11)&&(quantity<=15))
		{
			totalAmount=quantity*195.0;
		}else
		{
			totalAmount=quantity*180.0;
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