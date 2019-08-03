package billing;

public class Calculation1
{

	public static void main(String[] args) {
		ElectricityBill B1,B2;
		B1=new ElectricityBill(1000,"captain",1010,1329,"Domestic");
		B1.printData();
		B2=new ElectricityBill();
		B2.getdata();
		B1.computeBillamount();
		B2.computeBillamount();

	}

}
