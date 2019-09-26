package billings;
public class calculation {
	public static void main(String[]args) {
		ElectricityBill B1,B2;
		B1=new ElectricityBill(5016,"faizul",1000,2000,"domestic");
		B1.printData();
		B2=new ElectricityBill();
		B2.getData();
		B1.computeBillAmount();
		B2.computeBillAmount();
	}
}
