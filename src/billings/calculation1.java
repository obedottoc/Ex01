package billings;

public class calculation1 {

	public static void main(String[] args) {
		ElectricityBill bill1,bill2;
		bill1=new ElectricityBill(2334,"ag",12321,23545,"domestic");
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}
