/**
1 * electricity bill
 * 
 * developed by suriyakumar
 * sksuri01@gmail.com
 * 212217105057

 */package electricitybills;

public class Calculationforbillings {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBills E1,E2;
		E1=new ElectricityBills(1001,"Arun",90,110,"Domestic");
		E1.printData();
		E2=new ElectricityBills();
		E2.getdata();
		E1.computeBillamount();
		E2.computeBillamount();
	}

}
