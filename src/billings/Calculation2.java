/****
 *Developed By Avinash Raja
 *Reg n0:212217105009
 *exp n0:1
 *EEE-A
 */
package billings;

public class Calculation2 {
	
	public static void main(String[] args) {
		ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(2019,"lokesh",11.5,13.7,"Domestic");
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillunit();
		bill2.computeBillunit();
	}

}
