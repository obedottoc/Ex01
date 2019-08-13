package billings;

public class Calculations1 {

	public static void main(String[] args) {
		ElectricityBill E1,E2;
		E1=new ElectricityBill(100,"Alexa",200,400,"domestic");
		E2= new ElectricityBill();
		E2.getdata();
		E2.ComputeBillAmount();
	}

}
