package billings;

public class Calculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectrictyBill bill1,bill2;
		
		bill1=new ElectrictyBill (2001,"yogeeswaran",123.0,134.6,"Domestic");
		bill1.printData();
		bill2=new ElectrictyBill ();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}
