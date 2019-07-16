/******

 * To calculate the electricity bill amount 
 * 
 * Developed by
 * b.karthik
 * 
 * karthikbhaskar2000@gmail.com
 * 
 */
package billings;

public class calculation {

	public static void main(String[] args) {
		ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(2000,"kamal","domestic",100,200);
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}
