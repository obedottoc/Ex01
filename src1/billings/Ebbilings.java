package billings;

import java.util.Scanner;

/***
 * Class to develop Electricity bills
 * @author monica
 *
 */

public class Ebbilings {
	private long customernumber;
	private String customername;
	private double previousmonthreading;
	private double currentmonthreading;
	private string customertype;
	/***
	 * To create Electricity bills with initial values
	 */
	public Ebbilings()
	{
		this.customernumber=1000;
		this.customername="unknown";
		this.previousmonthreading=3000;
		this.currentmonthreading=3500;
		this.customertype="Domestic";
	}/***
	 * 
	 * @param number  Customer number like 1001 etc
	 * @param name Customer name
	 * @param reading previous month reading
	 * @param reading current month reading
	 * @param type customertype
	 */
	public Ebbilings(long number,String name,double rating,double rating,string type)
	{
		this.customernumber=number;
		this.customername=name;
		previousmonthreading=rating;
        currentmonthreading=rating;
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
		previousmonthreading=sc.nextDouble();
		System.out.print("Enter the currentmonthreading:");
	    currentmonthreading=sc.nextDouble();
		System.out.println("Enter the customertype(Domestic or Commercial):");
		customertype=sc.next();
		
	}		

/*****
 * To print the bill details
 */
public void printData()
{
	System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
	System.out.printf("%s%8.2f %-16s %40s\n", "previousmonthreading:",previousmonthreading,"reading","Currentmonthreading:",currentmonthreading,"reading");
	System.out.printf("%-40s", "typeofconnection:"+customertype);
}
/***
 * To calculate the bill amount
 */
public void computeBillAmount()
{
	double totalAmount=-1;
	String divider="---------------------------------------------------------------------------------";
	
	if(customertype.equals("Domestic"))
	{
		if((>=0)&& (quantity<=100))
		{
			totalAmount=quantity*1.0;
		}else if((quantity>=101)&&(quantity<=200))
		{
			totalAmount=quantity*2.50;
		}else if((quantity>=201)&&(quantity<=500))
		{
			totalAmount=quantity*4.50;
		}else
		{
			totalAmount=quantity*6.0;
		}
	}else if(typeofconnection.equals("commercial"))
	{
		if((quantity>=0)&& (quantity<=100))
		{
			totalAmount=quantity*.0;
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

