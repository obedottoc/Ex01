//Experiment-01
//created by
//gk81299
package billings;
import java.util.Scanner;
public class ElectricityBill {
	private long customernumber;
	private String customername;
	private long previousmonthreading;
	private long currentmonthreading;
	private String customertype;
	
	public ElectricityBill()
	{
		this.customernumber=1000;
		this.customername="unknown";
		this.previousmonthreading=10;
		this.currentmonthreading=12;
		this.customertype="domestic";
	}
		
	public ElectricityBill(long number,String name,long pmr,long cmr ,String type)
	{
		this.customernumber=number;
		this.customername=name;
		previousmonthreading=pmr;
		currentmonthreading=cmr;
		customertype=type;
	}
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the customer number:");
		this.customernumber=sc.nextLong();
		System.out.print("Enter the customer name:");
		customername= sc.next();
		System.out.print("Enter the Previous Month Reading");
		previousmonthreading=sc.nextLong();
		System.out.print("Enter the Current Month Reading");
		currentmonthreading=sc.nextLong();
		System.out.print("Enter the Customer type (Domestic,Commercial)");
		customertype=sc.next();
	}
	public void printData()
	{
		System.out.printf("Customer Number:"+customernumber,"CustomerName:"+customername);
		System.out.print("PreviousMonthReading:"+previousmonthreading+"CurrentMonthReading:"+currentmonthreading+"Customer Type:"+customertype);
	}
	public void computeBillamount()
	{
		long unit=currentmonthreading-previousmonthreading;
		double billAmount=0;
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
