/*********
 * To calculate the ElectricityBill amount
 *
 *Developed by
 *nikhil kumar reddy
 *
 *nikhilkumarreddybtech@gmail.com
 *
 */
package billings;

import billings. ElectricityBill;

public class Calculation1 {

	public static void main(String[] args) {
		ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(2001,"Kamal",10,"user",11);
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}

