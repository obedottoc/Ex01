package billings;
import java.util.Scanner;
public class ElectricityBill {
	private long customernumber;
	private String customername;
	private long previousmonthreading;
	private long currentmonthreading;
	private String customertype;
	public ElectricityBill()
	{	this.customernumber =1000;
		this.customername= "Person";
		this.previousmonthreading=10;
		this.currentmonthreading=12;
		this.customertype="domestic";
	}
	public ElectricityBill(long number,String name,long pmr,long cmr,String type)
	{	this.customernumber=number;
		this.customername=name;
		previousmonthreading=pmr;
		currentmonthreading=cmr;
		customertype=type;		
	}
	public void getdata()
	{	Scanner sc= new Scanner(System.in);
		System.out.printf("\n%40s","BILLING INFORMATION: ");
		System.out.print("\nEnter the customer number: ");
		this.customernumber=sc.nextLong();
		System.out.print("\nEnter the customer type(domestic,commercial)");
		customertype=sc.next();
		System.out.print("\nEnter the customer last month reading: ");
		this.previousmonthreading=sc.nextLong();
		System.out.print("\nEnter the customer current month reading: ");
		this.currentmonthreading=sc.nextLong();
	}
	public void printData()
	{	System.out.printf("\nCustomer Number"+customernumber+"\nCustomer Name:"+customername );
		System.out.printf("\nPrevious Month Reading: "+previousmonthreading+"\nCurrent Month Reading: "+currentmonthreading+"\nCustomer Type: "+customertype);
	}
	public void ComputeBillAmount()
	{	long unit=currentmonthreading-previousmonthreading;
		double billAmount=0;
		String spacing="-----------------------";
		if (customertype.contentEquals("domestic"))
		{	if((unit>=0)&&(unit<=100))
				billAmount=unit*1.0;
			else if((unit>101)&&(unit<=200))
				billAmount=unit*2.5;
			else if((unit>=201)&&(unit<=500))
				billAmount=unit*4.0;
			else
				billAmount=unit*6.0;
			System.out.print("\n haha");
		}
		else if(customertype.contentEquals("Commercial"))
		{	if((unit>=0)&&(unit<=100))
				billAmount=unit*2.0;
			else if((unit>=101)&&(unit<=200))
				billAmount=unit*4.5;
			else if((unit>=201)&&(unit<=500))
				billAmount=unit*6.0;
			else
				billAmount=unit*7.0;
		}
		System.out.print("\n"+spacing+"\n");
		System.out.print("SALE BILL");
		System.out.print("\n"+spacing+"\n");
		this.printData();
		System.out.printf("\nBill Amount: ",billAmount);
		System.out.print("\n"+spacing+"\n");
	}
}
