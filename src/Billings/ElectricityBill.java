package Billings;
import java.util.Scanner;

/**
 * Electricity bill
 * @author mahesh
 *
 */
public class ElectricityBill {
	private long customernumber;
	private String customername;
	private double previousmonthreading;
	private double currentmonthreading;
	private String customertype;
	
	/**
	 * to create electricity bill with initial values
	 * 
	 */
	public ElectricityBill()
	{
		this.customernumber=1000;
		this.customername="unknown";
		this.currentmonthreading=0;
		this.previousmonthreading=0;
		this.customertype="Domestic";
		
	}
	public ElectricityBill(long number,String name,double c_reading,double p_reading,String type)
	{
		this.customernumber=number;
		this.customername=name;
		double c_rating;
		currentmonthreading=c_reading;
		previousmonthreading=p_reading;
		customertype=type;
		
	}
	/**
	 * to get bill information from the user
	 */
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the customer number:");
		this.customernumber=sc.nextLong();
		System.out.print("Enter the customer name:");
		customername= sc.next();
		System.out.print("Enter the current month reading:");
		currentmonthreading=sc.nextDouble();
		System.out.print("Enter the previous month reading");
		previousmonthreading=sc.nextDouble();
		System.out.print("Enter the customer type (Domestic or Commercial):");
		customertype=sc.next();
		
		
		
	}
	/**
	 * to print the bill details
	 */
	public void printData()
	{
		System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
		System.out.printf("%s%8.2f %s%8.2f %-16s %40s\n", "current month reading:",currentmonthreading,"previous month reading:",previousmonthreading,"CustomerType:",customertype);
		
	}
	/***
	 * to get the total amount
	 */
	public void computeBillAmount()
	{
		double totalAmount=-1;
		double unitsconsumed;
		String divider="---------------------------------------------------------------------------------";
		
		unitsconsumed=currentmonthreading-previousmonthreading;
		if(customertype.equals("Domestic"))
		{
			if((unitsconsumed>=0)&& (unitsconsumed<=100))
			{
				totalAmount=unitsconsumed*1.0;
			}else if((unitsconsumed>=101)&&(unitsconsumed<=200))
			{
				totalAmount=unitsconsumed*2.50;
			}else if((unitsconsumed>=201)&&(unitsconsumed==500))
			{
				totalAmount=unitsconsumed*4.0;
			}else
			{
				totalAmount=unitsconsumed*6.0;
			}
		}else if(customertype.equals("Commercial"))
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
		System.out.printf("%40s", "Electricity BILL");
		System.out.print("\n"+divider+"\n");
		this.printData();
		System.out.printf("%29s%8.2f Rs", "Total Amount:",totalAmount);
		System.out.print("\n"+divider+"\n");
	}
}

