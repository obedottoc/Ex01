//** created by roopesh
//** 1roopesh3@gmail.com
//** This program is written to generate electicity bill



package billings;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(2000,"K","domestic",100,200);
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}


	

}
