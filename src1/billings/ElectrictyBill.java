package billings;

import java.util.Scanner;

public class ElectrictyBill {
	 private int customernumber;
     private String customername;
     private double previousmonthreading;
     private double currentmonthreading;
     private String customertype;
     
     
     public ElectrictyBill()
     {
    	 this.customernumber=1000;
    	 this.customername="unknown";
    	 this.previousmonthreading=0;
    	 this.currentmonthreading=0;
    	 this.customertype="domestic";
    	 
     }
     public ElectrictyBill (int number,String name,double pmt,double cmt,String type)
     {
    	 this.customernumber=number;
    	 this.customername=name;
    	 this.previousmonthreading=pmt;
    	 this.currentmonthreading=cmt;
    	 this.customertype=type;
     }
     public void getData()
 	{
 		Scanner sc=new Scanner(System.in);
 		
 		System.out.printf("\n%40s","BILLING INFORMATION");
 		System.out.print("Enter the customer number");
 		customernumber=sc.nextInt();
 		System.out.print("Enter the customer name:");
 		customername= sc.next();
 		System.out.print("Enter the pmt");
 		previousmonthreading=sc.nextDouble();
 		System.out.print("Enter the cmt");
 		currentmonthreading=sc.nextDouble();
 		System.out.print("Enter the customer type (domestic or commercial)");
 		customertype=sc.next();
 	}
     public void printData()
 	{
 		System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
 		System.out.printf("%s%8.2f %-16s %40s\n", "Previous month Reading:",previousmonthreading,"Watts","Current Month Reading:",currentmonthreading,"Watts");
 		System.out.printf("%-40s", "Customer Type:",customertype);
 	}
 	
     public void computeBillAmount() 
     {
    	 	double totalAmount=-1;
    	 	double unitsconsumed=currentmonthreading-previousmonthreading;
    	 	String divider="----------------------------------------------------";
    	 	
    	 	if(customertype.equals("domestic"))
    		{
    			if((unitsconsumed>=0)&& (unitsconsumed<=100))
    			{
    				totalAmount=unitsconsumed*1;
    			}else if((unitsconsumed>=101)&&(unitsconsumed<=200))
    			{
    				totalAmount=unitsconsumed*2.50;
    			}else if((unitsconsumed>=201)&&(unitsconsumed<=500))
    			{
    				totalAmount=unitsconsumed*4;
    			}else
    			{
    				totalAmount=unitsconsumed*6;
    			}
    		}else if(customertype.equals("commercial"))
    		{
    			if((unitsconsumed>=0)&& (unitsconsumed<=100))
    			{
    				totalAmount=unitsconsumed*2.0;
    			}else if((unitsconsumed>=101)&&(unitsconsumed<=200))
    			{
    				totalAmount=unitsconsumed*4.50;
    			}else if((unitsconsumed>=201)&&(unitsconsumed<=500))
    			{
    				totalAmount=unitsconsumed*6;
    			}else
    			{
    				totalAmount=unitsconsumed*7;
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
