package billing;

public class calculation1 {
	public static void main(String[]args) {
		ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(2001,"aakash",10,12,"domestic");
		bill2=new ElectricityBill();
		bill1.printData();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}
