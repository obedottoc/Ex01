package electricitybill;
import java.util.Scanner;

/****
 * Class to represent  ElectricityBill of LED Lamp
 * 
 * @author mani kanta
 *
 */

public class ElectricityBill {
	private long customernumber;
	private String customername;
	private double currentmonthreading;
	private double previousmonthreading;
	private String customertype;
	private Scanner sc;/***
	 * To create ElectricityBill with initial values
	 */
	public ElectricityBill ()
	{
		this.customernumber=1000;
		this.customername="unknown";
		this.currentmonthreading=10;
		this.previousmonthreading=10;
		this.customertype="domestic";
		
	}
	/***
	 * 
	 * @param number  Customer number like 1001 etc
	 * @param name Customer name
	 * @param currentmonthreading
	 * @param previousmonthreading
	 * @param type type of the customer user or vendor
	 */
	public ElectricityBill (long number,String name,double c_reading,double p_reading,String type)
	{
		this.customernumber=number;
		this.customername=name;
		currentmonthreading=c_reading;
		previousmonthreading=p_reading;
		customertype=type;
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
		System.out.print("Enter the currentmonthreading:");
	     currentmonthreading=sc.nextDouble();
	     System.out.print("Enter the previousmonthreading:");
	     previousmonthreading=sc.nextDouble();
		System.out.print("Enter the customer type (domestic or commercial):");
		customertype=sc.next();
		
	}	
	/*****
	 * To print the bill details
	 */
	public void printData()
	{
		System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
		System.out.printf("%s%8.2f %s%8.2f %-16s %40s \n ","currentmonthreading:",currentmonthreading,"previousmonthreading:",previousmonthreading,"Customertype:",customertype);
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
		if(customertype.equals("domestic"))
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
		}else if(customertype.equals("commercial"))
		{
			if((unitsconsumed>=0)&& (unitsconsumed<=100))
			{
				totalAmount=unitsconsumed*2.0;
			}else if((unitsconsumed>=101)&&(unitsconsumed<=200))
			{
				totalAmount=unitsconsumed*4.5;
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

	
	
