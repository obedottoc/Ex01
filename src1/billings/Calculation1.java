package billings;

public class Calculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill (2001,"yogeeswaran");
		bill1.printData();
		bill2=new ElectricityBill ();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}
