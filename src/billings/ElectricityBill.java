package billings;

import java.util.Scanner;
/****
 * Class to represent ElectricityBill of LED Lamp
 * 
 * @author Harsha vardhan reddy
 *
 */
public class ElectricityBill {
	private long customernumber;
	private String customername;
	private double previousmonthreading;
	private double currentmonthreading;
	private String ElectricityBilltype;
	private Scanner sc;
	
	/***
	 * To create ElectricityBill with initial values
	 * @return 
	 */
	public ElectricityBill()
	{
		this.customernumber=1000;
		this.customername="unknown";
		this.previousmonthreading=0;
		this.currentmonthreading=0;
		this.ElectricityBilltype="domestic";
	}
	
	/***
	 * 
	 * @param number  Customer number like 1001 etc
	 * @param name Customer name
	 */
	public ElectricityBill(long number,String name,double preading,double creading,String type)
	{
		this.customernumber=number;
		this.customername=name;
		previousmonthreading=preading;
		currentmonthreading=creading;
		ElectricityBilltype=type;
	}
	
	/***
	 * To get billing information from the user
	 */
	public void getData()
	{
		sc = new Scanner(System.in);
		
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the customer number:");
		this.customernumber=sc.nextLong();
		System.out.print("Enter the customer name:");
		customername= sc.next();
		System.out.print("Enter the previousmonthreading in units:");
		previousmonthreading=sc.nextDouble();
		System.out.print("Enter the currentmonthreading in units");
		currentmonthreading=sc.nextDouble();
		System.out.print("Enter the ElectricityBilltype (domestic or commercial):");
		ElectricityBilltype=sc.next();
		
	}
	
	/*****
	 * To print the bill details
	 */
	public void printData()
	{
		System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
		System.out.printf("%s%8.2f %s%8.2f -16s %40s %40s\n ","previousmonthreading:",previousmonthreading,"Currentmonthreading:",currentmonthreading,"ElectricityBilltype:",ElectricityBilltype);
		}
	
	/***
	 * To calculate the bill amount
	 */
	public void computeBillAmount()
	{
		double totalAmount=-1;
		double unitsconsumed;
		String divider="---------------------------------------------------------------------------------";
		
		unitsconsumed=currentmonthreading-previousmonthreading;
		if(ElectricityBilltype.equals("domestic"))
		{
			if((unitsconsumed>=0)&& (unitsconsumed<=100))
			{
				totalAmount=unitsconsumed*1.0;
			}else if((unitsconsumed>=101)&&(unitsconsumed<=200))
			{
				totalAmount=unitsconsumed*2.50;
			}else if((unitsconsumed>=201)&&(unitsconsumed<=500))
			{
				totalAmount=unitsconsumed*4.0;
			}else
			{
				totalAmount=unitsconsumed*6.0;
			}
		}else if(ElectricityBilltype.equals("commercial"))
		{
			if((unitsconsumed>=0)&& (unitsconsumed<=100))
			{
				totalAmount=unitsconsumed*2.0;
			}else if((unitsconsumed>=101)&&(unitsconsumed<=200))
			{
				totalAmount=unitsconsumed*4.50;
			}else if((unitsconsumed>=201)&&(unitsconsumed<=500))
			{
				totalAmount=unitsconsumed*6.0;
			}else
			{
				totalAmount=unitsconsumed*7.0;
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
