package billings;

public class Calculationofbilling
{

	public static void main(String[] args) {
		ElectricityBill E1,E2;
		E1=new ElectricityBill(1000,"hari",1010,1329,"Domestic");
		E1.printData();
		E2=new ElectricityBill();
		E2.getdata();
		E1.computeBillamount();
		E2.computeBillamount();

	}

}
