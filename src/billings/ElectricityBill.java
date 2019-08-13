package billings;

import java.util.Scanner;

public class ElectricityBill{
	
	private long customernumber;
	private String customername;
	private long previousmonthreading;
	private long currentmonthreading;
	private String customertype;
	
	public ElectricityBill()
	{
	    this.customernumber=5010;
            customername="bairavan";
	    previousmonthreading=1000;
	    currentmonthreading=2000;
	    String customertype = "domestic";
		
	}
	
	public ElectricityBill(long number,String name,long pmr,long cmr,String type)                 
	{
	    this.customernumber=number;
	    customername=name;
	    previousmonthreading=pmr;
	    currentmonthreading=cmr;
	    customertype=type;
	}

	public void getData()
	{
	    Scanner sc=new Scanner(System.in);
		
	    System.out.printf("\n%40s","BILLING INFORMATION");
	    System.out.print("\nEnter the consumer number:");
	    this.customernumber=sc.nextLong();
	    System.out.print("Enter the consumer name:");
	    customername= sc.next();
	    System.out.print("Enter the previousmonthreading in watts:");
	    previousmonthreading=sc.nextLong();
	    System.out.print("Enter the currentmonthreading in watts:");
	    currentmonthreading=sc.nextLong();
	    System.out.print("Enter the cutomer type(domestic or commercial)");
	    customertype=sc.next();

        }
	public void printData(String customertype)
	{
	    System.out.printf("Customer Number:"+customernumber);
	    System.out.printf("CustomerName:"+customername);
	    System.out.printf("Previousmonthreading:"+previousmonthreading);
	    System.out.printf("Currentmonthreading:"+currentmonthreading,"CustomerType:"+customertype);        
	}
		
	public void computeBillAmount()
	{
            double unit=currentmonthreading-previousmonthreading;
	    String divider="----------------------------------";
			
		if(customertype.equals("domestic"))
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
		}else if(customertype.equals("commercial"))
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
	this.printData(divider);
	System.out.printf("%29s%8.2f Rs", "Total Amount:",unit);
	System.out.print("\n"+divider+"\n");
				
	
     }


}
