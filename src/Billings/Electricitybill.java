// created by Akhshy Ganesh B
// program for ELECTRICITY BILL
// Mail ID : akhshyganeshb@gmail.com


package Billings;

import java.util.Scanner;

        
public class Electricitybill
{
			
		private String consumer_name;
		private int consumer_no;
		private String consumertype;
		private long lastmonthreading;
		private long currentmonthreading;

		public Electricitybill() 
		{
			this.consumer_name="ag";
			this.consumer_no=2334;
			this.consumertype="domestic";
			this.lastmonthreading=1456;
			this.currentmonthreading=1800;
			
		}
			
		public Electricitybill(String name, int number,String type,long lmr,long cmr)
		{
			this.consumer_name=name;
			this.consumer_no=number;
			this.consumertype=type;	
			this.lastmonthreading=lmr;
			this.currentmonthreading=cmr;
		}
		
		public void getData()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.printf("\n%40s","BILLING INFORMATION");
			System.out.print("\nEnter the consumer_name:");
			this.consumer_name=sc.next();
			System.out.print("Enter the consumer_no:");
			this.consumer_no=sc.nextInt();
			System.out.print("Enter the customer type (domestic or commercial):");
			consumertype=sc.next();	
			System.out.print("Enter the lastmonthreading:");
			lastmonthreading=sc.nextLong();
			System.out.print("Enter the currentmonthreading:");
			currentmonthreading=sc.nextLong();
		}
		public void printData()
		{
			System.out.printf("%-40s%40s\n", "Consumer_name:"+consumer_name,"Consumer_no:"+consumer_no);
			System.out.printf("%s%s %-16s %d\n","Consumertype:",consumertype,"lastmonthreading:",lastmonthreading);
			System.out.printf("%-40s", "currentmonthreading:"+currentmonthreading);
		}
		
	    public void billings()
	    {
	    double TotalAmount = 0;
	    long unit;
		 unit=currentmonthreading-lastmonthreading;
		 String divider="---------------------------------------------------------------------------------";
		 if(consumertype.equals("domestic"))
			{
				if((unit>=0)&& (unit<=100))
				{
					TotalAmount=unit*1.0;
				}else if((unit>=101)&&(unit<=200))
				{
					TotalAmount=unit*2.50;
				}else if((unit>=201)&&(unit<=500))
				{
					TotalAmount=unit*4.0;
				}else
				{
					TotalAmount=unit*6.0;
				}
			}else if(consumertype.equals("commercial"))
			{
				if((unit>=0)&& (unit<=100))
				{
					TotalAmount=unit*2.0;
				}else if((unit>=101)&&(unit<=200))
				{
					TotalAmount=unit*4.50;
				}else if((unit>=201)&&(unit<=500))
				{
					TotalAmount=unit*6.0;
				}else
				{
					TotalAmount=unit*7.0;
				}			
		}	
		 System.out.print("\n"+divider+"\n");
			System.out.print( "BILL");
			System.out.print("\n"+divider+"\n");
			this.printData();
			System.out.print(TotalAmount);
			System.out.print("\n"+divider+"\n");
	}

}