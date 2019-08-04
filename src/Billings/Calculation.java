package Billings;

public class Calculation {
	public static void main(String[] args) {
		ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(2001,"Kamal",0,0,"Domestic");
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}
