/******
 * To calculate the Sale bill amount 
 * 
 * Developed by
 * N.pavithra
 * 
 * npavithra1405@gmail.com
 * 
 */
package billings;

public class Caluclation1 {

	public static void main(String[] args) {
		ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(2001,"Kamal",100,200,"domestic");
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}

