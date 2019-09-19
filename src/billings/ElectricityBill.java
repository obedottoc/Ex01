/*created by Abhijith.S
abhijithabhi524@gmail.com
*/
package billings;
import java.util.Scanner;
public class ElectricityBill {
	private long consumernumber;
	private String consumername;
	private long previousmonthreading;
	private long currentmonthreading;
	private String consumertype;
	public ElectricityBill()
	{	this.consumernumber =5002;
		this.consumername= "Abhijith";
		this.previousmonthreading=4916;
		this.currentmonthreading=5316;
		this.consumertype="domestic";
	}
	public ElectricityBill(long number,String name,long pmr,long cmr,String type)
	{	this.consumernumber=number;
		this.consumername=name;
		previousmonthreading=pmr;
		currentmonthreading=cmr;
		consumertype=type;		
	}
	public void getdata()
	{	Scanner sc= new Scanner(System.in);
		System.out.printf("\n%40s","BILLING INFORMATION: ");
		System.out.print("\nEnter the consumer name: ");
		this.consumername=sc.next();
		System.out.print("\nEnter the consumer number: ");
		this.consumernumber=sc.nextLong();
		System.out.print("\nEnter the consumer type(domestic,commercial)");
		consumertype=sc.next();
		System.out.print("\nEnter the consumer last month reading: ");
		this.previousmonthreading=sc.nextLong();
		System.out.print("\nEnter the consumer current month reading: ");
		this.currentmonthreading=sc.nextLong();
	}
	public void printData()
	{	System.out.printf("\nConsumer Number"+consumernumber+"\nConsumer Name:"+consumername );
		System.out.printf("\nPrevious Month Reading: "+previousmonthreading+"\nCurrent Month Reading: "+currentmonthreading+"\nConsumer Type: "+consumertype);
	}
	public void ComputeBillAmount()
	{	long unit=currentmonthreading-previousmonthreading;
		double billAmount=0;
		String spacing="-----------------------";
		if (consumertype.contentEquals("domestic"))
		{	if((unit>=0)&&(unit<=100))
				billAmount=unit*1.0;
			else if((unit>101)&&(unit<=200))
				billAmount=unit*2.5;
			else if((unit>=201)&&(unit<=500))
				billAmount=unit*4.0;
			else
				billAmount=unit*6.0;
		}
		else if(consumertype.contentEquals("commercial"))
		{	if((unit>=0)&&(unit<=100))
				billAmount=unit*2.0;
			else if((unit>=101)&&(unit<=200))
				billAmount=unit*4.5;
			else if((unit>=201)&&(unit<=500))
				billAmount=unit*6.0;
			else
				billAmount=unit*7.0;
		}
		System.out.printf("\n"+spacing+"\n");
		System.out.print("SALE BILL");
		System.out.print("\n"+spacing+"\n");
		printData();
		System.out.printf("\nBill Amount: "+billAmount);
		System.out.print("\n"+spacing+"\n");
	}
}
