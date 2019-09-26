/*
 * Program to perform ElectricityBill
 * By Faizul
 * faizulsmart10@gmail.com
 */
package billings;

import java.util.Scanner;

public class ElectricityBill{
	
	private long consumernumber;
	private String consumername;
	private long previousmonthreading;
	private long currentmonthreading;
	private String consumertype;
	
	public ElectricityBill()
	{
		this.consumernumber=5016;
		consumername="faizul";
		previousmonthreading=1000;
		currentmonthreading=2000;
		consumertype="domestic";
		
	}
	
	public ElectricityBill(long number,String name,long pmr,long cmr,String type)
	{
		this.consumernumber=number;
		consumername=name;
		previousmonthreading=pmr;
		currentmonthreading=cmr;
		consumertype=type;
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
		previousmonthreading=sc.nextLong();
		System.out.print("Enter the currentmonthreading in watts:");
		currentmonthreading=sc.nextLong();
		System.out.print("Enter the cutomer type(domestic or commercial)");
		consumertype=sc.next();

    }
	public void printData()
	{
		System.out.printf("Consumer Number:"+consumernumber);
		System.out.printf("ConsumerName:"+consumername);
		System.out.printf("Previousmonthreading:"+previousmonthreading);
		System.out.printf("Currentmonthreading:"+currentmonthreading,"ConsumerType:"+consumertype);
	}
		
		public void computeBillAmount()
		{
		    double unit=currentmonthreading-previousmonthreading;
			String divider="---------------------------------------------------------------------------------";
			
			if(consumertype.equals("domestic"))
			{
				if((unit>=0)&& (unit<=100))
				{
					unit=unit*1.0;
				}else if((unit>=101)&&(unit<=200))
				{
					unit=unit*2.50;
				}else if((unit>=201)&&(unit<=500))
				{
					unit=unit*4.0;
				}else
				{
					unit=unit*6.0;
				}
			}else if(consumertype.equals("commercial"))
			{
				if((unit>=0)&& (unit<=10))
				{
					unit=unit*2.0;
				}else if((unit>=101)&&(unit<=200))
				{
					unit=unit*4.50;
				}else if((unit>=201)&&(unit<=500))
				{
					unit=unit*6.0;
				}else
				{
					unit=unit*7.0;
				}			
				
			}
				
			    System.out.print("\n"+divider+"\n");
				System.out.printf("%40s", "ELECTRICITY BILL");
				System.out.print("\n"+divider+"\n");
				this.printData();
				System.out.printf("%29s%8.2f Rs", "Total Amount:",unit);
				System.out.print("\n"+divider+"\n");
				
		}
	}
		
			
	
	
	
	
	
	
	
