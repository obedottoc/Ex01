package billings;

import java.util.Scanner;

public class ElectricityBill {
	private long customernumber;
	private String customername;
	private double premonthreading;
	private double currentmonthreading;
	private String customertype ;
	
	
	public ElectricityBill()
	{
		this.customernumber=2000;
		this.customername="avinash";
		this.premonthreading=10.5;
		this.currentmonthreading=9.5;
		this.customertype="domestic";
	}
	
	public ElectricityBill(long number,String name,double preading,double creading,String type)
	{
		this.customernumber=number;
		this.customername=name;
		premonthreading=preading;
		currentmonthreading=creading;
		customertype=type;
	}
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the customer number:");
		this.customernumber=sc.nextLong();
		System.out.print("Enter the customer name:");
		customername= sc.next();
		System.out.print("Enter the reading:");
		premonthreading=sc.nextDouble();
		System.out.print("Enter the customer type (domestic or commercial):");
		customertype=sc.next();
		System.out.println("Enter the reading:");
		currentmonthreading=sc.nextInt();
		
	}
	public void printData()
	{
		System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
		System.out.printf("Pre Month Reading:"+premonthreading+"   "+"Current Month Reading:"+currentmonthreading+"   ");
		System.out.printf("%-40s", "Customer Type:"+customertype);
	}
	public void computeBillunit()
	{
	    double unit=currentmonthreading-premonthreading;
		double amount=0;
		String space="------------------------------------------------------------------------------";
		
		if(customertype.equals("domestic"))
		{
			if((unit>=0)&& (unit<=100))
			{
				amount=unit*2.0;
			}else if((unit>101)&&(unit<=200))
			{
				amount=unit*3.50;
			}else if((unit>201)&&(unit<=500))
			{
				amount=unit*50.0;
			}else
			{
				amount=unit*60.0;
			}
		}else if(customertype.equals("comercial"))
		{
			if((unit>=0)&& (unit<=100))
			{
				amount=unit*2.0;
			}else if((unit>=101)&&(unit<=200))
			{
				amount=unit*210.0;
			}else if((unit>=201)&&(unit<=500))
			{
				amount=unit*50.0;
			}else
			{
				amount=unit*60.0;
			}			
		}	
		System.out.print("\n"+space+"\n");
		System.out.printf("%50s", "ELECTRICITY BILL");
		System.out.print("\n"+space+"\n");
		this.printData();
		System.out.printf("%30s%9.3f Rs", "Total unit:",amount);
		System.out.print("\n"+space+"\n");
	}
}
