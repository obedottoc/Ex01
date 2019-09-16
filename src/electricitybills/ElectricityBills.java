//Experiment-01
//created by
//Rohitha korrapati
package electricitybills;
import java.util.Scanner;s
public class ElectricityBills {
	private long customernumber;
	private String customername;
	private long previousmonthreading;
	private long currentmonthreading;
	private String customertype;
	
	public ElectricityBills()
	{
		this.customernumber=1001;
		this.customername="unknown";
		this.previousmonthreading=100;
		this.currentmonthreading=120;
		this.customertype="domestic";
	}
		
	public ElectricityBills(long number,String name,long reading1,long reading2,String type)
	{
		this.customernumber=number;
		this.customername=name;
		previousmonthreading=reading1;
		currentmonthreading=reading2;
		customertype=type;
	}
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the customernumber:");
		this.customernumber=sc.nextLong();
		System.out.print("Enter the customername:");
		this.customername= sc.next();
		System.out.print("Enter the Previous Month Reading:");
		previousmonthreading=sc.nextLong();
		System.out.print("Enter the Current Month Reading:");
		currentmonthreading=sc.nextLong();
		System.out.print("Enter the Customer type (Domestic,Commercial):");
		customertype=sc.next();
	} 
	public void printData()
	{
		System.out.println("CustomerNumber:"+customernumber);
		System.out.println("CustomerName:"+customername);
		System.out.println("PreviousMonthReading:"+previousmonthreading);     
	    System.out.println("CurrentMonthReading:"+currentmonthreading);
		System.out.println("Customertype:"+customertype);
	}
	public void computeBillamount()
	{
		long unit=currentmonthreading-previousmonthreading;
		double billAmount;
		billAmount=0;
		String spacing="------------------------------------------------------------------------------------";
		
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
		}else if(customertype.equals("Commercial"))
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

