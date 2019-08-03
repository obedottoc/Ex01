/*****
 * Package for representing billings information
 * 
 * Developed by C.ObedOtto
 * Associate Professor,Saveetha Engineering College.
 * 
 * obedotto@saveetha.ac.in
 */
package billings;

import java.util.Scanner;

/****
 * Class to represent SaleBill of ElectricityBill
 * 
 * @author obedotto
 *
 */
public class ElectricityBill {
	private long customernumber;
	private String customername;
	private long previousmonthreading;
	private long currentmonthreading;
	private String customertype;
	
	/***
	 * To create sale bill with initial values
	 */
	public ElectricityBill()
	{
		this.customernumber=1000;
		this.customername="bairavan";
		this.previousmonthreading=10;
		this.currentmonthreading=12;
		this.customertype="domestic";
	}
	
	/***
	 * 
	 * @param number  user number like 1001 etc
	 * @param name Customer name
	 * @param rating LED lamp power rating in watts
	 * @param type type of the customer user or vendor
	 * @param qty number LED lamps to be purchased
	 */
	public ElectricityBill(long number,String name,long pmr,long cmr,String type)
	{
		this.customernumber=number;
		this.customername=name;
		previousmonthreading=pmr;
		currentmonthreading=cmr;
		customertype=type;
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
		System.out.print("Enter the previousmonthreading:");
		previousmonthreading=sc.nextLong();
		System.out.print("Enter the currentmonthreading:");
		currentmonthreading=sc.nextLong();
		System.out.println("Enter the customertype:");
		customertype=sc.next();
		
	}
	
	/*****
	 * To print the bill details
	 */
	public void printData()
	{
		System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
		System.out.printf("%s%8.2f %-16s %40s\n", "Previousmonthreading:",+previousmonthreading,"Currentmonthreading:"+currentmonthreading,"Customertype:"+customertype);
	}
	
	/***
	 * To calculate the bill amount
	 */
	public void computeBillAmount()
	{
		long unit=currentmonthreading-previousmonthreading;
		double billAmount=0;
		String spacing="---------------------------------------------------------------------------------";
		
		if(customertype.equals("Domestic"))
		{
			if((unit>=0)&& (unit<=100))
			{
				billAmount=unit*1.0;
			}else if((unit>=101)&&(unit<=200))
			{
				billAmount=unit*2.50;
			}else if((unit>=201)&&(unit<=500))
			{
				billAmount=unit*4.0;
			}else
			{
				billAmount=unit*6.0;
			}
		}else if(customertype.equals("commercial"))
		{
			if((unit>=0)&& (unit<=100))
			{
				billAmount=unit*2.0;
			}else if((unit>=101)&&(unit<=200))
			{
				billAmount=unit*4.50;
			}else if((unit>=201)&&(unit<=500))
			{
				billAmount=unit*6.0;
			}else
			{
				billAmount=unit*7.0;
			}			
		}	
		System.out.print("\n"+spacing+"\n");
		System.out.printf("%40s", "SALE BILL");
		System.out.print("\n"+spacing+"\n");
		this.printData();
		System.out.printf("%29s%8.2f Rs", "Total Amount:",billAmount);
		System.out.print("\n"+spacing+"\n");
	}
}
